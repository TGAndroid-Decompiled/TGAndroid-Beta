package ph;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.rl0;
public final class l2 extends rl0 {
    public final a3 U2;

    public l2(a3 a3Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.U2 = a3Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.U2.H) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.U2.H) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
