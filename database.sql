DROP DATABASE IF EXISTS urban_green_care;

CREATE DATABASE urban_green_care
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;

USE urban_green_care;


-- Таблиця дерев

CREATE TABLE tree (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    inventory_number VARCHAR(40) NOT NULL UNIQUE,
    species VARCHAR(100) NOT NULL,
    location VARCHAR(255) NOT NULL
);


-- Таблиця оглядів

CREATE TABLE inspection (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    tree_id BIGINT NOT NULL,
    inspection_date DATE NOT NULL,
    condition_score INT NOT NULL,
    notes TEXT,

    FOREIGN KEY (tree_id) REFERENCES tree(id)
);


-- Таблиця заявок на роботи

CREATE TABLE work_request (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    inspection_id BIGINT NOT NULL,
    description TEXT NOT NULL,
    state VARCHAR(30) NOT NULL,
    f1 DOUBLE NOT NULL,
    f2 DOUBLE NOT NULL,
    f3 DOUBLE NOT NULL,
    risk_index DOUBLE NOT NULL,

    FOREIGN KEY (inspection_id)
        REFERENCES inspection(id)
);


-- Таблиця нарядів

CREATE TABLE work_order (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    work_request_id BIGINT NOT NULL,
    description TEXT NOT NULL,
    planned_date DATE NOT NULL,
    completed_date DATE,
    executor VARCHAR(120) NOT NULL,

    FOREIGN KEY (work_request_id)
        REFERENCES work_request(id)
);


-- Початкові дані

INSERT INTO tree
(inventory_number, species, location)
VALUES
('PLT-001', 'Дуб', 'Полтава, Центральний парк'),
('PLT-002', 'Клен', 'Полтава, вулиця Соборності');


INSERT INTO inspection
(tree_id, inspection_date, condition_score, notes)
VALUES
(1, '2026-10-10', 80, 'Виявлено сухі та пошкоджені гілки'),
(2, '2026-10-12', 30, 'Дерево перебуває у задовільному стані');


INSERT INTO work_request
(inspection_id, description, state, f1, f2, f3, risk_index)
VALUES
(1, 'Обрізка небезпечних гілок', 'PLANNED',
 80, 70, 90, 79.0),

(2, 'Профілактичний догляд', 'COMPLETED',
 30, 50, 40, 39.5);


INSERT INTO work_order
(work_request_id, description, planned_date,
 completed_date, executor)
VALUES
(1, 'Обрізати пошкоджені гілки', '2026-10-25',
 NULL, 'Комунальна служба'),

(2, 'Провести профілактичний огляд', '2026-10-15',
 '2026-10-15', 'Міська служба озеленення');