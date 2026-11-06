package xh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
public final class g implements Runnable {
    public final int f58693a;
    public final h f58694b;
    public final int f58695c;

    public g(h hVar, int i7, int i10) {
        this.f58693a = i10;
        this.f58694b = hVar;
        this.f58695c = i7;
    }

    @Override
    public final void run() {
        switch (this.f58693a) {
            case 0:
                h hVar = this.f58694b;
                int i7 = hVar.f58705k;
                v6.e[] eVarArr = hVar.f58699c;
                int i10 = this.f58695c;
                if (eVarArr[i10] == null) {
                    eVarArr[i10] = new v6.e(i7);
                }
                Bitmap bitmap = hVar.f58700e;
                if (bitmap == null) {
                    hVar.f58700e = Bitmap.createBitmap(i7, i7, Bitmap.Config.ALPHA_8);
                    hVar.f58701f = new Canvas(hVar.f58700e);
                } else {
                    bitmap.eraseColor(0);
                }
                hVar.a(hVar.f58701f, hVar.f58709o);
                Utilities.copyBitmaps(hVar.f58700e, (Bitmap) eVarArr[i10].f57127a);
                g0.h3(new g(hVar, i10, 1));
                return;
            default:
                h hVar2 = this.f58694b;
                int i11 = this.f58695c;
                hVar2.d = i11;
                hVar2.f58702g.setShader((BitmapShader) hVar2.f58699c[i11].f57128b);
                hVar2.f58704j = false;
                hVar2.f58710p = true;
                return;
        }
    }
}
