package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.Components.rt0;
public final class v3 extends rt0 {
    public int f60467f0;
    public final b4 f60468g0;

    public v3(b4 b4Var, Context context) {
        super(context, null);
        this.f60468g0 = b4Var;
        this.f60467f0 = -1;
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
        this.f60468g0.f36261k1.invalidate();
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
        b4 b4Var = this.f60468g0;
        LinearLayout linearLayout = b4Var.f60130a2;
        linearLayout.setTranslationY(((i12 - i10) - linearLayout.getMeasuredHeight()) / 2.0f);
        b4Var.f60132c2.i0(b4Var.f60132c2.getY() + b4Var.f60130a2.getY(), getBackgroundSizeY());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (this.f60467f0 != -1) {
            super.onMeasure(i7, i10);
            int measuredHeight = getMeasuredHeight();
            int i11 = this.f60467f0;
            if (measuredHeight < i11) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max(i11, getMeasuredHeight()), Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i7, i10);
        int i12 = this.f60467f0;
        if (i12 == -1) {
            this.f60467f0 = Math.max(i12, getMeasuredHeight());
        }
    }
}
