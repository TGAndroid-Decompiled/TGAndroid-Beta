package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;
public final class ze implements Utilities.Callback2 {
    public final int f40450a;
    public final wn f40451b;

    public ze(wn wnVar, int i10) {
        this.f40450a = i10;
        this.f40451b = wnVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f40450a) {
            case 0:
                wn.k1(this.f40451b, (Integer) obj, (Boolean) obj2);
                return;
            case 1:
                wn.N0(this.f40451b, (Long) obj, (Boolean) obj2);
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                wn wnVar = this.f40451b;
                fh.b bVar = wnVar.f39727z8;
                bVar.a((Bitmap) obj2);
                gh.d.c(bVar, wnVar.fragmentView);
                wnVar.A8.d();
                return;
            default:
                wn wnVar2 = this.f40451b;
                wnVar2.B8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                wnVar2.D8 = paint;
                Bitmap bitmap2 = wnVar2.B8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                wnVar2.C8 = bitmapShader;
                paint.setShader(bitmapShader);
                wnVar2.E8 = new Matrix();
                fh.b bVar2 = wnVar2.f39727z8;
                bVar2.a((Bitmap) obj2);
                gh.d.c(bVar2, wnVar2.fragmentView);
                wnVar2.A8.d();
                return;
        }
    }
}
