package yf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class h0 extends ViewOutlineProvider {
    public final int f47154a;
    public final float f47155b;

    public h0(int i10, float f7) {
        this.f47154a = i10;
        this.f47155b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i10 = this.f47154a;
        float f7 = this.f47155b;
        int i11 = this.f47154a;
        outline.setRoundRect(i11, i11, width - i10, view.getHeight() - i10, f7);
    }
}
