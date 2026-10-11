package vh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import n7.z0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h implements Runnable {
    public final int f49790a;
    public final i f49791b;
    public final int f49792c;

    public h(i iVar, int i10, int i11) {
        this.f49790a = i11;
        this.f49791b = iVar;
        this.f49792c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49790a) {
            case 0:
                i iVar = this.f49791b;
                int i10 = iVar.f49802k;
                z0[] z0VarArr = iVar.f49796c;
                int i11 = this.f49792c;
                if (z0VarArr[i11] == null) {
                    z0VarArr[i11] = new z0(i10);
                }
                Bitmap bitmap = iVar.f49797e;
                if (bitmap == null) {
                    iVar.f49797e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    iVar.f49798f = new Canvas(iVar.f49797e);
                } else {
                    bitmap.eraseColor(0);
                }
                iVar.a(iVar.f49798f, iVar.f49806o);
                Utilities.copyBitmaps(iVar.f49797e, (Bitmap) z0VarArr[i11].f16869b);
                AndroidUtilities.runOnUIThread(new h(iVar, i11, 1));
                return;
            default:
                i iVar2 = this.f49791b;
                int i12 = this.f49792c;
                iVar2.d = i12;
                iVar2.f49799g.setShader((BitmapShader) iVar2.f49796c[i12].f16870c);
                iVar2.f49801j = false;
                iVar2.f49807p = true;
                return;
        }
    }
}
