package tg;

import a8.r9;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class d extends FrameLayout {
    public boolean f55627a;
    public final c f55628b;
    public boolean f55629c;
    public float d;
    public float f55630e;
    public boolean f55631f;

    public d(Context context, c cVar) {
        super(context);
        this.f55628b = cVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f55627a && (view instanceof q1)) {
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
        c cVar = this.f55628b;
        j l10 = cVar.l();
        if (l10 == null) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f55629c = false;
                l10.f55796n = false;
                l10.f55799r = false;
                this.d = motionEvent.getX();
                this.f55630e = motionEvent.getY();
                this.f55631f = false;
                return true;
            }
            if (!this.f55631f && actionMasked == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (this.f55629c || r9.a(x10, y10, this.d, this.f55630e) > org.telegram.messenger.g0.f22546e) {
                    this.f55629c = true;
                    l10.f55796n = true;
                    l10.e(x10 - this.d, y10 - this.f55630e);
                    this.d = x10;
                    this.f55630e = y10;
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                l10.f55796n = false;
                l10.f55799r = true;
                if (!this.f55629c) {
                    cVar.g();
                }
                invalidate();
                return false;
            }
            return true;
        }
        l10.f55796n = false;
        l10.f55799r = true;
        this.f55629c = false;
        this.f55631f = true;
        invalidate();
        return true;
    }
}
