package xh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import m4.w1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h implements Runnable {
    public final int f51882a;
    public final i f51883b;
    public final int f51884c;

    public h(i iVar, int i10, int i11) {
        this.f51882a = i11;
        this.f51883b = iVar;
        this.f51884c = i10;
    }

    @Override
    public final void run() {
        switch (this.f51882a) {
            case 0:
                i iVar = this.f51883b;
                int i10 = iVar.f51893k;
                w1[] w1VarArr = iVar.f51888c;
                int i11 = this.f51884c;
                if (w1VarArr[i11] == null) {
                    w1VarArr[i11] = new w1(i10);
                }
                Bitmap bitmap = iVar.e;
                if (bitmap == null) {
                    iVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f51889f = new Canvas(iVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f51889f, iVar.f51897o);
                Utilities.copyBitmaps(iVar.e, (Bitmap) w1VarArr[i11].f18293b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f51883b;
                int i12 = this.f51884c;
                iVar2.d = i12;
                iVar2.f51890g.setShader((BitmapShader) iVar2.f51888c[i12].f18294c);
                iVar2.f51892j = false;
                iVar2.f51898p = true;
                return;
        }
    }
}
