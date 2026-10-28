package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TextView;
import bi.b7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
public final class t extends b7 {
    public final Path D0;
    public final float[] E0;
    public final v F0;

    public t(v vVar, Context context, u6 u6Var, o oVar, bh.f fVar, bh.f fVar2, bh.f fVar3, bh.f fVar4, bh.f fVar5, bh.f fVar6) {
        super(context, u6Var, oVar, fVar, null, fVar2, fVar3, fVar4, fVar5, fVar6);
        this.F0 = vVar;
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
    public final int getFinalHeight() {
        return AndroidUtilities.dp(288.0f);
    }

    @Override
    public final float getRealHeight() {
        return AndroidUtilities.dp(288.0f);
    }

    @Override
    public final void k(int i10) {
        v vVar = this.F0;
        TextView textView = vVar.f53344b0;
        if (textView != null && y6.E1(textView.getBackground(), i10, false)) {
            vVar.f53344b0.invalidate();
        }
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
