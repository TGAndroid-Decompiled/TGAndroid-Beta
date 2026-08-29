package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.u10;
public final class s1 extends HorizontalScrollView {
    public final u10 f48727a;
    public final d6 f48728b;
    public final d6 f48729c;
    public final x1 d;

    public s1(x1 x1Var, Context context) {
        super(context);
        this.d = x1Var;
        this.f48727a = new u10();
        jr jrVar = jr.h;
        this.f48728b = new d6(this, 300L, jrVar);
        this.f48729c = new d6(this, 300L, jrVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e10 = this.f48728b.e(canScrollHorizontally(-1));
        float e11 = this.f48729c.e(canScrollHorizontally(1));
        int i10 = (e10 > 0.0f ? 1 : (e10 == 0.0f ? 0 : -1));
        if (i10 <= 0 && e11 <= 0.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), 255, 31);
        }
        super.dispatchDraw(canvas2);
        if (i10 <= 0 && e11 <= 0.0f) {
            return;
        }
        canvas2.save();
        u10 u10Var = this.f48727a;
        if (i10 > 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getScrollX(), 0.0f, AndroidUtilities.dp(48.0f) + getScrollX(), getHeight());
            u10Var.b(canvas2, rectF, 0, e10);
        }
        if (e11 > 0.0f) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set((getWidth() + getScrollX()) - AndroidUtilities.dp(48.0f), 0.0f, getWidth() + getScrollX(), getHeight());
            u10Var.b(canvas2, rectF2, 2, e11);
        }
        canvas2.restore();
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
        int i12 = this.d.f48856g0;
        if (mode == Integer.MIN_VALUE) {
            i12 = Math.min(i12, View.MeasureSpec.getSize(i10));
        }
        setMeasuredDimension(Math.min(measuredWidth, i12), getMeasuredHeight());
    }
}
