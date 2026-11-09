package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
public final class zr0 extends org.telegram.ui.Cells.q1 {
    public final Path f52659ld;
    public final Paint f52660md;
    public final byte[] f52661nd;
    public final int f52662od;
    public final int f52663pd;
    public final bs0 f52664qd;

    public zr0(bs0 bs0Var, Context context, int i7, org.telegram.ui.ActionBar.g6 g6Var, byte[] bArr, int i10, int i11) {
        super(context, i7, false, null, g6Var);
        this.f52664qd = bs0Var;
        this.f52661nd = bArr;
        this.f52662od = i10;
        this.f52663pd = i11;
        this.f52659ld = new Path();
        this.f52660md = new Paint(1);
    }

    @Override
    public final void j1(Canvas canvas) {
        this.R4 = 0;
        this.S4 = this.P4.size() - 1;
        this.T4 = (-org.telegram.messenger.g0.L(7.0f)) * this.f52664qd.D;
        super.j1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        canvas.save();
        int V1 = V1(this.f52661nd);
        float U1 = U1(V1);
        float T1 = T1(V1);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getPollButtonsLeft(), U1, getPollButtonsRight(), T1);
        float f11 = rectF.top;
        float L = org.telegram.messenger.g0.L(3.0f);
        bs0 bs0Var = this.f52664qd;
        if (bs0Var.V) {
            f10 = -org.telegram.messenger.g0.L(3.0f);
        } else {
            f10 = 0.0f;
        }
        rectF.top = org.telegram.messenger.g0.T1(L, f10, bs0Var.D) + f11;
        float f12 = rectF.bottom;
        boolean z9 = bs0Var.V;
        float L2 = org.telegram.messenger.g0.L(3.0f);
        if (!z9) {
            L2 = org.telegram.messenger.g0.T1(L2, 0.0f, bs0Var.D);
        }
        rectF.bottom = f12 + L2;
        Path path = this.f52659ld;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
        Paint paint = this.f52660md;
        paint.setColor(0);
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.l6.r1(bs0Var.D * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        canvas.clipPath(path);
        d1(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(this.f52662od, this.f52663pd);
    }

    @Override
    public final void setPressed(boolean z9) {
    }
}
