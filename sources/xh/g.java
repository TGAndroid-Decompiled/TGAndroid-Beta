package xh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
public final class g implements Runnable {
    public final int f58723a;
    public final h f58724b;
    public final int f58725c;

    public g(h hVar, int i7, int i10) {
        this.f58723a = i10;
        this.f58724b = hVar;
        this.f58725c = i7;
    }

    @Override
    public final void run() {
        switch (this.f58723a) {
            case 0:
                h hVar = this.f58724b;
                int i7 = hVar.f58735k;
                v6.e[] eVarArr = hVar.f58729c;
                int i10 = this.f58725c;
                if (eVarArr[i10] == null) {
                    eVarArr[i10] = new v6.e(i7);
                }
                Bitmap bitmap = hVar.f58730e;
                if (bitmap == null) {
                    hVar.f58730e = Bitmap.createBitmap(i7, i7, Bitmap.Config.ALPHA_8);
                    hVar.f58731f = new Canvas(hVar.f58730e);
                } else {
                    bitmap.eraseColor(0);
                }
                hVar.a(hVar.f58731f, hVar.f58739o);
                Utilities.copyBitmaps(hVar.f58730e, (Bitmap) eVarArr[i10].f57151a);
                g0.h3(new g(hVar, i10, 1));
                return;
            default:
                h hVar2 = this.f58724b;
                int i11 = this.f58725c;
                hVar2.d = i11;
                hVar2.f58732g.setShader((BitmapShader) hVar2.f58729c[i11].f57152b);
                hVar2.f58734j = false;
                hVar2.f58740p = true;
                return;
        }
    }
}
