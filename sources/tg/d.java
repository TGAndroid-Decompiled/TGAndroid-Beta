package tg;

import a8.w9;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class d extends FrameLayout {
    public boolean f57807a;
    public final c f57808b;
    public boolean f57809c;
    public float d;
    public float f57810e;
    public boolean f57811f;

    public d(Context context, c cVar) {
        super(context);
        this.f57808b = cVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f57807a && (view instanceof s1)) {
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
        c cVar = this.f57808b;
        j B = cVar.B();
        if (B == null) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f57809c = false;
                B.f57989n = false;
                B.f57993r = false;
                this.d = motionEvent.getX();
                this.f57810e = motionEvent.getY();
                this.f57811f = false;
                return true;
            }
            if (!this.f57811f && actionMasked == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (this.f57809c || w9.a(x10, y10, this.d, this.f57810e) > org.telegram.messenger.g0.f24025e) {
                    this.f57809c = true;
                    B.f57989n = true;
                    B.e(x10 - this.d, y10 - this.f57810e);
                    this.d = x10;
                    this.f57810e = y10;
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                B.f57989n = false;
                B.f57993r = true;
                if (!this.f57809c) {
                    cVar.i();
                }
                invalidate();
                return false;
            }
            return true;
        }
        B.f57989n = false;
        B.f57993r = true;
        this.f57809c = false;
        this.f57811f = true;
        invalidate();
        return true;
    }
}
