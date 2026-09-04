package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ll0;
import w7.x5;
public abstract class b extends FrameLayout implements m0 {
    public final f6 f46022a;
    public final ll0 f46023b;
    public final s4.c0 f46024c;

    public b(Context context, f6 f6Var) {
        super(context);
        this.f46022a = f6Var;
        ll0 ll0Var = new ll0(context, f6Var);
        this.f46023b = ll0Var;
        ll0Var.setNestedScrollingEnabled(true);
        ll0Var.setAdapter(a());
        s4.c0 c0Var = new s4.c0(1, false);
        this.f46024c = c0Var;
        ll0Var.setLayoutManager(c0Var);
        ll0Var.setClipToPadding(false);
        addView(ll0Var, x5.c(-1.0f, -1));
    }

    public abstract s4.h0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint T0 = j6.T0("paintDivider", this.f46022a);
        if (T0 == null) {
            T0 = j6.f20785k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, T0);
    }

    @Override
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            ll0 ll0Var = this.f46023b;
            if (ll0Var.K(0) == null || ll0Var.K(0).f45738a.getTop() != ll0Var.getPaddingTop()) {
                ll0Var.u0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.f46023b.setPadding(0, i10, 0, 0);
    }
}
