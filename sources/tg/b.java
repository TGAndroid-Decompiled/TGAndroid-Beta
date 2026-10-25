package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.mm0;
public abstract class b extends FrameLayout implements l0 {
    public final u6 f48815a;
    public final mm0 f48816b;
    public final s4.c0 f48817c;

    public b(Context context, u6 u6Var) {
        super(context);
        this.f48815a = u6Var;
        mm0 mm0Var = new mm0(context, u6Var);
        this.f48816b = mm0Var;
        mm0Var.setNestedScrollingEnabled(true);
        mm0Var.setAdapter(a());
        s4.c0 c0Var = new s4.c0(1, false);
        this.f48817c = c0Var;
        mm0Var.setLayoutManager(c0Var);
        mm0Var.setClipToPadding(false);
        addView(mm0Var, gb1.g(-1.0f, -1));
    }

    public abstract s4.h0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint V0 = y6.V0("paintDivider", this.f48815a);
        if (V0 == null) {
            V0 = y6.f23476k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, V0);
    }

    @Override
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            mm0 mm0Var = this.f48816b;
            if (mm0Var.K(0) == null || mm0Var.K(0).f47735a.getTop() != mm0Var.getPaddingTop()) {
                mm0Var.v0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.f48816b.setPadding(0, i10, 0, 0);
    }
}
