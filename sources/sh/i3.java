package sh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.g6;
public final class i3 extends org.telegram.ui.web.a1 {
    public final n3 M0;

    public i3(n3 n3Var, Context context, g6 g6Var, int i10) {
        super(i10, context, g6Var, true);
        this.M0 = n3Var;
    }

    @Override
    public final void G(org.telegram.ui.web.x0 x0Var) {
        this.M0.G.setWebView(x0Var);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            n3 n3Var = this.M0;
            if (!n3Var.M) {
                n3Var.M = true;
                n3Var.f47578n.L();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
