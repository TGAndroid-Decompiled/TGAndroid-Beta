package tg;

import a8.r9;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class d extends FrameLayout {
    public boolean f55616a;
    public final c f55617b;
    public boolean f55618c;
    public float d;
    public float f55619e;
    public boolean f55620f;

    public d(Context context, c cVar) {
        super(context);
        this.f55617b = cVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f55616a && (view instanceof q1)) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void measureChildWithMargins(View view, int i7, int i10, int i11, int i12) {
        if (view instanceof k2) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return;
        }
        super.measureChildWithMargins(view, i7, i10, i11, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar = this.f55617b;
        j l10 = cVar.l();
        if (l10 == null) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f55618c = false;
                l10.f55785n = false;
                l10.f55788r = false;
                this.d = motionEvent.getX();
                this.f55619e = motionEvent.getY();
                this.f55620f = false;
                return true;
            }
            if (!this.f55620f && actionMasked == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (this.f55618c || r9.a(x10, y10, this.d, this.f55619e) > org.telegram.messenger.g0.f22542e) {
                    this.f55618c = true;
                    l10.f55785n = true;
                    l10.e(x10 - this.d, y10 - this.f55619e);
                    this.d = x10;
                    this.f55619e = y10;
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                l10.f55785n = false;
                l10.f55788r = true;
                if (!this.f55618c) {
                    cVar.g();
                }
                invalidate();
                return false;
            }
            return true;
        }
        l10.f55785n = false;
        l10.f55788r = true;
        this.f55618c = false;
        this.f55620f = true;
        invalidate();
        return true;
    }
}
