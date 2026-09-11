package rg;

import android.content.Context;
import android.view.MotionEvent;
public final class w2 extends b {
    public final x2 E;

    public w2(x2 x2Var, Context context) {
        super(context);
        this.E = x2Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        j jVar = this.E.H;
        if (jVar != null && jVar.getVisibility() == 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.E.m();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.E.m();
    }
}
