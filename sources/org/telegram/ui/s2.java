package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.AndroidUtilities;
public final class s2 extends HorizontalScrollView {
    public final h70 f43342a;
    public final t2 f43343b;

    public s2(t2 t2Var, Context context, h70 h70Var) {
        super(context);
        this.f43343b = t2Var;
        this.f43342a = h70Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        this.f43343b.e.getMeasuredWidth();
        getMeasuredWidth();
        AndroidUtilities.dp(36.0f);
        return onInterceptTouchEvent;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        t2 t2Var = this.f43343b;
        t2Var.e.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight(), 0), i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), t2Var.e.getMeasuredHeight());
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        h70 h70Var = this.f43342a;
        if (h70Var.d != null) {
            h70Var.d = null;
            h70Var.f39919f = null;
        }
        this.f43343b.a();
        org.telegram.ui.Cells.s9 s9Var = ((j4) h70Var).P0;
        if (s9Var != null && s9Var.x()) {
            s9Var.w();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f43343b.e.getMeasuredWidth() <= getMeasuredWidth() - AndroidUtilities.dp(36.0f)) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean overScrollBy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        j4.T(this.f43342a);
        return super.overScrollBy(i10, i11, i12, i13, i14, i15, i16, i17, z10);
    }
}
