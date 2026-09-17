package vg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import rg.v1;
public final class o extends v1 {
    public final r f44364n;

    public o(r rVar, Context context) {
        super(context);
        this.f44364n = rVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44364n.f44369b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44364n.f44369b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f42544a.f42519b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
    }
}
