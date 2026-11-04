package zg;

import android.content.Context;
import org.telegram.messenger.g0;
import vg.t1;
public final class o extends t1 {
    public final r f60513r;

    public o(r rVar, Context context) {
        super(context);
        this.f60513r = rVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f60513r.f60519b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f60513r.f60519b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        this.f56857a.f56830b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - g0.L(52.0f));
    }
}
