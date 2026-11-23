package xh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import tg.y;
public final class g implements Runnable {
    public final int f60580a;
    public final h f60581b;
    public final int f60582c;

    public g(h hVar, int i7, int i10) {
        this.f60580a = i10;
        this.f60581b = hVar;
        this.f60582c = i7;
    }

    @Override
    public final void run() {
        switch (this.f60580a) {
            case 0:
                h hVar = this.f60581b;
                int i7 = hVar.f60592k;
                y[] yVarArr = hVar.f60586c;
                int i10 = this.f60582c;
                if (yVarArr[i10] == null) {
                    yVarArr[i10] = new y(i7);
                }
                Bitmap bitmap = hVar.f60587e;
                if (bitmap == null) {
                    hVar.f60587e = Bitmap.createBitmap(i7, i7, Bitmap.Config.ALPHA_8);
                    hVar.f60588f = new Canvas(hVar.f60587e);
                } else {
                    bitmap.eraseColor(0);
                }
                hVar.a(hVar.f60588f, hVar.f60596o);
                Utilities.copyBitmaps(hVar.f60587e, (Bitmap) yVarArr[i10].f58189b);
                g0.g3(new g(hVar, i10, 1));
                return;
            default:
                h hVar2 = this.f60581b;
                int i11 = this.f60582c;
                hVar2.d = i11;
                hVar2.f60589g.setShader((BitmapShader) hVar2.f60586c[i11].f58190c);
                hVar2.f60591j = false;
                hVar2.f60597p = true;
                return;
        }
    }
}
