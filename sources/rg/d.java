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
    public boolean f44225a;
    public final c f44226b;
    public boolean f44227c;
    public float d;
    public float e;
    public boolean f44228f;

    public d(Context context, c cVar) {
        super(context);
        this.f44226b = cVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.f44225a && (view instanceof c2)) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
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
        c cVar = this.f44226b;
        j b10 = cVar.b();
        if (b10 == null) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f44227c = false;
                b10.f44306n = false;
                b10.f44309r = false;
                this.d = motionEvent.getX();
                this.e = motionEvent.getY();
                this.f44228f = false;
                return true;
            }
            if (!this.f44228f && actionMasked == 2) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                if (this.f44227c || f7.a(x10, y3, this.d, this.e) > AndroidUtilities.touchSlop) {
                    this.f44227c = true;
                    b10.f44306n = true;
                    b10.e(x10 - this.d, y3 - this.e);
                    this.d = x10;
                    this.e = y3;
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                b10.f44306n = false;
                b10.f44309r = true;
                if (!this.f44227c) {
                    cVar.a();
                }
                invalidate();
                return false;
            }
            return true;
        }
        b10.f44306n = false;
        b10.f44309r = true;
        this.f44227c = false;
        this.f44228f = true;
        invalidate();
        return true;
    }
}
