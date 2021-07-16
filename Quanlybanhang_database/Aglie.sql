CREATE DATabase QUANLYBANHANG

use QUANLYBANHANG;
create table NhaSanXuat(
manhasanxuat varchar(15) primary key,
tennhasanxuat nvarchar(50) not null
)

create table SanPham(
masanpham varchar(15) primary key ,
tensanpham nvarchar(30) not null,
soluong int not null,
giasanpham money not null,
manhasanxuat varchar(15) 
foreign key(manhasanxuat) references nhasanxuat(manhasanxuat)
)

create table NhanVien(
manhanvien_username varchar(15) primary key,
tennhanvien nvarchar(50) not null,
ngayvaolam date, 
role nvarchar(30) not null,
password nvarchar(30)
--luong money
)

create table KhachHang(
makhachhang varchar(15) primary key,
tenkhachhang nvarchar(50)
)

create table hoadon(
mahoadon varchar(15) primary key,
ngaymua date not null,
manhanvien varchar(15) ,
makhachhang varchar(15),
-- Trang thai 
tongtien money not null,
foreign key(manhanvien) references nhanvien(manhanvien_username),
foreign key(makhachhang) references khachhang(makhachhang)
)

create table HoaDonChiTiet(
masanpham varchar(15),
soluong int not null,
mahoadon varchar(15),
foreign key(mahoadon) references hoadon(mahoadon),
foreign key(masanpham) references sanpham(masanpham)
);
select * from KhachHang
ALTER TABLE KhachHang
ADD
diachi nvarchar(50) not null,
gioitinh nvarchar(3),
ngaysinh date;
select * from SanPham
ALTER TABLE SanPham
ADD
anhsanpham varchar(255),
baohanh nvarchar(10),
hedieuhanh varchar(10),
ram varchar(10),
pinsac varchar(10),
mangdidong varchar(10),
manhinhrong varchar(10),
mota nvarchar(255);
select * from NhanVien
ALTER TABLE NhanVien
ADD
hocvan nvarchar(50),
gioitinh nvarchar(3),
dienthoai varchar(10),
ngaysinh date,
luong money,
diachi nvarchar(50),
cmndcccd varchar(20)
select * from NhaSanXuat
ALTER TABLE NhaSanXuat
ADD
diachi nvarchar(50),
dienthoai varchar(10),
email varchar(50),
motathem nvarchar(255)
drop table HoaDonChiTiet
drop table hoadon
drop table nhanvien
drop table users
drop table NhaSanXuat
drop table SanPham
drop table KhachHang


























































































