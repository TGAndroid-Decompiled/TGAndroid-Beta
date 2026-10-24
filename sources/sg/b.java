package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.lm0;
import w7.z5;
public abstract class b extends FrameLayout implements l0 {
    public final g6 f46639a;
    public final lm0 f46640b;
    public final s4.b0 f46641c;

    public b(Context context, g6 g6Var) {
        super(context);
        this.f46639a = g6Var;
        lm0 lm0Var = new lm0(context, g6Var);
        this.f46640b = lm0Var;
        lm0Var.setNestedScrollingEnabled(true);
        lm0Var.setAdapter(a());
        s4.b0 b0Var = new s4.b0(1, false);
        this.f46641c = b0Var;
        lm0Var.setLayoutManager(b0Var);
        lm0Var.setClipToPadding(false);
        addView(lm0Var, z5.c(-1.0f, -1));
    }

    public abstract s4.g0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint V0 = k6.V0("paintDivider", this.f46639a);
        if (V0 == null) {
            V0 = k6.f21305k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, V0);
    }

    @Override
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            lm0 lm0Var = this.f46640b;
            if (lm0Var.K(0) == null || lm0Var.K(0).f46342a.getTop() != lm0Var.getPaddingTop()) {
                lm0Var.u0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.f46640b.setPadding(0, i10, 0, 0);
    }
}
