package r;

import android.graphics.Bitmap;
import android.view.WindowInsets;
import androidx.car.app.utils.e;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
public final class a implements e, b2, rg.b {
    public final int f46786a;

    public static WindowInsets b() {
        return WindowInsets.CONSUMED;
    }

    @Override
    public Object a(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            Bitmap stackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
            stackBlurBitmapWithScaleFactor.setHasAlpha(false);
            return stackBlurBitmapWithScaleFactor;
        }
        return null;
    }

    @Override
    public void call() {
        throw null;
    }

    @Override
    public void g(c2 c2Var, int i10) {
        switch (this.f46786a) {
            case 27:
                c2Var.dismiss();
                return;
            default:
                c2Var.dismiss();
                return;
        }
    }
}
