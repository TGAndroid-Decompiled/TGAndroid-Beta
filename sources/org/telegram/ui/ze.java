package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;
public final class ze implements Utilities.Callback2 {
    public final int f40111a;
    public final xn f40112b;

    public ze(xn xnVar, int i10) {
        this.f40111a = i10;
        this.f40112b = xnVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f40111a) {
            case 0:
                xn.g1(this.f40112b, (Integer) obj, (Boolean) obj2);
                return;
            case 1:
                xn.O0(this.f40112b, (Long) obj, (Boolean) obj2);
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                xn xnVar = this.f40112b;
                fh.b bVar = xnVar.f39629z8;
                bVar.a((Bitmap) obj2);
                gh.d.c(bVar, xnVar.fragmentView);
                xnVar.A8.d();
                return;
            default:
                xn xnVar2 = this.f40112b;
                xnVar2.B8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                xnVar2.D8 = paint;
                Bitmap bitmap2 = xnVar2.B8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                xnVar2.C8 = bitmapShader;
                paint.setShader(bitmapShader);
                xnVar2.E8 = new Matrix();
                fh.b bVar2 = xnVar2.f39629z8;
                bVar2.a((Bitmap) obj2);
                gh.d.c(bVar2, xnVar2.fragmentView);
                xnVar2.A8.d();
                return;
        }
    }
}
