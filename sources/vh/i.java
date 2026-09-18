package vh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class i implements Runnable {
    public final int f44679a;
    public final j f44680b;
    public final int f44681c;

    public i(j jVar, int i10, int i11) {
        this.f44679a = i11;
        this.f44680b = jVar;
        this.f44681c = i10;
    }

    @Override
    public final void run() {
        switch (this.f44679a) {
            case 0:
                j jVar = this.f44680b;
                int i10 = jVar.f44690k;
                o0.a[] aVarArr = jVar.f44685c;
                int i11 = this.f44681c;
                if (aVarArr[i11] == null) {
                    aVarArr[i11] = new o0.a(i10);
                }
                Bitmap bitmap = jVar.e;
                if (bitmap == null) {
                    jVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    jVar.f44686f = new Canvas(jVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                jVar.a(jVar.f44686f, jVar.f44694o);
                Utilities.copyBitmaps(jVar.e, (Bitmap) aVarArr[i11].f15439b);
                AndroidUtilities.runOnUIThread(new i(jVar, i11, 1));
                return;
            default:
                j jVar2 = this.f44680b;
                int i12 = this.f44681c;
                jVar2.d = i12;
                jVar2.f44687g.setShader((BitmapShader) jVar2.f44685c[i12].f15440c);
                jVar2.f44689j = false;
                jVar2.f44695p = true;
                return;
        }
    }
}
