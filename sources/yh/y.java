package yh;

import ai.e7;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
public final class y extends e7 {
    public final Path B0;
    public final float[] C0;
    public final int D0;
    public final d0 E0;

    public y(d0 d0Var, Context context, d6 d6Var, tg.p pVar, ah.f fVar, ah.f fVar2, ah.f fVar3, ah.f fVar4, ah.f fVar5, ah.f fVar6, int i10) {
        super(context, d6Var, pVar, fVar, null, fVar2, fVar3, fVar4, fVar5, fVar6);
        this.E0 = d0Var;
        this.D0 = i10;
        this.B0 = new Path();
        this.C0 = new float[8];
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.B0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f1213b) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final int getFinalHeight() {
        return AndroidUtilities.dp(this.D0);
    }

    @Override
    public final float getRealHeight() {
        return AndroidUtilities.dp(this.D0);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        a0 a0Var = this.E0.f50243c0;
        if (a0Var != null) {
            a0Var.invalidate();
        }
    }

    @Override
    public final void k(int i10) {
        this.E0.f50243c0.setRibbonColor(i10);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.C0;
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        Path path = this.B0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i10, i11, this.C0, Path.Direction.CW);
    }
}
