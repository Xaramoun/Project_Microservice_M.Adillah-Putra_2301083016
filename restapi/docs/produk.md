# Produk API

## Create Produk
Endpoint : POST /api/produk

request body : 
```json
{
    "nama"      : "produk a",
    "harga"     : "230000",
    "Deskripsi" : "produk a produk paling recommend"
}
```

response body (success) : 
```json
{
    "msg" : "Produk Berhasil Ditambahkan"
}
```

response body (failed) : 
```json
{
    "msg" : "Produk Gagal Ditambahkan"
}
```