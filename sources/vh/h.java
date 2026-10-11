package vh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import n7.z0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h implements Runnable {
    public final int f49824a;
    public final i f49825b;
    public final int f49826c;

    public h(i iVar, int i10, int i11) {
        this.f49824a = i11;
        this.f49825b = iVar;
        this.f49826c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49824a) {
            case 0:
                i iVar = this.f49825b;
                int i10 = iVar.f49836k;
                z0[] z0VarArr = iVar.f49830c;
                int i11 = this.f49826c;
                if (z0VarArr[i11] == null) {
                    z0VarArr[i11] = new z0(i10);
                }
                Bitmap bitmap = iVar.f49831e;
                if (bitmap == null) {
                    iVar.f49831e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f49832f = new Canvas(iVar.f49831e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f49832f, iVar.f49840o);
                Utilities.copyBitmaps(iVar.f49831e, (Bitmap) z0VarArr[i11].f16905b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f49825b;
                int i12 = this.f49826c;
                iVar2.d = i12;
                iVar2.f49833g.setShader((BitmapShader) iVar2.f49830c[i12].f16906c);
                iVar2.f49835j = false;
                iVar2.f49841p = true;
                return;
        }
    }
}
