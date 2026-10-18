package zf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class i0 extends ViewOutlineProvider {
    public final int f51569a;
    public final float f51570b;

    public i0(int i10, float f7) {
        this.f51569a = i10;
        this.f51570b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i10 = this.f51569a;
        float f7 = this.f51570b;
        int i11 = this.f51569a;
        outline.setRoundRect(i11, i11, width - i10, view.getHeight() - i10, f7);
    }
}
