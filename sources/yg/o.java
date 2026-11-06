package yg;

import android.content.Context;
import org.telegram.messenger.g0;
import ug.q1;
public final class o extends q1 {
    public final r f59374r;

    public o(r rVar, Context context) {
        super(context);
        this.f59374r = rVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f59374r.f59380b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f59374r.f59380b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f56701a.f56672b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - g0.L(52.0f));
    }
}
