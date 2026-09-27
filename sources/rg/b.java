package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.yl0;
import w7.y5;
public abstract class b extends FrameLayout implements l0 {
    public final e6 f42581a;
    public final yl0 f42582b;
    public final s4.c0 f42583c;

    public b(Context context, e6 e6Var) {
        super(context);
        this.f42581a = e6Var;
        yl0 yl0Var = new yl0(context, e6Var);
        this.f42582b = yl0Var;
        yl0Var.setNestedScrollingEnabled(true);
        yl0Var.setAdapter(a());
        s4.c0 c0Var = new s4.c0(1, false);
        this.f42583c = c0Var;
        yl0Var.setLayoutManager(c0Var);
        yl0Var.setClipToPadding(false);
        addView(yl0Var, y5.c(-1.0f, -1));
    }

    public abstract s4.h0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint T0 = i6.T0("paintDivider", this.f42581a);
        if (T0 == null) {
            T0 = i6.f19179k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, T0);
    }

    @Override
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            yl0 yl0Var = this.f42582b;
            if (yl0Var.L(0) == null || yl0Var.L(0).f43005a.getTop() != yl0Var.getPaddingTop()) {
                yl0Var.v0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.f42582b.setPadding(0, i10, 0, 0);
    }
}
