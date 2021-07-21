create database quan_ly_ban_hang;
use quan_ly_ban_hang;
create table khachhang(
makhachhang varchar(10) primary key,
tenkhachhang nvarchar(100),
);
create table nhanvien(
manhanvien_username varchar(50) primary key,
tennhanvien nvarchar(100),
ngayvaolam date,
role nvarchar(30),
password nvarchar(30),
);
create table nhasanxuat(
manhasanxuat varchar(10) primary key,
tennhasanxuat nvarchar(100)
)
create table sanpham(
masanpham varchar(10) primary key,
tensanpham nvarchar(100) not null,
soluong int,
giasanpham money,
manhasanxuat varchar(10),
constraint fk_sanpham_nhasanxuat foreign key (manhasanxuat) references nhasanxuat(manhasanxuat)
)
create table hoadon(
mahoadon varchar(10)primary key,
ngaymua date,
manhanvien varchar(50),
makhachhang varchar(10),
tongtien money
constraint fk_hoadon_khachhang foreign key (makhachhang) references khachhang(makhachhang),
constraint fk_hoadon_nhanvien foreign key (manhanvien) references nhanvien(manhanvien_username)
);
create table hoadonchitiet(
masanpham varchar(10),
soluong int,
mahoadon varchar(10),
constraint fk_hoadonchitiet_hoadon foreign key (mahoadon) references hoadon(mahoadon)
);
alter table hoadonchitiet add constraint fk_hoadonchitiet_sanpham foreign key(masanpham) references sanpham(masanpham);
use quan_ly_ban_hang
ALTER TABLE khachhang
ADD
diachi nvarchar(50) not null,
gioitinh nvarchar(3),
ngaysinh date;
ALTER TABLE sanpham
ADD
anhsanpham varchar(255),
baohanh nvarchar(10), 
hedieuhanh varchar(10),
ram varchar(10),
pinsac varchar(10),
mangdidong varchar(10),
manhinhrong varchar(10),
mota nvarchar(255);
ALTER TABLE nhanvien
ADD
hocvan nvarchar(50),
gioitinh nvarchar(3),
dienthoai varchar(10),
ngaysinh date,
luong money,
diachi nvarchar(50),
cmndcccd varchar(20)
ALTER TABLE nhasanxuat
ADD
diachi nvarchar(50),
dienthoai varchar(10),
email varchar(50),
motathem nvarchar(255)