package wh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class i implements Runnable {
    public final int f48665a;
    public final j f48666b;
    public final int f48667c;

    public i(j jVar, int i10, int i11) {
        this.f48665a = i11;
        this.f48666b = jVar;
        this.f48667c = i10;
    }

    @Override
    public final void run() {
        switch (this.f48665a) {
            case 0:
                j jVar = this.f48666b;
                int i10 = jVar.f48677k;
                o0.a[] aVarArr = jVar.f48671c;
                int i11 = this.f48667c;
                if (aVarArr[i11] == null) {
                    aVarArr[i11] = new o0.a(i10);
                }
                Bitmap bitmap = jVar.f48672e;
                if (bitmap == null) {
                    jVar.f48672e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    jVar.f48673f = new Canvas(jVar.f48672e);
                } else {
                    bitmap.eraseColor(0);
                }
                jVar.a(jVar.f48673f, jVar.f48681o);
                Utilities.copyBitmaps(jVar.f48672e, (Bitmap) aVarArr[i11].f16796b);
                AndroidUtilities.runOnUIThread(new i(jVar, i11, 1));
                return;
            default:
                j jVar2 = this.f48666b;
                int i12 = this.f48667c;
                jVar2.d = i12;
                jVar2.f48674g.setShader((BitmapShader) jVar2.f48671c[i12].f16797c);
                jVar2.f48676j = false;
                jVar2.f48682p = true;
                return;
        }
    }
}
