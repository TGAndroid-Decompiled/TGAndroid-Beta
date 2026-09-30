package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.yl0;
import w7.y5;
public abstract class b extends FrameLayout implements l0 {
    public final d6 f42538a;
    public final yl0 f42539b;
    public final s4.c0 f42540c;

    public b(Context context, d6 d6Var) {
        super(context);
        this.f42538a = d6Var;
        yl0 yl0Var = new yl0(context, d6Var);
        this.f42539b = yl0Var;
        yl0Var.setNestedScrollingEnabled(true);
        yl0Var.setAdapter(a());
        s4.c0 c0Var = new s4.c0(1, false);
        this.f42540c = c0Var;
        yl0Var.setLayoutManager(c0Var);
        yl0Var.setClipToPadding(false);
        addView(yl0Var, y5.c(-1.0f, -1));
    }

    public abstract s4.h0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint T0 = h6.T0("paintDivider", this.f42538a);
        if (T0 == null) {
            T0 = h6.f19182k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, T0);
    }

    @Override
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            yl0 yl0Var = this.f42539b;
            if (yl0Var.K(0) == null || yl0Var.K(0).f42962a.getTop() != yl0Var.getPaddingTop()) {
                yl0Var.u0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.f42539b.setPadding(0, i10, 0, 0);
    }
}
