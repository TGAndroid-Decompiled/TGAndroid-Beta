package tg;

import a8.t9;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class d extends FrameLayout {
    public boolean f57179a;
    public final c f57180b;
    public boolean f57181c;
    public float d;
    public float f57182e;
    public boolean f57183f;

    public d(Context context, c cVar) {
        super(context);
        this.f57180b = cVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f57179a && (view instanceof q1)) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void measureChildWithMargins(View view, int i7, int i10, int i11, int i12) {
        if (view instanceof o2) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return;
        }
        super.measureChildWithMargins(view, i7, i10, i11, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar = this.f57180b;
        j z10 = cVar.z();
        if (z10 == null) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f57181c = false;
                z10.f57386n = false;
                z10.f57390r = false;
                this.d = motionEvent.getX();
                this.f57182e = motionEvent.getY();
                this.f57183f = false;
                return true;
            }
            if (!this.f57183f && actionMasked == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (this.f57181c || t9.a(x10, y10, this.d, this.f57182e) > org.telegram.messenger.g0.f23588e) {
                    this.f57181c = true;
                    z10.f57386n = true;
                    z10.e(x10 - this.d, y10 - this.f57182e);
                    this.d = x10;
                    this.f57182e = y10;
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                z10.f57386n = false;
                z10.f57390r = true;
                if (!this.f57181c) {
                    cVar.j();
                }
                invalidate();
                return false;
            }
            return true;
        }
        z10.f57386n = false;
        z10.f57390r = true;
        this.f57181c = false;
        this.f57183f = true;
        invalidate();
        return true;
    }
}
