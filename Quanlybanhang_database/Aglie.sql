CREATE DATabase QUANLYBANHANG


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
password nvarchar(30) not null,
gioitinh bit,
dienthoai nvarchar(15) not null,
ngaysinh date,
luong money not null,
socmnd nvarchar(15) not null,
diachi nvarchar(200),
anhdaidien nvarchar(30)
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
)


drop table HoaDonChiTiet
drop table hoadon
drop table nhanvien
drop table NhaSanXuat
drop table SanPham
drop table KhachHang


























































































