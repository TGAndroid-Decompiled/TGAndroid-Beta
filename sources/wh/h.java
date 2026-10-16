package wh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import m2.t;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h implements Runnable {
    public final int f47681a;
    public final i f47682b;
    public final int f47683c;

    public h(i iVar, int i10, int i11) {
        this.f47681a = i11;
        this.f47682b = iVar;
        this.f47683c = i10;
    }

    @Override
    public final void run() {
        switch (this.f47681a) {
            case 0:
                i iVar = this.f47682b;
                int i10 = iVar.f47692k;
                t[] tVarArr = iVar.f47687c;
                int i11 = this.f47683c;
                if (tVarArr[i11] == null) {
                    tVarArr[i11] = new t(i10);
                }
                Bitmap bitmap = iVar.e;
                if (bitmap == null) {
                    iVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f47688f = new Canvas(iVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f47688f, iVar.f47696o);
                Utilities.copyBitmaps(iVar.e, (Bitmap) tVarArr[i11].f15110b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f47682b;
                int i12 = this.f47683c;
                iVar2.d = i12;
                iVar2.f47689g.setShader((BitmapShader) iVar2.f47687c[i12].f15111c);
                iVar2.f47691j = false;
                iVar2.f47697p = true;
                return;
        }
    }
}
