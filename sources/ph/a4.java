package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.Components.vu0;
public final class a4 extends vu0 {
    public int f44985f0;
    public final g4 f44986g0;

    public a4(g4 g4Var, Context context) {
        super(context, null);
        this.f44986g0 = g4Var;
        this.f44985f0 = -1;
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final void S() {
        this.f44986g0.f26724k1.invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.L) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        g4 g4Var = this.f44986g0;
        LinearLayout linearLayout = g4Var.a2;
        linearLayout.setTranslationY(((i13 - i11) - linearLayout.getMeasuredHeight()) / 2.0f);
        g4Var.f45082c2.h0(g4Var.f45082c2.getY() + g4Var.a2.getY(), getBackgroundSizeY());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f44985f0 != -1) {
            super.onMeasure(i10, i11);
            int measuredHeight = getMeasuredHeight();
            int i12 = this.f44985f0;
            if (measuredHeight < i12) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max(i12, getMeasuredHeight()), Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i10, i11);
        int i13 = this.f44985f0;
        if (i13 == -1) {
            this.f44985f0 = Math.max(i13, getMeasuredHeight());
        }
    }
}
