package rf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.i0;
public final class b0 extends ViewOutlineProvider {
    public final int f46505a = 0;
    public float f46506b;

    public b0(int i10) {
        this.f46506b = i10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f46505a) {
            case 0:
                outline.setRoundRect(view.getPaddingLeft(), view.getPaddingTop(), view.getMeasuredWidth() - view.getPaddingRight(), view.getMeasuredHeight() - view.getPaddingBottom(), this.f46506b);
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), i0.N(this.f46506b));
                return;
        }
    }

    public b0(float f7) {
        this.f46506b = f7;
    }
}
