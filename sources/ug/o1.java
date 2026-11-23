package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import di.ec;
import org.telegram.messenger.pc;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.qh0;
public final class o1 extends m8 {
    public final ec f58937a0;
    public final int f58938b0;
    public final org.telegram.ui.web.z0 f58939c0;

    public o1(int i7, Context context, i6 i6Var) {
        super(context, i6Var);
        int i10;
        this.f58937a0 = new ec(1, 15);
        this.f58939c0 = new org.telegram.ui.web.z0(this, 29);
        if (i7 == 1) {
            i10 = n6.Wk;
        } else {
            i10 = n6.Dk;
        }
        this.f58938b0 = i10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean e10 = pc.e(131072);
        org.telegram.ui.web.z0 z0Var = this.f58939c0;
        if (e10) {
            ec ecVar = this.f58937a0;
            ecVar.d();
            ecVar.a(canvas, n6.x0(null, this.f58938b0, false));
            bg.k.d().a(15, z0Var);
        } else {
            bg.k.d().f(z0Var);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bg.k.d().f(this.f58939c0);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        qh0 qh0Var = this.f31176e;
        float width = (qh0Var.getWidth() / 2.0f) + qh0Var.getX();
        float y10 = qh0Var.getY();
        float height = ((qh0Var.getHeight() / 2.0f) + (y10 + qh0Var.getPaddingTop())) - org.telegram.messenger.g0.L(3.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(width - org.telegram.messenger.g0.L(16.0f), height - org.telegram.messenger.g0.L(16.0f), width + org.telegram.messenger.g0.L(16.0f), height + org.telegram.messenger.g0.L(16.0f));
        this.f58937a0.g(rectF);
    }
}
