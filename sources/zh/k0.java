package zh;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
public final class k0 extends x {
    public final m0 M;

    public k0(m0 m0Var, Activity activity, int i10, j0 j0Var) {
        super(activity, i10, j0Var);
        this.M = m0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        m0 m0Var = this.M;
        float min = Math.min(getHeight(), m0Var.v - (getTranslationY() + getTop()));
        c cVar = m0Var.f52066x;
        if (cVar != null) {
            cVar.G = min;
        }
        m0Var.I = min;
        if (cVar != null) {
            cVar.U = m0Var.f52064s - cVar.getLeft();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m0 m0Var = this.M;
        b1 b1Var = m0Var.d;
        if (b1Var != null && (b1Var.l1 > 0.5f || b1Var.f51777k1 > 0.5f)) {
            if (motionEvent.getActionMasked() == 1) {
                b1 b1Var2 = m0Var.d;
                b1Var2.l1 = 0.0f;
                b1Var2.invalidate();
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
