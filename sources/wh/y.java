package wh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import bi.d5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
public final class y extends xh.u3 {
    public final Path A0;
    public final float[] B0;
    public final int C0;
    public final d0 D0;

    public y(d0 d0Var, Context context, f6 f6Var, qg.q0 q0Var, d5 d5Var, d5 d5Var2, d5 d5Var3, d5 d5Var4, d5 d5Var5, d5 d5Var6, int i10) {
        super(context, f6Var, q0Var, d5Var, null, d5Var2, d5Var3, d5Var4, d5Var5, d5Var6);
        this.D0 = d0Var;
        this.C0 = i10;
        this.A0 = new Path();
        this.B0 = new float[8];
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.A0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f46099b) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final int getFinalHeight() {
        return AndroidUtilities.dp(this.C0);
    }

    @Override
    public final float getRealHeight() {
        return AndroidUtilities.dp(this.C0);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        a0 a0Var = this.D0.f44049c0;
        if (a0Var != null) {
            a0Var.invalidate();
        }
    }

    @Override
    public final void j(int i10) {
        this.D0.f44049c0.setRibbonColor(i10);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.B0;
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        Path path = this.A0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i10, i11, this.B0, Path.Direction.CW);
    }
}
