package org.techtown.kotlinandroid.Android_UI

// 안드로이드에서 화면을 그리는 방법
// - XML을 이용한다
// - XML은 뭘까
//  - DSL Language -> Domain Specific Language
//  - 안드로이드 UI를 그리기 위해 특화된 언어이다

// 핸드폰마다 화면 크기가 다 다른데 어떻게 화면을 그려야 할까?
//  - 픽셀, dpi, dp 단위
//  - 픽셀 -> 핸드폰 화면에서 빛이 나오는 전구 -> 가장 작은 단위
//  - dpi -> dot per inch
//      - ldpi -> 120 (1인치에 120픽셀)
//      - mdpi -> 160 (좋은 해상도를 가진 핸드폰일수록 같은 픽셀 단위로 선을 그으면 점점 짧아 보임임
//      - hdpi -> 240
//      - xhdpi -> 320
//      - xxhdpi -> 480
//      - xxxhdpi -> 640
//  - dp -> density Independent Pixel
//      - 픽셀 독립적인 단위 (어느 화면에서나 동일하게 나오게 됨)
