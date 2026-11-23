package xh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
public final class g implements Runnable {
    public final int f60698a;
    public final h f60699b;
    public final int f60700c;

    public g(h hVar, int i7, int i10) {
        this.f60698a = i10;
        this.f60699b = hVar;
        this.f60700c = i7;
    }

    @Override
    public final void run() {
        switch (this.f60698a) {
            case 0:
                h hVar = this.f60699b;
                int i7 = hVar.f60710k;
                t1.a[] aVarArr = hVar.f60704c;
                int i10 = this.f60700c;
                if (aVarArr[i10] == null) {
                    aVarArr[i10] = new t1.a(i7);
                }
                Bitmap bitmap = hVar.f60705e;
                if (bitmap == null) {
                    hVar.f60705e = Bitmap.createBitmap(i7, i7, Bitmap.Config.ALPHA_8);
                    hVar.f60706f = new Canvas(hVar.f60705e);
                } else {
                    bitmap.eraseColor(0);
                }
                hVar.a(hVar.f60706f, hVar.f60714o);
                Utilities.copyBitmaps(hVar.f60705e, (Bitmap) aVarArr[i10].f57641b);
                g0.g3(new g(hVar, i10, 1));
                return;
            default:
                h hVar2 = this.f60699b;
                int i11 = this.f60700c;
                hVar2.d = i11;
                hVar2.f60707g.setShader((BitmapShader) hVar2.f60704c[i11].f57642c);
                hVar2.f60709j = false;
                hVar2.f60715p = true;
                return;
        }
    }
}
