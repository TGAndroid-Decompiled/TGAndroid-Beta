package yg;

import android.content.Context;
import org.telegram.messenger.g0;
import ug.t1;
public final class o extends t1 {
    public final r f61381r;

    public o(r rVar, Context context) {
        super(context);
        this.f61381r = rVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f61381r.f61387b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f61381r.f61387b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f59038a.f59012b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - g0.L(52.0f));
    }
}
