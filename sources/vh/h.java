package vh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h implements Runnable {
    public final int f48421a;
    public final i f48422b;
    public final int f48423c;

    public h(i iVar, int i10, int i11) {
        this.f48421a = i11;
        this.f48422b = iVar;
        this.f48423c = i10;
    }

    @Override
    public final void run() {
        switch (this.f48421a) {
            case 0:
                i iVar = this.f48422b;
                int i10 = iVar.f48433k;
                o0.a[] aVarArr = iVar.f48427c;
                int i11 = this.f48423c;
                if (aVarArr[i11] == null) {
                    aVarArr[i11] = new o0.a(i10);
                }
                Bitmap bitmap = iVar.f48428e;
                if (bitmap == null) {
                    iVar.f48428e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f48429f = new Canvas(iVar.f48428e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f48429f, iVar.f48437o);
                Utilities.copyBitmaps(iVar.f48428e, (Bitmap) aVarArr[i11].f16937b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f48422b;
                int i12 = this.f48423c;
                iVar2.d = i12;
                iVar2.f48430g.setShader((BitmapShader) iVar2.f48427c[i12].f16938c);
                iVar2.f48432j = false;
                iVar2.f48438p = true;
                return;
        }
    }
}
