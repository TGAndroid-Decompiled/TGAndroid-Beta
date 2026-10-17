package wh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import mi.q;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h implements Runnable {
    public final int f49090a;
    public final i f49091b;
    public final int f49092c;

    public h(i iVar, int i10, int i11) {
        this.f49090a = i11;
        this.f49091b = iVar;
        this.f49092c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49090a) {
            case 0:
                i iVar = this.f49091b;
                int i10 = iVar.f49101k;
                q[] qVarArr = iVar.f49096c;
                int i11 = this.f49092c;
                if (qVarArr[i11] == null) {
                    qVarArr[i11] = new q(i10);
                }
                Bitmap bitmap = iVar.e;
                if (bitmap == null) {
                    iVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f49097f = new Canvas(iVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f49097f, iVar.f49105o);
                Utilities.copyBitmaps(iVar.e, (Bitmap) qVarArr[i11].f16967b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f49091b;
                int i12 = this.f49092c;
                iVar2.d = i12;
                iVar2.f49098g.setShader((BitmapShader) iVar2.f49096c[i12].f16968c);
                iVar2.f49100j = false;
                iVar2.f49106p = true;
                return;
        }
    }
}
