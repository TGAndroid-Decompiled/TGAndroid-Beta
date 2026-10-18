package zh;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
public final class d0 extends r {
    public final f0 M;

    public d0(f0 f0Var, Activity activity, int i10, c0 c0Var) {
        super(activity, i10, c0Var);
        this.M = f0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        f0 f0Var = this.M;
        float min = Math.min(getHeight(), f0Var.v - (getTranslationY() + getTop()));
        c cVar = f0Var.f51771x;
        if (cVar != null) {
            cVar.G = min;
        }
        f0Var.I = min;
        if (cVar != null) {
            cVar.U = f0Var.f51769s - cVar.getLeft();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        f0 f0Var = this.M;
        t0 t0Var = f0Var.d;
        if (t0Var != null && (t0Var.l1 > 0.5f || t0Var.f51995k1 > 0.5f)) {
            if (motionEvent.getActionMasked() == 1) {
                t0 t0Var2 = f0Var.d;
                t0Var2.l1 = 0.0f;
                t0Var2.invalidate();
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
