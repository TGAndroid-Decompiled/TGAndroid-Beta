package vh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b5;
public final class h implements Runnable {
    public final int f49747a;
    public final i f49748b;
    public final int f49749c;

    public h(i iVar, int i10, int i11) {
        this.f49747a = i11;
        this.f49748b = iVar;
        this.f49749c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49747a) {
            case 0:
                i iVar = this.f49748b;
                int i10 = iVar.f49759k;
                b5[] b5VarArr = iVar.f49753c;
                int i11 = this.f49749c;
                if (b5VarArr[i11] == null) {
                    b5VarArr[i11] = new b5(i10);
                }
                Bitmap bitmap = iVar.f49754e;
                if (bitmap == null) {
                    iVar.f49754e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f49755f = new Canvas(iVar.f49754e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f49755f, iVar.f49763o);
                Utilities.copyBitmaps(iVar.f49754e, (Bitmap) b5VarArr[i11].f20465b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f49748b;
                int i12 = this.f49749c;
                iVar2.d = i12;
                iVar2.f49756g.setShader((BitmapShader) iVar2.f49753c[i12].f20466c);
                iVar2.f49758j = false;
                iVar2.f49764p = true;
                return;
        }
    }
}
