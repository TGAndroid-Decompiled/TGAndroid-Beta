package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.cu0;
public final class e0 extends View {
    public final cu0 f46173a;

    public e0(cu0 cu0Var, Context context) {
        super(context);
        this.f46173a = cu0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c0 c0Var = this.f46173a.W0;
        if (c0Var != null) {
            c0Var.d(canvas);
        }
    }
}
