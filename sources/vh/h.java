package vh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h implements Runnable {
    public final int f44706a;
    public final i f44707b;
    public final int f44708c;

    public h(i iVar, int i10, int i11) {
        this.f44706a = i11;
        this.f44707b = iVar;
        this.f44708c = i10;
    }

    @Override
    public final void run() {
        switch (this.f44706a) {
            case 0:
                i iVar = this.f44707b;
                int i10 = iVar.f44717k;
                o0.a[] aVarArr = iVar.f44712c;
                int i11 = this.f44708c;
                if (aVarArr[i11] == null) {
                    aVarArr[i11] = new o0.a(i10);
                }
                Bitmap bitmap = iVar.e;
                if (bitmap == null) {
                    iVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f44713f = new Canvas(iVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f44713f, iVar.f44721o);
                Utilities.copyBitmaps(iVar.e, (Bitmap) aVarArr[i11].f15482b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f44707b;
                int i12 = this.f44708c;
                iVar2.d = i12;
                iVar2.f44714g.setShader((BitmapShader) iVar2.f44712c[i12].f15483c);
                iVar2.f44716j = false;
                iVar2.f44722p = true;
                return;
        }
    }
}
