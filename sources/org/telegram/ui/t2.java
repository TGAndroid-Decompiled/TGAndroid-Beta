package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.AndroidUtilities;
public final class t2 extends HorizontalScrollView {
    public final t70 f40680a;
    public final u2 f40681b;

    public t2(u2 u2Var, Context context, t70 t70Var) {
        super(context);
        this.f40681b = u2Var;
        this.f40680a = t70Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        this.f40681b.f41030e.getMeasuredWidth();
        getMeasuredWidth();
        AndroidUtilities.dp(36.0f);
        return onInterceptTouchEvent;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        u2 u2Var = this.f40681b;
        u2Var.f41030e.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight(), 0), i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), u2Var.f41030e.getMeasuredHeight());
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        t70 t70Var = this.f40680a;
        if (t70Var.d != null) {
            t70Var.d = null;
            t70Var.f40712f = null;
        }
        this.f40681b.a();
        org.telegram.ui.Cells.q9 q9Var = ((i4) t70Var).O0;
        if (q9Var != null && q9Var.y()) {
            q9Var.x();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f40681b.f41030e.getMeasuredWidth() <= getMeasuredWidth() - AndroidUtilities.dp(36.0f)) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean overScrollBy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        i4.T(this.f40680a);
        return super.overScrollBy(i10, i11, i12, i13, i14, i15, i16, i17, z10);
    }
}
