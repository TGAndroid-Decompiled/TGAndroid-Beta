package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.AndroidUtilities;
public final class x2 extends HorizontalScrollView {
    public final d70 f44439a;
    public final y2 f44440b;

    public x2(y2 y2Var, Context context, d70 d70Var) {
        super(context);
        this.f44440b = y2Var;
        this.f44439a = d70Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        this.f44440b.f44703e.getMeasuredWidth();
        getMeasuredWidth();
        AndroidUtilities.dp(36.0f);
        return onInterceptTouchEvent;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        y2 y2Var = this.f44440b;
        y2Var.f44703e.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight(), 0), i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), y2Var.f44703e.getMeasuredHeight());
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        d70 d70Var = this.f44439a;
        if (d70Var.d != null) {
            d70Var.d = null;
            d70Var.f37383f = null;
        }
        this.f44440b.a();
        org.telegram.ui.Cells.k9 k9Var = ((m4) d70Var).K0;
        if (k9Var != null && k9Var.y()) {
            k9Var.x();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f44440b.f44703e.getMeasuredWidth() <= getMeasuredWidth() - AndroidUtilities.dp(36.0f)) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean overScrollBy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        m4.T(this.f44439a);
        return super.overScrollBy(i10, i11, i12, i13, i14, i15, i16, i17, z10);
    }
}
