package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.AndroidUtilities;
public final class x2 extends HorizontalScrollView {
    public final p70 f39829a;
    public final y2 f39830b;

    public x2(y2 y2Var, Context context, p70 p70Var) {
        super(context);
        this.f39830b = y2Var;
        this.f39829a = p70Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        this.f39830b.e.getMeasuredWidth();
        getMeasuredWidth();
        AndroidUtilities.dp(36.0f);
        return onInterceptTouchEvent;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        y2 y2Var = this.f39830b;
        y2Var.e.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight(), 0), i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), y2Var.e.getMeasuredHeight());
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        p70 p70Var = this.f39829a;
        if (p70Var.d != null) {
            p70Var.d = null;
            p70Var.f36983f = null;
        }
        this.f39830b.a();
        org.telegram.ui.Cells.l9 l9Var = ((n4) p70Var).L0;
        if (l9Var != null && l9Var.y()) {
            l9Var.x();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f39830b.e.getMeasuredWidth() <= getMeasuredWidth() - AndroidUtilities.dp(36.0f)) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean overScrollBy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z4) {
        n4.T(this.f39829a);
        return super.overScrollBy(i10, i11, i12, i13, i14, i15, i16, i17, z4);
    }
}
