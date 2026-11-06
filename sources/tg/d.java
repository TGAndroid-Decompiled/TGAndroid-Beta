package tg;

import a8.r9;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class d extends FrameLayout {
    public boolean f55524a;
    public final c f55525b;
    public boolean f55526c;
    public float d;
    public float f55527e;
    public boolean f55528f;

    public d(Context context, c cVar) {
        super(context);
        this.f55525b = cVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f55524a && (view instanceof q1)) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void measureChildWithMargins(View view, int i7, int i10, int i11, int i12) {
        if (view instanceof k2) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return;
        }
        super.measureChildWithMargins(view, i7, i10, i11, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar = this.f55525b;
        j l10 = cVar.l();
        if (l10 == null) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f55526c = false;
                l10.f55693n = false;
                l10.f55696r = false;
                this.d = motionEvent.getX();
                this.f55527e = motionEvent.getY();
                this.f55528f = false;
                return true;
            }
            if (!this.f55528f && actionMasked == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (this.f55526c || r9.a(x10, y10, this.d, this.f55527e) > org.telegram.messenger.g0.f22516e) {
                    this.f55526c = true;
                    l10.f55693n = true;
                    l10.e(x10 - this.d, y10 - this.f55527e);
                    this.d = x10;
                    this.f55527e = y10;
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                l10.f55693n = false;
                l10.f55696r = true;
                if (!this.f55526c) {
                    cVar.g();
                }
                invalidate();
                return false;
            }
            return true;
        }
        l10.f55693n = false;
        l10.f55696r = true;
        this.f55526c = false;
        this.f55528f = true;
        invalidate();
        return true;
    }
}
