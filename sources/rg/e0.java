package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.it0;
public final class e0 extends View {
    public final it0 f45751a;

    public e0(it0 it0Var, Context context) {
        super(context);
        this.f45751a = it0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c0 c0Var = this.f45751a.W0;
        if (c0Var != null) {
            c0Var.d(canvas);
        }
    }
}
