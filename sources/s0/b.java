package s0;

import android.graphics.Bitmap;
import com.google.firebase.datatransport.TransportRegistrar;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
public final class b implements c9.e, c2, tg.b, j3.f, v2.g, j4.g {
    public final int f43896a;

    public b(int i10) {
        this.f43896a = i10;
    }

    @Override
    public Object a(Bitmap bitmap) {
        switch (this.f43896a) {
            case 14:
                if (bitmap != null && !bitmap.isRecycled()) {
                    Bitmap stackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
                    stackBlurBitmapWithScaleFactor.setHasAlpha(false);
                    return stackBlurBitmapWithScaleFactor;
                }
                return null;
            case 15:
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
    public boolean b(int i10, int i11, int i12, int i13, int i14) {
        if (i11 != 67 || i12 != 79 || i13 != 77 || (i14 != 77 && i10 != 2)) {
            if (i11 == 77 && i12 == 76 && i13 == 76) {
                if (i14 == 84 || i10 == 2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override
    public j3.g c(android.os.Bundle r22) {
        throw new UnsupportedOperationException("Method not decompiled: s0.b.c(android.os.Bundle):j3.g");
    }

    @Override
    public Object f0(c5.j jVar) {
        return TransportRegistrar.a(jVar);
    }

    @Override
    public void i(d2 d2Var, int i10) {
        switch (this.f43896a) {
            case 12:
                d2Var.dismiss();
                return;
            default:
                d2Var.dismiss();
                return;
        }
    }

    @Override
    public void d(Exception exc) {
    }
}
