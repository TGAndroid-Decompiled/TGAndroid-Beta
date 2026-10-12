package zf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class i0 extends ViewOutlineProvider {
    public final int f50189a;
    public final float f50190b;

    public i0(int i10, float f7) {
        this.f50189a = i10;
        this.f50190b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i10 = this.f50189a;
        float f7 = this.f50190b;
        int i11 = this.f50189a;
        outline.setRoundRect(i11, i11, width - i10, view.getHeight() - i10, f7);
    }
}
