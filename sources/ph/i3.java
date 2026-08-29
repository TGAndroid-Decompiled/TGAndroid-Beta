package ph;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.c6;
public final class i3 extends org.telegram.ui.web.z0 {
    public final n3 L0;

    public i3(n3 n3Var, Context context, c6 c6Var, int i10) {
        super(i10, context, c6Var, true);
        this.L0 = n3Var;
    }

    @Override
    public final void G(org.telegram.ui.web.w0 w0Var) {
        this.L0.F.setWebView(w0Var);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            n3 n3Var = this.L0;
            if (!n3Var.L) {
                n3Var.L = true;
                n3Var.f45917n.L();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
