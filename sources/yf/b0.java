package yf;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewTreeObserver;
public final class b0 extends View implements ViewTreeObserver.OnPreDrawListener {
    public final a0 f52347a;
    public final boolean f52348b;
    public int f52349c;
    public ViewTreeObserver d;

    public b0(Context context, a0 a0Var) {
        super(context);
        this.f52349c = 0;
        this.f52347a = a0Var;
        this.f52348b = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f52348b) {
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
        if (!this.f52348b) {
            this.f52347a.a(this.f52349c);
            this.f52349c = 0;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(1, 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        if (this.f52348b && (i10 = this.f52349c) != 0) {
            this.f52347a.a(i10);
            this.f52349c = 0;
            return true;
        }
        return true;
    }
}
