package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.au0;
public final class e0 extends View {
    public final au0 f41595a;

    public e0(au0 au0Var, Context context) {
        super(context);
        this.f41595a = au0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c0 c0Var = this.f41595a.W0;
        if (c0Var != null) {
            c0Var.d(canvas);
        }
    }
}
