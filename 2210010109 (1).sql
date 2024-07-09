-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 09 Jul 2024 pada 02.29
-- Versi server: 10.4.25-MariaDB
-- Versi PHP: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `2210010109`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `table_arsip`
--

CREATE TABLE `table_arsip` (
  `kd_arsip` int(11) NOT NULL,
  `arsip` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `table_arsip`
--

INSERT INTO `table_arsip` (`kd_arsip`, `arsip`) VALUES
(1, 'babbi');

-- --------------------------------------------------------

--
-- Struktur dari tabel `table_hasil`
--

CREATE TABLE `table_hasil` (
  `kd_hasil` int(11) NOT NULL,
  `kd_arsip` int(2) NOT NULL,
  `no_surat` int(2) NOT NULL,
  `kd_progres` int(2) NOT NULL,
  `tgl_jawab` date NOT NULL,
  `hasil` varchar(20) NOT NULL,
  `kd_penyakit` int(2) NOT NULL,
  `jml_diagnosa` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `table_hewan`
--

CREATE TABLE `table_hewan` (
  `kd_hewan` int(11) NOT NULL,
  `hewan` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `table_progres`
--

CREATE TABLE `table_progres` (
  `kd_progres` int(10) NOT NULL,
  `tgl` int(10) NOT NULL,
  `tgl_kirim` date NOT NULL,
  `kd_kecamatan` date NOT NULL,
  `desa` varchar(25) NOT NULL,
  `kd_hewan` int(10) NOT NULL,
  `pemilik` varchar(25) NOT NULL,
  `kd_spesimen` int(10) NOT NULL,
  `kd_lab` int(10) NOT NULL,
  `jml` int(10) NOT NULL,
  `kd_jns_uji` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `table_arsip`
--
ALTER TABLE `table_arsip`
  ADD PRIMARY KEY (`kd_arsip`);

--
-- Indeks untuk tabel `table_hasil`
--
ALTER TABLE `table_hasil`
  ADD PRIMARY KEY (`kd_hasil`);

--
-- Indeks untuk tabel `table_hewan`
--
ALTER TABLE `table_hewan`
  ADD PRIMARY KEY (`kd_hewan`);

--
-- Indeks untuk tabel `table_progres`
--
ALTER TABLE `table_progres`
  ADD PRIMARY KEY (`kd_progres`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `table_arsip`
--
ALTER TABLE `table_arsip`
  MODIFY `kd_arsip` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT untuk tabel `table_hasil`
--
ALTER TABLE `table_hasil`
  MODIFY `kd_hasil` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT untuk tabel `table_hewan`
--
ALTER TABLE `table_hewan`
  MODIFY `kd_hewan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT untuk tabel `table_progres`
--
ALTER TABLE `table_progres`
  MODIFY `kd_progres` int(10) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
