package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.AndroidUtilities;
public final class v2 extends HorizontalScrollView {
    public final n70 f39062a;
    public final w2 f39063b;

    public v2(w2 w2Var, Context context, n70 n70Var) {
        super(context);
        this.f39063b = w2Var;
        this.f39062a = n70Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        this.f39063b.e.getMeasuredWidth();
        getMeasuredWidth();
        AndroidUtilities.dp(36.0f);
        return onInterceptTouchEvent;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        w2 w2Var = this.f39063b;
        w2Var.e.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight(), 0), i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), w2Var.e.getMeasuredHeight());
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        n70 n70Var = this.f39062a;
        if (n70Var.d != null) {
            n70Var.d = null;
            n70Var.f36478f = null;
        }
        this.f39063b.a();
        org.telegram.ui.Cells.m9 m9Var = ((l4) n70Var).L0;
        if (m9Var != null && m9Var.y()) {
            m9Var.x();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f39063b.e.getMeasuredWidth() <= getMeasuredWidth() - AndroidUtilities.dp(36.0f)) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean overScrollBy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z4) {
        l4.T(this.f39062a);
        return super.overScrollBy(i10, i11, i12, i13, i14, i15, i16, i17, z4);
    }
}
