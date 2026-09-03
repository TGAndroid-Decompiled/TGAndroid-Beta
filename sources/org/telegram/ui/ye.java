package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;
public final class ye implements Utilities.Callback2 {
    public final int f40247a;
    public final zn f40248b;

    public ye(zn znVar, int i10) {
        this.f40247a = i10;
        this.f40248b = znVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f40247a) {
            case 0:
                zn.g1(this.f40248b, (Integer) obj, (Boolean) obj2);
                return;
            case 1:
                zn.O0(this.f40248b, (Long) obj, (Boolean) obj2);
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                zn znVar = this.f40248b;
                sg.b bVar = znVar.f40794w8;
                bVar.a((Bitmap) obj2);
                tg.c.c(bVar, znVar.fragmentView);
                znVar.f40808x8.d();
                return;
            default:
                zn znVar2 = this.f40248b;
                znVar2.f40822y8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                znVar2.A8 = paint;
                Bitmap bitmap2 = znVar2.f40822y8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                znVar2.f40834z8 = bitmapShader;
                paint.setShader(bitmapShader);
                znVar2.B8 = new Matrix();
                sg.b bVar2 = znVar2.f40794w8;
                bVar2.a((Bitmap) obj2);
                tg.c.c(bVar2, znVar2.fragmentView);
                znVar2.f40808x8.d();
                return;
        }
    }
}
