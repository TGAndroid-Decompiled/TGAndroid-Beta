package tg;

import android.content.Context;
import android.view.MotionEvent;
public final class m2 extends b {
    public final n2 Z1;

    public m2(n2 n2Var, Context context) {
        super(context);
        this.Z1 = n2Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        i iVar = this.Z1.I;
        if (iVar != null && iVar.getVisibility() == 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.Z1.m();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.Z1.m();
    }
}
