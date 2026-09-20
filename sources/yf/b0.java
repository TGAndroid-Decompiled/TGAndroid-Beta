package yf;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewTreeObserver;
public final class b0 extends View implements ViewTreeObserver.OnPreDrawListener {
    public final a0 f47081a;
    public final boolean f47082b;
    public int f47083c;
    public ViewTreeObserver d;

    public b0(Context context, a0 a0Var) {
        super(context);
        this.f47083c = 0;
        this.f47081a = a0Var;
        this.f47082b = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f47082b) {
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
        if (!this.f47082b) {
            this.f47081a.a(this.f47083c);
            this.f47083c = 0;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(1, 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        if (this.f47082b && (i10 = this.f47083c) != 0) {
            this.f47081a.a(i10);
            this.f47083c = 0;
            return true;
        }
        return true;
    }
}
