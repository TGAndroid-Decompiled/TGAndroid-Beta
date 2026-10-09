package vh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b5;
public final class h implements Runnable {
    public final int f49703a;
    public final i f49704b;
    public final int f49705c;

    public h(i iVar, int i10, int i11) {
        this.f49703a = i11;
        this.f49704b = iVar;
        this.f49705c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49703a) {
            case 0:
                i iVar = this.f49704b;
                int i10 = iVar.f49715k;
                b5[] b5VarArr = iVar.f49709c;
                int i11 = this.f49705c;
                if (b5VarArr[i11] == null) {
                    b5VarArr[i11] = new b5(i10);
                }
                Bitmap bitmap = iVar.f49710e;
                if (bitmap == null) {
                    iVar.f49710e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f49711f = new Canvas(iVar.f49710e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f49711f, iVar.f49719o);
                Utilities.copyBitmaps(iVar.f49710e, (Bitmap) b5VarArr[i11].f20461b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f49704b;
                int i12 = this.f49705c;
                iVar2.d = i12;
                iVar2.f49712g.setShader((BitmapShader) iVar2.f49709c[i12].f20462c);
                iVar2.f49714j = false;
                iVar2.f49720p = true;
                return;
        }
    }
}
