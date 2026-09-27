package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.AndroidUtilities;
public final class u2 extends HorizontalScrollView {
    public final s70 f38106a;
    public final v2 f38107b;

    public u2(v2 v2Var, Context context, s70 s70Var) {
        super(context);
        this.f38107b = v2Var;
        this.f38106a = s70Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        this.f38107b.e.getMeasuredWidth();
        getMeasuredWidth();
        AndroidUtilities.dp(36.0f);
        return onInterceptTouchEvent;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        v2 v2Var = this.f38107b;
        v2Var.e.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight(), 0), i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), v2Var.e.getMeasuredHeight());
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        s70 s70Var = this.f38106a;
        if (s70Var.d != null) {
            s70Var.d = null;
            s70Var.f37322f = null;
        }
        this.f38107b.a();
        org.telegram.ui.Cells.q9 q9Var = ((j4) s70Var).O0;
        if (q9Var != null && q9Var.y()) {
            q9Var.x();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f38107b.e.getMeasuredWidth() <= getMeasuredWidth() - AndroidUtilities.dp(36.0f)) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean overScrollBy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        j4.T(this.f38106a);
        return super.overScrollBy(i10, i11, i12, i13, i14, i15, i16, i17, z10);
    }
}
