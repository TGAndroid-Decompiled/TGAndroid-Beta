package yf;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewTreeObserver;
public final class b0 extends View implements ViewTreeObserver.OnPreDrawListener {
    public final a0 f47103a;
    public final boolean f47104b;
    public int f47105c;
    public ViewTreeObserver d;

    public b0(Context context, a0 a0Var) {
        super(context);
        this.f47105c = 0;
        this.f47103a = a0Var;
        this.f47104b = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f47104b) {
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
        if (!this.f47104b) {
            this.f47103a.a(this.f47105c);
            this.f47105c = 0;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(1, 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        if (this.f47104b && (i10 = this.f47105c) != 0) {
            this.f47103a.a(i10);
            this.f47105c = 0;
            return true;
        }
        return true;
    }
}
