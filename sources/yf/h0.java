package yf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class h0 extends ViewOutlineProvider {
    public final int f52167a;
    public final float f52168b;

    public h0(int i10, float f7) {
        this.f52167a = i10;
        this.f52168b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i10 = this.f52167a;
        float f7 = this.f52168b;
        int i11 = this.f52167a;
        outline.setRoundRect(i11, i11, width - i10, view.getHeight() - i10, f7);
    }
}
