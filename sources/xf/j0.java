package xf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class j0 extends ViewOutlineProvider {
    public final int f45152a;
    public final float f45153b;

    public j0(int i10, float f7) {
        this.f45152a = i10;
        this.f45153b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i10 = this.f45152a;
        float f7 = this.f45153b;
        int i11 = this.f45152a;
        outline.setRoundRect(i11, i11, width - i10, view.getHeight() - i10, f7);
    }
}
