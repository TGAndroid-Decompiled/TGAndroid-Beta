package rh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.f6;
public final class j3 extends org.telegram.ui.web.a1 {
    public final o3 M0;

    public j3(o3 o3Var, Context context, f6 f6Var, int i10) {
        super(i10, context, f6Var, true);
        this.M0 = o3Var;
    }

    @Override
    public final void G(org.telegram.ui.web.w0 w0Var) {
        this.M0.G.setWebView(w0Var);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            o3 o3Var = this.M0;
            if (!o3Var.M) {
                o3Var.M = true;
                o3Var.f43641n.L();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
