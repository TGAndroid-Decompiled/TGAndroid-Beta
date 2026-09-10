package pg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.zt0;
public final class e0 extends View {
    public final zt0 f39981a;

    public e0(zt0 zt0Var, Context context) {
        super(context);
        this.f39981a = zt0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c0 c0Var = this.f39981a.W0;
        if (c0Var != null) {
            c0Var.d(canvas);
        }
    }
}
