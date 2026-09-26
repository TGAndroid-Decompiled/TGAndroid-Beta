package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.xl0;
import w7.y5;
public abstract class b extends FrameLayout implements l0 {
    public final d6 f42535a;
    public final xl0 f42536b;
    public final s4.c0 f42537c;

    public b(Context context, d6 d6Var) {
        super(context);
        this.f42535a = d6Var;
        xl0 xl0Var = new xl0(context, d6Var);
        this.f42536b = xl0Var;
        xl0Var.setNestedScrollingEnabled(true);
        xl0Var.setAdapter(a());
        s4.c0 c0Var = new s4.c0(1, false);
        this.f42537c = c0Var;
        xl0Var.setLayoutManager(c0Var);
        xl0Var.setClipToPadding(false);
        addView(xl0Var, y5.c(-1.0f, -1));
    }

    public abstract s4.h0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint T0 = h6.T0("paintDivider", this.f42535a);
        if (T0 == null) {
            T0 = h6.f19180k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, T0);
    }

    @Override
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            xl0 xl0Var = this.f42536b;
            if (xl0Var.K(0) == null || xl0Var.K(0).f42959a.getTop() != xl0Var.getPaddingTop()) {
                xl0Var.u0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.f42536b.setPadding(0, i10, 0, 0);
    }
}
