package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class d extends FrameLayout {
    public boolean f55923a;
    public final c f55924b;
    public boolean f55925c;
    public float d;
    public float f55926e;
    public boolean f55927f;

    public d(Context context, c cVar) {
        super(context);
        this.f55924b = cVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.f55923a && (view instanceof q1)) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void measureChildWithMargins(View view, int i3, int i10, int i11, int i12) {
        if (view instanceof l2) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return;
        }
        super.measureChildWithMargins(view, i3, i10, i11, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar = this.f55924b;
        j p10 = cVar.p();
        if (p10 == null) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f55925c = false;
                p10.f56084n = false;
                p10.f56088r = false;
                this.d = motionEvent.getX();
                this.f55926e = motionEvent.getY();
                this.f55927f = false;
                return true;
            }
            if (!this.f55927f && actionMasked == 2) {
                float x10 = motionEvent.getX();
                float y9 = motionEvent.getY();
                if (this.f55925c || a7.h.a(x10, y9, this.d, this.f55926e) > org.telegram.messenger.g0.f22587e) {
                    this.f55925c = true;
                    p10.f56084n = true;
                    p10.e(x10 - this.d, y9 - this.f55926e);
                    this.d = x10;
                    this.f55926e = y9;
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                p10.f56084n = false;
                p10.f56088r = true;
                if (!this.f55925c) {
                    cVar.f();
                }
                invalidate();
                return false;
            }
            return true;
        }
        p10.f56084n = false;
        p10.f56088r = true;
        this.f55925c = false;
        this.f55927f = true;
        invalidate();
        return true;
    }
}
