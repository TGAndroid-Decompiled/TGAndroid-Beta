package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;

public final class re implements Utilities.Callback2 {

    public final int f41909a;

    public final rn f41910b;

    public re(rn rnVar, int i10) {
        this.f41909a = i10;
        this.f41910b = rnVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f41909a) {
            case 0:
                rn.g1(this.f41910b, (Integer) obj, (Boolean) obj2);
                break;
            case 1:
                rn.O0(this.f41910b, (Long) obj, (Boolean) obj2);
                break;
            case 2:
                rn rnVar = this.f41910b;
                og.b bVar = rnVar.f42246v8;
                bVar.a((Bitmap) obj2);
                pg.c.c(bVar, rnVar.fragmentView);
                rnVar.f42260w8.d();
                break;
            default:
                rn rnVar2 = this.f41910b;
                rnVar2.x8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                rnVar2.f42298z8 = paint;
                Bitmap bitmap = rnVar2.x8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                rnVar2.f42285y8 = bitmapShader;
                paint.setShader(bitmapShader);
                rnVar2.A8 = new Matrix();
                og.b bVar2 = rnVar2.f42246v8;
                bVar2.a((Bitmap) obj2);
                pg.c.c(bVar2, rnVar2.fragmentView);
                rnVar2.f42260w8.d();
                break;
        }
    }
}
