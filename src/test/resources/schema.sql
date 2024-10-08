DROP TABLE "members";

CREATE TABLE "members" (
	"id"	int		NOT NULL,
	"name"	varchar(100)		NULL,
	"email"	varchar(100)		NULL,
	"phone"	varchar(15)		NULL,
	"birthdate"	DATE		NULL,
	"gender"	ENUM('M', 'F')		NULL,
	"membership_type"	enum('일반','VIP','이벤트')		NULL,
	"join_date"	DATETIME		NULL,
	"profile_image"	VARCHAR(255)		NULL,
	"status"	enum('활성','탈퇴')		NULL,
	"created_at"	timestamp		NULL,
	"updated_at"	timestamp		NULL
);

ALTER TABLE "members" ADD CONSTRAINT "PK_MEMBERS" PRIMARY KEY (
	"id"
);