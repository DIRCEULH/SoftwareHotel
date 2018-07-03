-- phpMyAdmin SQL Dump
-- version 4.4.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 01-Jan-2016 às 23:53
-- Versão do servidor: 5.6.26-log
-- PHP Version: 5.6.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotel`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `candidato`
--

CREATE TABLE IF NOT EXISTS `candidato` (
  `id` int(15) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `rg` varchar(15) DEFAULT NULL,
  `cpf` varchar(15) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `rua` varchar(50) DEFAULT NULL,
  `bairro` varchar(50) DEFAULT NULL,
  `cidade` varchar(50) DEFAULT NULL,
  `estado` varchar(50) DEFAULT NULL,
  `n` int(15) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=68 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `candidato`
--

INSERT INTO `candidato` (`id`, `nome`, `rg`, `cpf`, `email`, `telefone`, `rua`, `bairro`, `cidade`, `estado`, `n`) VALUES
(57, 'Dirceu Luis Heineck', '4081427413', '00056732082', 'dirceulh@hotmail.com', '(51) 9749-6359', 'Romenia', 'marechal Rondom', 'Cachoeirinha', 'Rs', 300),
(58, 'Diogo Carvalho', '4578457845', '07425247950', 'diogo@outlook.com', '(51) 7845-8956', 'Canada', 'Esperanca', 'Gravatai', 'Rs', 784),
(59, 'Paulo Daerlan', '7845895645', '95931228004', 'Paulo@hotmail.com', '(51) 9785-4589', 'Passarela 2', 'Rincao de ilheus', 'Cachoeirinha', 'Rs', 32),
(60, 'Carla ermantraut', '7845895645', '01391586000', 'carla@hotmail.com', '(51) 8956-4512', 'Tapajos', 'Rincao', 'Estancia Velha', 'Rs', 250),
(61, 'Thaysa Veiga', '7845896545', '55723047000', 'thaysa@hotmail.com', '(51) 8945-5623', 'Romenia', 'Canada', 'Gravatai', 'Rs', 260),
(62, 'Gilvana Comunnello', '7898564512', '97550345953', 'GGilvana@outlook.com', '(51) 8556-2356', 'Amazonas', 'Centro', 'Cachoeirinha', 'Rs', 570),
(63, 'Ricardo Souza', '7898564512', '02441504002', 'ricardo@outlook.com', '(51) 9785-4612', 'estados unidos', 'medianeira', 'Porto alegre', 'Rs', 45450),
(64, 'Mauricio medeiros', '7889457845', '75242966068', 'mau@hotmail.com', '(51) 8956-4512', 'maua', 'chacara das rosas', 'bento concalves', 'Rs', 4512),
(65, 'Thiago fagundes', '7889654512', '01313408085', 'tiago56@outlook.com', '(51) 8956-4512', 'novo hamburgo', 'Estancia velha', 'Dois Irmaos', 'Rs', 780),
(66, 'Jorge Engelmann', '78895645', '83629475000', 'jorge45@gmx.com', '(51) 8945-5654', 'taquareira', 'Travessão', 'Dois Irmaos', 'Rs', 8945),
(67, 'Gisele Heineck', '8956452178', '95433589072', 'gisa@hotmail.com', '(55) 8956-4512', 'joao batista', 'Centro', 'Santo cristo', 'Rs', 2378);

-- --------------------------------------------------------

--
-- Estrutura da tabela `consumo`
--

CREATE TABLE IF NOT EXISTS `consumo` (
  `idconsumo` int(11) NOT NULL,
  `idhospedagem` int(11) DEFAULT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `nomeproduto` varchar(45) DEFAULT NULL,
  `preco` varchar(45) DEFAULT NULL,
  `quantidade` int(11) DEFAULT NULL,
  `dia` varchar(45) DEFAULT NULL,
  `mes` varchar(45) DEFAULT NULL,
  `ano` varchar(45) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `consumo`
--

INSERT INTO `consumo` (`idconsumo`, `idhospedagem`, `nome`, `nomeproduto`, `preco`, `quantidade`, `dia`, `mes`, `ano`) VALUES
(1, 2, 'Paulo Daerlan', 'Alaminuta', '30.0', 2, '21', '12', '2015'),
(2, 3, 'Carla ermantraut', 'Xis salada', '10.00', 1, '23', '12', '2015'),
(3, 20, 'Gilvana Comunnello', 'Alaminuta', '60.0', 4, '01', '01', '2016'),
(16, 20, 'Gilvana Comunnello', 'Sprit 350 ml', '20.0', 4, '27', '12', '2015');

-- --------------------------------------------------------

--
-- Estrutura da tabela `hospedagem`
--

CREATE TABLE IF NOT EXISTS `hospedagem` (
  `idhospedagem` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `nquarto` int(11) DEFAULT NULL,
  `preco` varchar(45) DEFAULT NULL,
  `qtpessoas` int(11) DEFAULT NULL,
  `dataentrada` date DEFAULT NULL,
  `datasaida` date DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `hospedagem`
--

INSERT INTO `hospedagem` (`idhospedagem`, `nome`, `nquarto`, `preco`, `qtpessoas`, `dataentrada`, `datasaida`) VALUES
(2, 'Paulo Daerlan', 1, '250.00', 2, '2015-12-20', '2015-12-30'),
(3, 'Carla ermantraut', 2, '250.00', 2, '2015-12-20', '2015-12-20'),
(20, 'Gilvana Comunnello', 3, '125.00', 4, '2015-12-25', '2016-01-02');

-- --------------------------------------------------------

--
-- Estrutura da tabela `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `id` int(11) NOT NULL,
  `usuario` varchar(8) DEFAULT NULL,
  `senha` varchar(8) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `login`
--

INSERT INTO `login` (`id`, `usuario`, `senha`) VALUES
(1, 'hotel', 'hotel');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE IF NOT EXISTS `produto` (
  `idproduto` int(11) NOT NULL,
  `nomeproduto` varchar(45) DEFAULT NULL,
  `categoria` varchar(45) DEFAULT NULL,
  `precoproduto` varchar(45) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`idproduto`, `nomeproduto`, `categoria`, `precoproduto`) VALUES
(1, 'cocacola 350 ml', 'Bebidas', '5.00'),
(2, 'Sprit 350 ml', 'Bebidas', '5.00'),
(3, 'Xis salada', 'Alimentos', '10.00'),
(4, 'Xis coracão', 'Alimentos', '12.00'),
(5, 'Bolacha Recheada', 'Alimentos', '3.50'),
(6, 'Sanduiche', 'Alimentos', '7.50'),
(7, 'Alaminuta', 'Alimentos', '15.00'),
(8, 'Cerveja Skol 350 ml', 'Bebidas', '4.50'),
(9, 'Cerveja skin 350 ml', 'Bebidas', '4.00'),
(10, 'Cerveja Colonia 350 ml', 'Bebidas', ' 4.00'),
(11, 'Weiffer 50 kg', 'Alimentos', '2.50'),
(12, 'Cerveja Brhama choop', 'Bebidas', '5.00'),
(13, 'Suco de Uva copo 350 ml', 'Bebidas', '5.00'),
(14, 'Suco de laranja 350 ml', 'Bebidas', '5.00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `quarto`
--

CREATE TABLE IF NOT EXISTS `quarto` (
  `idquarto` int(11) NOT NULL,
  `numero` int(11) NOT NULL,
  `descrisao` varchar(45) NOT NULL,
  `localizacao` varchar(45) NOT NULL,
  `preco` varchar(15) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `quarto`
--

INSERT INTO `quarto` (`idquarto`, `numero`, `descrisao`, `localizacao`, `preco`) VALUES
(1, 1, 'Solteiro 2 pessoas', 'Terrio', '25.00'),
(2, 2, 'Casal 2 pessoas', 'Terrio', '25.00'),
(3, 3, 'Casal 4 pessoas', 'Terrio', '35.00'),
(4, 4, 'Solteiro 4 pessoas', 'Terrio', '60.00'),
(5, 5, 'Solteiro 1 pessoa', 'Terrio', '35.00'),
(6, 6, 'Solteiro 2 pessoas', 'Terrio', '40.00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `reserva`
--

CREATE TABLE IF NOT EXISTS `reserva` (
  `idreserva` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `nquarto` int(11) NOT NULL,
  `dataentrada` date NOT NULL,
  `datasaida` date NOT NULL,
  `qtpessoas` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `reserva`
--

INSERT INTO `reserva` (`idreserva`, `nome`, `nquarto`, `dataentrada`, `datasaida`, `qtpessoas`) VALUES
(1, 'Dirceu Luis Heineck', 1, '2016-01-05', '2016-01-05', 1),
(2, 'Diogo Carvalho', 2, '2016-01-05', '2016-01-10', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `candidato`
--
ALTER TABLE `candidato`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `consumo`
--
ALTER TABLE `consumo`
  ADD PRIMARY KEY (`idconsumo`),
  ADD KEY `idcliente_idx` (`preco`),
  ADD KEY `idhospedagem_idx` (`idhospedagem`),
  ADD KEY `idproduto_idx` (`nomeproduto`),
  ADD KEY `idcliente` (`preco`);

--
-- Indexes for table `hospedagem`
--
ALTER TABLE `hospedagem`
  ADD PRIMARY KEY (`idhospedagem`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`idproduto`);

--
-- Indexes for table `quarto`
--
ALTER TABLE `quarto`
  ADD PRIMARY KEY (`idquarto`);

--
-- Indexes for table `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`idreserva`),
  ADD KEY `idquarto_idx` (`nquarto`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `candidato`
--
ALTER TABLE `candidato`
  MODIFY `id` int(15) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=68;
--
-- AUTO_INCREMENT for table `consumo`
--
ALTER TABLE `consumo`
  MODIFY `idconsumo` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT for table `hospedagem`
--
ALTER TABLE `hospedagem`
  MODIFY `idhospedagem` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=21;
--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `produto`
--
ALTER TABLE `produto`
  MODIFY `idproduto` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=15;
--
-- AUTO_INCREMENT for table `quarto`
--
ALTER TABLE `quarto`
  MODIFY `idquarto` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT for table `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idreserva` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=10;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
