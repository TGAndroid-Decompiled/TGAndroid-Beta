package tg;

import a8.r9;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class d extends FrameLayout {
    public boolean f55628a;
    public final c f55629b;
    public boolean f55630c;
    public float d;
    public float f55631e;
    public boolean f55632f;

    public d(Context context, c cVar) {
        super(context);
        this.f55629b = cVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f55628a && (view instanceof q1)) {
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
        c cVar = this.f55629b;
        j l10 = cVar.l();
        if (l10 == null) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f55630c = false;
                l10.f55797n = false;
                l10.f55800r = false;
                this.d = motionEvent.getX();
                this.f55631e = motionEvent.getY();
                this.f55632f = false;
                return true;
            }
            if (!this.f55632f && actionMasked == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (this.f55630c || r9.a(x10, y10, this.d, this.f55631e) > org.telegram.messenger.g0.f22542e) {
                    this.f55630c = true;
                    l10.f55797n = true;
                    l10.e(x10 - this.d, y10 - this.f55631e);
                    this.d = x10;
                    this.f55631e = y10;
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                l10.f55797n = false;
                l10.f55800r = true;
                if (!this.f55630c) {
                    cVar.g();
                }
                invalidate();
                return false;
            }
            return true;
        }
        l10.f55797n = false;
        l10.f55800r = true;
        this.f55630c = false;
        this.f55632f = true;
        invalidate();
        return true;
    }
}
