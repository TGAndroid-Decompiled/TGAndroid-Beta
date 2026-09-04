package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.Components.ov0;
public final class r4 extends ov0 {
    public int f50536w0;
    public final x4 f50537x0;

    public r4(x4 x4Var, Context context) {
        super(context, null);
        this.f50537x0 = x4Var;
        this.f50536w0 = -1;
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
        this.f50537x0.d.invalidate();
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
        x4 x4Var = this.f50537x0;
        LinearLayout linearLayout = x4Var.f50636i0;
        linearLayout.setTranslationY(((i13 - i11) - linearLayout.getMeasuredHeight()) / 2.0f);
        x4Var.f50638k0.W(x4Var.f50638k0.getY() + x4Var.f50636i0.getY(), getBackgroundSizeY());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f50536w0 != -1) {
            super.onMeasure(i10, i11);
            int measuredHeight = getMeasuredHeight();
            int i12 = this.f50536w0;
            if (measuredHeight < i12) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max(i12, getMeasuredHeight()), Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i10, i11);
        int i13 = this.f50536w0;
        if (i13 == -1) {
            this.f50536w0 = Math.max(i13, getMeasuredHeight());
        }
    }
}
