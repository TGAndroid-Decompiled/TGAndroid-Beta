package xf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class i0 extends ViewOutlineProvider {
    public final int f45147a = 0;
    public float f45148b;

    public i0(int i10) {
        this.f45148b = i10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f45147a) {
            case 0:
                outline.setRoundRect(view.getPaddingLeft(), view.getPaddingTop(), view.getMeasuredWidth() - view.getPaddingRight(), view.getMeasuredHeight() - view.getPaddingBottom(), this.f45148b);
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dpf2(this.f45148b));
                return;
        }
    }

    public i0(float f7) {
        this.f45148b = f7;
    }
}
