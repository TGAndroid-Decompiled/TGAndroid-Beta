package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public final class u extends zh.o3 {
    public final Path A0;
    public final float[] B0;
    public final w C0;

    public u(w wVar, Context context, c6 c6Var, p pVar, ah.f fVar, ah.f fVar2, ah.f fVar3, ah.f fVar4, ah.f fVar5, ah.f fVar6) {
        super(context, c6Var, pVar, fVar, null, fVar2, fVar3, fVar4, fVar5, fVar6);
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
        TextView textView = wVar.f49168b0;
        if (textView != null && g6.C1(textView.getBackground(), i10, false)) {
            wVar.f49168b0.invalidate();
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
