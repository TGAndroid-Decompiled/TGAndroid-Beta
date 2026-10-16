package zf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class i0 extends ViewOutlineProvider {
    public final int f50190a;
    public final float f50191b;

    public i0(int i10, float f7) {
        this.f50190a = i10;
        this.f50191b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i10 = this.f50190a;
        float f7 = this.f50191b;
        int i11 = this.f50190a;
        outline.setRoundRect(i11, i11, width - i10, view.getHeight() - i10, f7);
    }
}
