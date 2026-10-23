package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;
public final class we implements Utilities.Callback2 {
    public final int f43014a;
    public final sn f43015b;

    public we(sn snVar, int i10) {
        this.f43014a = i10;
        this.f43015b = snVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f43014a) {
            case 0:
                sn.z1(this.f43015b, (Integer) obj, (Boolean) obj2);
                return;
            case 1:
                sn.s1(this.f43015b, (Long) obj, (Boolean) obj2);
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                sn snVar = this.f43015b;
                gh.b bVar = snVar.L8;
                bVar.a((Bitmap) obj2);
                hh.d.c(bVar, snVar.fragmentView);
                snVar.M8.d();
                return;
            default:
                sn snVar2 = this.f43015b;
                snVar2.N8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                snVar2.P8 = paint;
                Bitmap bitmap2 = snVar2.N8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                snVar2.O8 = bitmapShader;
                paint.setShader(bitmapShader);
                snVar2.Q8 = new Matrix();
                gh.b bVar2 = snVar2.L8;
                bVar2.a((Bitmap) obj2);
                hh.d.c(bVar2, snVar2.fragmentView);
                snVar2.M8.d();
                return;
        }
    }
}
