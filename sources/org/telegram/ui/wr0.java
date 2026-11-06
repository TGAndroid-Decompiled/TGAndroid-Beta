package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
public final class wr0 extends org.telegram.ui.Cells.q1 {
    public final Path f51481kd;
    public final Paint f51482ld;
    public final byte[] f51483md;
    public final int f51484nd;
    public final int f51485od;
    public final yr0 f51486pd;

    public wr0(yr0 yr0Var, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var, byte[] bArr, int i10, int i11) {
        super(context, i7, false, null, f6Var);
        this.f51486pd = yr0Var;
        this.f51483md = bArr;
        this.f51484nd = i10;
        this.f51485od = i11;
        this.f51481kd = new Path();
        this.f51482ld = new Paint(1);
    }

    @Override
    public final void j1(Canvas canvas) {
        this.R4 = 0;
        this.S4 = this.P4.size() - 1;
        this.T4 = (-org.telegram.messenger.g0.L(7.0f)) * this.f51486pd.D;
        super.j1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        canvas.save();
        int V1 = V1(this.f51483md);
        float U1 = U1(V1);
        float T1 = T1(V1);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getPollButtonsLeft(), U1, getPollButtonsRight(), T1);
        float f11 = rectF.top;
        float L = org.telegram.messenger.g0.L(3.0f);
        yr0 yr0Var = this.f51486pd;
        if (yr0Var.V) {
            f10 = -org.telegram.messenger.g0.L(3.0f);
        } else {
            f10 = 0.0f;
        }
        rectF.top = org.telegram.messenger.g0.T1(L, f10, yr0Var.D) + f11;
        float f12 = rectF.bottom;
        boolean z9 = yr0Var.V;
        float L2 = org.telegram.messenger.g0.L(3.0f);
        if (!z9) {
            L2 = org.telegram.messenger.g0.T1(L2, 0.0f, yr0Var.D);
        }
        rectF.bottom = f12 + L2;
        Path path = this.f51481kd;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
        Paint paint = this.f51482ld;
        paint.setColor(0);
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.k6.r1(yr0Var.D * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        canvas.clipPath(path);
        d1(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(this.f51484nd, this.f51485od);
    }

    @Override
    public final void setPressed(boolean z9) {
    }
}
