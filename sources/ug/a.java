package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import c8.na;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ek0;
public abstract class a extends FrameLayout implements n0 {
    public final i6 f58720a;
    public final ek0 f58721b;
    public final v4.c0 f58722c;

    public a(Context context, i6 i6Var) {
        super(context);
        this.f58720a = i6Var;
        ek0 ek0Var = new ek0(context, i6Var);
        this.f58721b = ek0Var;
        ek0Var.setNestedScrollingEnabled(true);
        ek0Var.setAdapter(a());
        v4.c0 c0Var = new v4.c0(1, false);
        this.f58722c = c0Var;
        ek0Var.setLayoutManager(c0Var);
        ek0Var.setClipToPadding(false);
        addView(ek0Var, na.c(-1.0f, -1));
    }

    public abstract v4.i0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint W0 = n6.W0("paintDivider", this.f58720a);
        if (W0 == null) {
            W0 = n6.f29574k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, W0);
    }

    @Override
    public void setOffset(float f10) {
        if (Math.abs(f10 / getMeasuredWidth()) == 1.0f) {
            ek0 ek0Var = this.f58721b;
            if (ek0Var.K(0) == null || ek0Var.K(0).f59245a.getTop() != ek0Var.getPaddingTop()) {
                ek0Var.v0(0);
            }
        }
    }

    public void setTopOffset(int i7) {
        this.f58721b.setPadding(0, i7, 0, 0);
    }
}
