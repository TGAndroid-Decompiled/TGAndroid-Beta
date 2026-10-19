package zh;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
public final class j0 extends r {
    public final m0 M;

    public j0(m0 m0Var, Activity activity, int i10, i0 i0Var) {
        super(activity, i10, i0Var);
        this.M = m0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        m0 m0Var = this.M;
        float min = Math.min(getHeight(), m0Var.v - (getTranslationY() + getTop()));
        c cVar = m0Var.f52051x;
        if (cVar != null) {
            cVar.G = min;
        }
        m0Var.K = min;
        if (cVar != null) {
            cVar.U = m0Var.f52049s - cVar.getLeft();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m0 m0Var = this.M;
        c1 c1Var = m0Var.d;
        if (c1Var != null && (c1Var.l1 > 0.5f || c1Var.f51801k1 > 0.5f)) {
            if (motionEvent.getActionMasked() == 1) {
                c1 c1Var2 = m0Var.d;
                c1Var2.l1 = 0.0f;
                c1Var2.invalidate();
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
