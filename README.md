# Módulo 1 – Ciclismo 🏁
## Taller de Herramientas de Programación (THP) – ORT Argentina

Este repositorio contiene la resolución del **Primer Parcial** de la materia **Taller de Herramientas de Programación**, desarrollada en **Java**, aplicando **programación estructurada**, con uso de variables, constantes, contadores y acumuladores, validaciones y corrección de errores, **sin utilización de Programación Orientada a Objetos**, según la consigna.


---

## 📄 Enunciado del ejercicio

En una competición de ciclismo de montaña, varios ciclistas participan en distintas rutas.  
Cada ciclista compite únicamente en una ruta, aunque en cada una pueden participar varios ciclistas al mismo tiempo.

El objetivo del programa es **registrar la información de las rutas y los ciclistas**, y **calcular estadísticas relevantes** sobre el desempeño de los participantes.

### 📥 Datos ingresados por teclado

#### Por cada ruta:
- Nombre de la ruta (string no vacío).  
  > Al ingresar **"FIN"** se indica que no existen más rutas para procesar.
- Cantidad de ciclistas que participaron en la ruta (entero mayor o igual a 0).
- Grado de dificultad:
  - **B** → Bajo
  - **M** → Moderado
  - **A** → Alto  
  (validando que el dato ingresado sea correcto)

#### Por cada ciclista:
- Nombre del ciclista (string no vacío).
- Indicador de si terminó o no la carrera.
- Tiempo de recorrido en minutos (entero mayor a 0, solo si terminó).
- Cantidad de agua consumida en litros (double mayor a 0, solo si terminó).

---

## 📊 Estadísticas solicitadas

El programa calcula y muestra:

- Para cada ruta, el total de agua consumida por los ciclistas que finalizaron la carrera.
- El promedio de tiempo de todos los ciclistas que completaron la carrera en todas las rutas.
- La cantidad de rutas donde ningún ciclista abandonó.


---

## 🛠️ Tareas realizadas sobre el proyecto base

La solución entregada incluía un código incompleto con errores.

### 🔧 Corrección de errores de compilación
- Se resolvieron los errores que impedían la ejecución del programa.

### 🐞 Corrección de bugs
- Se corrigió la solicitud de tiempo y agua para ciclistas que no finalizaron la carrera.
- Se solucionó el problema que impedía continuar la carga aun ingresando valores válidos.
- Se corrigió el cálculo del promedio de tiempos, que siempre devolvía cero.

> Para la detección y corrección de errores se utilizó el depurador (debugger) y la consola de Eclipse, realizando un seguimiento del flujo de ejecución del programa.


### ✨ Nuevas funcionalidades
- Identificación del ciclista más rápido por ruta.
- Identificación del ciclista con mayor consumo de agua.
- Validación del grado de dificultad de cada ruta.
- Cálculo del porcentaje de rutas por grado de dificultad.

---
🧠 Conceptos aplicados

Durante la resolución del ejercicio se aplicaron:

- Uso de contadores y acumuladores.
- Cálculo de máximos y mínimos.
- Validaciones de datos ingresados por teclado.
- Control del flujo mediante estructuras condicionales y repetitivas.
---

## 💻 Implementación en Java

La solución fue implementada en Java respetando:
- Validación de datos de entrada
- Uso de constantes
- Control de flujo con estructuras repetitivas y condicionales
- Cálculo de estadísticas acumuladas


---

## 🧩 Diagramas Nassi–Shneiderman

A continuación se presenta el diagrama **Nassi–Shneiderman**, utilizados como base para el diseño lógico y la posterior implementación del programa en Java.

### 🔹 Flujo principal del programa
![ns-java-parte-1](https://github.com/user-attachments/assets/57624b52-873a-4e90-a044-f30eb4a61536)

![ns-java-parte-2](https://github.com/user-attachments/assets/efd0f4c4-5e99-4f7d-a9d8-051a1b5218b0)

![ns-java-parte-3](https://github.com/user-attachments/assets/c7222712-e67d-4daf-a002-351b03423e20)

![ns-java-parte-4](https://github.com/user-attachments/assets/27b9a941-03d2-436e-a3c0-83ed984715a6)


---

## 👩‍💻 Autora

**Gabriela Ayelén Barrera**  
Estudiante de Analista de Sistemas – ORT Argentina
