package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
public final class xe implements org.telegram.messenger.k20 {
    public final int f43360a;
    public final un f43361b;

    public xe(un unVar, int i10) {
        this.f43360a = i10;
        this.f43361b = unVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f43360a) {
            case 0:
                un.b1(this.f43361b, (Integer) obj, (Boolean) obj2);
                return;
            case 1:
                un.r1(this.f43361b, (Long) obj, (Boolean) obj2);
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                un unVar = this.f43361b;
                hi.b bVar = unVar.N8;
                bVar.a((Bitmap) obj2);
                yg.d.c(bVar, unVar.fragmentView);
                unVar.O8.d();
                return;
            default:
                un unVar2 = this.f43361b;
                unVar2.P8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                unVar2.R8 = paint;
                Bitmap bitmap2 = unVar2.P8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                unVar2.Q8 = bitmapShader;
                paint.setShader(bitmapShader);
                unVar2.S8 = new Matrix();
                hi.b bVar2 = unVar2.N8;
                bVar2.a((Bitmap) obj2);
                yg.d.c(bVar2, unVar2.fragmentView);
                unVar2.O8.d();
                return;
        }
    }
}
