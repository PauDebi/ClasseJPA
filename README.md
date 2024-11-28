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
);

create table Producte (
    referencia char(3) primary key,
    nom varchar(30),
    descripcio varchar(200)
)

create table compra(
    usuari int,
    producte char(3),
    foreign key (usuari) references USUARI(idUsuari),
    foreign key (producte) references Producte(referencia)
)

create table episodi(
    temporada int,
    numero int,
    titol varchar(150),
    minuts int,
    primary key (temporada, numero)
);

create table ciutat(
    id int primary key,
    nom varchar(60)
);

create table alumne(
    nAlumne int primary key,
    nom varchar(100),
    correu varchar(150),
    ciutat int,
    foreign key (ciutat) references ciutat(id)
);

create table modul(
    codi char(3) primary key,
    nom varchar(100),
    hores int
);

create table matricula(
    alumne int,
    modul char(3),
    primary key (alumne, modul),
    foreign key (modul) references modul(codi),
    foreign key (alumne) references alumne(nAlumne)
);
