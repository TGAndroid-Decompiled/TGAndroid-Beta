package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class qv0 extends org.telegram.ui.Cells.u1 {
    public final Path Ge;
    public final Paint He;
    public final byte[] Ie;
    public final int Je;
    public final int Ke;
    public final sv0 Le;

    public qv0(sv0 sv0Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, byte[] bArr, int i11, int i12) {
        super(context, i10, false, null, d6Var);
        this.Le = sv0Var;
        this.Ie = bArr;
        this.Je = i11;
        this.Ke = i12;
        this.Ge = new Path();
        this.He = new Paint(1);
    }

    @Override
    public final void Y1(Canvas canvas) {
        this.f23331i6 = 0;
        this.f23345j6 = this.Y5.size() - 1;
        this.f23360k6 = (-AndroidUtilities.dp(7.0f)) * this.Le.f41513y;
        super.Y1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        canvas.save();
        int I2 = I2(this.Ie);
        float H2 = H2(I2);
        float G2 = G2(I2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPollButtonsLeft(), H2, getPollButtonsRight(), G2);
        float f10 = rectF.top;
        float dp = AndroidUtilities.dp(3.0f);
        sv0 sv0Var = this.Le;
        if (sv0Var.V) {
            f7 = -AndroidUtilities.dp(3.0f);
        } else {
            f7 = 0.0f;
        }
        rectF.top = AndroidUtilities.lerp(dp, f7, sv0Var.f41513y) + f10;
        float f11 = rectF.bottom;
        boolean z10 = sv0Var.V;
        float dp2 = AndroidUtilities.dp(3.0f);
        if (!z10) {
            dp2 = AndroidUtilities.lerp(dp2, 0.0f, sv0Var.f41513y);
        }
        rectF.bottom = f11 + dp2;
        Path path = this.Ge;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        Paint paint = this.He;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.h6.m1(sv0Var.f41513y * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.clipPath(path);
        S1(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.Je, this.Ke);
    }

    @Override
    public final void setPressed(boolean z10) {
    }
}
