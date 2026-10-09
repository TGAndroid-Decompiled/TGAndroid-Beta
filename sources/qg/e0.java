package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.bu0;
public final class e0 extends View {
    public final bu0 f46226a;

    public e0(bu0 bu0Var, Context context) {
        super(context);
        this.f46226a = bu0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c0 c0Var = this.f46226a.W0;
        if (c0Var != null) {
            c0Var.d(canvas);
        }
    }
}
