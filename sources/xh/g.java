package xh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import tg.y;
public final class g implements Runnable {
    public final int f60615a;
    public final h f60616b;
    public final int f60617c;

    public g(h hVar, int i7, int i10) {
        this.f60615a = i10;
        this.f60616b = hVar;
        this.f60617c = i7;
    }

    @Override
    public final void run() {
        switch (this.f60615a) {
            case 0:
                h hVar = this.f60616b;
                int i7 = hVar.f60627k;
                y[] yVarArr = hVar.f60621c;
                int i10 = this.f60617c;
                if (yVarArr[i10] == null) {
                    yVarArr[i10] = new y(i7);
                }
                Bitmap bitmap = hVar.f60622e;
                if (bitmap == null) {
                    hVar.f60622e = Bitmap.createBitmap(i7, i7, Bitmap.Config.ALPHA_8);
                    hVar.f60623f = new Canvas(hVar.f60622e);
                } else {
                    bitmap.eraseColor(0);
                }
                hVar.a(hVar.f60623f, hVar.f60631o);
                Utilities.copyBitmaps(hVar.f60622e, (Bitmap) yVarArr[i10].f58224b);
                g0.g3(new g(hVar, i10, 1));
                return;
            default:
                h hVar2 = this.f60616b;
                int i11 = this.f60617c;
                hVar2.d = i11;
                hVar2.f60624g.setShader((BitmapShader) hVar2.f60621c[i11].f58225c);
                hVar2.f60626j = false;
                hVar2.f60632p = true;
                return;
        }
    }
}
