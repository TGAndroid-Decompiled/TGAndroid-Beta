package wh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class i implements Runnable {
    public final int f48637a;
    public final j f48638b;
    public final int f48639c;

    public i(j jVar, int i10, int i11) {
        this.f48637a = i11;
        this.f48638b = jVar;
        this.f48639c = i10;
    }

    @Override
    public final void run() {
        switch (this.f48637a) {
            case 0:
                j jVar = this.f48638b;
                int i10 = jVar.f48649k;
                o0.a[] aVarArr = jVar.f48643c;
                int i11 = this.f48639c;
                if (aVarArr[i11] == null) {
                    aVarArr[i11] = new o0.a(i10);
                }
                Bitmap bitmap = jVar.f48644e;
                if (bitmap == null) {
                    jVar.f48644e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    jVar.f48645f = new Canvas(jVar.f48644e);
                } else {
                    bitmap.eraseColor(0);
                }
                jVar.a(jVar.f48645f, jVar.f48653o);
                Utilities.copyBitmaps(jVar.f48644e, (Bitmap) aVarArr[i11].f16769b);
                AndroidUtilities.runOnUIThread(new i(jVar, i11, 1));
                return;
            default:
                j jVar2 = this.f48638b;
                int i12 = this.f48639c;
                jVar2.d = i12;
                jVar2.f48646g.setShader((BitmapShader) jVar2.f48643c[i12].f16770c);
                jVar2.f48648j = false;
                jVar2.f48654p = true;
                return;
        }
    }
}
