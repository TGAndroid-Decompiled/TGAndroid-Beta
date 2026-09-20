package vh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class i implements Runnable {
    public final int f44723a;
    public final j f44724b;
    public final int f44725c;

    public i(j jVar, int i10, int i11) {
        this.f44723a = i11;
        this.f44724b = jVar;
        this.f44725c = i10;
    }

    @Override
    public final void run() {
        switch (this.f44723a) {
            case 0:
                j jVar = this.f44724b;
                int i10 = jVar.f44734k;
                m5.e[] eVarArr = jVar.f44729c;
                int i11 = this.f44725c;
                if (eVarArr[i11] == null) {
                    eVarArr[i11] = new m5.e(i10);
                }
                Bitmap bitmap = jVar.e;
                if (bitmap == null) {
                    jVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    jVar.f44730f = new Canvas(jVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                jVar.a(jVar.f44730f, jVar.f44738o);
                Utilities.copyBitmaps(jVar.e, (Bitmap) eVarArr[i11].f14953b);
                AndroidUtilities.runOnUIThread(new i(jVar, i11, 1));
                return;
            default:
                j jVar2 = this.f44724b;
                int i12 = this.f44725c;
                jVar2.d = i12;
                jVar2.f44731g.setShader((BitmapShader) jVar2.f44729c[i12].f14954c);
                jVar2.f44733j = false;
                jVar2.f44739p = true;
                return;
        }
    }
}
