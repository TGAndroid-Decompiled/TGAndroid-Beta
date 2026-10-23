package wh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import mi.q;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h implements Runnable {
    public final int f49520a;
    public final i f49521b;
    public final int f49522c;

    public h(i iVar, int i10, int i11) {
        this.f49520a = i11;
        this.f49521b = iVar;
        this.f49522c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49520a) {
            case 0:
                i iVar = this.f49521b;
                int i10 = iVar.f49531k;
                q[] qVarArr = iVar.f49526c;
                int i11 = this.f49522c;
                if (qVarArr[i11] == null) {
                    qVarArr[i11] = new q(i10);
                }
                Bitmap bitmap = iVar.e;
                if (bitmap == null) {
                    iVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f49527f = new Canvas(iVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f49527f, iVar.f49535o);
                Utilities.copyBitmaps(iVar.e, (Bitmap) qVarArr[i11].f17036b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f49521b;
                int i12 = this.f49522c;
                iVar2.d = i12;
                iVar2.f49528g.setShader((BitmapShader) iVar2.f49526c[i12].f17037c);
                iVar2.f49530j = false;
                iVar2.f49536p = true;
                return;
        }
    }
}
