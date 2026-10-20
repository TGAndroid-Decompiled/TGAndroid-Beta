package wh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import mi.q;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h implements Runnable {
    public final int f49074a;
    public final i f49075b;
    public final int f49076c;

    public h(i iVar, int i10, int i11) {
        this.f49074a = i11;
        this.f49075b = iVar;
        this.f49076c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49074a) {
            case 0:
                i iVar = this.f49075b;
                int i10 = iVar.f49085k;
                q[] qVarArr = iVar.f49080c;
                int i11 = this.f49076c;
                if (qVarArr[i11] == null) {
                    qVarArr[i11] = new q(i10);
                }
                Bitmap bitmap = iVar.e;
                if (bitmap == null) {
                    iVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f49081f = new Canvas(iVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f49081f, iVar.f49089o);
                Utilities.copyBitmaps(iVar.e, (Bitmap) qVarArr[i11].f16973b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f49075b;
                int i12 = this.f49076c;
                iVar2.d = i12;
                iVar2.f49082g.setShader((BitmapShader) iVar2.f49080c[i12].f16974c);
                iVar2.f49084j = false;
                iVar2.f49090p = true;
                return;
        }
    }
}
