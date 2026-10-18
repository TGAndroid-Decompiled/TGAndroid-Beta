package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;
public final class ye implements Utilities.Callback2 {
    public final int f43380a;
    public final sn f43381b;

    public ye(sn snVar, int i10) {
        this.f43380a = i10;
        this.f43381b = snVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f43380a) {
            case 0:
                sn.z1(this.f43381b, (Integer) obj, (Boolean) obj2);
                return;
            case 1:
                sn.p1(this.f43381b, (Long) obj, (Boolean) obj2);
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                sn snVar = this.f43381b;
                gh.b bVar = snVar.f41452z8;
                bVar.a((Bitmap) obj2);
                hh.d.c(bVar, snVar.fragmentView);
                snVar.A8.d();
                return;
            default:
                sn snVar2 = this.f43381b;
                snVar2.B8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                snVar2.D8 = paint;
                Bitmap bitmap2 = snVar2.B8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                snVar2.C8 = bitmapShader;
                paint.setShader(bitmapShader);
                snVar2.E8 = new Matrix();
                gh.b bVar2 = snVar2.f41452z8;
                bVar2.a((Bitmap) obj2);
                hh.d.c(bVar2, snVar2.fragmentView);
                snVar2.A8.d();
                return;
        }
    }
}
