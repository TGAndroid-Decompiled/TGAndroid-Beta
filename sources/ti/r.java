package ti;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.g0;
import org.telegram.ui.LaunchActivity;
public final class r extends ViewGroup {
    public final LaunchActivity f56163a;
    public final Rect f56164b;
    public View f56165c;
    public int d;
    public int f56166e;
    public boolean f56167f;

    public r(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f56164b = new Rect();
        this.f56163a = launchActivity;
        setWillNotDraw(false);
    }

    public final void a(View view, Rect rect) {
        View view2 = this.f56165c;
        if (view2 != null && view2 != view) {
            removeView(view2);
        }
        this.f56165c = view;
        Rect rect2 = this.f56164b;
        if (rect != null) {
            rect2.set(rect);
        } else {
            rect2.setEmpty();
        }
        if (view != null && view.getParent() != this) {
            g0.E2(view);
            addView(view);
        }
        requestLayout();
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f56165c != null && this.f56167f) {
            canvas.drawColor(-16777216);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        if (this.f56165c == null) {
            return;
        }
        if (!this.f56167f) {
            Rect rect = this.f56164b;
            if (!rect.isEmpty()) {
                this.f56165c.layout(rect.left, rect.top, rect.right, rect.bottom);
                return;
            }
        }
        this.f56165c.layout(0, 0, i11 - i7, i12 - i10);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z9;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean H1 = g0.H1(this.f56163a);
        if (!H1) {
            this.d = size;
            this.f56166e = size2;
        }
        boolean z10 = false;
        if (H1 && (size < this.d || size2 < this.f56166e)) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f56167f = z9;
        setMeasuredDimension(size, size2);
        if (this.f56165c != null) {
            boolean z11 = this.f56167f;
            Rect rect = this.f56164b;
            if (z11 || rect.isEmpty()) {
                z10 = true;
            }
            View view = this.f56165c;
            if (!z10) {
                size = rect.width();
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            if (!z10) {
                size2 = rect.height();
            }
            view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
    }
}
