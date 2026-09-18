package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.wl0;
import w7.y5;
public abstract class b extends FrameLayout implements l0 {
    public final e6 f42506a;
    public final wl0 f42507b;
    public final s4.c0 f42508c;

    public b(Context context, e6 e6Var) {
        super(context);
        this.f42506a = e6Var;
        wl0 wl0Var = new wl0(context, e6Var);
        this.f42507b = wl0Var;
        wl0Var.setNestedScrollingEnabled(true);
        wl0Var.setAdapter(a());
        s4.c0 c0Var = new s4.c0(1, false);
        this.f42508c = c0Var;
        wl0Var.setLayoutManager(c0Var);
        wl0Var.setClipToPadding(false);
        addView(wl0Var, y5.c(-1.0f, -1));
    }

    public abstract s4.h0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint T0 = j6.T0("paintDivider", this.f42506a);
        if (T0 == null) {
            T0 = j6.f19184k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, T0);
    }

    @Override
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            wl0 wl0Var = this.f42507b;
            if (wl0Var.L(0) == null || wl0Var.L(0).f42929a.getTop() != wl0Var.getPaddingTop()) {
                wl0Var.v0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.f42507b.setPadding(0, i10, 0, 0);
    }
}
