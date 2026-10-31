package rf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class c0 extends ViewOutlineProvider {
    public final int f46496a;
    public final float f46497b;

    public c0(int i10, float f7) {
        this.f46496a = i10;
        this.f46497b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i10 = this.f46496a;
        float f7 = this.f46497b;
        int i11 = this.f46496a;
        outline.setRoundRect(i11, i11, width - i10, view.getHeight() - i10, f7);
    }
}
