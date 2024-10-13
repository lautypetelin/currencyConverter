# Conversor de Moneda

Esta aplicación es un conversor de divisas que utiliza la API de ExchangeRate para obtener las tasas de conversión entre distintas monedas. Permite realizar conversiones entre las siguientes monedas:

- Dólar estadounidense (USD)
- Peso argentino (ARS)
- Real brasileño (BRL)
- Peso colombiano (COP)

## Funcionalidades

El usuario puede elegir entre las siguientes opciones de conversión:

1. Dólar estadounidense (USD) → Peso argentino (ARS)
2. Peso argentino (ARS) → Dólar estadounidense (USD)
3. Dólar estadounidense (USD) → Real brasileño (BRL)
4. Real brasileño (BRL) → Dólar estadounidense (USD)
5. Dólar estadounidense (USD) → Peso colombiano (COP)
6. Peso colombiano (COP) → Dólar estadounidense (USD)
7. Salir del programa

## Requisitos

- JDK 11 o superior
- Dependencias externas: [Gson](https://github.com/google/gson) para el procesamiento de datos JSON
- Conexión a internet para realizar las consultas a la API

## Estructura del Proyecto

El proyecto cuenta con dos clases principales:

### Main

Esta clase contiene el ciclo principal de la aplicación, mostrando el menú de opciones al usuario y permitiendo la interacción con el conversor.

#### Métodos principales:

- `showMenu()`: Muestra el menú y recibe la opción del usuario.
- `getValue()`: Solicita el valor a convertir.
- `main()`: Controla el flujo del programa y realiza las conversiones utilizando la API de ExchangeRate.

### ConsultaAPI

Esta clase maneja las llamadas a la API de ExchangeRate para obtener las tasas de conversión actualizadas.

#### Método principal:

- `getConversionRate(String from, String to)`: Realiza la consulta a la API y devuelve la tasa de conversión entre las dos monedas especificadas.

## Uso

1. Ejecutar el programa.
2. Seleccionar una de las opciones del menú.
3. Ingresar el monto que se desea convertir.
4. El programa mostrará el resultado de la conversión.
5. Repetir el proceso o salir del programa seleccionando la opción 7.

### Configuración de la API

Este proyecto utiliza la API de ExchangeRate para obtener las tasas de cambio actuales. Se requiere una clave de API válida, que se puede obtener registrándose en [ExchangeRate-API](https://www.exchangerate-api.com/).

## Clave de API
Reemplazar la clave de API en la clase ConsultaAPI:

```private static final String API_KEY = "TU_CLAVE_DE_API_AQUI";```

----------------------------------

Esta aplicación ha sido ejecutada por ultima vez en IntelliJ IDEA y JDK 17. Si tienes alguna pregunta o comentario, no dudes en ponerte en contacto conmigo.
