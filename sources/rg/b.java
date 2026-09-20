package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.vl0;
import w7.y5;
public abstract class b extends FrameLayout implements l0 {
    public final f6 f42550a;
    public final vl0 f42551b;
    public final s4.c0 f42552c;

    public b(Context context, f6 f6Var) {
        super(context);
        this.f42550a = f6Var;
        vl0 vl0Var = new vl0(context, f6Var);
        this.f42551b = vl0Var;
        vl0Var.setNestedScrollingEnabled(true);
        vl0Var.setAdapter(a());
        s4.c0 c0Var = new s4.c0(1, false);
        this.f42552c = c0Var;
        vl0Var.setLayoutManager(c0Var);
        vl0Var.setClipToPadding(false);
        addView(vl0Var, y5.c(-1.0f, -1));
    }

    public abstract s4.h0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint T0 = j6.T0("paintDivider", this.f42550a);
        if (T0 == null) {
            T0 = j6.f19216k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, T0);
    }

    @Override
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            vl0 vl0Var = this.f42551b;
            if (vl0Var.L(0) == null || vl0Var.L(0).f42974a.getTop() != vl0Var.getPaddingTop()) {
                vl0Var.v0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.f42551b.setPadding(0, i10, 0, 0);
    }
}
