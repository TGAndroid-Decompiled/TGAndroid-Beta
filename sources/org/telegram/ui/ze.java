package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;
public final class ze implements Utilities.Callback2 {
    public final int f40143a;
    public final bo f40144b;

    public ze(bo boVar, int i10) {
        this.f40143a = i10;
        this.f40144b = boVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f40143a) {
            case 0:
                bo.g1(this.f40144b, (Integer) obj, (Boolean) obj2);
                return;
            case 1:
                bo.O0(this.f40144b, (Long) obj, (Boolean) obj2);
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                bo boVar = this.f40144b;
                fh.b bVar = boVar.f32557z8;
                bVar.a((Bitmap) obj2);
                gh.d.c(bVar, boVar.fragmentView);
                boVar.A8.d();
                return;
            default:
                bo boVar2 = this.f40144b;
                boVar2.B8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                boVar2.D8 = paint;
                Bitmap bitmap2 = boVar2.B8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                boVar2.C8 = bitmapShader;
                paint.setShader(bitmapShader);
                boVar2.E8 = new Matrix();
                fh.b bVar2 = boVar2.f32557z8;
                bVar2.a((Bitmap) obj2);
                gh.d.c(bVar2, boVar2.fragmentView);
                boVar2.A8.d();
                return;
        }
    }
}
