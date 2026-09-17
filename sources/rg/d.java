package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import v7.z6;
public abstract class d extends FrameLayout {
    public boolean f45183a;
    public final c f45184b;
    public boolean f45185c;
    public float d;
    public float f45186e;
    public boolean f45187f;

    public d(Context context, c cVar) {
        super(context);
        this.f45184b = cVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f45183a && (view instanceof c2)) {
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
        c cVar = this.f45184b;
        k b10 = cVar.b();
        if (b10 == null) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f45185c = false;
                b10.f45284n = false;
                b10.f45287r = false;
                this.d = motionEvent.getX();
                this.f45186e = motionEvent.getY();
                this.f45187f = false;
                return true;
            }
            if (!this.f45187f && actionMasked == 2) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                if (this.f45185c || z6.a(x10, y3, this.d, this.f45186e) > AndroidUtilities.touchSlop) {
                    this.f45185c = true;
                    b10.f45284n = true;
                    b10.e(x10 - this.d, y3 - this.f45186e);
                    this.d = x10;
                    this.f45186e = y3;
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                b10.f45284n = false;
                b10.f45287r = true;
                if (!this.f45185c) {
                    cVar.a();
                }
                invalidate();
                return false;
            }
            return true;
        }
        b10.f45284n = false;
        b10.f45287r = true;
        this.f45185c = false;
        this.f45187f = true;
        invalidate();
        return true;
    }
}
