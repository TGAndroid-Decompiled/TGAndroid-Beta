package yf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class i0 extends ViewOutlineProvider {
    public final int f50108a;
    public final float f50109b;

    public i0(int i10, float f7) {
        this.f50108a = i10;
        this.f50109b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i10 = this.f50108a;
        float f7 = this.f50109b;
        int i11 = this.f50108a;
        outline.setRoundRect(i11, i11, width - i10, view.getHeight() - i10, f7);
    }
}
