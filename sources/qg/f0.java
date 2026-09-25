package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.st0;
public final class f0 extends View {
    public final st0 f41629a;

    public f0(st0 st0Var, Context context) {
        super(context);
        this.f41629a = st0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        d0 d0Var = this.f41629a.W0;
        if (d0Var != null) {
            d0Var.d(canvas);
        }
    }
}
