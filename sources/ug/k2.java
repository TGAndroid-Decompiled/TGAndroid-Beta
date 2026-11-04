package ug;

import android.content.Context;
import android.view.MotionEvent;
public final class k2 extends b {
    public final l2 U1;

    public k2(l2 l2Var, Context context) {
        super(context);
        this.U1 = l2Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        i iVar = this.U1.I;
        if (iVar != null && iVar.getVisibility() == 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        this.U1.m();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        this.U1.m();
    }
}
