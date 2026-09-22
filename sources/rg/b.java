package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ll0;
import w7.x5;
public abstract class b extends FrameLayout implements l0 {
    public final e6 f42248a;
    public final ll0 f42249b;
    public final s4.c0 f42250c;

    public b(Context context, e6 e6Var) {
        super(context);
        this.f42248a = e6Var;
        ll0 ll0Var = new ll0(context, e6Var);
        this.f42249b = ll0Var;
        ll0Var.setNestedScrollingEnabled(true);
        ll0Var.setAdapter(a());
        s4.c0 c0Var = new s4.c0(1, false);
        this.f42250c = c0Var;
        ll0Var.setLayoutManager(c0Var);
        ll0Var.setClipToPadding(false);
        addView(ll0Var, x5.c(-1.0f, -1));
    }

    public abstract s4.h0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint T0 = i6.T0("paintDivider", this.f42248a);
        if (T0 == null) {
            T0 = i6.f18955k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, T0);
    }

    @Override
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            ll0 ll0Var = this.f42249b;
            if (ll0Var.K(0) == null || ll0Var.K(0).f42671a.getTop() != ll0Var.getPaddingTop()) {
                ll0Var.u0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.f42249b.setPadding(0, i10, 0, 0);
    }
}
