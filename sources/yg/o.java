package yg;

import android.content.Context;
import org.telegram.messenger.g0;
import ug.s1;
public final class o extends s1 {
    public final r f60684r;

    public o(r rVar, Context context) {
        super(context);
        this.f60684r = rVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f60684r.f60690b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f60684r.f60690b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f58330a.f58306b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - g0.L(52.0f));
    }
}
