# Model Conceptual

![Entities!](/assets/images/entities.png)

## Save one-to with object

```
POST http://localhost:8080/people
 {
     "name": "Nova Pessoa",
    "salary": 8000.0,
    "department": {
        "id": 1
    }
 }
 ```
 
 ## Save one-to with Id

```
POST http://localhost:8080/people
 {
     "name": "Nova Pessoa",
    "salary": 8000.0,
    "departmentId": 1
 }
 ```

