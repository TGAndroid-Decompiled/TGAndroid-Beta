package wh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import mi.q;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h implements Runnable {
    public final int f49115a;
    public final i f49116b;
    public final int f49117c;

    public h(i iVar, int i10, int i11) {
        this.f49115a = i11;
        this.f49116b = iVar;
        this.f49117c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49115a) {
            case 0:
                i iVar = this.f49116b;
                int i10 = iVar.f49126k;
                q[] qVarArr = iVar.f49121c;
                int i11 = this.f49117c;
                if (qVarArr[i11] == null) {
                    qVarArr[i11] = new q(i10);
                }
                Bitmap bitmap = iVar.e;
                if (bitmap == null) {
                    iVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f49122f = new Canvas(iVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f49122f, iVar.f49130o);
                Utilities.copyBitmaps(iVar.e, (Bitmap) qVarArr[i11].f16974b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f49116b;
                int i12 = this.f49117c;
                iVar2.d = i12;
                iVar2.f49123g.setShader((BitmapShader) iVar2.f49121c[i12].f16975c);
                iVar2.f49125j = false;
                iVar2.f49131p = true;
                return;
        }
    }
}
