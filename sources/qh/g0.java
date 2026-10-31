package qh;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
public final class g0 extends r {
    public final i0 M;

    public g0(i0 i0Var, Activity activity, int i10, f0 f0Var) {
        super(activity, i10, f0Var);
        this.M = i0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        i0 i0Var = this.M;
        float min = Math.min(getHeight(), i0Var.f45666w - (getTranslationY() + getTop()));
        c cVar = i0Var.f45668y;
        if (cVar != null) {
            cVar.G = min;
        }
        i0Var.K = min;
        if (cVar != null) {
            cVar.U = i0Var.f45665s - cVar.getLeft();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        i0 i0Var = this.M;
        x0 x0Var = i0Var.d;
        if (x0Var != null && (x0Var.l1 > 0.5f || x0Var.f45899k1 > 0.5f)) {
            if (motionEvent.getActionMasked() == 1) {
                x0 x0Var2 = i0Var.d;
                x0Var2.l1 = 0.0f;
                x0Var2.invalidate();
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
