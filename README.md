# OpenFire_Decrypt
OpenFire 管理后台账号密码解密

![](./images/install.png)

`/usr/share/openfire/embedded-db/openfire.log`

```
/*C3*/INSERT INTO OFPROPERTY VALUES('passwordKey','QWMRc9f3X9t2BN0')
/*C1*/DELETE FROM OFUSER WHERE USERNAME='admin'
INSERT INTO OFUSER VALUES('admin',NULL,'cef7d1faf10db55cdd43847c9869da627674cda780275756','Administrator','admin@example.com','0','0')
```

`select encryptedPassword from OFUSER where username='admin';`

`select * from ofproperty where propValue='passwordKey' `

![](./images/password.png)


**`encryptedPassword`**  **`passwordKey`**
```
String encryptedPassword = "cef7d1faf10db55cdd43847c9869da627674cda780275756";
String passwordKey = "QWMRc9f3X9t2BN0";
```

![](./images/decrypt.png)
