package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.Components.rt0;
public final class u3 extends rt0 {
    public int f60541f0;
    public final a4 f60542g0;

    public u3(a4 a4Var, Context context) {
        super(context, null);
        this.f60542g0 = a4Var;
        this.f60541f0 = -1;
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
        this.f60542g0.f36277k1.invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.L) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        a4 a4Var = this.f60542g0;
        LinearLayout linearLayout = a4Var.f60207a2;
        linearLayout.setTranslationY(((i12 - i10) - linearLayout.getMeasuredHeight()) / 2.0f);
        a4Var.f60209c2.i0(a4Var.f60209c2.getY() + a4Var.f60207a2.getY(), getBackgroundSizeY());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (this.f60541f0 != -1) {
            super.onMeasure(i7, i10);
            int measuredHeight = getMeasuredHeight();
            int i11 = this.f60541f0;
            if (measuredHeight < i11) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max(i11, getMeasuredHeight()), Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i7, i10);
        int i12 = this.f60541f0;
        if (i12 == -1) {
            this.f60541f0 = Math.max(i12, getMeasuredHeight());
        }
    }
}
