package tg;

import a8.w9;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class d extends FrameLayout {
    public boolean f57772a;
    public final c f57773b;
    public boolean f57774c;
    public float d;
    public float f57775e;
    public boolean f57776f;

    public d(Context context, c cVar) {
        super(context);
        this.f57773b = cVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f57772a && (view instanceof q1)) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void measureChildWithMargins(View view, int i7, int i10, int i11, int i12) {
        if (view instanceof m2) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return;
        }
        super.measureChildWithMargins(view, i7, i10, i11, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar = this.f57773b;
        j B = cVar.B();
        if (B == null) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f57774c = false;
                B.f57962n = false;
                B.f57966r = false;
                this.d = motionEvent.getX();
                this.f57775e = motionEvent.getY();
                this.f57776f = false;
                return true;
            }
            if (!this.f57776f && actionMasked == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (this.f57774c || w9.a(x10, y10, this.d, this.f57775e) > org.telegram.messenger.g0.f24097e) {
                    this.f57774c = true;
                    B.f57962n = true;
                    B.e(x10 - this.d, y10 - this.f57775e);
                    this.d = x10;
                    this.f57775e = y10;
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                B.f57962n = false;
                B.f57966r = true;
                if (!this.f57774c) {
                    cVar.i();
                }
                invalidate();
                return false;
            }
            return true;
        }
        B.f57962n = false;
        B.f57966r = true;
        this.f57774c = false;
        this.f57776f = true;
        invalidate();
        return true;
    }
}
