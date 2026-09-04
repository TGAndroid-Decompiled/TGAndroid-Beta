package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class t extends zh.t3 {
    public final Path A0;
    public final float[] B0;
    public final v C0;

    public t(v vVar, Context context, f6 f6Var, o oVar, ah.f fVar, ah.f fVar2, ah.f fVar3, ah.f fVar4, ah.f fVar5, ah.f fVar6) {
        super(context, f6Var, oVar, fVar, null, fVar2, fVar3, fVar4, fVar5, fVar6);
        this.C0 = vVar;
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
    public final int getFinalHeight() {
        return AndroidUtilities.dp(288.0f);
    }

    @Override
    public final float getRealHeight() {
        return AndroidUtilities.dp(288.0f);
    }

    @Override
    public final void j(int i10) {
        v vVar = this.C0;
        TextView textView = vVar.f50590b0;
        if (textView != null && j6.B1(textView.getBackground(), i10, false)) {
            vVar.f50590b0.invalidate();
        }
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
