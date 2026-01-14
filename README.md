# Práctica 1 – Ciclismo 🏁  
**Taller de Herramientas de Programación (THP) – ORT Argentina**

Este repositorio contiene la resolución de la **Práctica 1 / Primer Parcial** de la materia **Taller de Herramientas de Programación**, desarrollada en **Java**, aplicando lógica estructurada y validaciones según la consigna.

---

## 📌 Enunciado (resumen)

En una competencia de ciclismo de montaña participan ciclistas en distintas rutas.  
Por cada ruta se registra:
- Nombre de la ruta
- Grado de dificultad (Bajo / Medio / Alto)
- Cantidad de ciclistas

Por cada ciclista:
- Nombre
- Si terminó o no la carrera
- Tiempo de recorrido (si terminó)
- Cantidad de agua consumida (si terminó)

El programa calcula estadísticas como:
- Total de agua consumida por ruta
- Promedio de tiempo total
- Cantidad de rutas sin abandonos
- Ciclista más rápido por ruta
- Ciclista con mayor consumo de agua
- Porcentaje de rutas por dificultad

---

## 🧩 Diagramas Nassi–Shneiderman

A continuación se presentan los **diagramas Nassi–Shneiderman** que representan el flujo lógico del programa, utilizados como base para la implementación en Java.

### 🔹 Flujo principal – Parte 1
![NS Parte 1](docs/ns/ns-ciclismo-parte-1.jpg)

### 🔹 Flujo principal – Parte 2
![NS Parte 2](docs/ns/ns-ciclismo-parte-2.jpg)

### 🔹 Flujo principal – Parte 3
![NS Parte 3](docs/ns/ns-ciclismo-parte-3.jpg)

### 🔹 Flujo principal – Parte 4
![NS Parte 4](docs/ns/ns-ciclismo-parte-4.jpg)

---

## 💻 Implementación en Java

La solución fue implementada en Java respetando:
- Validación de datos de entrada
- Uso de constantes
- Control de flujo con estructuras repetitivas y condicionales
- Cálculo de estadísticas acumuladas

## 📄 Enunciado del ejercicio

En una competición de ciclismo de montaña, varios ciclistas participan en distintas rutas.  
Cada ciclista compite únicamente en una ruta, aunque en cada una pueden participar varios ciclistas al mismo tiempo.

El objetivo del programa es **registrar la información de las rutas y los ciclistas**, y **calcular estadísticas relevantes** sobre el desempeño de los participantes.

---

### 📥 Datos ingresados por teclado

#### Por cada ruta:
- Nombre de la ruta (string no vacío).  
  > Al ingresar **"FIN"** se indica que no existen más rutas para procesar.
- Cantidad de ciclistas que participaron en la ruta (entero mayor o igual a 0).
- Grado de dificultad de la ruta:
  - **B** → Bajo  
  - **M** → Moderado  
  - **A** → Alto  
  (validando que el dato ingresado sea correcto)

#### Por cada ciclista:
- Nombre del ciclista (string no vacío).
- Indicador de si terminó o no la carrera.
- Tiempo de recorrido en minutos (entero mayor a 0, solo si terminó la carrera).
- Cantidad de agua consumida en litros (double mayor a 0, solo si terminó la carrera).

---

### 📊 Estadísticas solicitadas

El programa debe calcular y mostrar:
- Para cada ruta, el **total de agua consumida** por los ciclistas que finalizaron la carrera.
- El **promedio de tiempo** que tardaron los ciclistas en completar la carrera considerando todas las rutas.
- La **cantidad de rutas** donde ningún ciclista abandonó.
- Para cada ruta, el **ciclista que tardó menos tiempo** (excluyendo abandonos).
- El **ciclista con mayor consumo de agua** entre todas las rutas.
- El **porcentaje de rutas** según su grado de dificultad (Bajo, Medio y Alto).

---

### 🛠️ Tareas realizadas sobre el proyecto base

La solución entregada incluía un código incompleto con errores.  
Las tareas realizadas fueron:

#### 🔧 Corrección de errores de compilación
- Se resolvieron los errores que impedían la ejecución del programa.

#### 🐞 Corrección de bugs
- Se corrigió la solicitud de tiempo y agua para ciclistas que no finalizaron la carrera.
- Se solucionó el problema que impedía continuar la carga aun ingresando valores válidos.
- Se corrigió el cálculo del promedio de tiempos, que siempre devolvía cero.

> Para la detección de errores se utilizó el **debugger** y el seguimiento del flujo de ejecución.

#### ✨ Nuevas funcionalidades
- Identificación del ciclista más rápido por ruta.
- Identificación del ciclista con mayor consumo de agua.
- Validación del grado de dificultad de cada ruta.
- Cálculo del porcentaje de rutas por grado de dificultad.
---

## 👩‍💻 Autora

**Gabriela Ayelén Barrera**  
Estudiante de Analista de Sistemas – ORT Argentina
