package vh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h implements Runnable {
    public final int f44814a;
    public final i f44815b;
    public final int f44816c;

    public h(i iVar, int i10, int i11) {
        this.f44814a = i11;
        this.f44815b = iVar;
        this.f44816c = i10;
    }

    @Override
    public final void run() {
        switch (this.f44814a) {
            case 0:
                i iVar = this.f44815b;
                int i10 = iVar.f44825k;
                o0.a[] aVarArr = iVar.f44820c;
                int i11 = this.f44816c;
                if (aVarArr[i11] == null) {
                    aVarArr[i11] = new o0.a(i10);
                }
                Bitmap bitmap = iVar.e;
                if (bitmap == null) {
                    iVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f44821f = new Canvas(iVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f44821f, iVar.f44829o);
                Utilities.copyBitmaps(iVar.e, (Bitmap) aVarArr[i11].f15498b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f44815b;
                int i12 = this.f44816c;
                iVar2.d = i12;
                iVar2.f44822g.setShader((BitmapShader) iVar2.f44820c[i12].f15499c);
                iVar2.f44824j = false;
                iVar2.f44830p = true;
                return;
        }
    }
}
