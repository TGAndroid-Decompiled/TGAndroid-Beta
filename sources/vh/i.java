package vh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class i implements Runnable {
    public final int f44454a;
    public final j f44455b;
    public final int f44456c;

    public i(j jVar, int i10, int i11) {
        this.f44454a = i11;
        this.f44455b = jVar;
        this.f44456c = i10;
    }

    @Override
    public final void run() {
        switch (this.f44454a) {
            case 0:
                j jVar = this.f44455b;
                int i10 = jVar.f44465k;
                o0.a[] aVarArr = jVar.f44460c;
                int i11 = this.f44456c;
                if (aVarArr[i11] == null) {
                    aVarArr[i11] = new o0.a(i10);
                }
                Bitmap bitmap = jVar.e;
                if (bitmap == null) {
                    jVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    jVar.f44461f = new Canvas(jVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                jVar.a(jVar.f44461f, jVar.f44469o);
                Utilities.copyBitmaps(jVar.e, (Bitmap) aVarArr[i11].f15310b);
                AndroidUtilities.runOnUIThread(new i(jVar, i11, 1));
                return;
            default:
                j jVar2 = this.f44455b;
                int i12 = this.f44456c;
                jVar2.d = i12;
                jVar2.f44462g.setShader((BitmapShader) jVar2.f44460c[i12].f15311c);
                jVar2.f44464j = false;
                jVar2.f44470p = true;
                return;
        }
    }
}
