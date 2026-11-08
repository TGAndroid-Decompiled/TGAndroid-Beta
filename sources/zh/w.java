package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import bi.e7;
import org.telegram.ui.ActionBar.f6;
public final class w extends e7 {
    public final Path D0;
    public final float[] E0;
    public final int F0;
    public final b0 G0;

    public w(b0 b0Var, Context context, f6 f6Var, wg.p pVar, bi.l1 l1Var, bi.l1 l1Var2, bi.l1 l1Var3, bi.l1 l1Var4, bi.l1 l1Var5, bi.l1 l1Var6, int i7) {
        super(context, f6Var, pVar, l1Var, null, l1Var2, l1Var3, l1Var4, l1Var5, l1Var6);
        this.G0 = b0Var;
        this.F0 = i7;
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f3767b) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final int getFinalHeight() {
        return org.telegram.messenger.g0.L(this.F0);
    }

    @Override
    public final float getRealHeight() {
        return org.telegram.messenger.g0.L(this.F0);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        y yVar = this.G0.U1;
        if (yVar != null) {
            yVar.invalidate();
        }
    }

    @Override
    public final void k(int i7) {
        this.G0.U1.setRibbonColor(i7);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        float L = org.telegram.messenger.g0.L(12.0f);
        float[] fArr = this.E0;
        fArr[3] = L;
        fArr[2] = L;
        fArr[1] = L;
        fArr[0] = L;
        Path path = this.D0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i7, i10, this.E0, Path.Direction.CW);
    }
}
