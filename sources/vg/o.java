package vg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import rg.y1;
public final class o extends y1 {
    public final r f48313n;

    public o(r rVar, Context context) {
        super(context);
        this.f48313n = rVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48313n.f48319b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48313n.f48319b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f46393a.f46359b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
    }
}
