package xh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import tg.x;
public final class g implements Runnable {
    public final int f60004a;
    public final h f60005b;
    public final int f60006c;

    public g(h hVar, int i7, int i10) {
        this.f60004a = i10;
        this.f60005b = hVar;
        this.f60006c = i7;
    }

    @Override
    public final void run() {
        switch (this.f60004a) {
            case 0:
                h hVar = this.f60005b;
                int i7 = hVar.f60016k;
                x[] xVarArr = hVar.f60010c;
                int i10 = this.f60006c;
                if (xVarArr[i10] == null) {
                    xVarArr[i10] = new x(i7);
                }
                Bitmap bitmap = hVar.f60011e;
                if (bitmap == null) {
                    hVar.f60011e = Bitmap.createBitmap(i7, i7, Bitmap.Config.ALPHA_8);
                    hVar.f60012f = new Canvas(hVar.f60011e);
                } else {
                    bitmap.eraseColor(0);
                }
                hVar.a(hVar.f60012f, hVar.f60020o);
                Utilities.copyBitmaps(hVar.f60011e, (Bitmap) xVarArr[i10].f57597b);
                g0.h3(new g(hVar, i10, 1));
                return;
            default:
                h hVar2 = this.f60005b;
                int i11 = this.f60006c;
                hVar2.d = i11;
                hVar2.f60013g.setShader((BitmapShader) hVar2.f60010c[i11].f57598c);
                hVar2.f60015j = false;
                hVar2.f60021p = true;
                return;
        }
    }
}
