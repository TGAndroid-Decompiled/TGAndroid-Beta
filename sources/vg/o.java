package vg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import rg.v1;
public final class o extends v1 {
    public final r f44594n;

    public o(r rVar, Context context) {
        super(context);
        this.f44594n = rVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44594n.f44599b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44594n.f44599b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f42776a.f42751b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
    }
}
