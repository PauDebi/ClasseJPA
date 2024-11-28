use persistencia;
select * from empleat;

delete from empleat where id = 1;

create table ADRECA (
    idAdreca int primary key,
    carrer varchar(80),
    codi_postal varchar(10),
    poblacio varchar(60)
);

create table USUARI (
    idUsuari int primary key,
    nom varchar(100),
    adreca int,
    foreign key (adreca) references ADRECA(idAdreca)
);

create table tasca (
    idTasca char(1) primary key,
    descripcio varchar(200),
    minuts int,
    usuari int,
    foreign key (usuari) references USUARI(idUsuari)
)
