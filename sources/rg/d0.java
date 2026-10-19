package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.gt0;
public final class d0 extends View {
    public final gt0 f45313a;

    public d0(gt0 gt0Var, Context context) {
        super(context);
        this.f45313a = gt0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b0 b0Var = this.f45313a.W0;
        if (b0Var != null) {
            b0Var.d(canvas);
        }
    }
}
