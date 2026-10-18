package wh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import mi.q;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h implements Runnable {
    public final int f49068a;
    public final i f49069b;
    public final int f49070c;

    public h(i iVar, int i10, int i11) {
        this.f49068a = i11;
        this.f49069b = iVar;
        this.f49070c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49068a) {
            case 0:
                i iVar = this.f49069b;
                int i10 = iVar.f49079k;
                q[] qVarArr = iVar.f49074c;
                int i11 = this.f49070c;
                if (qVarArr[i11] == null) {
                    qVarArr[i11] = new q(i10);
                }
                Bitmap bitmap = iVar.e;
                if (bitmap == null) {
                    iVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f49075f = new Canvas(iVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f49075f, iVar.f49083o);
                Utilities.copyBitmaps(iVar.e, (Bitmap) qVarArr[i11].f16972b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f49069b;
                int i12 = this.f49070c;
                iVar2.d = i12;
                iVar2.f49076g.setShader((BitmapShader) iVar2.f49074c[i12].f16973c);
                iVar2.f49078j = false;
                iVar2.f49084p = true;
                return;
        }
    }
}
