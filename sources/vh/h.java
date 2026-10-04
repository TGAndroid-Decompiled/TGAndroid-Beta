package vh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h implements Runnable {
    public final int f48414a;
    public final i f48415b;
    public final int f48416c;

    public h(i iVar, int i10, int i11) {
        this.f48414a = i11;
        this.f48415b = iVar;
        this.f48416c = i10;
    }

    @Override
    public final void run() {
        switch (this.f48414a) {
            case 0:
                i iVar = this.f48415b;
                int i10 = iVar.f48426k;
                o0.a[] aVarArr = iVar.f48420c;
                int i11 = this.f48416c;
                if (aVarArr[i11] == null) {
                    aVarArr[i11] = new o0.a(i10);
                }
                Bitmap bitmap = iVar.f48421e;
                if (bitmap == null) {
                    iVar.f48421e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f48422f = new Canvas(iVar.f48421e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f48422f, iVar.f48430o);
                Utilities.copyBitmaps(iVar.f48421e, (Bitmap) aVarArr[i11].f16932b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f48415b;
                int i12 = this.f48416c;
                iVar2.d = i12;
                iVar2.f48423g.setShader((BitmapShader) iVar2.f48420c[i12].f16933c);
                iVar2.f48425j = false;
                iVar2.f48431p = true;
                return;
        }
    }
}
