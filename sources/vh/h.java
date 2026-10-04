package vh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h implements Runnable {
    public final int f48405a;
    public final i f48406b;
    public final int f48407c;

    public h(i iVar, int i10, int i11) {
        this.f48405a = i11;
        this.f48406b = iVar;
        this.f48407c = i10;
    }

    @Override
    public final void run() {
        switch (this.f48405a) {
            case 0:
                i iVar = this.f48406b;
                int i10 = iVar.f48417k;
                o0.a[] aVarArr = iVar.f48411c;
                int i11 = this.f48407c;
                if (aVarArr[i11] == null) {
                    aVarArr[i11] = new o0.a(i10);
                }
                Bitmap bitmap = iVar.f48412e;
                if (bitmap == null) {
                    iVar.f48412e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f48413f = new Canvas(iVar.f48412e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f48413f, iVar.f48421o);
                Utilities.copyBitmaps(iVar.f48412e, (Bitmap) aVarArr[i11].f16927b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f48406b;
                int i12 = this.f48407c;
                iVar2.d = i12;
                iVar2.f48414g.setShader((BitmapShader) iVar2.f48411c[i12].f16928c);
                iVar2.f48416j = false;
                iVar2.f48422p = true;
                return;
        }
    }
}
