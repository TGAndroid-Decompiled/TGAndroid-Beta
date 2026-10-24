package wh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import mi.q;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h implements Runnable {
    public final int f49519a;
    public final i f49520b;
    public final int f49521c;

    public h(i iVar, int i10, int i11) {
        this.f49519a = i11;
        this.f49520b = iVar;
        this.f49521c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49519a) {
            case 0:
                i iVar = this.f49520b;
                int i10 = iVar.f49530k;
                q[] qVarArr = iVar.f49525c;
                int i11 = this.f49521c;
                if (qVarArr[i11] == null) {
                    qVarArr[i11] = new q(i10);
                }
                Bitmap bitmap = iVar.e;
                if (bitmap == null) {
                    iVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f49526f = new Canvas(iVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f49526f, iVar.f49534o);
                Utilities.copyBitmaps(iVar.e, (Bitmap) qVarArr[i11].f17036b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f49520b;
                int i12 = this.f49521c;
                iVar2.d = i12;
                iVar2.f49527g.setShader((BitmapShader) iVar2.f49525c[i12].f17037c);
                iVar2.f49529j = false;
                iVar2.f49535p = true;
                return;
        }
    }
}
