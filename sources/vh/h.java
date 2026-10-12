package vh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import n7.z0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h implements Runnable {
    public final int f49931a;
    public final i f49932b;
    public final int f49933c;

    public h(i iVar, int i10, int i11) {
        this.f49931a = i11;
        this.f49932b = iVar;
        this.f49933c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49931a) {
            case 0:
                i iVar = this.f49932b;
                int i10 = iVar.f49943k;
                z0[] z0VarArr = iVar.f49937c;
                int i11 = this.f49933c;
                if (z0VarArr[i11] == null) {
                    z0VarArr[i11] = new z0(i10);
                }
                Bitmap bitmap = iVar.f49938e;
                if (bitmap == null) {
                    iVar.f49938e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f49939f = new Canvas(iVar.f49938e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f49939f, iVar.f49947o);
                Utilities.copyBitmaps(iVar.f49938e, (Bitmap) z0VarArr[i11].f16572b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f49932b;
                int i12 = this.f49933c;
                iVar2.d = i12;
                iVar2.f49940g.setShader((BitmapShader) iVar2.f49937c[i12].f16573c);
                iVar2.f49942j = false;
                iVar2.f49948p = true;
                return;
        }
    }
}
