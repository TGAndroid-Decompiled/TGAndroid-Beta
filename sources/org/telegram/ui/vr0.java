package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
public final class vr0 extends org.telegram.ui.Cells.q1 {
    public final Paint Ad;
    public final byte[] Bd;
    public final int Cd;
    public final int Dd;
    public final xr0 Ed;
    public final Path f52278zd;

    public vr0(xr0 xr0Var, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var, byte[] bArr, int i10, int i11) {
        super(context, i7, false, null, e6Var);
        this.Ed = xr0Var;
        this.Bd = bArr;
        this.Cd = i10;
        this.Dd = i11;
        this.f52278zd = new Path();
        this.Ad = new Paint(1);
    }

    @Override
    public final void j1(Canvas canvas) {
        this.S4 = 0;
        this.T4 = this.Q4.size() - 1;
        this.U4 = (-org.telegram.messenger.g0.L(7.0f)) * this.Ed.E;
        super.j1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        canvas.save();
        int W1 = W1(this.Bd);
        float V1 = V1(W1);
        float U1 = U1(W1);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getPollButtonsLeft(), V1, getPollButtonsRight(), U1);
        float f11 = rectF.top;
        float L = org.telegram.messenger.g0.L(3.0f);
        xr0 xr0Var = this.Ed;
        if (xr0Var.W) {
            f10 = -org.telegram.messenger.g0.L(3.0f);
        } else {
            f10 = 0.0f;
        }
        rectF.top = org.telegram.messenger.g0.T1(L, f10, xr0Var.E) + f11;
        float f12 = rectF.bottom;
        boolean z10 = xr0Var.W;
        float L2 = org.telegram.messenger.g0.L(3.0f);
        if (!z10) {
            L2 = org.telegram.messenger.g0.T1(L2, 0.0f, xr0Var.E);
        }
        rectF.bottom = f12 + L2;
        Path path = this.f52278zd;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
        Paint paint = this.Ad;
        paint.setColor(0);
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.j6.r1(xr0Var.E * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        canvas.clipPath(path);
        d1(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(this.Cd, this.Dd);
    }

    @Override
    public final void setPressed(boolean z10) {
    }
}
