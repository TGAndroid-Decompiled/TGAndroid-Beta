package yg;

import android.content.Context;
import org.telegram.messenger.g0;
import ug.t1;
public final class o extends t1 {
    public final r f61293r;

    public o(r rVar, Context context) {
        super(context);
        this.f61293r = rVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f61293r.f61299b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f61293r.f61299b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f58954a.f58928b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - g0.L(52.0f));
    }
}
