package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.tt0;
public final class g0 extends View {
    public final tt0 f41318a;

    public g0(tt0 tt0Var, Context context) {
        super(context);
        this.f41318a = tt0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        e0 e0Var = this.f41318a.W0;
        if (e0Var != null) {
            e0Var.d(canvas);
        }
    }
}
