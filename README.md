# 🚲 Movilidad Sostenible - PMV para ODS 11

Este proyecto es un **Producto Mínimo Viable (PMV)** orientado a brindar soluciones técnicas y estratégicas para mejorar la movilidad urbana, promoviendo ciudades y comunidades sostenibles, en línea con el **ODS 11** de la Agenda 2030.

## 🎯 Objetivo

Desarrollar un sistema de simulación de movilidad urbana centrado en:
- El uso de transporte público eficiente.
- Fomento de medios de transporte no motorizados (bicicleta, caminata).
- Integración de tecnologías para la gestión y optimización del transporte.
- Participación ciudadana y sensibilización.

## 🛠️ Tecnologías

- Lenguaje: Java 17
- Sistema de construcción: Maven
- Estructuras de datos utilizadas: `List`, `Map`, `Set`
- Entorno: Aplicación de consola (extensible a web/móvil)

## 📦 Estructura del proyecto

```plaintext
movilidad-sostenible/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── org/
                └── movilidad/
                    ├── Main.java
                    ├── model/
                    │   ├── Bicicleta.java
                    │   ├── Estacion.java
                    │   ├── Ruta.java
                    │   ├── Usuario.java
                    └── service/
                        └── Ciudad.java
```

## 🚀 Cómo ejecutar

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/movilidad-sostenible.git
   cd movilidad-sostenible
   ```

## 📊 Funcionalidades del PMV
- Simulación de estaciones de bicicletas y su capacidad.
- Registro y gestión de rutas urbanas con paradas intermedias.
- Uso de estructuras de datos eficientes (List, Map, Set) para modelar entidades del sistema.
- Carga de datos simulados como punto de partida para la planificación.
- Preparación para integrar datos reales desde sensores, archivos o APIs.

## 🌱 Impacto y escalabilidad
- Este proyecto puede escalar hacia soluciones reales mediante:
- Integración con bases de datos geoespaciales y sensores IoT.
- Transformación en una aplicación web con Spring Boot y bases de datos SQL/NoSQL.
- Creación de una app móvil para los usuarios, con funciones como:
- Información en tiempo real sobre transporte.
- Rutas sugeridas.
- Gamificación para fomentar el uso de la movilidad sostenible.
- Alianzas con gobiernos locales, universidades o startups interesadas en movilidad urbana.
