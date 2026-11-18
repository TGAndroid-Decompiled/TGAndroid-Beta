package yg;

import android.content.Context;
import org.telegram.messenger.g0;
import ug.u1;
public final class o extends u1 {
    public final r f61252r;

    public o(r rVar, Context context) {
        super(context);
        this.f61252r = rVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f61252r.f61258b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f61252r.f61258b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f58920a.f58894b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - g0.L(52.0f));
    }
}
