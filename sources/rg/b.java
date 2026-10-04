package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.zl0;
import w7.z5;
public abstract class b extends FrameLayout implements m0 {
    public final d6 f46049a;
    public final zl0 f46050b;
    public final s4.c0 f46051c;

    public b(Context context, d6 d6Var) {
        super(context);
        this.f46049a = d6Var;
        zl0 zl0Var = new zl0(context, d6Var);
        this.f46050b = zl0Var;
        zl0Var.setNestedScrollingEnabled(true);
        zl0Var.setAdapter(a());
        s4.c0 c0Var = new s4.c0(1, false);
        this.f46051c = c0Var;
        zl0Var.setLayoutManager(c0Var);
        zl0Var.setClipToPadding(false);
        addView(zl0Var, z5.c(-1.0f, -1));
    }

    public abstract s4.h0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint T0 = i6.T0("paintDivider", this.f46049a);
        if (T0 == null) {
            T0 = i6.f20940k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, T0);
    }

    @Override
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            zl0 zl0Var = this.f46050b;
            if (zl0Var.K(0) == null || zl0Var.K(0).f46523a.getTop() != zl0Var.getPaddingTop()) {
                zl0Var.v0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.f46050b.setPadding(0, i10, 0, 0);
    }
}
