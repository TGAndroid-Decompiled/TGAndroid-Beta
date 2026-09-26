package yf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class h0 extends ViewOutlineProvider {
    public final int f47108a;
    public final float f47109b;

    public h0(int i10, float f7) {
        this.f47108a = i10;
        this.f47109b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i10 = this.f47108a;
        float f7 = this.f47109b;
        int i11 = this.f47108a;
        outline.setRoundRect(i11, i11, width - i10, view.getHeight() - i10, f7);
    }
}
