package ug;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import qg.x1;
public final class o extends x1 {
    public final r f42709n;

    public o(r rVar, Context context) {
        super(context);
        this.f42709n = rVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42709n.f42714b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42709n.f42714b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f40983a.f40956b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
    }
}
