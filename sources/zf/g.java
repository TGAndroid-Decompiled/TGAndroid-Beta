package zf;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.eq;
public final class g implements y6, yg.b {
    public final int f55510a;

    @Override
    public Object a(Bitmap bitmap) {
        switch (this.f55510a) {
            case 1:
                if (bitmap != null && !bitmap.isRecycled()) {
                    Bitmap E = Utilities.E(Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f), bitmap);
                    E.setHasAlpha(false);
                    return E;
                }
                return null;
            case 2:
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
    public void d(int i10, View view) {
        Drawable background = view.getBackground();
        if (background instanceof eq) {
            Drawable drawable = ((eq) background).f25901a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(i10);
                view.invalidate();
            }
        }
    }
}
