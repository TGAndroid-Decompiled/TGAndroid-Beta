package qh;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
public final class a2 extends ImageView implements b2 {
    @Override
    public void setInvert(float f10) {
        setColorFilter(new PorterDuffColorFilter(i0.a.d(f10, -1, -16777216), PorterDuff.Mode.MULTIPLY));
    }
}
