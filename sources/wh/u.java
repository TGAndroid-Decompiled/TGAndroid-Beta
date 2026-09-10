package wh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TextView;
import bi.d5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class u extends xh.u3 {
    public final Path A0;
    public final float[] B0;
    public final w C0;

    public u(w wVar, Context context, f6 f6Var, o oVar, d5 d5Var, d5 d5Var2, d5 d5Var3, d5 d5Var4, d5 d5Var5, d5 d5Var6) {
        super(context, f6Var, oVar, d5Var, null, d5Var2, d5Var3, d5Var4, d5Var5, d5Var6);
        this.C0 = wVar;
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
        w wVar = this.C0;
        TextView textView = wVar.f44399b0;
        if (textView != null && j6.B1(textView.getBackground(), i10, false)) {
            wVar.f44399b0.invalidate();
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
