package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class u4 extends View {
    public final h9 f42476a;

    public u4(h9 h9Var, Context context) {
        super(context);
        this.f42476a = h9Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        s4 s4Var = this.f42476a.L0;
        if (s4Var != null) {
            s4Var.d(canvas);
        }
    }
}
