package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.jt0;
public final class e0 extends View {
    public final jt0 f45752a;

    public e0(jt0 jt0Var, Context context) {
        super(context);
        this.f45752a = jt0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c0 c0Var = this.f45752a.W0;
        if (c0Var != null) {
            c0Var.d(canvas);
        }
    }
}
