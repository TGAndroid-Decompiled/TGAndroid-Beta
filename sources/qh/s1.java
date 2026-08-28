package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.y5;
import org.telegram.ui.s10;
public final class s1 extends HorizontalScrollView {
    public final s10 f46683a;
    public final y5 f46684b;
    public final y5 f46685c;
    public final x1 d;

    public s1(x1 x1Var, Context context) {
        super(context);
        this.d = x1Var;
        this.f46683a = new s10();
        gr grVar = gr.h;
        this.f46684b = new y5(this, 300L, grVar);
        this.f46685c = new y5(this, 300L, grVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e10 = this.f46684b.e(canScrollHorizontally(-1));
        float e11 = this.f46685c.e(canScrollHorizontally(1));
        int i9 = (e10 > 0.0f ? 1 : (e10 == 0.0f ? 0 : -1));
        if (i9 <= 0 && e11 <= 0.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), 255, 31);
        }
        super.dispatchDraw(canvas2);
        if (i9 <= 0 && e11 <= 0.0f) {
            return;
        }
        canvas2.save();
        s10 s10Var = this.f46683a;
        if (i9 > 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getScrollX(), 0.0f, AndroidUtilities.dp(48.0f) + getScrollX(), getHeight());
            s10Var.b(canvas2, rectF, 0, e10);
        }
        if (e11 > 0.0f) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set((getWidth() + getScrollX()) - AndroidUtilities.dp(48.0f), 0.0f, getWidth() + getScrollX(), getHeight());
            s10Var.b(canvas2, rectF2, 2, e11);
        }
        canvas2.restore();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int mode = View.MeasureSpec.getMode(i9);
        if (mode == 1073741824) {
            super.onMeasure(i9, i10);
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 0), i10);
        int measuredWidth = getMeasuredWidth();
        int i11 = this.d.f46802g0;
        if (mode == Integer.MIN_VALUE) {
            i11 = Math.min(i11, View.MeasureSpec.getSize(i9));
        }
        setMeasuredDimension(Math.min(measuredWidth, i11), getMeasuredHeight());
    }
}
