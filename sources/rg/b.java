package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ml0;
import w7.x5;
public abstract class b extends FrameLayout implements l0 {
    public final f6 f42274a;
    public final ml0 f42275b;
    public final s4.c0 f42276c;

    public b(Context context, f6 f6Var) {
        super(context);
        this.f42274a = f6Var;
        ml0 ml0Var = new ml0(context, f6Var);
        this.f42275b = ml0Var;
        ml0Var.setNestedScrollingEnabled(true);
        ml0Var.setAdapter(a());
        s4.c0 c0Var = new s4.c0(1, false);
        this.f42276c = c0Var;
        ml0Var.setLayoutManager(c0Var);
        ml0Var.setClipToPadding(false);
        addView(ml0Var, x5.c(-1.0f, -1));
    }

    public abstract s4.h0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint T0 = j6.T0("paintDivider", this.f42274a);
        if (T0 == null) {
            T0 = j6.f18984k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, T0);
    }

    @Override
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            ml0 ml0Var = this.f42275b;
            if (ml0Var.L(0) == null || ml0Var.L(0).f42697a.getTop() != ml0Var.getPaddingTop()) {
                ml0Var.v0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.f42275b.setPadding(0, i10, 0, 0);
    }
}
