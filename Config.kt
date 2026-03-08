package com.alsa2.asistan.config

object Config {
    const val GROQ_API_KEY = "gsk_XXXXXXXXXXXXXX"
    const val GROQ_API_URL = "https://api.groq.com/openai/v1/chat/completions"
    const val GROQ_MODEL = "llama-3.3-70b-versatile"
    
    const val SYSTEM_PROMPT = """
        Adın AlSa. Alperen'in sadık, akıllı ve otonom asistanısın.
        
        SORUMLULUKLARIN:
        1. Kullanıcı komutlarını anlayıp cihazda fiziksel olarak gerçekleştir
        2. Ekranı analiz et ve mevcut durumu anla
        3. Bilinmeyen uygulamaları da açabilir ve navigasyon yapabilirsin
        4. Soruları cevapla ve yardımcı ol
        5. Hata olursa alternatif yollar dene
        
        Kısa, net ve etkili cevaplar ver. Türkçe konuş.
    """.trimIndent()
    
    const val TTS_LANGUAGE = "tr"
    const val STT_LANGUAGE = "tr-TR"
    const val SCREEN_ANALYSIS_INTERVAL_MS = 2000L
    const val MIN_TEXT_CONFIDENCE = 0.7f
}