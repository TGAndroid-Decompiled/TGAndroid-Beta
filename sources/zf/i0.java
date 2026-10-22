package zf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class i0 extends ViewOutlineProvider {
    public final int f51579a;
    public final float f51580b;

    public i0(int i10, float f7) {
        this.f51579a = i10;
        this.f51580b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i10 = this.f51579a;
        float f7 = this.f51580b;
        int i11 = this.f51579a;
        outline.setRoundRect(i11, i11, width - i10, view.getHeight() - i10, f7);
    }
}
