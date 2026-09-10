package pg;

import android.content.Context;
import android.view.MotionEvent;
public final class u2 extends b {
    public final v2 E;

    public u2(v2 v2Var, Context context) {
        super(context);
        this.E = v2Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        i iVar = this.E.H;
        if (iVar != null && iVar.getVisibility() == 0) {
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
