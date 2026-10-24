package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class rv0 extends org.telegram.ui.Cells.t1 {
    public final Path Ge;
    public final Paint He;
    public final byte[] Ie;
    public final int Je;
    public final int Ke;
    public final tv0 Le;

    public rv0(tv0 tv0Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, byte[] bArr, int i11, int i12) {
        super(context, i10, false, null, g6Var);
        this.Le = tv0Var;
        this.Ie = bArr;
        this.Je = i11;
        this.Ke = i12;
        this.Ge = new Path();
        this.He = new Paint(1);
    }

    @Override
    public final void X1(Canvas canvas) {
        this.f23427i6 = 0;
        this.f23441j6 = this.Y5.size() - 1;
        this.f23456k6 = (-AndroidUtilities.dp(7.0f)) * this.Le.f42139y;
        super.X1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        canvas.save();
        int H2 = H2(this.Ie);
        float G2 = G2(H2);
        float F2 = F2(H2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPollButtonsLeft(), G2, getPollButtonsRight(), F2);
        float f10 = rectF.top;
        float dp = AndroidUtilities.dp(3.0f);
        tv0 tv0Var = this.Le;
        if (tv0Var.V) {
            f7 = -AndroidUtilities.dp(3.0f);
        } else {
            f7 = 0.0f;
        }
        rectF.top = AndroidUtilities.lerp(dp, f7, tv0Var.f42139y) + f10;
        float f11 = rectF.bottom;
        boolean z10 = tv0Var.V;
        float dp2 = AndroidUtilities.dp(3.0f);
        if (!z10) {
            dp2 = AndroidUtilities.lerp(dp2, 0.0f, tv0Var.f42139y);
        }
        rectF.bottom = f11 + dp2;
        Path path = this.Ge;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        Paint paint = this.He;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.k6.o1(tv0Var.f42139y * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.clipPath(path);
        R1(canvas);
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
