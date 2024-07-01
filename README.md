# PatikaStore Ürün Yönetim Sistemi


Patika ekibi, elektronik eşyaların satıldığı sanal bir mağaza olan PatikaStore'u açmaya karar verdi ve ürün yönetim sistemi için Patika gönüllülerinden yardım istiyor.

## Proje Tanımı
PatikaStore projesi, Nesne Yönelimli Programlama (OOP) prensipleriyle tasarlanmıştır ve terminal üzerinden metin tabanlı olarak çalışır. Bu yaklaşım, projenin daha modüler, bakımı kolay ve genişletilebilir olmasını sağlar.

## Genel Bilgiler
Sanal mağazanın adı: PatikaStore

### Mağazada oluşturulacak markalar:

Samsung
Lenovo
Apple
Huawei
Casper
Asus
HP
Xiaomi
Monster
Markalar her zaman alfabetik sıraya göre listelenmelidir.

Şu an için satılacak ürün grupları:
Cep Telefonları
Notebook


### Ürün Özellikleri
#### Cep Telefonları
Ürün ID: Sistemde kayıtlı benzersiz numarası

Ürün Adı

Marka

Birim Fiyatı

İndirim Oranı

Stok Miktarı

Hafıza Bilgisi (128 GB, 64 GB)

Ekran Boyutu (6.1 İnc)

Pil Gücü (4000 mAh)

RAM (6 GB)

Renk (Siyah, Kırmızı, Mavi)

#### Notebook
Ürün ID: Sistemde kayıtlı benzersiz numarası

Ürün Adı

Marka

Birim Fiyatı

İndirim Oranı

Stok Miktarı

RAM (8 GB)

Depolama (512 SSD)

Ekran Boyutu (14 inç)

### Nesne Yönelimli Programlama (OOP) Kullanımı
PatikaStore projesi, OOP'nin sağladığı avantajlardan faydalanarak tasarlanmıştır. Özellikle şu noktalarda OOP prensipleri kullanılmıştır:

Sınıflar ve Nesneler: Her ürün grubu için ayrı sınıflar oluşturulmuş ve her bir ürün nesnesi ilgili sınıfa ait özelliklere sahiptir.

Kalıtım (Inheritance): Ürünlerin ortak özellikleri olan birçok alan (örneğin ürün ID, ürün adı, birim fiyatı, stok miktarı, marka bilgisi, indirim oranı) üst sınıftan miras alınarak yeniden kullanılmıştır.

Soyutlama (Abstraction): Her ürün grubu için soyut sınıflar veya arayüzler tanımlanmış ve bu arayüzler üzerinden ürünlerin yönetimi sağlanmıştır.

Kapsülleme (Encapsulation): Her ürün sınıfı, ilgili verileri korumak ve doğrudan erişimini engellemek için gerekli getter ve setter metodları ile kapsüllenmiştir.

Çok Biçimlilik (Polymorphism): Kullanıcı işlemlerinde, aynı metot ismi ile farklı ürün gruplarına ait farklı işlemleri gerçekleştiren metotlar kullanılmıştır.

### Başlangıç
Projenin çalıştırılması için Main.java sınıfı kullanılabilir. Bu sınıf, proje başlangıç noktasını temsil eder ve uygulamayı başlatır.

### Katkıda Bulunma
Proje geliştirilmesine katkıda bulunmak isterseniz forklayabilir ve pull request gönderebilirsiniz. Katkılarınızı bekliyoruz!
