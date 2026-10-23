package wh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import mi.q;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h implements Runnable {
    public final int f49078a;
    public final i f49079b;
    public final int f49080c;

    public h(i iVar, int i10, int i11) {
        this.f49078a = i11;
        this.f49079b = iVar;
        this.f49080c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49078a) {
            case 0:
                i iVar = this.f49079b;
                int i10 = iVar.f49089k;
                q[] qVarArr = iVar.f49084c;
                int i11 = this.f49080c;
                if (qVarArr[i11] == null) {
                    qVarArr[i11] = new q(i10);
                }
                Bitmap bitmap = iVar.e;
                if (bitmap == null) {
                    iVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f49085f = new Canvas(iVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f49085f, iVar.f49093o);
                Utilities.copyBitmaps(iVar.e, (Bitmap) qVarArr[i11].f16973b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f49079b;
                int i12 = this.f49080c;
                iVar2.d = i12;
                iVar2.f49086g.setShader((BitmapShader) iVar2.f49084c[i12].f16974c);
                iVar2.f49088j = false;
                iVar2.f49094p = true;
                return;
        }
    }
}
