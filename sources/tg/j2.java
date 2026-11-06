package tg;

import android.content.Context;
import android.view.MotionEvent;
public final class j2 extends b {
    public final k2 T1;

    public j2(k2 k2Var, Context context) {
        super(context);
        this.T1 = k2Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        i iVar = this.T1.H;
        if (iVar != null && iVar.getVisibility() == 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.T1.m();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.T1.m();
    }
}
