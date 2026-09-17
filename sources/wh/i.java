package wh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class i implements Runnable {
    public final int f48666a;
    public final j f48667b;
    public final int f48668c;

    public i(j jVar, int i10, int i11) {
        this.f48666a = i11;
        this.f48667b = jVar;
        this.f48668c = i10;
    }

    @Override
    public final void run() {
        switch (this.f48666a) {
            case 0:
                j jVar = this.f48667b;
                int i10 = jVar.f48678k;
                o0.a[] aVarArr = jVar.f48672c;
                int i11 = this.f48668c;
                if (aVarArr[i11] == null) {
                    aVarArr[i11] = new o0.a(i10);
                }
                Bitmap bitmap = jVar.f48673e;
                if (bitmap == null) {
                    jVar.f48673e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    jVar.f48674f = new Canvas(jVar.f48673e);
                } else {
                    bitmap.eraseColor(0);
                }
                jVar.a(jVar.f48674f, jVar.f48682o);
                Utilities.copyBitmaps(jVar.f48673e, (Bitmap) aVarArr[i11].f16796b);
                AndroidUtilities.runOnUIThread(new i(jVar, i11, 1));
                return;
            default:
                j jVar2 = this.f48667b;
                int i12 = this.f48668c;
                jVar2.d = i12;
                jVar2.f48675g.setShader((BitmapShader) jVar2.f48672c[i12].f16797c);
                jVar2.f48677j = false;
                jVar2.f48683p = true;
                return;
        }
    }
}
