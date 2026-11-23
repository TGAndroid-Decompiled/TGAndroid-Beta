package tg;

import android.content.Context;
import android.view.MotionEvent;
public final class p2 extends f {
    public final q2 f58172h2;

    public p2(q2 q2Var, Context context) {
        super(context);
        this.f58172h2 = q2Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m mVar = this.f58172h2.J;
        if (mVar != null && mVar.getVisibility() == 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f58172h2.m();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f58172h2.m();
    }
}
