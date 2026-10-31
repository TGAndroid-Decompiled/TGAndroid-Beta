package rf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.i0;
public final class b0 extends ViewOutlineProvider {
    public final int f46494a = 0;
    public float f46495b;

    public b0(int i10) {
        this.f46495b = i10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f46494a) {
            case 0:
                outline.setRoundRect(view.getPaddingLeft(), view.getPaddingTop(), view.getMeasuredWidth() - view.getPaddingRight(), view.getMeasuredHeight() - view.getPaddingBottom(), this.f46495b);
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), i0.N(this.f46495b));
                return;
        }
    }

    public b0(float f7) {
        this.f46495b = f7;
    }
}
