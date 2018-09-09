CREATE SCHEMA avto;

CREATE TABLE avto_marks (
	id                   uuid  NOT NULL ,
	name                 varchar(100)  NOT NULL ,
	CONSTRAINT pk_mark_id PRIMARY KEY ( id )
 );

CREATE TABLE avto_models (
	id                   uuid  NOT NULL ,
	name                 varchar(100)  NOT NULL ,
	mark_id              uuid  NOT NULL ,
	CONSTRAINT pk_model_id PRIMARY KEY ( id )
 );

CREATE INDEX idx_avto_models_mark_id ON avto_models ( mark_id );

CREATE TABLE avto_params (
	id                   uuid  NOT NULL ,
	model_id             uuid  NOT NULL ,
	mark_id              uuid  NOT NULL ,
	"year"               integer  NOT NULL ,
	distance             real  NOT NULL ,
	power                integer  NOT NULL ,
	engine_volume        real  NOT NULL ,
	transmision          varchar(100)   ,
	engine_type          varchar(100)   ,
	CONSTRAINT pk_avto_params_id PRIMARY KEY ( id )
 );

CREATE INDEX idx_avto_params_model_id ON avto_params ( model_id );

CREATE INDEX idx_avto_params_mark_id ON avto_params ( mark_id );

CREATE TABLE roles (
	id                   uuid  NOT NULL ,
	name                 varchar(100)  NOT NULL ,
	CONSTRAINT pk_roles_id PRIMARY KEY ( id )
 );


CREATE TABLE usr (
	id                   uuid  NOT NULL ,
	name                 varchar(255)  NOT NULL ,
	phone                varchar(25)  NOT NULL ,
	role_id              uuid  ,
	CONSTRAINT pk_usr_id PRIMARY KEY ( id )
 );

CREATE INDEX idx_usr_role_id ON usr ( role_id );

CREATE TABLE advertisement (
	id                   uuid  NOT NULL ,
	title                varchar(255)  NOT NULL ,
	description          text   ,
	longitude            real   ,
	latitude             real  NOT NULL ,
	price                real  NOT NULL ,
	start_date           date  NOT NULL ,
	is_active            bool  NOT NULL ,
	city                 varchar(100)  NOT NULL ,
	seller_id            uuid  NOT NULL ,
	params_id            uuid  NOT NULL ,
	CONSTRAINT pk_advertisement_id PRIMARY KEY ( id )
 );

CREATE INDEX idx_advertisement_seller_id ON advertisement ( seller_id );

CREATE INDEX idx_advertisement_params_id ON advertisement ( params_id );

CREATE TABLE "comment" (
	id                   uuid  NOT NULL ,
	commentator_id       uuid  NOT NULL ,
	advertisement_id     uuid  NOT NULL ,
	comment_text         text  NOT NULL ,
	CONSTRAINT pk_cmment_id PRIMARY KEY ( id )
 );

CREATE INDEX idx_comment_commentator_id ON "comment" ( commentator_id );

CREATE INDEX idx_comment_advertisement_id ON "comment" ( advertisement_id );

ALTER TABLE advertisement ADD CONSTRAINT fk_advertisement_usr_id FOREIGN KEY ( seller_id ) REFERENCES usr( id );

ALTER TABLE advertisement ADD CONSTRAINT fk_advertisement_avto_params FOREIGN KEY ( params_id ) REFERENCES avto_params( id );

ALTER TABLE avto_models ADD CONSTRAINT fk_avto_models_avto_marks_id FOREIGN KEY ( mark_id ) REFERENCES avto_marks( id );

ALTER TABLE avto_params ADD CONSTRAINT fk_avto_params_avto_models FOREIGN KEY ( model_id ) REFERENCES avto_models( id );

ALTER TABLE avto_params ADD CONSTRAINT fk_avto_params_avto_marks FOREIGN KEY ( mark_id ) REFERENCES avto_marks( id );

ALTER TABLE "comment" ADD CONSTRAINT fk_comment_commentator_id FOREIGN KEY ( commentator_id ) REFERENCES usr( id );

ALTER TABLE "comment" ADD CONSTRAINT fk_comment_advertisement_id FOREIGN KEY ( advertisement_id ) REFERENCES advertisement( id );

ALTER TABLE usr ADD CONSTRAINT fk_usr_role_id FOREIGN KEY ( role_id ) REFERENCES roles( id );

