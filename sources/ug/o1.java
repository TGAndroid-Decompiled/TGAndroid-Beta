package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import di.ec;
import org.telegram.messenger.qc;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Components.rh0;
public final class o1 extends n8 {
    public final ec f58857a0;
    public final int f58858b0;
    public final org.telegram.ui.web.z0 f58859c0;

    public o1(int i7, Context context, h6 h6Var) {
        super(context, h6Var);
        int i10;
        this.f58857a0 = new ec(1, 15);
        this.f58859c0 = new org.telegram.ui.web.z0(this, 28);
        if (i7 == 1) {
            i10 = m6.Wk;
        } else {
            i10 = m6.Dk;
        }
        this.f58858b0 = i10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean e10 = qc.e(131072);
        org.telegram.ui.web.z0 z0Var = this.f58859c0;
        if (e10) {
            ec ecVar = this.f58857a0;
            ecVar.d();
            ecVar.a(canvas, m6.x0(null, this.f58858b0, false));
            bg.k.d().a(15, z0Var);
        } else {
            bg.k.d().f(z0Var);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bg.k.d().f(this.f58859c0);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        rh0 rh0Var = this.f31168e;
        float width = (rh0Var.getWidth() / 2.0f) + rh0Var.getX();
        float y10 = rh0Var.getY();
        float height = ((rh0Var.getHeight() / 2.0f) + (y10 + rh0Var.getPaddingTop())) - org.telegram.messenger.g0.L(3.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(width - org.telegram.messenger.g0.L(16.0f), height - org.telegram.messenger.g0.L(16.0f), width + org.telegram.messenger.g0.L(16.0f), height + org.telegram.messenger.g0.L(16.0f));
        this.f58857a0.g(rectF);
    }
}
