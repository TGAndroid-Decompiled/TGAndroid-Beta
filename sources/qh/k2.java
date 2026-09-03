package qh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.Components.sl0;
public final class k2 extends sl0 {
    public final z2 U2;

    public k2(z2 z2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.U2 = z2Var;
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
