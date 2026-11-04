package vg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import b8.mf;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.tj0;
public abstract class a extends FrameLayout implements k0 {
    public final e6 f56567a;
    public final tj0 f56568b;
    public final u4.b0 f56569c;

    public a(Context context, e6 e6Var) {
        super(context);
        this.f56567a = e6Var;
        tj0 tj0Var = new tj0(context, e6Var);
        this.f56568b = tj0Var;
        tj0Var.setNestedScrollingEnabled(true);
        tj0Var.setAdapter(a());
        u4.b0 b0Var = new u4.b0(1, false);
        this.f56569c = b0Var;
        tj0Var.setLayoutManager(b0Var);
        tj0Var.setClipToPadding(false);
        addView(tj0Var, mf.c(-1.0f, -1));
    }

    public abstract u4.h0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint W0 = k6.W0("paintDivider", this.f56567a);
        if (W0 == null) {
            W0 = k6.f28002k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, W0);
    }

    @Override
    public void setOffset(float f10) {
        if (Math.abs(f10 / getMeasuredWidth()) == 1.0f) {
            tj0 tj0Var = this.f56568b;
            if (tj0Var.K(0) == null || tj0Var.K(0).f55540a.getTop() != tj0Var.getPaddingTop()) {
                tj0Var.v0(0);
            }
        }
    }

    public void setTopOffset(int i3) {
        this.f56568b.setPadding(0, i3, 0, 0);
    }
}
