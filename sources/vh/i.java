package vh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class i implements Runnable {
    public final int f44449a;
    public final j f44450b;
    public final int f44451c;

    public i(j jVar, int i10, int i11) {
        this.f44449a = i11;
        this.f44450b = jVar;
        this.f44451c = i10;
    }

    @Override
    public final void run() {
        switch (this.f44449a) {
            case 0:
                j jVar = this.f44450b;
                int i10 = jVar.f44460k;
                o0.a[] aVarArr = jVar.f44455c;
                int i11 = this.f44451c;
                if (aVarArr[i11] == null) {
                    aVarArr[i11] = new o0.a(i10);
                }
                Bitmap bitmap = jVar.e;
                if (bitmap == null) {
                    jVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    jVar.f44456f = new Canvas(jVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                jVar.a(jVar.f44456f, jVar.f44464o);
                Utilities.copyBitmaps(jVar.e, (Bitmap) aVarArr[i11].f15310b);
                AndroidUtilities.runOnUIThread(new i(jVar, i11, 1));
                return;
            default:
                j jVar2 = this.f44450b;
                int i12 = this.f44451c;
                jVar2.d = i12;
                jVar2.f44457g.setShader((BitmapShader) jVar2.f44455c[i12].f15311c);
                jVar2.f44459j = false;
                jVar2.f44465p = true;
                return;
        }
    }
}
