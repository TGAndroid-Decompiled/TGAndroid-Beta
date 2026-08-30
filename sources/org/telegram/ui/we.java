package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;
public final class we implements Utilities.Callback2 {
    public final int f39404a;
    public final xn f39405b;

    public we(xn xnVar, int i10) {
        this.f39404a = i10;
        this.f39405b = xnVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f39404a) {
            case 0:
                xn.g1(this.f39405b, (Integer) obj, (Boolean) obj2);
                return;
            case 1:
                xn.O0(this.f39405b, (Long) obj, (Boolean) obj2);
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                xn xnVar = this.f39405b;
                sg.b bVar = xnVar.f40228w8;
                bVar.a((Bitmap) obj2);
                tg.c.c(bVar, xnVar.fragmentView);
                xnVar.f40242x8.d();
                return;
            default:
                xn xnVar2 = this.f39405b;
                xnVar2.f40256y8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                xnVar2.A8 = paint;
                Bitmap bitmap2 = xnVar2.f40256y8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                xnVar2.f40268z8 = bitmapShader;
                paint.setShader(bitmapShader);
                xnVar2.B8 = new Matrix();
                sg.b bVar2 = xnVar2.f40228w8;
                bVar2.a((Bitmap) obj2);
                tg.c.c(bVar2, xnVar2.fragmentView);
                xnVar2.f40242x8.d();
                return;
        }
    }
}
