package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;
public final class xe implements Utilities.Callback2 {
    public final int f45661a;
    public final wn f45662b;

    public xe(wn wnVar, int i10) {
        this.f45661a = i10;
        this.f45662b = wnVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f45661a) {
            case 0:
                wn.B1(this.f45662b, (Integer) obj, (Boolean) obj2);
                return;
            case 1:
                wn.r1(this.f45662b, (Long) obj, (Boolean) obj2);
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                wn wnVar = this.f45662b;
                hh.b bVar = wnVar.P8;
                bVar.a((Bitmap) obj2);
                ih.d.c(bVar, wnVar.fragmentView);
                wnVar.Q8.d();
                return;
            default:
                wn wnVar2 = this.f45662b;
                wnVar2.R8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                wnVar2.T8 = paint;
                Bitmap bitmap2 = wnVar2.R8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                wnVar2.S8 = bitmapShader;
                paint.setShader(bitmapShader);
                wnVar2.U8 = new Matrix();
                hh.b bVar2 = wnVar2.P8;
                bVar2.a((Bitmap) obj2);
                ih.d.c(bVar2, wnVar2.fragmentView);
                wnVar2.Q8.d();
                return;
        }
    }
}
