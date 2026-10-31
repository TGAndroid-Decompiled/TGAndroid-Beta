package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.w5;
public final class y extends rh.y3 {
    public final Path D0;
    public final float[] E0;
    public final int F0;
    public final d0 G0;

    public y(d0 d0Var, Context context, p6 p6Var, w5 w5Var, bh.c cVar, bh.c cVar2, bh.c cVar3, bh.c cVar4, bh.c cVar5, bh.c cVar6, int i10) {
        super(context, p6Var, w5Var, cVar, null, cVar2, cVar3, cVar4, cVar5, cVar6);
        this.G0 = d0Var;
        this.F0 = i10;
        this.D0 = new Path();
        this.E0 = new float[8];
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.D0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f47718b) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final int getFinalHeight() {
        return org.telegram.messenger.i0.L(this.F0);
    }

    @Override
    public final float getRealHeight() {
        return org.telegram.messenger.i0.L(this.F0);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        a0 a0Var = this.G0.U1;
        if (a0Var != null) {
            a0Var.invalidate();
        }
    }

    @Override
    public final void k(int i10) {
        this.G0.U1.setRibbonColor(i10);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float L = org.telegram.messenger.i0.L(12.0f);
        float[] fArr = this.E0;
        fArr[3] = L;
        fArr[2] = L;
        fArr[1] = L;
        fArr[0] = L;
        Path path = this.D0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i10, i11, this.E0, Path.Direction.CW);
    }
}
