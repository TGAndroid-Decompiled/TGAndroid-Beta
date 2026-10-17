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
    public boolean f45341a;
    public final c f45342b;
    public boolean f45343c;
    public float d;
    public float e;
    public boolean f45344f;

    public d(Context context, c cVar) {
        super(context);
        this.f45342b = cVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.f45341a && (view instanceof a2)) {
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
        c cVar = this.f45342b;
        j b10 = cVar.b();
        if (b10 == null) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f45343c = false;
                b10.f45421n = false;
                b10.f45424r = false;
                this.d = motionEvent.getX();
                this.e = motionEvent.getY();
                this.f45344f = false;
                return true;
            }
            if (!this.f45344f && actionMasked == 2) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                if (this.f45343c || f7.a(x10, y3, this.d, this.e) > AndroidUtilities.touchSlop) {
                    this.f45343c = true;
                    b10.f45421n = true;
                    b10.e(x10 - this.d, y3 - this.e);
                    this.d = x10;
                    this.e = y3;
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                b10.f45421n = false;
                b10.f45424r = true;
                if (!this.f45343c) {
                    cVar.a();
                }
                invalidate();
                return false;
            }
            return true;
        }
        b10.f45421n = false;
        b10.f45424r = true;
        this.f45343c = false;
        this.f45344f = true;
        invalidate();
        return true;
    }
}
