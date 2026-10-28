package xh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import m4.w1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h implements Runnable {
    public final int f51940a;
    public final i f51941b;
    public final int f51942c;

    public h(i iVar, int i10, int i11) {
        this.f51940a = i11;
        this.f51941b = iVar;
        this.f51942c = i10;
    }

    @Override
    public final void run() {
        switch (this.f51940a) {
            case 0:
                i iVar = this.f51941b;
                int i10 = iVar.f51951k;
                w1[] w1VarArr = iVar.f51946c;
                int i11 = this.f51942c;
                if (w1VarArr[i11] == null) {
                    w1VarArr[i11] = new w1(i10);
                }
                Bitmap bitmap = iVar.e;
                if (bitmap == null) {
                    iVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f51947f = new Canvas(iVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f51947f, iVar.f51955o);
                Utilities.copyBitmaps(iVar.e, (Bitmap) w1VarArr[i11].f18292b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f51941b;
                int i12 = this.f51942c;
                iVar2.d = i12;
                iVar2.f51948g.setShader((BitmapShader) iVar2.f51946c[i12].f18293c);
                iVar2.f51950j = false;
                iVar2.f51956p = true;
                return;
        }
    }
}
