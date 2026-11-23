package tg;

import a8.x9;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class h extends FrameLayout {
    public boolean f57938a;
    public final g f57939b;
    public boolean f57940c;
    public float d;
    public float f57941e;
    public boolean f57942f;

    public h(Context context, g gVar) {
        super(context);
        this.f57939b = gVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f57938a && (view instanceof v1)) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void measureChildWithMargins(View view, int i7, int i10, int i11, int i12) {
        if (view instanceof q2) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return;
        }
        super.measureChildWithMargins(view, i7, i10, i11, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        g gVar = this.f57939b;
        n o4 = gVar.o();
        if (o4 == null) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f57940c = false;
                o4.f58104n = false;
                o4.f58109r = false;
                this.d = motionEvent.getX();
                this.f57941e = motionEvent.getY();
                this.f57942f = false;
                return true;
            }
            if (!this.f57942f && actionMasked == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (this.f57940c || x9.a(x10, y10, this.d, this.f57941e) > org.telegram.messenger.g0.f24205e) {
                    this.f57940c = true;
                    o4.f58104n = true;
                    o4.e(x10 - this.d, y10 - this.f57941e);
                    this.d = x10;
                    this.f57941e = y10;
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                o4.f58104n = false;
                o4.f58109r = true;
                if (!this.f57940c) {
                    gVar.h();
                }
                invalidate();
                return false;
            }
            return true;
        }
        o4.f58104n = false;
        o4.f58109r = true;
        this.f57940c = false;
        this.f57942f = true;
        invalidate();
        return true;
    }
}
