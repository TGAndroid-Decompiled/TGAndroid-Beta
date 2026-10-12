package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.wm0;
import w7.w5;
public abstract class b extends FrameLayout implements l0 {
    public final c6 f47415a;
    public final wm0 f47416b;
    public final s4.d0 f47417c;

    public b(Context context, c6 c6Var) {
        super(context);
        this.f47415a = c6Var;
        wm0 wm0Var = new wm0(context, c6Var);
        this.f47416b = wm0Var;
        wm0Var.setNestedScrollingEnabled(true);
        wm0Var.setAdapter(a());
        s4.d0 d0Var = new s4.d0(1, false);
        this.f47417c = d0Var;
        wm0Var.setLayoutManager(d0Var);
        wm0Var.setClipToPadding(false);
        addView(wm0Var, w5.d(-1.0f, -1));
    }

    public abstract s4.i0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint U0 = h6.U0("paintDivider", this.f47415a);
        if (U0 == null) {
            U0 = h6.f20681k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, U0);
    }

    @Override
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            wm0 wm0Var = this.f47416b;
            if (wm0Var.K(0) == null || wm0Var.K(0).f47889a.getTop() != wm0Var.getPaddingTop()) {
                wm0Var.u0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.f47416b.setPadding(0, i10, 0, 0);
    }
}
