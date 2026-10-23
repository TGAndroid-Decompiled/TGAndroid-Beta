package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.jm0;
import w7.z5;
public abstract class b extends FrameLayout implements m0 {
    public final d6 f46216a;
    public final jm0 f46217b;
    public final s4.b0 f46218c;

    public b(Context context, d6 d6Var) {
        super(context);
        this.f46216a = d6Var;
        jm0 jm0Var = new jm0(context, d6Var);
        this.f46217b = jm0Var;
        jm0Var.setNestedScrollingEnabled(true);
        jm0Var.setAdapter(a());
        s4.b0 b0Var = new s4.b0(1, false);
        this.f46218c = b0Var;
        jm0Var.setLayoutManager(b0Var);
        jm0Var.setClipToPadding(false);
        addView(jm0Var, z5.c(-1.0f, -1));
    }

    public abstract s4.g0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint U0 = h6.U0("paintDivider", this.f46216a);
        if (U0 == null) {
            U0 = h6.f21115k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, U0);
    }

    @Override
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            jm0 jm0Var = this.f46217b;
            if (jm0Var.K(0) == null || jm0Var.K(0).f45921a.getTop() != jm0Var.getPaddingTop()) {
                jm0Var.u0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.f46217b.setPadding(0, i10, 0, 0);
    }
}
