package tg;

import a8.w9;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class d extends FrameLayout {
    public boolean f57803a;
    public final c f57804b;
    public boolean f57805c;
    public float d;
    public float f57806e;
    public boolean f57807f;

    public d(Context context, c cVar) {
        super(context);
        this.f57804b = cVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f57803a && (view instanceof s1)) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void measureChildWithMargins(View view, int i7, int i10, int i11, int i12) {
        if (view instanceof n2) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return;
        }
        super.measureChildWithMargins(view, i7, i10, i11, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar = this.f57804b;
        j B = cVar.B();
        if (B == null) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f57805c = false;
                B.f57985n = false;
                B.f57989r = false;
                this.d = motionEvent.getX();
                this.f57806e = motionEvent.getY();
                this.f57807f = false;
                return true;
            }
            if (!this.f57807f && actionMasked == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (this.f57805c || w9.a(x10, y10, this.d, this.f57806e) > org.telegram.messenger.g0.f24125e) {
                    this.f57805c = true;
                    B.f57985n = true;
                    B.e(x10 - this.d, y10 - this.f57806e);
                    this.d = x10;
                    this.f57806e = y10;
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                B.f57985n = false;
                B.f57989r = true;
                if (!this.f57805c) {
                    cVar.i();
                }
                invalidate();
                return false;
            }
            return true;
        }
        B.f57985n = false;
        B.f57989r = true;
        this.f57805c = false;
        this.f57807f = true;
        invalidate();
        return true;
    }
}
