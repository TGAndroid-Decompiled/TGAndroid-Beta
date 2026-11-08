package xh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
public final class g implements Runnable {
    public final int f58813a;
    public final h f58814b;
    public final int f58815c;

    public g(h hVar, int i7, int i10) {
        this.f58813a = i10;
        this.f58814b = hVar;
        this.f58815c = i7;
    }

    @Override
    public final void run() {
        switch (this.f58813a) {
            case 0:
                h hVar = this.f58814b;
                int i7 = hVar.f58825k;
                v6.e[] eVarArr = hVar.f58819c;
                int i10 = this.f58815c;
                if (eVarArr[i10] == null) {
                    eVarArr[i10] = new v6.e(i7);
                }
                Bitmap bitmap = hVar.f58820e;
                if (bitmap == null) {
                    hVar.f58820e = Bitmap.createBitmap(i7, i7, Bitmap.Config.ALPHA_8);
                    hVar.f58821f = new Canvas(hVar.f58820e);
                } else {
                    bitmap.eraseColor(0);
                }
                hVar.a(hVar.f58821f, hVar.f58829o);
                Utilities.copyBitmaps(hVar.f58820e, (Bitmap) eVarArr[i10].f57244a);
                g0.h3(new g(hVar, i10, 1));
                return;
            default:
                h hVar2 = this.f58814b;
                int i11 = this.f58815c;
                hVar2.d = i11;
                hVar2.f58822g.setShader((BitmapShader) hVar2.f58819c[i11].f57245b);
                hVar2.f58824j = false;
                hVar2.f58830p = true;
                return;
        }
    }
}
