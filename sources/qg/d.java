package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import v7.z6;
public abstract class d extends FrameLayout {
    public boolean f41324a;
    public final c f41325b;
    public boolean f41326c;
    public float d;
    public float e;
    public boolean f41327f;

    public d(Context context, c cVar) {
        super(context);
        this.f41325b = cVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f41324a && (view instanceof d2)) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (view instanceof x2) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return;
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar = this.f41325b;
        j b10 = cVar.b();
        if (b10 == null) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f41326c = false;
                b10.f41413n = false;
                b10.f41416r = false;
                this.d = motionEvent.getX();
                this.e = motionEvent.getY();
                this.f41327f = false;
                return true;
            }
            if (!this.f41327f && actionMasked == 2) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                if (this.f41326c || z6.a(x10, y3, this.d, this.e) > AndroidUtilities.touchSlop) {
                    this.f41326c = true;
                    b10.f41413n = true;
                    b10.e(x10 - this.d, y3 - this.e);
                    this.d = x10;
                    this.e = y3;
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                b10.f41413n = false;
                b10.f41416r = true;
                if (!this.f41326c) {
                    cVar.a();
                }
                invalidate();
                return false;
            }
            return true;
        }
        b10.f41413n = false;
        b10.f41416r = true;
        this.f41326c = false;
        this.f41327f = true;
        invalidate();
        return true;
    }
}
