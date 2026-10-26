package sg;

import a8.ic;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class d extends FrameLayout {
    public boolean f48175a;
    public final c f48176b;
    public boolean f48177c;
    public float d;
    public float e;
    public boolean f48178f;

    public d(Context context, c cVar) {
        super(context);
        this.f48176b = cVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.f48175a && (view instanceof c2)) {
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
        c cVar = this.f48176b;
        j b10 = cVar.b();
        if (b10 == null) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f48177c = false;
                b10.f48259n = false;
                b10.f48262r = false;
                this.d = motionEvent.getX();
                this.e = motionEvent.getY();
                this.f48178f = false;
                return true;
            }
            if (!this.f48178f && actionMasked == 2) {
                float x9 = motionEvent.getX();
                float y3 = motionEvent.getY();
                if (this.f48177c || ic.a(x9, y3, this.d, this.e) > AndroidUtilities.touchSlop) {
                    this.f48177c = true;
                    b10.f48259n = true;
                    b10.e(x9 - this.d, y3 - this.e);
                    this.d = x9;
                    this.e = y3;
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                b10.f48259n = false;
                b10.f48262r = true;
                if (!this.f48177c) {
                    cVar.a();
                }
                invalidate();
                return false;
            }
            return true;
        }
        b10.f48259n = false;
        b10.f48262r = true;
        this.f48177c = false;
        this.f48178f = true;
        invalidate();
        return true;
    }
}
