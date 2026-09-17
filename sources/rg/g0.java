package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.zt0;
public final class g0 extends View {
    public final zt0 f45189a;

    public g0(zt0 zt0Var, Context context) {
        super(context);
        this.f45189a = zt0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        e0 e0Var = this.f45189a.W0;
        if (e0Var != null) {
            e0Var.d(canvas);
        }
    }
}
