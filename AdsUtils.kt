package com.joksee.Blackaestheticwallpapers.config

object AdsUtils {

    // Jangan diubah
    const val ADMOB = "ADMOB"
    const val FAN = "FAN"
    const val STARTAPP = "STARTAPP"
    const val UNITY = "UNITY"

    var PRIMARY_ADS = listOf(
        ADMOB, // primary
        FAN, // backup #1
        STARTAPP, // backup #2
        UNITY // backup #3
    )

    // ADMOB APP ID (ubah di res -> values -> strings juga)
    var ADMOB_APP_ID = "ca-app-pub-9601865255535750~2307037908"

    // ADMOB IKLAN ID
    var ADMOB_BANNER_ID = "ca-app-pub-9601865255535750/5180651249"
    var ADMOB_INTERSTITIAL_ID = "ca-app-pub-9601865255535750/2554487907"
    var ADMOB_NATIVE_ID = "ca-app-pub-9601865255535750/9869833156"

    // interval interstitial tiap klik logo, save, atau set logo
    var INTERSTITIAL_INTERVAL = 3

    var ADMOB_HPK_1 = "car"
    var ADMOB_HPK_2 = "fashion"
    var ADMOB_HPK_3 = "sport"
    var ADMOB_HPK_4 = "mobile"
    var ADMOB_HPK_5 = "insurance"

    // FAN IKLAN ID
    var FAN_BANNER_ID = "YOUR_PLACEMENT_ID"
    var FAN_INTERSTITIAL_ID = "YOUR_PLACEMENT_ID"
    var FAN_NATIVE_ID = "YOUR_PLACEMENT_ID"

    // Startapp Ad Id
    var STARTAPP_APP_ID = "1234567"

    //UNITY
    var UNITY_ID = "1234567"
    var UNITY_BANNER = "Banner_Android"
    var UNITY_INTERSTITIAL = "Interstitial_Android"

    // url ads json online
    // jika mau offline, kosongkan ""
    // jika offline, jangan lupa set username & albums pinterest di file Constants
    // dan untuk di file ini harap diisi semua dengan benar, sehingga ketika gagal load ads json online, masih bisa menggunakan config ads offline
    var ADS_JSON_URL = "https://raw.githubusercontent.com/jeki21/joksee/main/Blackaestheticwallpapers.json"

}