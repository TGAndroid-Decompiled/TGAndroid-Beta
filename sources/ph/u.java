package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TextView;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
public final class u extends rh.y3 {
    public final Path D0;
    public final float[] E0;
    public final w F0;

    public u(w wVar, Context context, p6 p6Var, o oVar, bh.c cVar, bh.c cVar2, bh.c cVar3, bh.c cVar4, bh.c cVar5, bh.c cVar6) {
        super(context, p6Var, oVar, cVar, null, cVar2, cVar3, cVar4, cVar5, cVar6);
        this.F0 = wVar;
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
        return org.telegram.messenger.i0.L(288.0f);
    }

    @Override
    public final float getRealHeight() {
        return org.telegram.messenger.i0.L(288.0f);
    }

    @Override
    public final void k(int i10) {
        w wVar = this.F0;
        TextView textView = wVar.T1;
        if (textView != null && t6.H1(textView.getBackground(), i10, false)) {
            wVar.T1.invalidate();
        }
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
