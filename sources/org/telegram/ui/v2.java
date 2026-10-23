package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.AndroidUtilities;
public final class v2 extends HorizontalScrollView {
    public final b70 f42101a;
    public final w2 f42102b;

    public v2(w2 w2Var, Context context, b70 b70Var) {
        super(context);
        this.f42102b = w2Var;
        this.f42101a = b70Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        this.f42102b.e.getMeasuredWidth();
        getMeasuredWidth();
        AndroidUtilities.dp(36.0f);
        return onInterceptTouchEvent;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        w2 w2Var = this.f42102b;
        w2Var.e.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight(), 0), i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), w2Var.e.getMeasuredHeight());
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        b70 b70Var = this.f42101a;
        if (b70Var.d != null) {
            b70Var.d = null;
            b70Var.f35529f = null;
        }
        this.f42102b.a();
        org.telegram.ui.Cells.n9 n9Var = ((l4) b70Var).O0;
        if (n9Var != null && n9Var.x()) {
            n9Var.w();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f42102b.e.getMeasuredWidth() <= getMeasuredWidth() - AndroidUtilities.dp(36.0f)) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean overScrollBy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        l4.T(this.f42101a);
        return super.overScrollBy(i10, i11, i12, i13, i14, i15, i16, i17, z10);
    }
}
