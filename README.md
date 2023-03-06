# todo-rest-api
This is a simple Todo Rest API built using Spring Boot. The API allows users to create, read, update, and delete tasks.

## Here are all the endpoints for the Todo Rest API with Spring Boot:

### GET /todos
Returns a list of all todos.

### POST /todos
Creates a new todo.

### GET /todos/{id}
Returns a single todo by ID.

### PUT /todos/{id}
Updates a todo by ID.

### DELETE /todos/{id}
Deletes a todo by ID.

For each endpoint, you can expect to receive a JSON response with information about the todo(s). The GET endpoints will return a JSON array of todo objects, while the POST, PUT, and DELETE endpoints will return a single todo object.
