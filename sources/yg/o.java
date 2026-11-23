package yg;

import android.content.Context;
import org.telegram.messenger.g0;
import ug.t1;
public final class o extends t1 {
    public final r f61262r;

    public o(r rVar, Context context) {
        super(context);
        this.f61262r = rVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f61262r.f61268b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f61262r.f61268b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f58923a.f58897b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - g0.L(52.0f));
    }
}
