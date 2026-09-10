package wh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.Components.aw0;
public final class s4 extends aw0 {
    public int f44350w0;
    public final y4 f44351x0;

    public s4(y4 y4Var, Context context) {
        super(context, null);
        this.f44351x0 = y4Var;
        this.f44350w0 = -1;
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
        this.f44351x0.d.invalidate();
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
        y4 y4Var = this.f44351x0;
        LinearLayout linearLayout = y4Var.f44448i0;
        linearLayout.setTranslationY(((i13 - i11) - linearLayout.getMeasuredHeight()) / 2.0f);
        y4Var.f44450k0.W(y4Var.f44450k0.getY() + y4Var.f44448i0.getY(), getBackgroundSizeY());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f44350w0 != -1) {
            super.onMeasure(i10, i11);
            int measuredHeight = getMeasuredHeight();
            int i12 = this.f44350w0;
            if (measuredHeight < i12) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max(i12, getMeasuredHeight()), Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i10, i11);
        int i13 = this.f44350w0;
        if (i13 == -1) {
            this.f44350w0 = Math.max(i13, getMeasuredHeight());
        }
    }
}
