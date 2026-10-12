package zf;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewTreeObserver;
public final class c0 extends View implements ViewTreeObserver.OnPreDrawListener {
    public final b0 f50139a;
    public final boolean f50140b;
    public int f50141c;
    public ViewTreeObserver d;

    public c0(Context context, b0 b0Var) {
        super(context);
        this.f50141c = 0;
        this.f50139a = b0Var;
        this.f50140b = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f50140b) {
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
        if (!this.f50140b) {
            this.f50139a.a(this.f50141c);
            this.f50141c = 0;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(1, 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        if (this.f50140b && (i10 = this.f50141c) != 0) {
            this.f50139a.a(i10);
            this.f50141c = 0;
            return true;
        }
        return true;
    }
}
