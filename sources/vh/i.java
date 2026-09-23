package vh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class i implements Runnable {
    public final int f44376a;
    public final j f44377b;
    public final int f44378c;

    public i(j jVar, int i10, int i11) {
        this.f44376a = i11;
        this.f44377b = jVar;
        this.f44378c = i10;
    }

    @Override
    public final void run() {
        switch (this.f44376a) {
            case 0:
                j jVar = this.f44377b;
                int i10 = jVar.f44387k;
                o0.a[] aVarArr = jVar.f44382c;
                int i11 = this.f44378c;
                if (aVarArr[i11] == null) {
                    aVarArr[i11] = new o0.a(i10);
                }
                Bitmap bitmap = jVar.e;
                if (bitmap == null) {
                    jVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    jVar.f44383f = new Canvas(jVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                jVar.a(jVar.f44383f, jVar.f44391o);
                Utilities.copyBitmaps(jVar.e, (Bitmap) aVarArr[i11].f15275b);
                AndroidUtilities.runOnUIThread(new i(jVar, i11, 1));
                return;
            default:
                j jVar2 = this.f44377b;
                int i12 = this.f44378c;
                jVar2.d = i12;
                jVar2.f44384g.setShader((BitmapShader) jVar2.f44382c[i12].f15276c);
                jVar2.f44386j = false;
                jVar2.f44392p = true;
                return;
        }
    }
}
