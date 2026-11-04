package yh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
public final class g implements Runnable {
    public final int f59530a;
    public final h f59531b;
    public final int f59532c;

    public g(h hVar, int i3, int i10) {
        this.f59530a = i10;
        this.f59531b = hVar;
        this.f59532c = i3;
    }

    @Override
    public final void run() {
        switch (this.f59530a) {
            case 0:
                h hVar = this.f59531b;
                int i3 = hVar.f59542k;
                w9.b[] bVarArr = hVar.f59536c;
                int i10 = this.f59532c;
                if (bVarArr[i10] == null) {
                    bVarArr[i10] = new w9.b(i3);
                }
                Bitmap bitmap = hVar.f59537e;
                if (bitmap == null) {
                    hVar.f59537e = Bitmap.createBitmap(i3, i3, Bitmap.Config.ALPHA_8);
                    hVar.f59538f = new Canvas(hVar.f59537e);
                } else {
                    bitmap.eraseColor(0);
                }
                hVar.a(hVar.f59538f, hVar.f59546o);
                Utilities.copyBitmaps(hVar.f59537e, (Bitmap) bVarArr[i10].f57424b);
                g0.h3(new g(hVar, i10, 1));
                return;
            default:
                h hVar2 = this.f59531b;
                int i11 = this.f59532c;
                hVar2.d = i11;
                hVar2.f59539g.setShader((BitmapShader) hVar2.f59536c[i11].f57425c);
                hVar2.f59541j = false;
                hVar2.f59547p = true;
                return;
        }
    }
}
