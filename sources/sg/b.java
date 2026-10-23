package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.mm0;
import w7.z5;
public abstract class b extends FrameLayout implements l0 {
    public final g6 f46640a;
    public final mm0 f46641b;
    public final s4.b0 f46642c;

    public b(Context context, g6 g6Var) {
        super(context);
        this.f46640a = g6Var;
        mm0 mm0Var = new mm0(context, g6Var);
        this.f46641b = mm0Var;
        mm0Var.setNestedScrollingEnabled(true);
        mm0Var.setAdapter(a());
        s4.b0 b0Var = new s4.b0(1, false);
        this.f46642c = b0Var;
        mm0Var.setLayoutManager(b0Var);
        mm0Var.setClipToPadding(false);
        addView(mm0Var, z5.c(-1.0f, -1));
    }

    public abstract s4.g0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint V0 = k6.V0("paintDivider", this.f46640a);
        if (V0 == null) {
            V0 = k6.f21304k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, V0);
    }

    @Override
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            mm0 mm0Var = this.f46641b;
            if (mm0Var.K(0) == null || mm0Var.K(0).f46343a.getTop() != mm0Var.getPaddingTop()) {
                mm0Var.u0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.f46641b.setPadding(0, i10, 0, 0);
    }
}
