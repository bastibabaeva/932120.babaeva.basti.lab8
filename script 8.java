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