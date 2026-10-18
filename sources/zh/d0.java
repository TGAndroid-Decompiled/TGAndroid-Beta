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
        c cVar = f0Var.f51726x;
        if (cVar != null) {
            cVar.G = min;
        }
        f0Var.K = min;
        if (cVar != null) {
            cVar.U = f0Var.f51724s - cVar.getLeft();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        f0 f0Var = this.M;
        u0 u0Var = f0Var.d;
        if (u0Var != null && (u0Var.l1 > 0.5f || u0Var.f51954k1 > 0.5f)) {
            if (motionEvent.getActionMasked() == 1) {
                u0 u0Var2 = f0Var.d;
                u0Var2.l1 = 0.0f;
                u0Var2.invalidate();
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
