package zf;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public abstract class d extends FrameLayout {

    public boolean f50372a;

    public final c f50373b;

    public boolean f50374c;
    public float d;

    public float f50375e;

    public boolean f50376f;

    public d(Context context, c cVar) {
        super(context);
        this.f50373b = cVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.f50372a && (view instanceof b2)) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (!(view instanceof v2)) {
            super.measureChildWithMargins(view, i10, i11, i12, i13);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar = this.f50373b;
        j jVarB = cVar.b();
        if (jVarB == null) {
            return false;
        }
        if (motionEvent.getPointerCount() != 1) {
            jVarB.f50463n = false;
            jVarB.f50464r = true;
            this.f50374c = false;
            this.f50376f = true;
            invalidate();
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f50374c = false;
            jVarB.f50463n = false;
            jVarB.f50464r = false;
            this.d = motionEvent.getX();
            this.f50375e = motionEvent.getY();
            this.f50376f = false;
            return true;
        }
        if (!this.f50376f && actionMasked == 2) {
            float x8 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (this.f50374c || h7.y.a(x8, y10, this.d, this.f50375e) > AndroidUtilities.touchSlop) {
                this.f50374c = true;
                jVarB.f50463n = true;
                jVarB.e(x8 - this.d, y10 - this.f50375e);
                this.d = x8;
                this.f50375e = y10;
                return true;
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            jVarB.f50463n = false;
            jVarB.f50464r = true;
            if (!this.f50374c) {
                cVar.a();
            }
            invalidate();
            return false;
        }
        return true;
    }
}
