package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.vt0;
public final class e0 extends View {
    public final vt0 f45005a;

    public e0(vt0 vt0Var, Context context) {
        super(context);
        this.f45005a = vt0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c0 c0Var = this.f45005a.W0;
        if (c0Var != null) {
            c0Var.d(canvas);
        }
    }
}
