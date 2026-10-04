package yf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class d0 extends ViewOutlineProvider {
    public final int f50946a;
    public final float f50947b;

    public d0(int i10, float f7) {
        this.f50946a = i10;
        this.f50947b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i10 = this.f50946a;
        float f7 = this.f50947b;
        int i11 = this.f50946a;
        outline.setRoundRect(i11, i11, width - i10, view.getHeight() - i10, f7);
    }
}
