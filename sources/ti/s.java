package ti;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.g0;
import org.telegram.ui.LaunchActivity;
public final class s extends ViewGroup {
    public final LaunchActivity f56062a;
    public final Rect f56063b;
    public View f56064c;
    public int d;
    public int f56065e;
    public boolean f56066f;

    public s(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f56063b = new Rect();
        this.f56062a = launchActivity;
        setWillNotDraw(false);
    }

    public final void a(View view, Rect rect) {
        View view2 = this.f56064c;
        if (view2 != null && view2 != view) {
            removeView(view2);
        }
        this.f56064c = view;
        Rect rect2 = this.f56063b;
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
        if (this.f56064c != null && this.f56066f) {
            canvas.drawColor(-16777216);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        if (this.f56064c == null) {
            return;
        }
        if (!this.f56066f) {
            Rect rect = this.f56063b;
            if (!rect.isEmpty()) {
                this.f56064c.layout(rect.left, rect.top, rect.right, rect.bottom);
                return;
            }
        }
        this.f56064c.layout(0, 0, i11 - i7, i12 - i10);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z9;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean H1 = g0.H1(this.f56062a);
        if (!H1) {
            this.d = size;
            this.f56065e = size2;
        }
        boolean z10 = false;
        if (H1 && (size < this.d || size2 < this.f56065e)) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f56066f = z9;
        setMeasuredDimension(size, size2);
        if (this.f56064c != null) {
            boolean z11 = this.f56066f;
            Rect rect = this.f56063b;
            if (z11 || rect.isEmpty()) {
                z10 = true;
            }
            View view = this.f56064c;
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
