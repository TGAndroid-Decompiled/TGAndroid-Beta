package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.zl0;
import w7.y5;
public abstract class b extends FrameLayout implements l0 {
    public final d6 f42641a;
    public final zl0 f42642b;
    public final s4.c0 f42643c;

    public b(Context context, d6 d6Var) {
        super(context);
        this.f42641a = d6Var;
        zl0 zl0Var = new zl0(context, d6Var);
        this.f42642b = zl0Var;
        zl0Var.setNestedScrollingEnabled(true);
        zl0Var.setAdapter(a());
        s4.c0 c0Var = new s4.c0(1, false);
        this.f42643c = c0Var;
        zl0Var.setLayoutManager(c0Var);
        zl0Var.setClipToPadding(false);
        addView(zl0Var, y5.c(-1.0f, -1));
    }

    public abstract s4.h0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint T0 = h6.T0("paintDivider", this.f42641a);
        if (T0 == null) {
            T0 = h6.f19197k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, T0);
    }

    @Override
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            zl0 zl0Var = this.f42642b;
            if (zl0Var.K(0) == null || zl0Var.K(0).f43068a.getTop() != zl0Var.getPaddingTop()) {
                zl0Var.v0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.f42642b.setPadding(0, i10, 0, 0);
    }
}
