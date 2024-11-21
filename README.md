# Conversor de Moneda

Esta aplicación es un conversor de divisas que utiliza la API de ExchangeRate para obtener las tasas de conversión entre una amplia lista de distintas monedas.

![Principal](https://github.com/user-attachments/assets/62dedf40-ee74-4127-b735-df9962563b85)

## Funcionalidades del Sistema

1. **Elegir la moneda base y la moneda a convertir**
2. **Visualización del historial de consultas**
3. **Validaciones para el correcto ingreso de datos**

## Uso

1. Ejecutar el programa.
2. Seleccionar en la primer lista desplegable la moneda base que desea convertir.

    ![Opciones 2](https://github.com/user-attachments/assets/a03c4c07-1e37-416a-a211-a582ace74092)

4. Seleccionar en la segunda lista despleglabe la moneda a la que desea convertir.

    ![Opciones](https://github.com/user-attachments/assets/c07f4a5e-768c-4692-bfa4-e842c7a92911)

5. Ingresar el monto que se desea convertir.
4. El programa mostrará el resultado de la conversión.
5. La conversión y la hora de la misma se reflejara en la tabla.

    ![Accion](https://github.com/user-attachments/assets/85c467df-3144-4d0f-aedc-5207e4ae40f7)

7. Repetir el proceso o salir del programa.

### Configuración de la API

Este proyecto utiliza la API de ExchangeRate para obtener las tasas de cambio actuales. Se requiere una clave de API válida, que se puede obtener registrándose en [ExchangeRate-API](https://www.exchangerate-api.com/).

## Clave de API
Reemplazar la clave de API en la interfaz IKEY:

![KEY](https://github.com/user-attachments/assets/baeb0cfe-14e1-4265-8268-ef4e66f34481)

```public static final String KEY = "TU_CLAVE_DE_API_AQUI";```

## Desarrollo y Uso

1. Clonar el repositorio.
3. Ejecutar la aplicación.
4. Utilizar la IGU para realizar las conversiones.

## Créditos

- **Desarrollado por**: Lautaro Tomás Israel Petelin
- **Tecnologías utilizadas**: Java 17.0.6
- **IDE**: Netbeans 17
- **Autor de la consigna**: Alura Latam (ONE)

## Contribuciones

¡Las contribuciones son bienvenidas! Si encuentras algún problema o tienes sugerencias de mejora, no dudes en abrir un problema o enviar una pull request.
