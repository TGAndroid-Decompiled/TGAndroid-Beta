package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ml0;
import w7.x5;
public abstract class b extends FrameLayout implements l0 {
    public final d6 f42203a;
    public final ml0 f42204b;
    public final s4.c0 f42205c;

    public b(Context context, d6 d6Var) {
        super(context);
        this.f42203a = d6Var;
        ml0 ml0Var = new ml0(context, d6Var);
        this.f42204b = ml0Var;
        ml0Var.setNestedScrollingEnabled(true);
        ml0Var.setAdapter(a());
        s4.c0 c0Var = new s4.c0(1, false);
        this.f42205c = c0Var;
        ml0Var.setLayoutManager(c0Var);
        ml0Var.setClipToPadding(false);
        addView(ml0Var, x5.c(-1.0f, -1));
    }

    public abstract s4.h0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint T0 = h6.T0("paintDivider", this.f42203a);
        if (T0 == null) {
            T0 = h6.f18910k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, T0);
    }

    @Override
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            ml0 ml0Var = this.f42204b;
            if (ml0Var.K(0) == null || ml0Var.K(0).f42627a.getTop() != ml0Var.getPaddingTop()) {
                ml0Var.u0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.f42204b.setPadding(0, i10, 0, 0);
    }
}
