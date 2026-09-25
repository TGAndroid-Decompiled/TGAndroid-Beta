package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.wl0;
import w7.y5;
public abstract class b extends FrameLayout implements l0 {
    public final d6 f42537a;
    public final wl0 f42538b;
    public final s4.c0 f42539c;

    public b(Context context, d6 d6Var) {
        super(context);
        this.f42537a = d6Var;
        wl0 wl0Var = new wl0(context, d6Var);
        this.f42538b = wl0Var;
        wl0Var.setNestedScrollingEnabled(true);
        wl0Var.setAdapter(a());
        s4.c0 c0Var = new s4.c0(1, false);
        this.f42539c = c0Var;
        wl0Var.setLayoutManager(c0Var);
        wl0Var.setClipToPadding(false);
        addView(wl0Var, y5.c(-1.0f, -1));
    }

    public abstract s4.h0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint T0 = h6.T0("paintDivider", this.f42537a);
        if (T0 == null) {
            T0 = h6.f19181k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, T0);
    }

    @Override
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            wl0 wl0Var = this.f42538b;
            if (wl0Var.K(0) == null || wl0Var.K(0).f42961a.getTop() != wl0Var.getPaddingTop()) {
                wl0Var.u0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.f42538b.setPadding(0, i10, 0, 0);
    }
}
