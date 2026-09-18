package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.cu0;
public final class g0 extends View {
    public final cu0 f41393a;

    public g0(cu0 cu0Var, Context context) {
        super(context);
        this.f41393a = cu0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        e0 e0Var = this.f41393a.W0;
        if (e0Var != null) {
            e0Var.d(canvas);
        }
    }
}
