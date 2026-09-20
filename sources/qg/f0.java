package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.au0;
public final class f0 extends View {
    public final au0 f41642a;

    public f0(au0 au0Var, Context context) {
        super(context);
        this.f41642a = au0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        d0 d0Var = this.f41642a.W0;
        if (d0Var != null) {
            d0Var.d(canvas);
        }
    }
}
