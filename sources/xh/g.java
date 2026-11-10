package xh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
public final class g implements Runnable {
    public final int f58820a;
    public final h f58821b;
    public final int f58822c;

    public g(h hVar, int i7, int i10) {
        this.f58820a = i10;
        this.f58821b = hVar;
        this.f58822c = i7;
    }

    @Override
    public final void run() {
        switch (this.f58820a) {
            case 0:
                h hVar = this.f58821b;
                int i7 = hVar.f58832k;
                v6.e[] eVarArr = hVar.f58826c;
                int i10 = this.f58822c;
                if (eVarArr[i10] == null) {
                    eVarArr[i10] = new v6.e(i7);
                }
                Bitmap bitmap = hVar.f58827e;
                if (bitmap == null) {
                    hVar.f58827e = Bitmap.createBitmap(i7, i7, Bitmap.Config.ALPHA_8);
                    hVar.f58828f = new Canvas(hVar.f58827e);
                } else {
                    bitmap.eraseColor(0);
                }
                hVar.a(hVar.f58828f, hVar.f58836o);
                Utilities.copyBitmaps(hVar.f58827e, (Bitmap) eVarArr[i10].f57252a);
                g0.h3(new g(hVar, i10, 1));
                return;
            default:
                h hVar2 = this.f58821b;
                int i11 = this.f58822c;
                hVar2.d = i11;
                hVar2.f58829g.setShader((BitmapShader) hVar2.f58826c[i11].f57253b);
                hVar2.f58831j = false;
                hVar2.f58837p = true;
                return;
        }
    }
}
