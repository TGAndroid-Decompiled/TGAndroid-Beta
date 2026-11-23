package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import c8.na;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.ek0;
public abstract class a extends FrameLayout implements n0 {
    public final h6 f58605a;
    public final ek0 f58606b;
    public final v4.b0 f58607c;

    public a(Context context, h6 h6Var) {
        super(context);
        this.f58605a = h6Var;
        ek0 ek0Var = new ek0(context, h6Var);
        this.f58606b = ek0Var;
        ek0Var.setNestedScrollingEnabled(true);
        ek0Var.setAdapter(a());
        v4.b0 b0Var = new v4.b0(1, false);
        this.f58607c = b0Var;
        ek0Var.setLayoutManager(b0Var);
        ek0Var.setClipToPadding(false);
        addView(ek0Var, na.c(-1.0f, -1));
    }

    public abstract v4.h0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint W0 = m6.W0("paintDivider", this.f58605a);
        if (W0 == null) {
            W0 = m6.f29470k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, W0);
    }

    @Override
    public void setOffset(float f10) {
        if (Math.abs(f10 / getMeasuredWidth()) == 1.0f) {
            ek0 ek0Var = this.f58606b;
            if (ek0Var.K(0) == null || ek0Var.K(0).f59111a.getTop() != ek0Var.getPaddingTop()) {
                ek0Var.v0(0);
            }
        }
    }

    public void setTopOffset(int i7) {
        this.f58606b.setPadding(0, i7, 0, 0);
    }
}
