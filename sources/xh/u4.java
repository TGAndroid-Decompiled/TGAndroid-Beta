package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.Components.cw0;
public final class u4 extends cw0 {
    public int f46489w0;
    public final a5 f46490x0;

    public u4(a5 a5Var, Context context) {
        super(context, null);
        this.f46490x0 = a5Var;
        this.f46489w0 = -1;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final void T() {
        this.f46490x0.d.invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.L) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        a5 a5Var = this.f46490x0;
        LinearLayout linearLayout = a5Var.f46127i0;
        linearLayout.setTranslationY(((i13 - i11) - linearLayout.getMeasuredHeight()) / 2.0f);
        a5Var.f46129k0.W(a5Var.f46129k0.getY() + a5Var.f46127i0.getY(), getBackgroundSizeY());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f46489w0 != -1) {
            super.onMeasure(i10, i11);
            int measuredHeight = getMeasuredHeight();
            int i12 = this.f46489w0;
            if (measuredHeight < i12) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max(i12, getMeasuredHeight()), Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i10, i11);
        int i13 = this.f46489w0;
        if (i13 == -1) {
            this.f46489w0 = Math.max(i13, getMeasuredHeight());
        }
    }
}
