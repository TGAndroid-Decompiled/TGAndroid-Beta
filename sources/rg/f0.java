package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.hu0;
public final class f0 extends View {
    public final hu0 f44252a;

    public f0(hu0 hu0Var, Context context) {
        super(context);
        this.f44252a = hu0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        d0 d0Var = this.f44252a.W0;
        if (d0Var != null) {
            d0Var.d(canvas);
        }
    }
}
