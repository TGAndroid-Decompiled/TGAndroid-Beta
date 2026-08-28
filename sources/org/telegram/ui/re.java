package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;
public final class re implements Utilities.Callback2 {
    public final int f42380a;
    public final qn f42381b;

    public re(qn qnVar, int i9) {
        this.f42380a = i9;
        this.f42381b = qnVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f42380a) {
            case 0:
                qn.g1(this.f42381b, (Integer) obj, (Boolean) obj2);
                return;
            case 1:
                qn.O0(this.f42381b, (Long) obj, (Boolean) obj2);
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                qn qnVar = this.f42381b;
                ng.b bVar = qnVar.f42110v8;
                bVar.a((Bitmap) obj2);
                og.d.c(bVar, qnVar.fragmentView);
                qnVar.w8.d();
                return;
            default:
                qn qnVar2 = this.f42381b;
                qnVar2.f42135x8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                qnVar2.f42161z8 = paint;
                Bitmap bitmap2 = qnVar2.f42135x8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                qnVar2.f42149y8 = bitmapShader;
                paint.setShader(bitmapShader);
                qnVar2.A8 = new Matrix();
                ng.b bVar2 = qnVar2.f42110v8;
                bVar2.a((Bitmap) obj2);
                og.d.c(bVar2, qnVar2.fragmentView);
                qnVar2.w8.d();
                return;
        }
    }
}
