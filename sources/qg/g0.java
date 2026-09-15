package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.au0;
public final class g0 extends View {
    public final au0 f41366a;

    public g0(au0 au0Var, Context context) {
        super(context);
        this.f41366a = au0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        e0 e0Var = this.f41366a.W0;
        if (e0Var != null) {
            e0Var.d(canvas);
        }
    }
}
