package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.nm0;
public abstract class b extends FrameLayout implements l0 {
    public final u6 f48853a;
    public final nm0 f48854b;
    public final s4.c0 f48855c;

    public b(Context context, u6 u6Var) {
        super(context);
        this.f48853a = u6Var;
        nm0 nm0Var = new nm0(context, u6Var);
        this.f48854b = nm0Var;
        nm0Var.setNestedScrollingEnabled(true);
        nm0Var.setAdapter(a());
        s4.c0 c0Var = new s4.c0(1, false);
        this.f48855c = c0Var;
        nm0Var.setLayoutManager(c0Var);
        nm0Var.setClipToPadding(false);
        addView(nm0Var, kb1.g(-1.0f, -1));
    }

    public abstract s4.h0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint V0 = y6.V0("paintDivider", this.f48853a);
        if (V0 == null) {
            V0 = y6.f23479k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, V0);
    }

    @Override
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            nm0 nm0Var = this.f48854b;
            if (nm0Var.K(0) == null || nm0Var.K(0).f47773a.getTop() != nm0Var.getPaddingTop()) {
                nm0Var.v0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.f48854b.setPadding(0, i10, 0, 0);
    }
}
