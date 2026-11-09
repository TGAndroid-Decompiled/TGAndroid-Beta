package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import c8.ha;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.qj0;
public abstract class a extends FrameLayout implements l0 {
    public final g6 f56534a;
    public final qj0 f56535b;
    public final v4.b0 f56536c;

    public a(Context context, g6 g6Var) {
        super(context);
        this.f56534a = g6Var;
        qj0 qj0Var = new qj0(context, g6Var);
        this.f56535b = qj0Var;
        qj0Var.setNestedScrollingEnabled(true);
        qj0Var.setAdapter(a());
        v4.b0 b0Var = new v4.b0(1, false);
        this.f56536c = b0Var;
        qj0Var.setLayoutManager(b0Var);
        qj0Var.setClipToPadding(false);
        addView(qj0Var, ha.c(-1.0f, -1));
    }

    public abstract v4.g0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint W0 = l6.W0("paintDivider", this.f56534a);
        if (W0 == null) {
            W0 = l6.f27988k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, W0);
    }

    @Override
    public void setOffset(float f10) {
        if (Math.abs(f10 / getMeasuredWidth()) == 1.0f) {
            qj0 qj0Var = this.f56535b;
            if (qj0Var.K(0) == null || qj0Var.K(0).f57056a.getTop() != qj0Var.getPaddingTop()) {
                qj0Var.v0(0);
            }
        }
    }

    public void setTopOffset(int i7) {
        this.f56535b.setPadding(0, i7, 0, 0);
    }
}
