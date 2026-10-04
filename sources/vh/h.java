package vh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h implements Runnable {
    public final int f48406a;
    public final i f48407b;
    public final int f48408c;

    public h(i iVar, int i10, int i11) {
        this.f48406a = i11;
        this.f48407b = iVar;
        this.f48408c = i10;
    }

    @Override
    public final void run() {
        switch (this.f48406a) {
            case 0:
                i iVar = this.f48407b;
                int i10 = iVar.f48418k;
                o0.a[] aVarArr = iVar.f48412c;
                int i11 = this.f48408c;
                if (aVarArr[i11] == null) {
                    aVarArr[i11] = new o0.a(i10);
                }
                Bitmap bitmap = iVar.f48413e;
                if (bitmap == null) {
                    iVar.f48413e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f48414f = new Canvas(iVar.f48413e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f48414f, iVar.f48422o);
                Utilities.copyBitmaps(iVar.f48413e, (Bitmap) aVarArr[i11].f16928b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f48407b;
                int i12 = this.f48408c;
                iVar2.d = i12;
                iVar2.f48415g.setShader((BitmapShader) iVar2.f48412c[i12].f16929c);
                iVar2.f48417j = false;
                iVar2.f48423p = true;
                return;
        }
    }
}
