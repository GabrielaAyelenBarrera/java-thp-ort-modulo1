# Módulo 1 – Ciclismo 🏁
**Taller de Herramientas de Programación (THP) – ORT Argentina**

Este repositorio contiene la resolución del **Primer Parcial** de la materia **Taller de Herramientas de Programación**, desarrollado en **Java**, aplicando **programación estructurada**, con uso de variables, constantes, contadores y acumuladores, validaciones y corrección de errores, según la consigna (**sin utilización de Programación orientada a objetos**).

---

## 📄 Enunciado del ejercicio

En una competición de ciclismo de montaña, varios ciclistas participan en distintas rutas.  
Cada ciclista compite únicamente en una ruta, aunque en cada una pueden participar varios ciclistas al mismo tiempo.

El objetivo del programa es registrar la información de las rutas y los ciclistas, y calcular estadísticas relevantes sobre el desempeño de los participantes.

---

## 📥 Datos ingresados por teclado

### Por cada ruta:
- Nombre de la ruta (valor **String no vacío**).  
  - Al ingresar `"FIN"` se indica que no existen más rutas para procesar.
- Cantidad de ciclistas que participarán en la ruta (entero **mayor o igual a 0**).
- Grado de dificultad:
  - **B** → Bajo  
  - **M** → Moderado  
  - **A** → Alto  
  (validando que el dato ingresado sea correcto)

### Por cada ciclista:
- Nombre del ciclista (valor **String no vacío**).
- Indicador de si terminó o no la carrera.
- Tiempo de recorrido en minutos (entero **mayor a 0**, solo si terminó).
- Cantidad de agua consumida en litros (double **mayor a 0**, solo si terminó).

---

## 📊 Estadísticas solicitadas

El programa calcula y muestra:

- Para cada ruta, el total de agua consumida por los ciclistas que finalizaron la carrera.
- El promedio de tiempo de todos los ciclistas que completaron la carrera en todas las rutas.
- La cantidad de rutas donde ningún ciclista abandonó la carrera.

---

## 🛠️ Tareas realizadas sobre el proyecto base

La solución entregada incluía un código incompleto con errores.

### 🔧 Corrección de errores de compilación
Se resolvieron los errores que impedían la ejecución del programa.

### 🐞 Corrección de bugs
- Se corrigió la solicitud de tiempo y agua para ciclistas que **no** finalizaron la carrera.
- Se solucionó el problema que impedía continuar la carga aun ingresando valores válidos.
- Se corrigió el cálculo del promedio de tiempos, que siempre devolvía cero.

Para la detección y corrección de errores se utilizó el **depurador y la consola de Eclipse**, realizando un seguimiento del flujo de ejecución del programa.

---

## ✨ Nuevas funcionalidades

- Identificación del ciclista más rápido por ruta.
- Identificación del ciclista con mayor consumo de agua.
- Validación del grado de dificultad de cada ruta.
- Cálculo del porcentaje de rutas por grado de dificultad.

---

## 🧠 Conceptos aplicados

Durante la resolución del ejercicio se aplicaron:

- Uso de contadores y acumuladores.
- Cálculo de máximos y mínimos.
- Validaciones de datos ingresados por teclado.
- Control del flujo mediante estructuras condicionales y repetitivas.

---

## 💻 Implementación en Java

La solución fue implementada en Java respetando:

- Validación de datos de entrada.
- Uso de constantes.
- Control de flujo con estructuras repetitivas y condicionales.
- Cálculo de estadísticas acumuladas.


---

## 🧩 Diagramas Nassi–Shneiderman

A continuación se presenta el diagrama **Nassi–Shneiderman**, utilizados como base para el diseño lógico y la posterior implementación del programa en Java.

### 🔹 Flujo principal del programa
<img width="1130" height="721" alt="image" src="https://github.com/user-attachments/assets/7526d7d3-2f0f-4eef-a265-5c1a4523f5f1" />
<img width="1133" height="718" alt="image" src="https://github.com/user-attachments/assets/87a1aec8-74bd-4bbe-8c3b-47159ade4dad" />
<img width="1133" height="719" alt="image" src="https://github.com/user-attachments/assets/063e2a35-d3c0-4778-a496-6979aff17e39" />
<img width="1130" height="334" alt="image" src="https://github.com/user-attachments/assets/0668ee18-9ef4-42bc-8f04-b9d4dc748639" />

---

## 👩‍💻 Autora

**Gabriela Ayelén Barrera**  
Estudiante de Analista de Sistemas – ORT Argentina
