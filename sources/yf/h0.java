package yf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class h0 extends ViewOutlineProvider {
    public final int f46853a;
    public final float f46854b;

    public h0(int i10, float f7) {
        this.f46853a = i10;
        this.f46854b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i10 = this.f46853a;
        float f7 = this.f46854b;
        int i11 = this.f46853a;
        outline.setRoundRect(i11, i11, width - i10, view.getHeight() - i10, f7);
    }
}
