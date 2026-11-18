package xh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import tg.x;
public final class g implements Runnable {
    public final int f60570a;
    public final h f60571b;
    public final int f60572c;

    public g(h hVar, int i7, int i10) {
        this.f60570a = i10;
        this.f60571b = hVar;
        this.f60572c = i7;
    }

    @Override
    public final void run() {
        switch (this.f60570a) {
            case 0:
                h hVar = this.f60571b;
                int i7 = hVar.f60582k;
                x[] xVarArr = hVar.f60576c;
                int i10 = this.f60572c;
                if (xVarArr[i10] == null) {
                    xVarArr[i10] = new x(i7);
                }
                Bitmap bitmap = hVar.f60577e;
                if (bitmap == null) {
                    hVar.f60577e = Bitmap.createBitmap(i7, i7, Bitmap.Config.ALPHA_8);
                    hVar.f60578f = new Canvas(hVar.f60577e);
                } else {
                    bitmap.eraseColor(0);
                }
                hVar.a(hVar.f60578f, hVar.f60586o);
                Utilities.copyBitmaps(hVar.f60577e, (Bitmap) xVarArr[i10].f58165b);
                g0.g3(new g(hVar, i10, 1));
                return;
            default:
                h hVar2 = this.f60571b;
                int i11 = this.f60572c;
                hVar2.d = i11;
                hVar2.f60579g.setShader((BitmapShader) hVar2.f60576c[i11].f58166c);
                hVar2.f60581j = false;
                hVar2.f60587p = true;
                return;
        }
    }
}
