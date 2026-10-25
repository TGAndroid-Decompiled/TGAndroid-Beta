package xh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import m4.w1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h implements Runnable {
    public final int f51879a;
    public final i f51880b;
    public final int f51881c;

    public h(i iVar, int i10, int i11) {
        this.f51879a = i11;
        this.f51880b = iVar;
        this.f51881c = i10;
    }

    @Override
    public final void run() {
        switch (this.f51879a) {
            case 0:
                i iVar = this.f51880b;
                int i10 = iVar.f51890k;
                w1[] w1VarArr = iVar.f51885c;
                int i11 = this.f51881c;
                if (w1VarArr[i11] == null) {
                    w1VarArr[i11] = new w1(i10);
                }
                Bitmap bitmap = iVar.e;
                if (bitmap == null) {
                    iVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f51886f = new Canvas(iVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f51886f, iVar.f51894o);
                Utilities.copyBitmaps(iVar.e, (Bitmap) w1VarArr[i11].f18293b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f51880b;
                int i12 = this.f51881c;
                iVar2.d = i12;
                iVar2.f51887g.setShader((BitmapShader) iVar2.f51885c[i12].f18294c);
                iVar2.f51889j = false;
                iVar2.f51895p = true;
                return;
        }
    }
}
