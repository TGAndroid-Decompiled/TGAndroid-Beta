package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import v7.f7;
public abstract class d extends FrameLayout {
    public boolean f45311a;
    public final c f45312b;
    public boolean f45313c;
    public float d;
    public float e;
    public boolean f45314f;

    public d(Context context, c cVar) {
        super(context);
        this.f45312b = cVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.f45311a && (view instanceof b2)) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (view instanceof v2) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return;
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar = this.f45312b;
        j b10 = cVar.b();
        if (b10 == null) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f45313c = false;
                b10.f45397n = false;
                b10.f45400r = false;
                this.d = motionEvent.getX();
                this.e = motionEvent.getY();
                this.f45314f = false;
                return true;
            }
            if (!this.f45314f && actionMasked == 2) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                if (this.f45313c || f7.a(x10, y3, this.d, this.e) > AndroidUtilities.touchSlop) {
                    this.f45313c = true;
                    b10.f45397n = true;
                    b10.e(x10 - this.d, y3 - this.e);
                    this.d = x10;
                    this.e = y3;
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                b10.f45397n = false;
                b10.f45400r = true;
                if (!this.f45313c) {
                    cVar.a();
                }
                invalidate();
                return false;
            }
            return true;
        }
        b10.f45397n = false;
        b10.f45400r = true;
        this.f45313c = false;
        this.f45314f = true;
        invalidate();
        return true;
    }
}
