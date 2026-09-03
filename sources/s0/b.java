package s0;

import android.graphics.Bitmap;
import com.google.firebase.datatransport.TransportRegistrar;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
public final class b implements c9.f, c2, tg.b, j3.f, v2.g {
    public final int f43962a;

    public b(int i10) {
        this.f43962a = i10;
    }

    @Override
    public Object a(Bitmap bitmap) {
        switch (this.f43962a) {
            case 15:
                if (bitmap != null && !bitmap.isRecycled()) {
                    Bitmap stackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
                    stackBlurBitmapWithScaleFactor.setHasAlpha(false);
                    return stackBlurBitmapWithScaleFactor;
                }
                return null;
            case 16:
                int i10 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    int height = bitmap.getHeight();
                    i10 = Utilities.averageBitmapColor(bitmap, 0, (height * 9) / 10, bitmap.getWidth(), height);
                }
                return Integer.valueOf(i10);
            default:
                int i11 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    i11 = Utilities.averageBitmapColor(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight() / 10);
                }
                return Integer.valueOf(i11);
        }
    }

    @Override
    public j3.g c(android.os.Bundle r22) {
        throw new UnsupportedOperationException("Method not decompiled: s0.b.c(android.os.Bundle):j3.g");
    }

    @Override
    public Object d0(c5.j jVar) {
        return TransportRegistrar.a(jVar);
    }

    @Override
    public void l(d2 d2Var, int i10) {
        switch (this.f43962a) {
            case 13:
                d2Var.dismiss();
                return;
            default:
                d2Var.dismiss();
                return;
        }
    }

    @Override
    public void b(Exception exc) {
    }
}
