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
    public boolean f46295a;
    public final c f46296b;
    public boolean f46297c;
    public float d;
    public float f46298e;
    public boolean f46299f;

    public d(Context context, c cVar) {
        super(context);
        this.f46296b = cVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f46295a && (view instanceof a2)) {
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
        c cVar = this.f46296b;
        j b10 = cVar.b();
        if (b10 == null) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f46297c = false;
                b10.f46385n = false;
                b10.f46388r = false;
                this.d = motionEvent.getX();
                this.f46298e = motionEvent.getY();
                this.f46299f = false;
                return true;
            }
            if (!this.f46299f && actionMasked == 2) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                if (this.f46297c || z6.a(x10, y3, this.d, this.f46298e) > AndroidUtilities.touchSlop) {
                    this.f46297c = true;
                    b10.f46385n = true;
                    b10.e(x10 - this.d, y3 - this.f46298e);
                    this.d = x10;
                    this.f46298e = y3;
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                b10.f46385n = false;
                b10.f46388r = true;
                if (!this.f46297c) {
                    cVar.a();
                }
                invalidate();
                return false;
            }
            return true;
        }
        b10.f46385n = false;
        b10.f46388r = true;
        this.f46297c = false;
        this.f46299f = true;
        invalidate();
        return true;
    }
}
