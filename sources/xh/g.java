package xh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
public final class g implements Runnable {
    public final int f58812a;
    public final h f58813b;
    public final int f58814c;

    public g(h hVar, int i7, int i10) {
        this.f58812a = i10;
        this.f58813b = hVar;
        this.f58814c = i7;
    }

    @Override
    public final void run() {
        switch (this.f58812a) {
            case 0:
                h hVar = this.f58813b;
                int i7 = hVar.f58824k;
                v6.e[] eVarArr = hVar.f58818c;
                int i10 = this.f58814c;
                if (eVarArr[i10] == null) {
                    eVarArr[i10] = new v6.e(i7);
                }
                Bitmap bitmap = hVar.f58819e;
                if (bitmap == null) {
                    hVar.f58819e = Bitmap.createBitmap(i7, i7, Bitmap.Config.ALPHA_8);
                    hVar.f58820f = new Canvas(hVar.f58819e);
                } else {
                    bitmap.eraseColor(0);
                }
                hVar.a(hVar.f58820f, hVar.f58828o);
                Utilities.copyBitmaps(hVar.f58819e, (Bitmap) eVarArr[i10].f57243a);
                g0.h3(new g(hVar, i10, 1));
                return;
            default:
                h hVar2 = this.f58813b;
                int i11 = this.f58814c;
                hVar2.d = i11;
                hVar2.f58821g.setShader((BitmapShader) hVar2.f58818c[i11].f57244b);
                hVar2.f58823j = false;
                hVar2.f58829p = true;
                return;
        }
    }
}
