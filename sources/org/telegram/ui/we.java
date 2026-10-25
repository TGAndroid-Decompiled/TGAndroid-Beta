package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;
public final class we implements Utilities.Callback2 {
    public final int f45115a;
    public final un f45116b;

    public we(un unVar, int i10) {
        this.f45115a = i10;
        this.f45116b = unVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f45115a) {
            case 0:
                un.l1(this.f45116b, (Integer) obj, (Boolean) obj2);
                return;
            case 1:
                un.S0(this.f45116b, (Long) obj, (Boolean) obj2);
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                un unVar = this.f45116b;
                hh.b bVar = unVar.L8;
                bVar.a((Bitmap) obj2);
                ih.d.c(bVar, unVar.fragmentView);
                unVar.M8.d();
                return;
            default:
                un unVar2 = this.f45116b;
                unVar2.N8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                unVar2.P8 = paint;
                Bitmap bitmap2 = unVar2.N8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                unVar2.O8 = bitmapShader;
                paint.setShader(bitmapShader);
                unVar2.Q8 = new Matrix();
                hh.b bVar2 = unVar2.L8;
                bVar2.a((Bitmap) obj2);
                ih.d.c(bVar2, unVar2.fragmentView);
                unVar2.M8.d();
                return;
        }
    }
}
