package wi;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.g0;
import org.telegram.ui.LaunchActivity;
public final class q extends ViewGroup {
    public final LaunchActivity f60015a;
    public final Rect f60016b;
    public View f60017c;
    public int d;
    public int f60018e;
    public boolean f60019f;

    public q(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f60016b = new Rect();
        this.f60015a = launchActivity;
        setWillNotDraw(false);
    }

    public final void a(View view, Rect rect) {
        View view2 = this.f60017c;
        if (view2 != null && view2 != view) {
            removeView(view2);
        }
        this.f60017c = view;
        Rect rect2 = this.f60016b;
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
        if (this.f60017c != null && this.f60019f) {
            canvas.drawColor(-16777216);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        if (this.f60017c == null) {
            return;
        }
        if (!this.f60019f) {
            Rect rect = this.f60016b;
            if (!rect.isEmpty()) {
                this.f60017c.layout(rect.left, rect.top, rect.right, rect.bottom);
                return;
            }
        }
        this.f60017c.layout(0, 0, i11 - i7, i12 - i10);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean H1 = g0.H1(this.f60015a);
        if (!H1) {
            this.d = size;
            this.f60018e = size2;
        }
        boolean z11 = false;
        if (H1 && (size < this.d || size2 < this.f60018e)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f60019f = z10;
        setMeasuredDimension(size, size2);
        if (this.f60017c != null) {
            boolean z12 = this.f60019f;
            Rect rect = this.f60016b;
            if (z12 || rect.isEmpty()) {
                z11 = true;
            }
            View view = this.f60017c;
            if (!z11) {
                size = rect.width();
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            if (!z11) {
                size2 = rect.height();
            }
            view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
    }
}
