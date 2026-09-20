package yf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class h0 extends ViewOutlineProvider {
    public final int f47132a;
    public final float f47133b;

    public h0(int i10, float f7) {
        this.f47132a = i10;
        this.f47133b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i10 = this.f47132a;
        float f7 = this.f47133b;
        int i11 = this.f47132a;
        outline.setRoundRect(i11, i11, width - i10, view.getHeight() - i10, f7);
    }
}
