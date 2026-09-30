package yf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class h0 extends ViewOutlineProvider {
    public final int f47217a;
    public final float f47218b;

    public h0(int i10, float f7) {
        this.f47217a = i10;
        this.f47218b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i10 = this.f47217a;
        float f7 = this.f47218b;
        int i11 = this.f47217a;
        outline.setRoundRect(i11, i11, width - i10, view.getHeight() - i10, f7);
    }
}
