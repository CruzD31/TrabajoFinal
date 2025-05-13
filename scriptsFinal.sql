-- DDL Creación        
CREATE TABLE Sensor (
    ID INT PRIMARY KEY IDENTITY,
    Ubicacion VARCHAR(100),
    Tipo VARCHAR(50)
);

CREATE TABLE Lectura (
    ID INT PRIMARY KEY IDENTITY,
    SensorID INT FOREIGN KEY REFERENCES Sensor(ID),
    FechaHora DATETIME,
    Humedad FLOAT
);

CREATE TABLE EventoRiego (
    ID INT PRIMARY KEY IDENTITY,
    SensorID INT FOREIGN KEY REFERENCES Sensor(ID),
    FechaHora DATETIME,
    DuracionSegundos INT
);


-- DML Inserción
INSERT INTO Sensor (Ubicacion, Tipo) VALUES ('Invernadero 1', 'Humedad');
INSERT INTO Lectura (SensorID, FechaHora, Humedad) VALUES (1, GETDATE(), 45.7);
INSERT INTO EventoRiego (SensorID, FechaHora, DuracionSegundos) VALUES (1, GETDATE(), 30);
