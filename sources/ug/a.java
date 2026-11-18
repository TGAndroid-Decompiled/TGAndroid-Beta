package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import c8.ma;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ck0;
public abstract class a extends FrameLayout implements o0 {
    public final i6 f58594a;
    public final ck0 f58595b;
    public final v4.c0 f58596c;

    public a(Context context, i6 i6Var) {
        super(context);
        this.f58594a = i6Var;
        ck0 ck0Var = new ck0(context, i6Var);
        this.f58595b = ck0Var;
        ck0Var.setNestedScrollingEnabled(true);
        ck0Var.setAdapter(a());
        v4.c0 c0Var = new v4.c0(1, false);
        this.f58596c = c0Var;
        ck0Var.setLayoutManager(c0Var);
        ck0Var.setClipToPadding(false);
        addView(ck0Var, ma.c(-1.0f, -1));
    }

    public abstract v4.i0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint W0 = n6.W0("paintDivider", this.f58594a);
        if (W0 == null) {
            W0 = n6.f29519k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, W0);
    }

    @Override
    public void setOffset(float f10) {
        if (Math.abs(f10 / getMeasuredWidth()) == 1.0f) {
            ck0 ck0Var = this.f58595b;
            if (ck0Var.K(0) == null || ck0Var.K(0).f59122a.getTop() != ck0Var.getPaddingTop()) {
                ck0Var.v0(0);
            }
        }
    }

    public void setTopOffset(int i7) {
        this.f58595b.setPadding(0, i7, 0, 0);
    }
}
