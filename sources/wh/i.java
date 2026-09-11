package wh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class i implements Runnable {
    public final int f48636a;
    public final j f48637b;
    public final int f48638c;

    public i(j jVar, int i10, int i11) {
        this.f48636a = i11;
        this.f48637b = jVar;
        this.f48638c = i10;
    }

    @Override
    public final void run() {
        switch (this.f48636a) {
            case 0:
                j jVar = this.f48637b;
                int i10 = jVar.f48648k;
                o0.a[] aVarArr = jVar.f48642c;
                int i11 = this.f48638c;
                if (aVarArr[i11] == null) {
                    aVarArr[i11] = new o0.a(i10);
                }
                Bitmap bitmap = jVar.f48643e;
                if (bitmap == null) {
                    jVar.f48643e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    jVar.f48644f = new Canvas(jVar.f48643e);
                } else {
                    bitmap.eraseColor(0);
                }
                jVar.a(jVar.f48644f, jVar.f48652o);
                Utilities.copyBitmaps(jVar.f48643e, (Bitmap) aVarArr[i11].f16769b);
                AndroidUtilities.runOnUIThread(new i(jVar, i11, 1));
                return;
            default:
                j jVar2 = this.f48637b;
                int i12 = this.f48638c;
                jVar2.d = i12;
                jVar2.f48645g.setShader((BitmapShader) jVar2.f48642c[i12].f16770c);
                jVar2.f48647j = false;
                jVar2.f48653p = true;
                return;
        }
    }
}
