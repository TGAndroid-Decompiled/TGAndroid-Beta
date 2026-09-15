package vh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class i implements Runnable {
    public final int f44426a;
    public final j f44427b;
    public final int f44428c;

    public i(j jVar, int i10, int i11) {
        this.f44426a = i11;
        this.f44427b = jVar;
        this.f44428c = i10;
    }

    @Override
    public final void run() {
        switch (this.f44426a) {
            case 0:
                j jVar = this.f44427b;
                int i10 = jVar.f44437k;
                o0.a[] aVarArr = jVar.f44432c;
                int i11 = this.f44428c;
                if (aVarArr[i11] == null) {
                    aVarArr[i11] = new o0.a(i10);
                }
                Bitmap bitmap = jVar.e;
                if (bitmap == null) {
                    jVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    jVar.f44433f = new Canvas(jVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                jVar.a(jVar.f44433f, jVar.f44441o);
                Utilities.copyBitmaps(jVar.e, (Bitmap) aVarArr[i11].f15300b);
                AndroidUtilities.runOnUIThread(new i(jVar, i11, 1));
                return;
            default:
                j jVar2 = this.f44427b;
                int i12 = this.f44428c;
                jVar2.d = i12;
                jVar2.f44434g.setShader((BitmapShader) jVar2.f44432c[i12].f15301c);
                jVar2.f44436j = false;
                jVar2.f44442p = true;
                return;
        }
    }
}
