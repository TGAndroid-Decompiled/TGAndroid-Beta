package vg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import rg.w1;
public final class o extends w1 {
    public final r f44624n;

    public o(r rVar, Context context) {
        super(context);
        this.f44624n = rVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44624n.f44629b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44624n.f44629b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f42817a.f42789b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
    }
}
