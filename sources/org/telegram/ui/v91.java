package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
public final class v91 extends org.telegram.ui.Cells.q1 {
    public final Path f42685hd;
    public final Paint f42686id;
    public final int f42687jd;
    public final int f42688kd;
    public final int f42689ld;
    public final x91 f42690md;

    public v91(x91 x91Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, p6Var);
        this.f42690md = x91Var;
        this.f42687jd = i11;
        this.f42688kd = i12;
        this.f42689ld = i13;
        this.f42685hd = new Path();
        this.f42686id = new Paint(1);
    }

    @Override
    public final void h1(Canvas canvas) {
        this.Q4 = 0;
        this.R4 = this.O4.size() - 1;
        super.h1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int Z1 = Z1(this.f42687jd);
        float S1 = S1(Z1);
        float R1 = R1(Z1);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(getPollButtonsLeft(), S1, getPollButtonsRight(), R1);
        Path path = this.f42685hd;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), Path.Direction.CW);
        Paint paint = this.f42686id;
        paint.setColor(0);
        paint.setShadowLayer(org.telegram.messenger.i0.L(2.0f), 0.0f, org.telegram.messenger.i0.L(0.66f), org.telegram.ui.ActionBar.t6.r1(this.f42690md.f43522y * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), paint);
        canvas.clipPath(path);
        b1(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.f42688kd, this.f42689ld);
    }

    @Override
    public final void setPressed(boolean z10) {
    }
}
