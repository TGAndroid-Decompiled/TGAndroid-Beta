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
    public boolean f44994a;
    public final c f44995b;
    public boolean f44996c;
    public float d;
    public float f44997e;
    public boolean f44998f;

    public d(Context context, c cVar) {
        super(context);
        this.f44995b = cVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f44994a && (view instanceof a2)) {
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
        c cVar = this.f44995b;
        j b10 = cVar.b();
        if (b10 == null) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f44996c = false;
                b10.f45086n = false;
                b10.f45089r = false;
                this.d = motionEvent.getX();
                this.f44997e = motionEvent.getY();
                this.f44998f = false;
                return true;
            }
            if (!this.f44998f && actionMasked == 2) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                if (this.f44996c || z6.a(x10, y3, this.d, this.f44997e) > AndroidUtilities.touchSlop) {
                    this.f44996c = true;
                    b10.f45086n = true;
                    b10.e(x10 - this.d, y3 - this.f44997e);
                    this.d = x10;
                    this.f44997e = y3;
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                b10.f45086n = false;
                b10.f45089r = true;
                if (!this.f44996c) {
                    cVar.a();
                }
                invalidate();
                return false;
            }
            return true;
        }
        b10.f45086n = false;
        b10.f45089r = true;
        this.f44996c = false;
        this.f44998f = true;
        invalidate();
        return true;
    }
}
