package vh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h implements Runnable {
    public final int f44708a;
    public final i f44709b;
    public final int f44710c;

    public h(i iVar, int i10, int i11) {
        this.f44708a = i11;
        this.f44709b = iVar;
        this.f44710c = i10;
    }

    @Override
    public final void run() {
        switch (this.f44708a) {
            case 0:
                i iVar = this.f44709b;
                int i10 = iVar.f44719k;
                o0.a[] aVarArr = iVar.f44714c;
                int i11 = this.f44710c;
                if (aVarArr[i11] == null) {
                    aVarArr[i11] = new o0.a(i10);
                }
                Bitmap bitmap = iVar.e;
                if (bitmap == null) {
                    iVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f44715f = new Canvas(iVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f44715f, iVar.f44723o);
                Utilities.copyBitmaps(iVar.e, (Bitmap) aVarArr[i11].f15483b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f44709b;
                int i12 = this.f44710c;
                iVar2.d = i12;
                iVar2.f44716g.setShader((BitmapShader) iVar2.f44714c[i12].f15484c);
                iVar2.f44718j = false;
                iVar2.f44724p = true;
                return;
        }
    }
}
