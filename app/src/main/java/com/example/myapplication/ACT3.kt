package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AktivitasPertama(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(top = 40.dp, start = 12.dp, end = 12.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            stringResource(R.string.prodi),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            stringResource(R.string.univ),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))
        ItemCard(
            cardColor = colorResource(R.color.card_0_bg),
            nama = R.string.nama_1,
            noHp = R.string.nohp_1,
            alamat = R.string.alamat_1,
            fontNama = FontFamily.Cursive,
            warnaNama = Color.White,
            warnaNoHp = colorResource(R.color.text_cyan),
            warnaAlamat = colorResource(R.color.text_yellow)
        )

        Spacer(modifier = Modifier.height(8.dp))
        ItemCard(
            cardColor = colorResource(R.color.card_1_bg),
            nama = R.string.nama_2,
            noHp = R.string.nohp_2,
            alamat = R.string.alamat_2,
            fontNama = FontFamily.Default,
            warnaNama = Color.White,
            warnaNoHp = colorResource(R.color.text_cyan),
            warnaAlamat = colorResource(R.color.text_yellow)
        )

        Spacer(modifier = Modifier.height(8.dp))
        ItemCard(
            cardColor = colorResource(R.color.card_2_bg),
            nama = R.string.nama_3,
            noHp = R.string.nohp_3,
            alamat = R.string.alamat_3,
            fontNama = FontFamily.Default,
            warnaNama = Color.White,
            warnaNoHp = colorResource(R.color.text_cyan),
            warnaAlamat = colorResource(R.color.text_yellow)
        )
        Spacer(modifier = Modifier.height(8.dp))
        ItemCard(
            cardColor = colorResource(R.color.card_3_bg),
            nama = R.string.nama_4,
            noHp = R.string.nohp_4,
            alamat = R.string.alamat_4,
            fontNama = FontFamily.Default,
            warnaNama = Color.White,
            warnaNoHp = colorResource(R.color.text_cyan),
            warnaAlamat = colorResource(R.color.text_yellow)
        )
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                stringResource(R.string.copy),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 30.dp)
            )
        }
    }
}
@Composable
fun ItemCard(
    cardColor: Color,
    nama: Int,
    noHp: Int?,
    alamat : Int,
    fontNama: FontFamily,
    warnaNama: Color,
    warnaNoHp: Color? = null,
    warnaAlamat: Color
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = cardColor
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            val gambar = painterResource(R.drawable.logo_umy)
            Image(
                painter = gambar,
                contentDescription = null,
                modifier = Modifier
                    .size(65.dp)
                    .padding(4.dp)
            )
    }
}