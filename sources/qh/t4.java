package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class t4 extends View {
    public final e9 f46136a;

    public t4(e9 e9Var, Context context) {
        super(context);
        this.f46136a = e9Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        r4 r4Var = this.f46136a.L0;
        if (r4Var != null) {
            r4Var.d(canvas);
        }
    }
}
