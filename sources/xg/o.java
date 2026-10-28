package xg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import tg.x1;
public final class o extends x1 {
    public final r f51856r;

    public o(r rVar, Context context) {
        super(context);
        this.f51856r = rVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f51856r.f51861b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f51856r.f51861b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f49154a.f49126b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
    }
}
