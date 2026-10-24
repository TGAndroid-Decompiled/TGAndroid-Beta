package zf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class i0 extends ViewOutlineProvider {
    public final int f52041a;
    public final float f52042b;

    public i0(int i10, float f7) {
        this.f52041a = i10;
        this.f52042b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i10 = this.f52041a;
        float f7 = this.f52042b;
        int i11 = this.f52041a;
        outline.setRoundRect(i11, i11, width - i10, view.getHeight() - i10, f7);
    }
}
