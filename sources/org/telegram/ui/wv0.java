package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class wv0 extends org.telegram.ui.Cells.t1 {
    public final Path Ce;
    public final Paint De;
    public final byte[] Ee;
    public final int Fe;
    public final int Ge;
    public final yv0 He;

    public wv0(yv0 yv0Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, byte[] bArr, int i11, int i12) {
        super(context, i10, false, null, g6Var);
        this.He = yv0Var;
        this.Ee = bArr;
        this.Fe = i11;
        this.Ge = i12;
        this.Ce = new Path();
        this.De = new Paint(1);
    }

    @Override
    public final void Y1(Canvas canvas) {
        this.f23848f6 = 0;
        this.f23862g6 = this.V5.size() - 1;
        this.f23877h6 = (-AndroidUtilities.dp(7.0f)) * this.He.f43720y;
        super.Y1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        canvas.save();
        int I2 = I2(this.Ee);
        float H2 = H2(I2);
        float G2 = G2(I2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPollButtonsLeft(), H2, getPollButtonsRight(), G2);
        float f11 = rectF.top;
        float dp = AndroidUtilities.dp(3.0f);
        yv0 yv0Var = this.He;
        if (yv0Var.S) {
            f10 = -AndroidUtilities.dp(3.0f);
        } else {
            f10 = 0.0f;
        }
        rectF.top = AndroidUtilities.lerp(dp, f10, yv0Var.f43720y) + f11;
        float f12 = rectF.bottom;
        boolean z4 = yv0Var.S;
        float dp2 = AndroidUtilities.dp(3.0f);
        if (!z4) {
            dp2 = AndroidUtilities.lerp(dp2, 0.0f, yv0Var.f43720y);
        }
        rectF.bottom = f12 + dp2;
        Path path = this.Ce;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        Paint paint = this.De;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.k6.l1(yv0Var.f43720y * 0.2f, -16777216));
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
