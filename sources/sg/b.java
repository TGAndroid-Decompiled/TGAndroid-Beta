package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.im0;
import w7.z5;
public abstract class b extends FrameLayout implements m0 {
    public final d6 f46207a;
    public final im0 f46208b;
    public final s4.b0 f46209c;

    public b(Context context, d6 d6Var) {
        super(context);
        this.f46207a = d6Var;
        im0 im0Var = new im0(context, d6Var);
        this.f46208b = im0Var;
        im0Var.setNestedScrollingEnabled(true);
        im0Var.setAdapter(a());
        s4.b0 b0Var = new s4.b0(1, false);
        this.f46209c = b0Var;
        im0Var.setLayoutManager(b0Var);
        im0Var.setClipToPadding(false);
        addView(im0Var, z5.c(-1.0f, -1));
    }

    public abstract s4.g0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint U0 = h6.U0("paintDivider", this.f46207a);
        if (U0 == null) {
            U0 = h6.f21108k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, U0);
    }

    @Override
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            im0 im0Var = this.f46208b;
            if (im0Var.K(0) == null || im0Var.K(0).f45912a.getTop() != im0Var.getPaddingTop()) {
                im0Var.u0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.f46208b.setPadding(0, i10, 0, 0);
    }
}
