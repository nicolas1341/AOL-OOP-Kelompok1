-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 06 Jan 2024 pada 14.57
-- Versi server: 10.4.28-MariaDB
-- Versi PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `msrestoran`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `msmenu`
--

CREATE TABLE `msmenu` (
  `MenuID` int(255) NOT NULL,
  `MenuName` varchar(255) NOT NULL,
  `MenuType` varchar(255) NOT NULL,
  `MenuPrice` int(255) NOT NULL,
  `MenuDescription` varchar(255) NOT NULL,
  `CabangRestoran` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `msreservation`
--

CREATE TABLE `msreservation` (
  `ReservationID` int(255) NOT NULL,
  `CustomerName` varchar(255) NOT NULL,
  `Cabang` varchar(255) NOT NULL,
  `TableType` varchar(255) NOT NULL,
  `JumlahCustomer` int(255) NOT NULL,
  `Status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `msstaff`
--

CREATE TABLE `msstaff` (
  `StaffID` int(255) NOT NULL,
  `StaffName` varchar(255) NOT NULL,
  `CabangRestoran` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `order`
--

CREATE TABLE `order` (
  `OrderID` int(255) NOT NULL,
  `ReservationID` int(255) NOT NULL,
  `MenuID` int(255) NOT NULL,
  `Quantity` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `msmenu`
--
ALTER TABLE `msmenu`
  ADD PRIMARY KEY (`MenuID`),
  ADD UNIQUE KEY `CabangRestoran` (`CabangRestoran`),
  ADD UNIQUE KEY `CabangRestoran_2` (`CabangRestoran`);

--
-- Indeks untuk tabel `msreservation`
--
ALTER TABLE `msreservation`
  ADD PRIMARY KEY (`ReservationID`);

--
-- Indeks untuk tabel `msstaff`
--
ALTER TABLE `msstaff`
  ADD PRIMARY KEY (`StaffID`);

--
-- Indeks untuk tabel `order`
--
ALTER TABLE `order`
  ADD PRIMARY KEY (`OrderID`),
  ADD KEY `ReservationID` (`ReservationID`),
  ADD KEY `MenuID` (`MenuID`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `order`
--
ALTER TABLE `order`
  ADD CONSTRAINT `order_ibfk_1` FOREIGN KEY (`ReservationID`) REFERENCES `msreservation` (`ReservationID`),
  ADD CONSTRAINT `order_ibfk_2` FOREIGN KEY (`MenuID`) REFERENCES `msmenu` (`MenuID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
