package vh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h implements Runnable {
    public final int f44692a;
    public final i f44693b;
    public final int f44694c;

    public h(i iVar, int i10, int i11) {
        this.f44692a = i11;
        this.f44693b = iVar;
        this.f44694c = i10;
    }

    @Override
    public final void run() {
        switch (this.f44692a) {
            case 0:
                i iVar = this.f44693b;
                int i10 = iVar.f44703k;
                o0.a[] aVarArr = iVar.f44698c;
                int i11 = this.f44694c;
                if (aVarArr[i11] == null) {
                    aVarArr[i11] = new o0.a(i10);
                }
                Bitmap bitmap = iVar.e;
                if (bitmap == null) {
                    iVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f44699f = new Canvas(iVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f44699f, iVar.f44707o);
                Utilities.copyBitmaps(iVar.e, (Bitmap) aVarArr[i11].f15467b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f44693b;
                int i12 = this.f44694c;
                iVar2.d = i12;
                iVar2.f44700g.setShader((BitmapShader) iVar2.f44698c[i12].f15468c);
                iVar2.f44702j = false;
                iVar2.f44708p = true;
                return;
        }
    }
}
