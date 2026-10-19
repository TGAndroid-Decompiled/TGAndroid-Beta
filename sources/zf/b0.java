package zf;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewTreeObserver;
public final class b0 extends View implements ViewTreeObserver.OnPreDrawListener {
    public final a0 f51521a;
    public final boolean f51522b;
    public int f51523c;
    public ViewTreeObserver d;

    public b0(Context context, a0 a0Var) {
        super(context);
        this.f51523c = 0;
        this.f51521a = a0Var;
        this.f51522b = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f51522b) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            this.d = viewTreeObserver;
            viewTreeObserver.addOnPreDrawListener(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewTreeObserver viewTreeObserver = this.d;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.d.removeOnPreDrawListener(this);
        }
        this.d = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f51522b) {
            this.f51521a.a(this.f51523c);
            this.f51523c = 0;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(1, 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        if (this.f51522b && (i10 = this.f51523c) != 0) {
            this.f51521a.a(i10);
            this.f51523c = 0;
            return true;
        }
        return true;
    }
}
