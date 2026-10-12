package wh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h implements Runnable {
    public final int f47682a;
    public final i f47683b;
    public final int f47684c;

    public h(i iVar, int i10, int i11) {
        this.f47682a = i11;
        this.f47683b = iVar;
        this.f47684c = i10;
    }

    @Override
    public final void run() {
        switch (this.f47682a) {
            case 0:
                i iVar = this.f47683b;
                int i10 = iVar.f47693k;
                m4.c[] cVarArr = iVar.f47688c;
                int i11 = this.f47684c;
                if (cVarArr[i11] == null) {
                    cVarArr[i11] = new m4.c(i10);
                }
                Bitmap bitmap = iVar.e;
                if (bitmap == null) {
                    iVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f47689f = new Canvas(iVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f47689f, iVar.f47697o);
                Utilities.copyBitmaps(iVar.e, (Bitmap) cVarArr[i11].f15392b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f47683b;
                int i12 = this.f47684c;
                iVar2.d = i12;
                iVar2.f47690g.setShader((BitmapShader) iVar2.f47688c[i12].f15393c);
                iVar2.f47692j = false;
                iVar2.f47698p = true;
                return;
        }
    }
}
