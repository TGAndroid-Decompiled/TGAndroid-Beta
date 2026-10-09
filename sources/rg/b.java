package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.qm0;
import w7.x5;
public abstract class b extends FrameLayout implements l0 {
    public final e6 f47199a;
    public final qm0 f47200b;
    public final s4.d0 f47201c;

    public b(Context context, e6 e6Var) {
        super(context);
        this.f47199a = e6Var;
        qm0 qm0Var = new qm0(context, e6Var);
        this.f47200b = qm0Var;
        qm0Var.setNestedScrollingEnabled(true);
        qm0Var.setAdapter(a());
        s4.d0 d0Var = new s4.d0(1, false);
        this.f47201c = d0Var;
        qm0Var.setLayoutManager(d0Var);
        qm0Var.setClipToPadding(false);
        addView(qm0Var, x5.d(-1.0f, -1));
    }

    public abstract s4.i0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint U0 = i6.U0("paintDivider", this.f47199a);
        if (U0 == null) {
            U0 = i6.f20919k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, U0);
    }

    @Override
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            qm0 qm0Var = this.f47200b;
            if (qm0Var.K(0) == null || qm0Var.K(0).f47656a.getTop() != qm0Var.getPaddingTop()) {
                qm0Var.u0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.f47200b.setPadding(0, i10, 0, 0);
    }
}
