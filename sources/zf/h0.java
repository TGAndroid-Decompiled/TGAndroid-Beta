package zf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class h0 extends ViewOutlineProvider {
    public final int f51591a;
    public final float f51592b;

    public h0(int i10, float f7) {
        this.f51591a = i10;
        this.f51592b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i10 = this.f51591a;
        float f7 = this.f51592b;
        int i11 = this.f51591a;
        outline.setRoundRect(i11, i11, width - i10, view.getHeight() - i10, f7);
    }
}
