package xh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
public final class g implements Runnable {
    public final int f58718a;
    public final h f58719b;
    public final int f58720c;

    public g(h hVar, int i7, int i10) {
        this.f58718a = i10;
        this.f58719b = hVar;
        this.f58720c = i7;
    }

    @Override
    public final void run() {
        switch (this.f58718a) {
            case 0:
                h hVar = this.f58719b;
                int i7 = hVar.f58730k;
                v6.e[] eVarArr = hVar.f58724c;
                int i10 = this.f58720c;
                if (eVarArr[i10] == null) {
                    eVarArr[i10] = new v6.e(i7);
                }
                Bitmap bitmap = hVar.f58725e;
                if (bitmap == null) {
                    hVar.f58725e = Bitmap.createBitmap(i7, i7, Bitmap.Config.ALPHA_8);
                    hVar.f58726f = new Canvas(hVar.f58725e);
                } else {
                    bitmap.eraseColor(0);
                }
                hVar.a(hVar.f58726f, hVar.f58734o);
                Utilities.copyBitmaps(hVar.f58725e, (Bitmap) eVarArr[i10].f57152a);
                g0.h3(new g(hVar, i10, 1));
                return;
            default:
                h hVar2 = this.f58719b;
                int i11 = this.f58720c;
                hVar2.d = i11;
                hVar2.f58727g.setShader((BitmapShader) hVar2.f58724c[i11].f57153b);
                hVar2.f58729j = false;
                hVar2.f58735p = true;
                return;
        }
    }
}
