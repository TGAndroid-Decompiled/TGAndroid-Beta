package zf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import g7.e6;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.wk0;
public abstract class b extends FrameLayout implements l0 {
    public final b6 f50463a;
    public final wk0 f50464b;
    public final f2.m0 f50465c;

    public b(Context context, b6 b6Var) {
        super(context);
        this.f50463a = b6Var;
        wk0 wk0Var = new wk0(context, b6Var);
        this.f50464b = wk0Var;
        wk0Var.setNestedScrollingEnabled(true);
        wk0Var.setAdapter(a());
        f2.m0 m0Var = new f2.m0(1, false);
        this.f50465c = m0Var;
        wk0Var.setLayoutManager(m0Var);
        wk0Var.setClipToPadding(false);
        addView(wk0Var, e6.c(-1.0f, -1));
    }

    public abstract f2.r0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint T0 = f6.T0("paintDivider", this.f50463a);
        if (T0 == null) {
            T0 = f6.f23121k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, T0);
    }

    @Override
    public void setOffset(float f10) {
        if (Math.abs(f10 / getMeasuredWidth()) == 1.0f) {
            wk0 wk0Var = this.f50464b;
            if (wk0Var.K(0) == null || wk0Var.K(0).f5501a.getTop() != wk0Var.getPaddingTop()) {
                wk0Var.u0(0);
            }
        }
    }

    public void setTopOffset(int i9) {
        this.f50464b.setPadding(0, i9, 0, 0);
    }
}
