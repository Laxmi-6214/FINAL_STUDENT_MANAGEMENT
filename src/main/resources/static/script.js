let students = [];
let editIndex = -1;

function addStudent() {
    let name = document.getElementById("name").value;
    let email = document.getElementById("email").value;
    let department = document.getElementById("department").value;
    let marks = document.getElementById("marks").value;
    let age = document.getElementById("age").value;

    if (name === "" || email === "" || department === "" || marks === "" || age === "") {
        alert("Please fill all fields");
        return;
    }

    let student = {
        name: name,
        email: email,
        department: department,
        marks: marks,
        age: age
    };

    if (editIndex === -1) {
        students.push(student);
    } else {
        students[editIndex] = student;
        editIndex = -1;
    }

    displayStudents();
    clearInputs();
}

function displayStudents() {
    let table = document.getElementById("studentTable");
    table.innerHTML = "";

    students.forEach((s, index) => {
        table.innerHTML += `
            <tr>
                <td>${s.name}</td>
                <td>${s.email}</td>
                <td>${s.department}</td>
                <td>${s.marks}</td>
                <td>${s.age}</td>
                <td>
                    <button onclick="editStudent(${index})">Edit</button>
                    <button onclick="deleteStudent(${index})">Delete</button>
                </td>
            </tr>
        `;
    });
}

function editStudent(index) {
    document.getElementById("name").value = students[index].name;
    document.getElementById("email").value = students[index].email;
    document.getElementById("department").value = students[index].department;
    document.getElementById("marks").value = students[index].marks;
    document.getElementById("age").value = students[index].age;
    editIndex = index;
}

function deleteStudent(index) {
    students.splice(index, 1);
    displayStudents();
}

function clearInputs() {
    document.getElementById("name").value = "";
    document.getElementById("email").value = "";
    document.getElementById("department").value = "";
    document.getElementById("marks").value = "";
    document.getElementById("age").value = "";

}