package xh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
public final class g implements Runnable {
    public final int f58717a;
    public final h f58718b;
    public final int f58719c;

    public g(h hVar, int i7, int i10) {
        this.f58717a = i10;
        this.f58718b = hVar;
        this.f58719c = i7;
    }

    @Override
    public final void run() {
        switch (this.f58717a) {
            case 0:
                h hVar = this.f58718b;
                int i7 = hVar.f58729k;
                v6.e[] eVarArr = hVar.f58723c;
                int i10 = this.f58719c;
                if (eVarArr[i10] == null) {
                    eVarArr[i10] = new v6.e(i7);
                }
                Bitmap bitmap = hVar.f58724e;
                if (bitmap == null) {
                    hVar.f58724e = Bitmap.createBitmap(i7, i7, Bitmap.Config.ALPHA_8);
                    hVar.f58725f = new Canvas(hVar.f58724e);
                } else {
                    bitmap.eraseColor(0);
                }
                hVar.a(hVar.f58725f, hVar.f58733o);
                Utilities.copyBitmaps(hVar.f58724e, (Bitmap) eVarArr[i10].f57151a);
                g0.h3(new g(hVar, i10, 1));
                return;
            default:
                h hVar2 = this.f58718b;
                int i11 = this.f58719c;
                hVar2.d = i11;
                hVar2.f58726g.setShader((BitmapShader) hVar2.f58723c[i11].f57152b);
                hVar2.f58728j = false;
                hVar2.f58734p = true;
                return;
        }
    }
}
