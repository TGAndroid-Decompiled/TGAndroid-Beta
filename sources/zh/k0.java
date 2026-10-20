package zh;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
public final class k0 extends r {
    public final n0 M;

    public k0(n0 n0Var, Activity activity, int i10, j0 j0Var) {
        super(activity, i10, j0Var);
        this.M = n0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n0 n0Var = this.M;
        float min = Math.min(getHeight(), n0Var.v - (getTranslationY() + getTop()));
        c cVar = n0Var.f52062x;
        if (cVar != null) {
            cVar.G = min;
        }
        n0Var.K = min;
        if (cVar != null) {
            cVar.U = n0Var.f52060s - cVar.getLeft();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        n0 n0Var = this.M;
        c1 c1Var = n0Var.d;
        if (c1Var != null && (c1Var.l1 > 0.5f || c1Var.f51806k1 > 0.5f)) {
            if (motionEvent.getActionMasked() == 1) {
                c1 c1Var2 = n0Var.d;
                c1Var2.l1 = 0.0f;
                c1Var2.invalidate();
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
