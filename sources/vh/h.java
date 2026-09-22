package vh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h implements Runnable {
    public final int f44744a;
    public final i f44745b;
    public final int f44746c;

    public h(i iVar, int i10, int i11) {
        this.f44744a = i11;
        this.f44745b = iVar;
        this.f44746c = i10;
    }

    @Override
    public final void run() {
        switch (this.f44744a) {
            case 0:
                i iVar = this.f44745b;
                int i10 = iVar.f44755k;
                m5.e[] eVarArr = iVar.f44750c;
                int i11 = this.f44746c;
                if (eVarArr[i11] == null) {
                    eVarArr[i11] = new m5.e(i10);
                }
                Bitmap bitmap = iVar.e;
                if (bitmap == null) {
                    iVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f44751f = new Canvas(iVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f44751f, iVar.f44759o);
                Utilities.copyBitmaps(iVar.e, (Bitmap) eVarArr[i11].f14968b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f44745b;
                int i12 = this.f44746c;
                iVar2.d = i12;
                iVar2.f44752g.setShader((BitmapShader) iVar2.f44750c[i12].f14969c);
                iVar2.f44754j = false;
                iVar2.f44760p = true;
                return;
        }
    }
}
