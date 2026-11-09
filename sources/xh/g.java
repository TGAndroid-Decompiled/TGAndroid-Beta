package xh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
public final class g implements Runnable {
    public final int f58822a;
    public final h f58823b;
    public final int f58824c;

    public g(h hVar, int i7, int i10) {
        this.f58822a = i10;
        this.f58823b = hVar;
        this.f58824c = i7;
    }

    @Override
    public final void run() {
        switch (this.f58822a) {
            case 0:
                h hVar = this.f58823b;
                int i7 = hVar.f58834k;
                v6.e[] eVarArr = hVar.f58828c;
                int i10 = this.f58824c;
                if (eVarArr[i10] == null) {
                    eVarArr[i10] = new v6.e(i7);
                }
                Bitmap bitmap = hVar.f58829e;
                if (bitmap == null) {
                    hVar.f58829e = Bitmap.createBitmap(i7, i7, Bitmap.Config.ALPHA_8);
                    hVar.f58830f = new Canvas(hVar.f58829e);
                } else {
                    bitmap.eraseColor(0);
                }
                hVar.a(hVar.f58830f, hVar.f58838o);
                Utilities.copyBitmaps(hVar.f58829e, (Bitmap) eVarArr[i10].f57256a);
                g0.h3(new g(hVar, i10, 1));
                return;
            default:
                h hVar2 = this.f58823b;
                int i11 = this.f58824c;
                hVar2.d = i11;
                hVar2.f58831g.setShader((BitmapShader) hVar2.f58828c[i11].f57257b);
                hVar2.f58833j = false;
                hVar2.f58839p = true;
                return;
        }
    }
}
