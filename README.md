# SpinnerV2

```xml
<Spinner
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:id="@+id/listItem"
    android:entries="@array/daftar_makanan"
    android:padding="15dp">
</Spinner>

<Button
    android:id="@+id/submit"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="Pesan Makanan"/>
```

```java
final Spinner List = findViewById(R.id.listItem);

//Inisialiasi Array Adapter dengan memasukkan String Array
final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
        android.R.layout.simple_spinner_dropdown_item,Item);

//Memasukan Adapter pada Spinner
List.setAdapter(adapter);

//Mengeset listener untuk mengetahui event/aksi saat item dipilih
List.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
    @Override
    public void onItemSelected(AdapterView adapterView, View view, int i, long l) {
        Toast.makeText(getApplicationContext(),"Saya Memesan "+adapter.getItem(i), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView adapterView) {

    }
});

Button Submit = findViewById(R.id.submit);
Submit.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Toast.makeText(getApplicationContext(), "Saya Memesan "+List.getSelectedItem(), Toast.LENGTH_SHORT).show();
    }
});
```

---

```
Copyright 2022 M. Fadli Zein
```