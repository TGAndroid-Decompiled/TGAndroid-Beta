package xf;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
public final class c0 extends View implements ViewTreeObserver.OnPreDrawListener {
    public final b0 f45096a;
    public final boolean f45097b;
    public int f45098c;
    public ViewTreeObserver d;

    public c0(Context context, b0 b0Var) {
        super(context);
        this.f45098c = 0;
        this.f45096a = b0Var;
        this.f45097b = true;
    }

    public final void a() {
        ViewGroup viewGroup;
        int indexOfChild;
        ViewParent parent = getParent();
        if ((parent instanceof ViewGroup) && (indexOfChild = (viewGroup = (ViewGroup) parent).indexOfChild(this)) >= 0 && indexOfChild != viewGroup.getChildCount() - 1) {
            viewGroup.bringChildToFront(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f45097b) {
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
        if (!this.f45097b) {
            this.f45096a.b(this.f45098c);
            this.f45098c = 0;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(1, 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        if (this.f45097b && (i10 = this.f45098c) != 0) {
            this.f45096a.b(i10);
            this.f45098c = 0;
            return true;
        }
        return true;
    }
}
