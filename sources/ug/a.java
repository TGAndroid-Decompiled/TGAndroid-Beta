package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import c8.ja;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.uj0;
public abstract class a extends FrameLayout implements m0 {
    public final e6 f58029a;
    public final uj0 f58030b;
    public final v4.b0 f58031c;

    public a(Context context, e6 e6Var) {
        super(context);
        this.f58029a = e6Var;
        uj0 uj0Var = new uj0(context, e6Var);
        this.f58030b = uj0Var;
        uj0Var.setNestedScrollingEnabled(true);
        uj0Var.setAdapter(a());
        v4.b0 b0Var = new v4.b0(1, false);
        this.f58031c = b0Var;
        uj0Var.setLayoutManager(b0Var);
        uj0Var.setClipToPadding(false);
        addView(uj0Var, ja.c(-1.0f, -1));
    }

    public abstract v4.h0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint W0 = j6.W0("paintDivider", this.f58029a);
        if (W0 == null) {
            W0 = j6.f28972k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, W0);
    }

    @Override
    public void setOffset(float f10) {
        if (Math.abs(f10 / getMeasuredWidth()) == 1.0f) {
            uj0 uj0Var = this.f58030b;
            if (uj0Var.K(0) == null || uj0Var.K(0).f58535a.getTop() != uj0Var.getPaddingTop()) {
                uj0Var.v0(0);
            }
        }
    }

    public void setTopOffset(int i7) {
        this.f58030b.setPadding(0, i7, 0, 0);
    }
}
