-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 04, 2019 at 01:39 AM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `coba_pbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `deposit`
--

CREATE TABLE `deposit` (
  `id` int(11) NOT NULL,
  `deposited_by` varchar(50) NOT NULL,
  `crypto_type` varchar(50) NOT NULL,
  `received_from` varchar(50) NOT NULL,
  `send_to` varchar(100) NOT NULL,
  `amount` double NOT NULL,
  `estimate` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `deposit`
--

INSERT INTO `deposit` (`id`, `deposited_by`, `crypto_type`, `received_from`, `send_to`, `amount`, `estimate`) VALUES
(2, 'a', 'Bitcoin', '1', '1nXMEJfya0yPgWviBGkgfapNPNkRWnZegR', 0.01, 1000000),
(3, 'a', 'Bitcoin', '11', '1nXMEJfya0yPgWviBGkgfapNPNkRWnZegR', 0.001, 100000),
(4, 'a', 'Ethereum', '0x', '0x0AZ1NBoG1AN6UcBcekh4na4sYBXJZZ2ohrPjs478', 0.4, 800000),
(5, 'a', 'Bitcoin', '12as', '1rPpDbzHNOQTxNhO879RNWfIQRET1sAqFv', 0.0001, 10000),
(7, 'ariffudinnotresponding@gmail.com', 'Ripple', 'rrrr', 'rCmctjB8FGCH82i3shMNcdzytQYrInMN2X', 400, 1800000),
(8, 'ariffudinnotresponding@gmail.com', 'Bitcoin', '1MUz4VMYui5qY1mxUiG8BQ1Luv6tqkvaiL', '1QiWJbXMNy0jUJjN4foNd9HD4SJ88UeJP0', 0.003, 300000);

-- --------------------------------------------------------

--
-- Table structure for table `login_log`
--

CREATE TABLE `login_log` (
  `id` bigint(18) NOT NULL,
  `user_id` varchar(50) DEFAULT NULL,
  `login_time` timestamp NOT NULL DEFAULT current_timestamp(),
  `logout_time` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `login_log`
--

INSERT INTO `login_log` (`id`, `user_id`, `login_time`, `logout_time`) VALUES
(263, 'ariffudinnotresponding@gmail.com', '2019-12-04 00:16:12', '2019-12-04 00:19:43'),
(262, 'ariffudinnotresponding@gmail.com', '2019-12-04 00:02:20', '2019-12-04 00:13:07'),
(261, 'a', '2019-12-03 23:40:07', '2019-12-03 23:41:52'),
(260, 'a', '2019-12-03 04:33:01', '2019-12-03 05:29:27'),
(259, 'ariffudinnotresponding@gmail.com', '2019-12-03 04:31:00', '2019-12-03 04:32:51'),
(258, 'a', '2019-12-03 04:29:24', '2019-12-03 04:29:42'),
(257, 'a', '2019-12-02 06:17:45', '2019-12-02 06:17:57'),
(256, 'a', '2019-12-02 06:16:29', '2019-12-02 06:17:27'),
(255, 'a', '2019-12-02 03:17:31', '2019-12-02 03:17:31'),
(254, 'a', '2019-12-02 03:07:35', '2019-12-02 03:15:44'),
(253, 'ariffudinnotresponding@gmail.com', '2019-12-02 03:04:19', '2019-12-02 03:17:17'),
(252, 'a', '2019-12-02 03:03:05', '2019-12-02 03:04:00'),
(251, 'a', '2019-12-02 02:46:55', '2019-12-02 02:58:47'),
(250, 'ariffudinnotresponding@gmail.com', '2019-12-01 11:35:59', '2019-12-01 11:39:55'),
(249, 'a', '2019-12-01 11:31:47', '2019-12-01 11:31:47'),
(248, 'a', '2019-12-01 11:28:43', '2019-12-01 11:29:07'),
(247, 'a', '2019-12-01 11:27:58', '2019-12-01 11:27:58'),
(246, 'a', '2019-12-01 11:26:17', '2019-12-01 11:26:17'),
(245, 'a', '2019-12-01 11:21:58', '2019-12-01 11:22:08'),
(244, 'a', '2019-12-01 11:19:55', '2019-12-01 11:19:55'),
(243, 'a', '2019-12-01 11:18:55', '2019-12-01 11:18:55'),
(242, 'a', '2019-12-01 11:18:23', '2019-12-01 11:18:23'),
(241, 'a', '2019-12-01 11:17:40', '2019-12-01 11:17:40'),
(240, 'a', '2019-12-01 11:16:15', '2019-12-01 11:16:15'),
(239, 'a', '2019-12-01 11:13:13', '2019-12-01 11:16:04'),
(238, 'a', '2019-12-01 11:12:37', '2019-12-01 11:12:51'),
(237, 'a', '2019-12-01 11:09:23', '2019-12-01 11:09:23'),
(236, 'a', '2019-12-01 11:07:10', '2019-12-01 11:07:32'),
(235, 'ariffudinnotresponding@gmail.com', '2019-12-01 11:01:58', '2019-12-01 11:04:05'),
(234, 'a', '2019-12-01 10:28:26', '2019-12-01 10:28:26'),
(233, 'a', '2019-12-01 10:24:47', '2019-12-01 10:25:12'),
(232, 'a', '2019-12-01 10:08:29', '2019-12-01 10:08:56'),
(231, 'a', '2019-12-01 10:05:27', '2019-12-01 10:05:27'),
(230, 'a', '2019-12-01 10:04:09', '2019-12-01 10:04:09'),
(229, 'a', '2019-12-01 10:02:35', '2019-12-01 10:02:55'),
(228, 'a', '2019-12-01 10:00:20', '2019-12-01 10:02:22'),
(227, 'a', '2019-12-01 09:44:55', '2019-12-01 09:44:55'),
(226, 'a', '2019-12-01 09:41:28', '2019-12-01 09:41:28'),
(225, 'a', '2019-12-01 09:18:24', '2019-12-01 09:20:57'),
(224, 'a', '2019-12-01 09:17:24', '2019-12-01 09:17:24'),
(223, 'a', '2019-12-01 09:13:01', '2019-12-01 09:13:01'),
(222, 'a', '2019-12-01 09:06:37', '2019-12-01 09:06:37'),
(221, 'a', '2019-12-01 09:04:30', '2019-12-01 09:04:30'),
(220, 'a', '2019-12-01 09:03:46', '2019-12-01 09:03:46'),
(219, 'a', '2019-12-01 08:56:49', '2019-12-01 09:03:35'),
(218, 'a', '2019-12-01 08:55:42', '2019-12-01 08:55:42'),
(217, 'a', '2019-12-01 08:52:50', '2019-12-01 08:52:50'),
(216, 'a', '2019-12-01 08:30:16', '2019-12-01 08:30:16'),
(215, 'a', '2019-12-01 08:26:41', '2019-12-01 08:26:41'),
(214, 'a', '2019-12-01 08:25:23', '2019-12-01 08:25:23'),
(213, 'a', '2019-12-01 08:19:35', '2019-12-01 08:19:35'),
(212, 'a', '2019-12-01 08:17:46', '2019-12-01 08:17:46'),
(211, 'a', '2019-12-01 08:16:39', '2019-12-01 08:16:39'),
(210, 'a', '2019-12-01 08:15:42', '2019-12-01 08:15:42'),
(209, 'a', '2019-12-01 08:14:34', '2019-12-01 08:14:34'),
(208, 'a', '2019-12-01 08:09:31', '2019-12-01 08:09:31'),
(207, 'a', '2019-12-01 08:07:30', '2019-12-01 08:07:30'),
(206, 'a', '2019-12-01 08:05:58', '2019-12-01 08:05:58'),
(205, 'a', '2019-12-01 08:04:25', '2019-12-01 08:04:25'),
(204, 'a', '2019-12-01 08:00:22', '2019-12-01 08:00:22'),
(203, 'a', '2019-12-01 07:59:05', '2019-12-01 08:00:15'),
(202, 'a', '2019-12-01 07:55:34', '2019-12-01 07:55:34'),
(201, 'a', '2019-12-01 07:51:27', '2019-12-01 07:53:26'),
(200, 'a', '2019-12-01 06:57:13', '2019-12-01 06:57:39'),
(199, 'a', '2019-12-01 06:42:46', '2019-12-01 06:56:35'),
(198, 'a', '2019-12-01 06:35:48', '2019-12-01 06:35:48'),
(197, 'a', '2019-12-01 06:33:00', '2019-12-01 06:33:28'),
(196, 'a', '2019-12-01 06:30:21', '2019-12-01 06:30:21'),
(195, 'a', '2019-12-01 06:27:59', '2019-12-01 06:30:13'),
(194, 'a', '2019-12-01 06:24:15', '2019-12-01 06:24:15'),
(193, 'a', '2019-12-01 06:22:50', '2019-12-01 06:22:50'),
(192, 'A', '2019-12-01 06:13:46', '2019-12-01 06:13:46'),
(191, 'a', '2019-12-01 06:07:35', '2019-12-01 06:07:35'),
(190, 'a', '2019-12-01 06:06:38', '2019-12-01 06:06:45'),
(189, 'a', '2019-12-01 06:03:27', '2019-12-01 06:03:27'),
(188, 'a', '2019-12-01 05:49:05', '2019-12-01 05:49:05'),
(187, 'a', '2019-12-01 05:47:42', '2019-12-01 05:47:42'),
(186, 'a', '2019-12-01 05:45:17', '2019-12-01 05:45:53'),
(185, 'a', '2019-12-01 05:40:41', '2019-12-01 05:43:09'),
(184, 'a', '2019-12-01 05:33:55', '2019-12-01 05:35:06'),
(183, 'a', '2019-12-01 05:32:34', '2019-12-01 05:33:48'),
(182, 'a', '2019-12-01 05:31:11', '2019-12-01 05:32:27'),
(181, 'a', '2019-12-01 05:29:11', '2019-12-01 05:31:02'),
(180, 'a', '2019-12-01 05:25:24', '2019-12-01 05:29:09'),
(179, 'a', '2019-12-01 05:24:15', '2019-12-01 05:25:18'),
(178, 'a', '2019-12-01 05:16:08', '2019-12-01 05:16:15'),
(177, 'a', '2019-12-01 05:15:26', '2019-12-01 05:16:02'),
(176, 'a', '2019-12-01 05:14:55', '2019-12-01 05:14:55'),
(175, 'a', '2019-12-01 05:14:33', '2019-12-01 05:14:33'),
(174, 'a', '2019-12-01 05:06:15', '2019-12-01 05:14:15'),
(173, 'a', '2019-12-01 05:02:52', '2019-12-01 05:06:09'),
(172, 'a', '2019-12-01 04:58:54', '2019-12-01 05:02:35'),
(171, 'a', '2019-12-01 04:56:18', '2019-12-01 04:56:18'),
(170, 'a', '2019-12-01 04:53:37', '2019-12-01 04:53:37'),
(169, 'a', '2019-12-01 04:51:20', '2019-12-01 04:51:20'),
(168, 'a', '2019-11-27 20:34:36', '2019-11-27 20:34:36'),
(167, 'a', '2019-11-27 20:33:28', '2019-11-27 20:33:28'),
(166, 'a', '2019-11-26 19:25:40', '2019-11-26 19:25:40'),
(165, 'a', '2019-11-25 19:07:51', '2019-11-25 19:07:51'),
(164, 'a', '2019-11-25 10:27:08', '2019-11-25 10:27:08'),
(163, 'a', '2019-11-25 10:25:50', '2019-11-25 10:25:50'),
(162, 'a', '2019-11-25 10:21:31', '2019-11-25 10:21:31'),
(161, 'a', '2019-11-25 10:18:38', '2019-11-25 10:18:38'),
(160, 'a', '2019-11-25 09:48:30', '2019-11-25 09:48:30'),
(159, 'a', '2019-11-25 08:53:53', '2019-11-25 08:54:09'),
(158, 'a', '2019-11-25 08:52:35', '2019-11-25 08:52:35');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `email` varchar(100) NOT NULL,
  `password` varchar(100) DEFAULT NULL,
  `username` varchar(100) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `btc_addr` varchar(100) DEFAULT NULL,
  `eth_addr` varchar(100) DEFAULT NULL,
  `bch_addr` varchar(50) DEFAULT NULL,
  `xrp_addr` varchar(50) DEFAULT NULL,
  `dash_addr` varchar(50) DEFAULT NULL,
  `ltc_addr` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`email`, `password`, `username`, `address`, `btc_addr`, `eth_addr`, `bch_addr`, `xrp_addr`, `dash_addr`, `ltc_addr`) VALUES
('a', 'c4ca4238a0b923820dcc509a6f75849b', 'Aripon Ganteng', 'Bumi Ronggolawe Tok', '1ExAfbyAtOA0xSRuAW8cKkChihLyJrYjie', '0xQASMD88xQuPh4FlOMkZYBMrWt81i7jdzd8XVhPz4', '33gxfxX7AgHjfRhrkt2H1qhWRgbf9p3pnC', 'rtjV6kIccKnpVYQQICRM0BEAj2oErlJkgR', 'XyCfTm6fNKtX7yzGuKlYcrfmiZ2vIQNcIta', 'LmmfLy2n95q7jOy9NqEZJ9a21Fxzhpoiuu9'),
('ariffudinnotresponding@gmail.com', '4dd39f49f898c062283963c187532af8', 'Arif', 'Malang', '1QiWJbXMNy0jUJjN4foNd9HD4SJ88UeJP0', '0xW37qeVpFaF0mDl2KP0OGcxsVKFNqbh4NGG7BCnRJ', '35oQCIZaDUVG4MnUrWfVBKBLqZlMHdInbC', 'rCmctjB8FGCH82i3shMNcdzytQYrInMN2X', 'XsudGiX4D77VQJ3gtrYb2HXSWm5nQUce2b1', 'LU6TCDGMtrqyI26NJGMoP8hrnsWrZck8mRr');

-- --------------------------------------------------------

--
-- Table structure for table `withdraw`
--

CREATE TABLE `withdraw` (
  `id` int(11) NOT NULL,
  `withdrawed_by` varchar(50) NOT NULL,
  `crypto_type` varchar(100) NOT NULL,
  `withdraw_to` varchar(100) NOT NULL,
  `received_from` varchar(100) NOT NULL,
  `amount` double NOT NULL,
  `estimate` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `withdraw`
--

INSERT INTO `withdraw` (`id`, `withdrawed_by`, `crypto_type`, `withdraw_to`, `received_from`, `amount`, `estimate`) VALUES
(1, 'a', 'a', 'a', 'a', 2.1, 10),
(3, 'a', 'Ethereum', '0xQASMD88xQuPh4FlOMkZYBMrWt81i7jdzd8XVhPz4', '0xA2503B22F42880980792f13726d62a9c56052477', 0.001, 2000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `deposit`
--
ALTER TABLE `deposit`
  ADD PRIMARY KEY (`id`),
  ADD KEY `deposited_by` (`deposited_by`);

--
-- Indexes for table `login_log`
--
ALTER TABLE `login_log`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`email`),
  ADD KEY `username_index` (`username`);

--
-- Indexes for table `withdraw`
--
ALTER TABLE `withdraw`
  ADD PRIMARY KEY (`id`),
  ADD KEY `withdrawed_by` (`withdrawed_by`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `deposit`
--
ALTER TABLE `deposit`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `login_log`
--
ALTER TABLE `login_log`
  MODIFY `id` bigint(18) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=264;

--
-- AUTO_INCREMENT for table `withdraw`
--
ALTER TABLE `withdraw`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `deposit`
--
ALTER TABLE `deposit`
  ADD CONSTRAINT `deposit_ibfk_1` FOREIGN KEY (`deposited_by`) REFERENCES `user` (`email`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `withdraw`
--
ALTER TABLE `withdraw`
  ADD CONSTRAINT `withdraw_ibfk_1` FOREIGN KEY (`withdrawed_by`) REFERENCES `user` (`email`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
