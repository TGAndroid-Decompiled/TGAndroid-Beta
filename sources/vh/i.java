package vh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class i implements Runnable {
    public final int f44422a;
    public final j f44423b;
    public final int f44424c;

    public i(j jVar, int i10, int i11) {
        this.f44422a = i11;
        this.f44423b = jVar;
        this.f44424c = i10;
    }

    @Override
    public final void run() {
        switch (this.f44422a) {
            case 0:
                j jVar = this.f44423b;
                int i10 = jVar.f44433k;
                o0.a[] aVarArr = jVar.f44428c;
                int i11 = this.f44424c;
                if (aVarArr[i11] == null) {
                    aVarArr[i11] = new o0.a(i10);
                }
                Bitmap bitmap = jVar.e;
                if (bitmap == null) {
                    jVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    jVar.f44429f = new Canvas(jVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                jVar.a(jVar.f44429f, jVar.f44437o);
                Utilities.copyBitmaps(jVar.e, (Bitmap) aVarArr[i11].f15298b);
                AndroidUtilities.runOnUIThread(new i(jVar, i11, 1));
                return;
            default:
                j jVar2 = this.f44423b;
                int i12 = this.f44424c;
                jVar2.d = i12;
                jVar2.f44430g.setShader((BitmapShader) jVar2.f44428c[i12].f15299c);
                jVar2.f44432j = false;
                jVar2.f44438p = true;
                return;
        }
    }
}
