-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 13, 2017 at 06:50 AM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pbomenujua`
--

-- --------------------------------------------------------

--
-- Table structure for table `akunadmin`
--

CREATE TABLE `akunadmin` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `akunadmin`
--

INSERT INTO `akunadmin` (`username`, `password`) VALUES
('bosbesar', 'mautauaja');

-- --------------------------------------------------------

--
-- Table structure for table `akunpetani`
--

CREATE TABLE `akunpetani` (
  `Nama` varchar(20) NOT NULL,
  `Alamat` varchar(40) NOT NULL,
  `noTelephone` int(15) NOT NULL,
  `username` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `akunpetani`
--

INSERT INTO `akunpetani` (`Nama`, `Alamat`, `noTelephone`, `username`, `password`) VALUES
('andrey', 'Del', 90999988, 'andrey', 'andrey'),
('petani', 'del', 55, 'petani', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `akunpetugas`
--

CREATE TABLE `akunpetugas` (
  `Nama` varchar(20) NOT NULL,
  `Alamat` varchar(40) NOT NULL,
  `noTelephone` int(15) NOT NULL,
  `username` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `akunpetugas`
--

INSERT INTO `akunpetugas` (`Nama`, `Alamat`, `noTelephone`, `username`, `password`) VALUES
('lohoy', 'Del', 9099766, 'anjay', 'anjay'),
('Anjas', 'del', 555, 'ando', 'ando'),
('Ronald', 'DEl', 44, 'ronal', 'ronal');

-- --------------------------------------------------------

--
-- Table structure for table `datahasiltani`
--

CREATE TABLE `datahasiltani` (
  `Kecamatan` varchar(30) NOT NULL,
  `jenis` varchar(20) NOT NULL,
  `tanggal` int(10) NOT NULL,
  `bulan` varchar(15) NOT NULL,
  `Jumlah` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `datahasiltani`
--

INSERT INTO `datahasiltani` (`Kecamatan`, `jenis`, `tanggal`, `bulan`, `Jumlah`) VALUES
('Balige', 'Padi', 88, 'Januari', 990),
('Laguboti', 'Padi', 88, 'Januari', 990),
('Balige', 'Padi', 90, 'Januari', 100),
('Sigumpar', 'Jagung', 0, 'Januari', 900),
('Porsea', 'Jagung', 0, 'Januari', 900),
('Siantar Narumonda', 'Jagung', 0, 'Januari', 900),
('Sigumpar', 'Tomat', 100, 'Februari', 100);

-- --------------------------------------------------------

--
-- Table structure for table `laporan`
--

CREATE TABLE `laporan` (
  `namaPengirim` varchar(20) NOT NULL,
  `tanggal` int(10) NOT NULL,
  `subjek` varchar(30) NOT NULL,
  `laporan` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `laporan`
--

INSERT INTO `laporan` (`namaPengirim`, `tanggal`, `subjek`, `laporan`) VALUES
('sds', 33, 'sds', 'sds'),
('Andrey', 22022017, 'Laporan Perkembangan jagung', 'Masih aman aman aja bos, belum signifikan');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
