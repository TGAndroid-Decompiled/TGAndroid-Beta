package vh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b5;
public final class h implements Runnable {
    public final int f49701a;
    public final i f49702b;
    public final int f49703c;

    public h(i iVar, int i10, int i11) {
        this.f49701a = i11;
        this.f49702b = iVar;
        this.f49703c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49701a) {
            case 0:
                i iVar = this.f49702b;
                int i10 = iVar.f49713k;
                b5[] b5VarArr = iVar.f49707c;
                int i11 = this.f49703c;
                if (b5VarArr[i11] == null) {
                    b5VarArr[i11] = new b5(i10);
                }
                Bitmap bitmap = iVar.f49708e;
                if (bitmap == null) {
                    iVar.f49708e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f49709f = new Canvas(iVar.f49708e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f49709f, iVar.f49717o);
                Utilities.copyBitmaps(iVar.f49708e, (Bitmap) b5VarArr[i11].f20461b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f49702b;
                int i12 = this.f49703c;
                iVar2.d = i12;
                iVar2.f49710g.setShader((BitmapShader) iVar2.f49707c[i12].f20462c);
                iVar2.f49712j = false;
                iVar2.f49718p = true;
                return;
        }
    }
}
