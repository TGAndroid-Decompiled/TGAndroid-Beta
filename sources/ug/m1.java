package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import di.bc;
import org.telegram.messenger.qc;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Components.fh0;
public final class m1 extends l8 {
    public final bc f58221a0;
    public final int f58222b0;
    public final q2.d f58223c0;

    public m1(int i7, Context context, e6 e6Var) {
        super(context, e6Var);
        int i10;
        this.f58221a0 = new bc(1, 15);
        this.f58223c0 = new q2.d(this, 25);
        if (i7 == 1) {
            i10 = j6.Wk;
        } else {
            i10 = j6.Dk;
        }
        this.f58222b0 = i10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean e10 = qc.e(131072);
        q2.d dVar = this.f58223c0;
        if (e10) {
            bc bcVar = this.f58221a0;
            bcVar.d();
            bcVar.a(canvas, j6.x0(null, this.f58222b0, false));
            bg.k.d().a(15, dVar);
        } else {
            bg.k.d().f(dVar);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bg.k.d().f(this.f58223c0);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        fh0 fh0Var = this.f30656e;
        float width = (fh0Var.getWidth() / 2.0f) + fh0Var.getX();
        float y10 = fh0Var.getY();
        float height = ((fh0Var.getHeight() / 2.0f) + (y10 + fh0Var.getPaddingTop())) - org.telegram.messenger.g0.L(3.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(width - org.telegram.messenger.g0.L(16.0f), height - org.telegram.messenger.g0.L(16.0f), width + org.telegram.messenger.g0.L(16.0f), height + org.telegram.messenger.g0.L(16.0f));
        this.f58221a0.g(rectF);
    }
}
