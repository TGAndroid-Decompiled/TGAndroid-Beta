package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class u4 extends View {
    public final f9 f46156a;

    public u4(f9 f9Var, Context context) {
        super(context);
        this.f46156a = f9Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        s4 s4Var = this.f46156a.L0;
        if (s4Var != null) {
            s4Var.d(canvas);
        }
    }
}
