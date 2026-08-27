package zf;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ys0;

public final class d0 extends View {

    public final ys0 f50377a;

    public d0(ys0 ys0Var, Context context) {
        super(context);
        this.f50377a = ys0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b0 b0Var = this.f50377a.S0;
        if (b0Var != null) {
            b0Var.d(canvas);
        }
    }
}
