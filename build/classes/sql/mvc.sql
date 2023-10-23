-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-10-2023 a las 09:32:42
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Base de datos: `mvc`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculos`
--

CREATE TABLE `vehiculos` (
  `id` int(11) NOT NULL,
  `placa` varchar(10) NOT NULL,
  `marca` varchar(25) NOT NULL,
  `modelo` varchar(25) NOT NULL,
  `anio` int(4) NOT NULL,
  `color` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `vehiculos`
--

INSERT INTO `vehiculos` (`id`, `placa`, `marca`, `modelo`, `anio`, `color`) VALUES
(1, 'MVC234', 'Lamborghini', 'Aventador SVJ', 2018, 'Verde'),
(2, 'ASS1535', 'Ferrari', 'LaFerrari', 2013, 'Rojo'),
(3, 'ASDAD6', 'Bugatti', 'Chiron', 2016, 'Celeste'),
(4, 'TRD5G', 'Bugatti', 'Divo', 2018, 'Gris'),
(5, 'GJH516', 'Lamborghini', 'Centenario', 2016, 'Negro'),
(6, '98J4KL', 'Chevrolet ', 'Camaro', 1977, 'Amarillo'),
(7, '65HKJ5', 'Porsche', '911 GT3 RS', 2018, 'Gris'),
(8, '54DGFG', ' McLaren', 'P1', 2013, 'Amarrillo'),
(9, 'HFD54', 'Ford', 'Mustang Shelby GT500', 2020, 'Azul');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `vehiculos`
--
ALTER TABLE `vehiculos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `vehiculos`
--
ALTER TABLE `vehiculos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;
