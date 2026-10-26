package xg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import tg.x1;
public final class o extends x1 {
    public final r f51798r;

    public o(r rVar, Context context) {
        super(context);
        this.f51798r = rVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f51798r.f51803b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f51798r.f51803b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f49119a.f49091b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
    }
}
