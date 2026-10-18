package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.it0;
public final class d0 extends View {
    public final it0 f45319a;

    public d0(it0 it0Var, Context context) {
        super(context);
        this.f45319a = it0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b0 b0Var = this.f45319a.W0;
        if (b0Var != null) {
            b0Var.d(canvas);
        }
    }
}
