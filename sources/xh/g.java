package xh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import tg.y;
public final class g implements Runnable {
    public final int f60611a;
    public final h f60612b;
    public final int f60613c;

    public g(h hVar, int i7, int i10) {
        this.f60611a = i10;
        this.f60612b = hVar;
        this.f60613c = i7;
    }

    @Override
    public final void run() {
        switch (this.f60611a) {
            case 0:
                h hVar = this.f60612b;
                int i7 = hVar.f60623k;
                y[] yVarArr = hVar.f60617c;
                int i10 = this.f60613c;
                if (yVarArr[i10] == null) {
                    yVarArr[i10] = new y(i7);
                }
                Bitmap bitmap = hVar.f60618e;
                if (bitmap == null) {
                    hVar.f60618e = Bitmap.createBitmap(i7, i7, Bitmap.Config.ALPHA_8);
                    hVar.f60619f = new Canvas(hVar.f60618e);
                } else {
                    bitmap.eraseColor(0);
                }
                hVar.a(hVar.f60619f, hVar.f60627o);
                Utilities.copyBitmaps(hVar.f60618e, (Bitmap) yVarArr[i10].f58220b);
                g0.g3(new g(hVar, i10, 1));
                return;
            default:
                h hVar2 = this.f60612b;
                int i11 = this.f60613c;
                hVar2.d = i11;
                hVar2.f60620g.setShader((BitmapShader) hVar2.f60617c[i11].f58221c);
                hVar2.f60622j = false;
                hVar2.f60628p = true;
                return;
        }
    }
}
