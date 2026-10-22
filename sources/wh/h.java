package wh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import mi.q;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h implements Runnable {
    public final int f49077a;
    public final i f49078b;
    public final int f49079c;

    public h(i iVar, int i10, int i11) {
        this.f49077a = i11;
        this.f49078b = iVar;
        this.f49079c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49077a) {
            case 0:
                i iVar = this.f49078b;
                int i10 = iVar.f49088k;
                q[] qVarArr = iVar.f49083c;
                int i11 = this.f49079c;
                if (qVarArr[i11] == null) {
                    qVarArr[i11] = new q(i10);
                }
                Bitmap bitmap = iVar.e;
                if (bitmap == null) {
                    iVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f49084f = new Canvas(iVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f49084f, iVar.f49092o);
                Utilities.copyBitmaps(iVar.e, (Bitmap) qVarArr[i11].f16973b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f49078b;
                int i12 = this.f49079c;
                iVar2.d = i12;
                iVar2.f49085g.setShader((BitmapShader) iVar2.f49083c[i12].f16974c);
                iVar2.f49087j = false;
                iVar2.f49093p = true;
                return;
        }
    }
}
