package wh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import mi.q;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h implements Runnable {
    public final int f49067a;
    public final i f49068b;
    public final int f49069c;

    public h(i iVar, int i10, int i11) {
        this.f49067a = i11;
        this.f49068b = iVar;
        this.f49069c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49067a) {
            case 0:
                i iVar = this.f49068b;
                int i10 = iVar.f49078k;
                q[] qVarArr = iVar.f49073c;
                int i11 = this.f49069c;
                if (qVarArr[i11] == null) {
                    qVarArr[i11] = new q(i10);
                }
                Bitmap bitmap = iVar.e;
                if (bitmap == null) {
                    iVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f49074f = new Canvas(iVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f49074f, iVar.f49082o);
                Utilities.copyBitmaps(iVar.e, (Bitmap) qVarArr[i11].f16975b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f49068b;
                int i12 = this.f49069c;
                iVar2.d = i12;
                iVar2.f49075g.setShader((BitmapShader) iVar2.f49073c[i12].f16976c);
                iVar2.f49077j = false;
                iVar2.f49083p = true;
                return;
        }
    }
}
