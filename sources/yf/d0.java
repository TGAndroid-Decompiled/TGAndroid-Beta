package yf;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.xs0;
public final class d0 extends View {
    public final xs0 f49787a;

    public d0(xs0 xs0Var, Context context) {
        super(context);
        this.f49787a = xs0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b0 b0Var = this.f49787a.S0;
        if (b0Var != null) {
            b0Var.d(canvas);
        }
    }
}
