package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
public final class xr0 extends org.telegram.ui.Cells.q1 {
    public final Path f51973kd;
    public final Paint f51974ld;
    public final byte[] f51975md;
    public final int f51976nd;
    public final int f51977od;
    public final zr0 f51978pd;

    public xr0(zr0 zr0Var, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var, byte[] bArr, int i10, int i11) {
        super(context, i7, false, null, f6Var);
        this.f51978pd = zr0Var;
        this.f51975md = bArr;
        this.f51976nd = i10;
        this.f51977od = i11;
        this.f51973kd = new Path();
        this.f51974ld = new Paint(1);
    }

    @Override
    public final void j1(Canvas canvas) {
        this.R4 = 0;
        this.S4 = this.P4.size() - 1;
        this.T4 = (-org.telegram.messenger.g0.L(7.0f)) * this.f51978pd.D;
        super.j1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        canvas.save();
        int V1 = V1(this.f51975md);
        float U1 = U1(V1);
        float T1 = T1(V1);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getPollButtonsLeft(), U1, getPollButtonsRight(), T1);
        float f11 = rectF.top;
        float L = org.telegram.messenger.g0.L(3.0f);
        zr0 zr0Var = this.f51978pd;
        if (zr0Var.V) {
            f10 = -org.telegram.messenger.g0.L(3.0f);
        } else {
            f10 = 0.0f;
        }
        rectF.top = org.telegram.messenger.g0.T1(L, f10, zr0Var.D) + f11;
        float f12 = rectF.bottom;
        boolean z9 = zr0Var.V;
        float L2 = org.telegram.messenger.g0.L(3.0f);
        if (!z9) {
            L2 = org.telegram.messenger.g0.T1(L2, 0.0f, zr0Var.D);
        }
        rectF.bottom = f12 + L2;
        Path path = this.f51973kd;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
        Paint paint = this.f51974ld;
        paint.setColor(0);
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.k6.r1(zr0Var.D * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        canvas.clipPath(path);
        d1(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(this.f51976nd, this.f51977od);
    }

    @Override
    public final void setPressed(boolean z9) {
    }
}
