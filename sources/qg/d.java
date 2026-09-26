package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import v7.a7;
public abstract class d extends FrameLayout {
    public boolean f41608a;
    public final c f41609b;
    public boolean f41610c;
    public float d;
    public float e;
    public boolean f41611f;

    public d(Context context, c cVar) {
        super(context);
        this.f41609b = cVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f41608a && (view instanceof b2)) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
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
        c cVar = this.f41609b;
        j b10 = cVar.b();
        if (b10 == null) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f41610c = false;
                b10.f41690n = false;
                b10.f41693r = false;
                this.d = motionEvent.getX();
                this.e = motionEvent.getY();
                this.f41611f = false;
                return true;
            }
            if (!this.f41611f && actionMasked == 2) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                if (this.f41610c || a7.a(x10, y3, this.d, this.e) > AndroidUtilities.touchSlop) {
                    this.f41610c = true;
                    b10.f41690n = true;
                    b10.e(x10 - this.d, y3 - this.e);
                    this.d = x10;
                    this.e = y3;
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                b10.f41690n = false;
                b10.f41693r = true;
                if (!this.f41610c) {
                    cVar.a();
                }
                invalidate();
                return false;
            }
            return true;
        }
        b10.f41690n = false;
        b10.f41693r = true;
        this.f41610c = false;
        this.f41611f = true;
        invalidate();
        return true;
    }
}
