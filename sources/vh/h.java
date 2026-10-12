package vh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import n7.z0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h implements Runnable {
    public final int f49939a;
    public final i f49940b;
    public final int f49941c;

    public h(i iVar, int i10, int i11) {
        this.f49939a = i11;
        this.f49940b = iVar;
        this.f49941c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49939a) {
            case 0:
                i iVar = this.f49940b;
                int i10 = iVar.f49951k;
                z0[] z0VarArr = iVar.f49945c;
                int i11 = this.f49941c;
                if (z0VarArr[i11] == null) {
                    z0VarArr[i11] = new z0(i10);
                }
                Bitmap bitmap = iVar.f49946e;
                if (bitmap == null) {
                    iVar.f49946e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f49947f = new Canvas(iVar.f49946e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f49947f, iVar.f49955o);
                Utilities.copyBitmaps(iVar.f49946e, (Bitmap) z0VarArr[i11].f16573b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f49940b;
                int i12 = this.f49941c;
                iVar2.d = i12;
                iVar2.f49948g.setShader((BitmapShader) iVar2.f49945c[i12].f16574c);
                iVar2.f49950j = false;
                iVar2.f49956p = true;
                return;
        }
    }
}
