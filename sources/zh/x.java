package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import bi.b7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
public final class x extends b7 {
    public final Path D0;
    public final float[] E0;
    public final int F0;
    public final c0 G0;

    public x(c0 c0Var, Context context, u6 u6Var, ti.g gVar, bh.f fVar, bh.f fVar2, bh.f fVar3, bh.f fVar4, bh.f fVar5, bh.f fVar6, int i10) {
        super(context, u6Var, gVar, fVar, null, fVar2, fVar3, fVar4, fVar5, fVar6);
        this.G0 = c0Var;
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
        if (view == this.f4345b) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final int getFinalHeight() {
        return AndroidUtilities.dp(this.F0);
    }

    @Override
    public final float getRealHeight() {
        return AndroidUtilities.dp(this.F0);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        z zVar = this.G0.f52974c0;
        if (zVar != null) {
            zVar.invalidate();
        }
    }

    @Override
    public final void k(int i10) {
        this.G0.f52974c0.setRibbonColor(i10);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.E0;
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        Path path = this.D0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i10, i11, this.E0, Path.Direction.CW);
    }
}
