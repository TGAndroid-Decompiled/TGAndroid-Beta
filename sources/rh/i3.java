package rh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.f6;
public final class i3 extends org.telegram.ui.web.c1 {
    public final n3 P0;

    public i3(n3 n3Var, Context context, f6 f6Var, int i10) {
        super(i10, context, f6Var, true);
        this.P0 = n3Var;
    }

    @Override
    public final void K(org.telegram.ui.web.y0 y0Var) {
        this.P0.G.setWebView(y0Var);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            n3 n3Var = this.P0;
            if (!n3Var.M) {
                n3Var.M = true;
                n3Var.f43693n.R();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
