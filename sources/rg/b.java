package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.sm0;
import w7.x5;
public abstract class b extends FrameLayout implements l0 {
    public final d6 f47291a;
    public final sm0 f47292b;
    public final s4.d0 f47293c;

    public b(Context context, d6 d6Var) {
        super(context);
        this.f47291a = d6Var;
        sm0 sm0Var = new sm0(context, d6Var);
        this.f47292b = sm0Var;
        sm0Var.setNestedScrollingEnabled(true);
        sm0Var.setAdapter(a());
        s4.d0 d0Var = new s4.d0(1, false);
        this.f47293c = d0Var;
        sm0Var.setLayoutManager(d0Var);
        sm0Var.setClipToPadding(false);
        addView(sm0Var, x5.d(-1.0f, -1));
    }

    public abstract s4.i0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint U0 = h6.U0("paintDivider", this.f47291a);
        if (U0 == null) {
            U0 = h6.f20908k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, U0);
    }

    @Override
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            sm0 sm0Var = this.f47292b;
            if (sm0Var.K(0) == null || sm0Var.K(0).f47748a.getTop() != sm0Var.getPaddingTop()) {
                sm0Var.u0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.f47292b.setPadding(0, i10, 0, 0);
    }
}
