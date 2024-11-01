let elements = [];

function createNewElement()
{
    const container = document.querySelector('.element-container');
    const newElement = document.createElement('div');
    newElement.className='element';

    newElement.innerHTML='
        <label>
            <input type="text">
        </label>
        <label>
            <input type="number">
        </label>
        <button onclick="upElement(this.parentNode)" value="up">up</button>
        <button onclick="downElement(this.parentNode)" value="down">down</button>
        <button onclick="deleteElement(this.parentNode)" value="delete">delete</button>
        ';
        container.appendChild(newElement);

}

function upElement(element){
    const prevElement = element.previousElementSibling;
    if(prevElement){
        element.parentNode.insertBefore(element, prevElement);
        updateElementsArray();
    }
}

function downElement(element){
    const nextElement = element.nextElementSibling;
    if(nextElement){
        element.parentNode.insertBefore(nextElement, element);
        updateElementsArray();
    }
}

function deleteElement(element){
    element.parentNode.removeChild(element);
}

function updateElementsArray(){
    elements=[];
    document.querySelectorAll('.element').forEach(element=>
    {
        const label = element.querySelector('input[type="text"]').value;
        const number = element.querySelector('input[type="number"]').value;
        elements.push({label, number});
    })
}

document.addEventListener('DOMContentLoaded', createNewElement);