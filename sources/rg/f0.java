package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.gu0;
public final class f0 extends View {
    public final gu0 f44011a;

    public f0(gu0 gu0Var, Context context) {
        super(context);
        this.f44011a = gu0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        d0 d0Var = this.f44011a.W0;
        if (d0Var != null) {
            d0Var.d(canvas);
        }
    }
}
