# 🌱 Sistema de Monitoreo de Humedad del Suelo

Este proyecto simula un sistema de monitoreo de humedad del suelo con activación automática del riego. Fue desarrollado como parte de la materia **Ingeniería de Software** en el ITSX.

---

## 📌 Objetivo

Desarrollar un prototipo funcional que:
- Simule lecturas de humedad del suelo.
- Active un sistema de riego si la humedad es baja.
- Use una base de datos relacional para almacenar datos.
- Implemente buenas prácticas de desarrollo con CI/CD.

---

## 🛠 Tecnologías utilizadas

- **Lenguaje:** Java
- **Base de datos:** SQL Server
- **Control de versiones:** Git y GitHub
- **CI/CD:** GitHub Actions

---

## 📁 Estructura del proyecto

/src
Main.java # Punto de entrada
Sensor.java # Simula sensor de humedad
Riego.java # Simula sistema de riego

scripts.sql # Script de creación de tablas

/.github/workflows
java.yml # Pipeline de CI
