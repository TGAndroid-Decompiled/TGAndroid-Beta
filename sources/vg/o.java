package vg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import rg.w1;
public final class o extends w1 {
    public final r f49610n;

    public o(r rVar, Context context) {
        super(context);
        this.f49610n = rVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f49610n.f49616b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f49610n.f49616b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f47503a.f47477b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
    }
}
