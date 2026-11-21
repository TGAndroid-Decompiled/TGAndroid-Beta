package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import c8.ma;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.ek0;
public abstract class a extends FrameLayout implements n0 {
    public final h6 f58636a;
    public final ek0 f58637b;
    public final v4.c0 f58638c;

    public a(Context context, h6 h6Var) {
        super(context);
        this.f58636a = h6Var;
        ek0 ek0Var = new ek0(context, h6Var);
        this.f58637b = ek0Var;
        ek0Var.setNestedScrollingEnabled(true);
        ek0Var.setAdapter(a());
        v4.c0 c0Var = new v4.c0(1, false);
        this.f58638c = c0Var;
        ek0Var.setLayoutManager(c0Var);
        ek0Var.setClipToPadding(false);
        addView(ek0Var, ma.c(-1.0f, -1));
    }

    public abstract v4.i0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint W0 = m6.W0("paintDivider", this.f58636a);
        if (W0 == null) {
            W0 = m6.f29501k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, W0);
    }

    @Override
    public void setOffset(float f10) {
        if (Math.abs(f10 / getMeasuredWidth()) == 1.0f) {
            ek0 ek0Var = this.f58637b;
            if (ek0Var.K(0) == null || ek0Var.K(0).f59161a.getTop() != ek0Var.getPaddingTop()) {
                ek0Var.v0(0);
            }
        }
    }

    public void setTopOffset(int i7) {
        this.f58637b.setPadding(0, i7, 0, 0);
    }
}
