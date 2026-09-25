package vh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h implements Runnable {
    public final int f44707a;
    public final i f44708b;
    public final int f44709c;

    public h(i iVar, int i10, int i11) {
        this.f44707a = i11;
        this.f44708b = iVar;
        this.f44709c = i10;
    }

    @Override
    public final void run() {
        switch (this.f44707a) {
            case 0:
                i iVar = this.f44708b;
                int i10 = iVar.f44718k;
                o0.a[] aVarArr = iVar.f44713c;
                int i11 = this.f44709c;
                if (aVarArr[i11] == null) {
                    aVarArr[i11] = new o0.a(i10);
                }
                Bitmap bitmap = iVar.e;
                if (bitmap == null) {
                    iVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f44714f = new Canvas(iVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f44714f, iVar.f44722o);
                Utilities.copyBitmaps(iVar.e, (Bitmap) aVarArr[i11].f15482b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f44708b;
                int i12 = this.f44709c;
                iVar2.d = i12;
                iVar2.f44715g.setShader((BitmapShader) iVar2.f44713c[i12].f15483c);
                iVar2.f44717j = false;
                iVar2.f44723p = true;
                return;
        }
    }
}
