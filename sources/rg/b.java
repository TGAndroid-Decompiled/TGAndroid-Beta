package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.rm0;
import w7.x5;
public abstract class b extends FrameLayout implements l0 {
    public final e6 f47245a;
    public final rm0 f47246b;
    public final s4.d0 f47247c;

    public b(Context context, e6 e6Var) {
        super(context);
        this.f47245a = e6Var;
        rm0 rm0Var = new rm0(context, e6Var);
        this.f47246b = rm0Var;
        rm0Var.setNestedScrollingEnabled(true);
        rm0Var.setAdapter(a());
        s4.d0 d0Var = new s4.d0(1, false);
        this.f47247c = d0Var;
        rm0Var.setLayoutManager(d0Var);
        rm0Var.setClipToPadding(false);
        addView(rm0Var, x5.d(-1.0f, -1));
    }

    public abstract s4.i0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint U0 = i6.U0("paintDivider", this.f47245a);
        if (U0 == null) {
            U0 = i6.f20923k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, U0);
    }

    @Override
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            rm0 rm0Var = this.f47246b;
            if (rm0Var.K(0) == null || rm0Var.K(0).f47702a.getTop() != rm0Var.getPaddingTop()) {
                rm0Var.u0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.f47246b.setPadding(0, i10, 0, 0);
    }
}
