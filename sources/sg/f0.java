package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.nt0;
public final class f0 extends View {
    public final nt0 f48199a;

    public f0(nt0 nt0Var, Context context) {
        super(context);
        this.f48199a = nt0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        d0 d0Var = this.f48199a.L0;
        if (d0Var != null) {
            d0Var.d(canvas);
        }
    }
}
