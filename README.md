# Calculator Microservice

Small project for playing with microservices.

Author: Denise Thieme

## Endpoints

### Hello
Endpoint for saying hello to the microservice!

<b>GET</b> /api/v1/calculator/hello

<br>

### Add
Endpoint for calculating the sum of two numbers.

<b>GET</b> /api/v1/calculator/add?firstSummand=*[number]*&secondSummand=*[number]*

<b>Query Params</b>

| Param      | Type   |
|------------|--------|
| firstSummand  | number |
| secondSummand | number |

<br>

### Subtract
Endpoint for calculating the difference of two numbers.

<b>GET</b> /api/v1/calculator/subtract?minuend=*[number]*&subtrahend=*[number]*

<b>Query Params</b>

| Param      | Type   |
|------------|--------|
| minuend    | number |
| subtrahend | number |
  
<br>

### Multiply
Endpoint for calculating the product of two numbers.

<b>GET</b> /api/v1/calculator/multiply?multiplier=*[number]*&multiplicand=*[number]*

<b>Query Params</b>

| Param         | Type   |
|---------------|--------|
| multiplier    | number |
| multiplicand  | number |

<br>

### Divide
Endpoint for calculating the quotient of two numbers.

<b>GET</b> /api/v1/calculator/divide?dividend=*[number]*&divisor=*[number]*

<b>Query Params</b>

| Param    | Type   |
|----------|--------|
| dividend | number |
| divisor  | number |

<br>

## Postman
The four endpoints can be tested locally via Postman. An importable request collection
can be found in the ["./postman" directory](/postman). The endpoints are documented in there as well.

<br>

## Docker
The microservice can also be deployed on Docker. To build an image run the following 
command in the root directory (tested with Docker Engine v24.0.7):

```
docker build -t dethieme/microservice .
```

*Note: The first build may take some time.*

After the build has finished, run this command to start the container:

```
 docker run -p 8080:8080 dethieme/microservice
```

The microservice is now accessible under *localhost:8080/api/v1/calculator* via Postman or a browser.
