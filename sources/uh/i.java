package uh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import n7.a1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class i implements Runnable {
    public final int f42794a;
    public final j f42795b;
    public final int f42796c;

    public i(j jVar, int i10, int i11) {
        this.f42794a = i11;
        this.f42795b = jVar;
        this.f42796c = i10;
    }

    @Override
    public final void run() {
        switch (this.f42794a) {
            case 0:
                j jVar = this.f42795b;
                int i10 = jVar.f42805k;
                a1[] a1VarArr = jVar.f42800c;
                int i11 = this.f42796c;
                if (a1VarArr[i11] == null) {
                    a1VarArr[i11] = new a1(i10);
                }
                Bitmap bitmap = jVar.e;
                if (bitmap == null) {
                    jVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    jVar.f42801f = new Canvas(jVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                jVar.a(jVar.f42801f, jVar.f42809o);
                Utilities.copyBitmaps(jVar.e, (Bitmap) a1VarArr[i11].f13938b);
                AndroidUtilities.runOnUIThread(new i(jVar, i11, 1));
                return;
            default:
                j jVar2 = this.f42795b;
                int i12 = this.f42796c;
                jVar2.d = i12;
                jVar2.f42802g.setShader((BitmapShader) jVar2.f42800c[i12].f13939c);
                jVar2.f42804j = false;
                jVar2.f42810p = true;
                return;
        }
    }
}
