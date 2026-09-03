package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class xd1 extends org.telegram.ui.Cells.t1 {
    public final Path Ce;
    public final Paint De;
    public final int Ee;
    public final int Fe;
    public final int Ge;
    public final zd1 He;

    public xd1(zd1 zd1Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, g6Var);
        this.He = zd1Var;
        this.Ee = i11;
        this.Fe = i12;
        this.Ge = i13;
        this.Ce = new Path();
        this.De = new Paint(1);
    }

    @Override
    public final void Y1(Canvas canvas) {
        this.f23848f6 = 0;
        this.f23862g6 = this.V5.size() - 1;
        super.Y1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int O2 = O2(this.Ee);
        float H2 = H2(O2);
        float G2 = G2(O2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPollButtonsLeft(), H2, getPollButtonsRight(), G2);
        Path path = this.Ce;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        Paint paint = this.De;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.k6.l1(this.He.f43934x * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.clipPath(path);
        S1(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.Fe, this.Ge);
    }

    @Override
    public final void setPressed(boolean z4) {
    }
}
