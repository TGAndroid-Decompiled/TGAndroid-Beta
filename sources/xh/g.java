package xh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import tg.x;
public final class g implements Runnable {
    public final int f60569a;
    public final h f60570b;
    public final int f60571c;

    public g(h hVar, int i7, int i10) {
        this.f60569a = i10;
        this.f60570b = hVar;
        this.f60571c = i7;
    }

    @Override
    public final void run() {
        switch (this.f60569a) {
            case 0:
                h hVar = this.f60570b;
                int i7 = hVar.f60581k;
                x[] xVarArr = hVar.f60575c;
                int i10 = this.f60571c;
                if (xVarArr[i10] == null) {
                    xVarArr[i10] = new x(i7);
                }
                Bitmap bitmap = hVar.f60576e;
                if (bitmap == null) {
                    hVar.f60576e = Bitmap.createBitmap(i7, i7, Bitmap.Config.ALPHA_8);
                    hVar.f60577f = new Canvas(hVar.f60576e);
                } else {
                    bitmap.eraseColor(0);
                }
                hVar.a(hVar.f60577f, hVar.f60585o);
                Utilities.copyBitmaps(hVar.f60576e, (Bitmap) xVarArr[i10].f58164b);
                g0.g3(new g(hVar, i10, 1));
                return;
            default:
                h hVar2 = this.f60570b;
                int i11 = this.f60571c;
                hVar2.d = i11;
                hVar2.f60578g.setShader((BitmapShader) hVar2.f60575c[i11].f58165c);
                hVar2.f60580j = false;
                hVar2.f60586p = true;
                return;
        }
    }
}
