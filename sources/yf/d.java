package yf;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class d extends FrameLayout {
    public boolean f49782a;
    public final c f49783b;
    public boolean f49784c;
    public float d;
    public float f49785e;
    public boolean f49786f;

    public d(Context context, c cVar) {
        super(context);
        this.f49783b = cVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.f49782a && (view instanceof a2)) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void measureChildWithMargins(View view, int i9, int i10, int i11, int i12) {
        if (view instanceof v2) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            view.measure(ViewGroup.getChildMeasureSpec(i9, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return;
        }
        super.measureChildWithMargins(view, i9, i10, i11, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar = this.f49783b;
        j b10 = cVar.b();
        if (b10 == null) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f49784c = false;
                b10.f49866n = false;
                b10.f49867r = false;
                this.d = motionEvent.getX();
                this.f49785e = motionEvent.getY();
                this.f49786f = false;
                return true;
            }
            if (!this.f49786f && actionMasked == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (this.f49784c || g7.w.a(x10, y10, this.d, this.f49785e) > AndroidUtilities.touchSlop) {
                    this.f49784c = true;
                    b10.f49866n = true;
                    b10.e(x10 - this.d, y10 - this.f49785e);
                    this.d = x10;
                    this.f49785e = y10;
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                b10.f49866n = false;
                b10.f49867r = true;
                if (!this.f49784c) {
                    cVar.a();
                }
                invalidate();
                return false;
            }
            return true;
        }
        b10.f49866n = false;
        b10.f49867r = true;
        this.f49784c = false;
        this.f49786f = true;
        invalidate();
        return true;
    }
}
