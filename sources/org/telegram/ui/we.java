package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;
public final class we implements Utilities.Callback2 {
    public final int f42538a;
    public final qn f42539b;

    public we(qn qnVar, int i10) {
        this.f42538a = i10;
        this.f42539b = qnVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f42538a) {
            case 0:
                qn.z1(this.f42539b, (Integer) obj, (Boolean) obj2);
                return;
            case 1:
                qn.p1(this.f42539b, (Long) obj, (Boolean) obj2);
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                qn qnVar = this.f42539b;
                gh.b bVar = qnVar.f40928z8;
                bVar.a((Bitmap) obj2);
                hh.d.c(bVar, qnVar.fragmentView);
                qnVar.A8.d();
                return;
            default:
                qn qnVar2 = this.f42539b;
                qnVar2.B8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                qnVar2.D8 = paint;
                Bitmap bitmap2 = qnVar2.B8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                qnVar2.C8 = bitmapShader;
                paint.setShader(bitmapShader);
                qnVar2.E8 = new Matrix();
                gh.b bVar2 = qnVar2.f40928z8;
                bVar2.a((Bitmap) obj2);
                hh.d.c(bVar2, qnVar2.fragmentView);
                qnVar2.A8.d();
                return;
        }
    }
}
