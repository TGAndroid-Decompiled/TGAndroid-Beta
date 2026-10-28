package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class xv0 extends org.telegram.ui.Cells.s1 {
    public final Path He;
    public final Paint Ie;
    public final byte[] Je;
    public final int Ke;
    public final int Le;
    public final zv0 Me;

    public xv0(zv0 zv0Var, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var, byte[] bArr, int i11, int i12) {
        super(context, i10, false, null, u6Var);
        this.Me = zv0Var;
        this.Je = bArr;
        this.Ke = i11;
        this.Le = i12;
        this.He = new Path();
        this.Ie = new Paint(1);
    }

    @Override
    public final void Y1(Canvas canvas) {
        this.f25136i6 = 0;
        this.f25149j6 = this.Y5.size() - 1;
        this.f25163k6 = (-AndroidUtilities.dp(7.0f)) * this.Me.f46391y;
        super.Y1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        canvas.save();
        int I2 = I2(this.Je);
        float H2 = H2(I2);
        float G2 = G2(I2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPollButtonsLeft(), H2, getPollButtonsRight(), G2);
        float f10 = rectF.top;
        float dp = AndroidUtilities.dp(3.0f);
        zv0 zv0Var = this.Me;
        if (zv0Var.V) {
            f7 = -AndroidUtilities.dp(3.0f);
        } else {
            f7 = 0.0f;
        }
        rectF.top = AndroidUtilities.lerp(dp, f7, zv0Var.f46391y) + f10;
        float f11 = rectF.bottom;
        boolean z10 = zv0Var.V;
        float dp2 = AndroidUtilities.dp(3.0f);
        if (!z10) {
            dp2 = AndroidUtilities.lerp(dp2, 0.0f, zv0Var.f46391y);
        }
        rectF.bottom = f11 + dp2;
        Path path = this.He;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        Paint paint = this.Ie;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.y6.o1(zv0Var.f46391y * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.clipPath(path);
        S1(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.Ke, this.Le);
    }

    @Override
    public final void setPressed(boolean z10) {
    }
}
