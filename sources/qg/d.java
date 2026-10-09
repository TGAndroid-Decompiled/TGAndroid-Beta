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
    public boolean f46213a;
    public final c f46214b;
    public boolean f46215c;
    public float d;
    public float f46216e;
    public boolean f46217f;

    public d(Context context, c cVar) {
        super(context);
        this.f46214b = cVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f46213a && (view instanceof b2)) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (view instanceof w2) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return;
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar = this.f46214b;
        j b10 = cVar.b();
        if (b10 == null) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f46215c = false;
                b10.f46299n = false;
                b10.f46302r = false;
                this.d = motionEvent.getX();
                this.f46216e = motionEvent.getY();
                this.f46217f = false;
                return true;
            }
            if (!this.f46217f && actionMasked == 2) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                if (this.f46215c || z6.a(x10, y3, this.d, this.f46216e) > AndroidUtilities.touchSlop) {
                    this.f46215c = true;
                    b10.f46299n = true;
                    b10.e(x10 - this.d, y3 - this.f46216e);
                    this.d = x10;
                    this.f46216e = y3;
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                b10.f46299n = false;
                b10.f46302r = true;
                if (!this.f46215c) {
                    cVar.a();
                }
                invalidate();
                return false;
            }
            return true;
        }
        b10.f46299n = false;
        b10.f46302r = true;
        this.f46215c = false;
        this.f46217f = true;
        invalidate();
        return true;
    }
}
