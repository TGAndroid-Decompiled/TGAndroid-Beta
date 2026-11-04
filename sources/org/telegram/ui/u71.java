package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
public final class u71 extends org.telegram.ui.Cells.q1 {
    public final Path f50008kd;
    public final Paint f50009ld;
    public final int f50010md;
    public final int f50011nd;
    public final int f50012od;
    public final w71 f50013pd;

    public u71(w71 w71Var, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var, int i10, int i11, int i12) {
        super(context, i3, false, null, e6Var);
        this.f50013pd = w71Var;
        this.f50010md = i10;
        this.f50011nd = i11;
        this.f50012od = i12;
        this.f50008kd = new Path();
        this.f50009ld = new Paint(1);
    }

    @Override
    public final void j1(Canvas canvas) {
        this.R4 = 0;
        this.S4 = this.P4.size() - 1;
        super.j1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int b22 = b2(this.f50010md);
        float U1 = U1(b22);
        float T1 = T1(b22);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getPollButtonsLeft(), U1, getPollButtonsRight(), T1);
        Path path = this.f50008kd;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
        Paint paint = this.f50009ld;
        paint.setColor(0);
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.k6.r1(this.f50013pd.f50747y * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        canvas.clipPath(path);
        d1(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(this.f50011nd, this.f50012od);
    }

    @Override
    public final void setPressed(boolean z10) {
    }
}
