package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TextView;
import bi.e7;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public final class s extends e7 {
    public final Path D0;
    public final float[] E0;
    public final u F0;

    public s(u uVar, Context context, h6 h6Var, n nVar, bi.l1 l1Var, bi.l1 l1Var2, bi.l1 l1Var3, bi.l1 l1Var4, bi.l1 l1Var5, bi.l1 l1Var6) {
        super(context, h6Var, nVar, l1Var, null, l1Var2, l1Var3, l1Var4, l1Var5, l1Var6);
        this.F0 = uVar;
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
        return org.telegram.messenger.g0.L(288.0f);
    }

    @Override
    public final float getRealHeight() {
        return org.telegram.messenger.g0.L(288.0f);
    }

    @Override
    public final void k(int i7) {
        u uVar = this.F0;
        TextView textView = uVar.W1;
        if (textView != null && m6.H1(textView.getBackground(), i7, false)) {
            uVar.W1.invalidate();
        }
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
