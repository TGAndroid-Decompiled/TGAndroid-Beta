package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.y5;
import org.telegram.ui.v10;

public final class s1 extends HorizontalScrollView {

    public final v10 f47429a;

    public final y5 f47430b;

    public final y5 f47431c;
    public final x1 d;

    public s1(x1 x1Var, Context context) {
        super(context);
        this.d = x1Var;
        this.f47429a = new v10();
        er erVar = er.h;
        this.f47430b = new y5(this, 300L, erVar);
        this.f47431c = new y5(this, 300L, erVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float fE = this.f47430b.e(canScrollHorizontally(-1));
        float fE2 = this.f47431c.e(canScrollHorizontally(1));
        if (fE > 0.0f || fE2 > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
        if (fE > 0.0f || fE2 > 0.0f) {
            canvas2.save();
            v10 v10Var = this.f47429a;
            if (fE > 0.0f) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getScrollX(), 0.0f, AndroidUtilities.dp(48.0f) + getScrollX(), getHeight());
                v10Var.b(canvas2, rectF, 0, fE);
            }
            if (fE2 > 0.0f) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set((getWidth() + getScrollX()) - AndroidUtilities.dp(48.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                v10Var.b(canvas2, rectF2, 2, fE2);
            }
            canvas2.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == 1073741824) {
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0), i11);
        int measuredWidth = getMeasuredWidth();
        int iMin = this.d.f47558g0;
        if (mode == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, View.MeasureSpec.getSize(i10));
        }
        setMeasuredDimension(Math.min(measuredWidth, iMin), getMeasuredHeight());
    }
}
