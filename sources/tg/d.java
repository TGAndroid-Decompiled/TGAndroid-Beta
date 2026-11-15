package tg;

import a8.t9;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class d extends FrameLayout {
    public boolean f57200a;
    public final c f57201b;
    public boolean f57202c;
    public float d;
    public float f57203e;
    public boolean f57204f;

    public d(Context context, c cVar) {
        super(context);
        this.f57201b = cVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f57200a && (view instanceof q1)) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void measureChildWithMargins(View view, int i7, int i10, int i11, int i12) {
        if (view instanceof n2) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return;
        }
        super.measureChildWithMargins(view, i7, i10, i11, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar = this.f57201b;
        j z10 = cVar.z();
        if (z10 == null) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f57202c = false;
                z10.f57391n = false;
                z10.f57395r = false;
                this.d = motionEvent.getX();
                this.f57203e = motionEvent.getY();
                this.f57204f = false;
                return true;
            }
            if (!this.f57204f && actionMasked == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (this.f57202c || t9.a(x10, y10, this.d, this.f57203e) > org.telegram.messenger.g0.f23590e) {
                    this.f57202c = true;
                    z10.f57391n = true;
                    z10.e(x10 - this.d, y10 - this.f57203e);
                    this.d = x10;
                    this.f57203e = y10;
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                z10.f57391n = false;
                z10.f57395r = true;
                if (!this.f57202c) {
                    cVar.j();
                }
                invalidate();
                return false;
            }
            return true;
        }
        z10.f57391n = false;
        z10.f57395r = true;
        this.f57202c = false;
        this.f57204f = true;
        invalidate();
        return true;
    }
}
