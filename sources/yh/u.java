package yh;

import ai.e7;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public final class u extends e7 {
    public final Path B0;
    public final float[] C0;
    public final w D0;

    public u(w wVar, Context context, d6 d6Var, p pVar, ah.f fVar, ah.f fVar2, ah.f fVar3, ah.f fVar4, ah.f fVar5, ah.f fVar6) {
        super(context, d6Var, pVar, fVar, null, fVar2, fVar3, fVar4, fVar5, fVar6);
        this.D0 = wVar;
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
    public final int getFinalHeight() {
        return AndroidUtilities.dp(288.0f);
    }

    @Override
    public final float getRealHeight() {
        return AndroidUtilities.dp(288.0f);
    }

    @Override
    public final void k(int i10) {
        w wVar = this.D0;
        TextView textView = wVar.f50572b0;
        if (textView != null && h6.C1(textView.getBackground(), i10, false)) {
            wVar.f50572b0.invalidate();
        }
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
