package rf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class c0 extends ViewOutlineProvider {
    public final int f46507a;
    public final float f46508b;

    public c0(int i10, float f7) {
        this.f46507a = i10;
        this.f46508b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i10 = this.f46507a;
        float f7 = this.f46508b;
        int i11 = this.f46507a;
        outline.setRoundRect(i11, i11, width - i10, view.getHeight() - i10, f7);
    }
}
