package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
public final class t91 extends org.telegram.ui.Cells.q1 {
    public final Path f41588hd;
    public final Paint f41589id;
    public final int f41590jd;
    public final int f41591kd;
    public final int f41592ld;
    public final v91 f41593md;

    public t91(v91 v91Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, p6Var);
        this.f41593md = v91Var;
        this.f41590jd = i11;
        this.f41591kd = i12;
        this.f41592ld = i13;
        this.f41588hd = new Path();
        this.f41589id = new Paint(1);
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
        int Z1 = Z1(this.f41590jd);
        float S1 = S1(Z1);
        float R1 = R1(Z1);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(getPollButtonsLeft(), S1, getPollButtonsRight(), R1);
        Path path = this.f41588hd;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), Path.Direction.CW);
        Paint paint = this.f41589id;
        paint.setColor(0);
        paint.setShadowLayer(org.telegram.messenger.i0.L(2.0f), 0.0f, org.telegram.messenger.i0.L(0.66f), org.telegram.ui.ActionBar.t6.r1(this.f41593md.f42462y * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), paint);
        canvas.clipPath(path);
        b1(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.f41591kd, this.f41592ld);
    }

    @Override
    public final void setPressed(boolean z10) {
    }
}
