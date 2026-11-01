package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
public final class r2 extends HorizontalScrollView {
    public final l60 f40957a;
    public final s2 f40958b;

    public r2(s2 s2Var, Context context, l60 l60Var) {
        super(context);
        this.f40958b = s2Var;
        this.f40957a = l60Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        this.f40958b.e.getMeasuredWidth();
        getMeasuredWidth();
        org.telegram.messenger.i0.L(36.0f);
        return onInterceptTouchEvent;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        s2 s2Var = this.f40958b;
        s2Var.e.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight(), 0), i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), s2Var.e.getMeasuredHeight());
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        l60 l60Var = this.f40957a;
        if (l60Var.d != null) {
            l60Var.d = null;
            l60Var.f39098f = null;
        }
        this.f40958b.a();
        org.telegram.ui.Cells.k9 k9Var = ((h4) l60Var).P0;
        if (k9Var != null && k9Var.x()) {
            k9Var.w();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f40958b.e.getMeasuredWidth() <= getMeasuredWidth() - org.telegram.messenger.i0.L(36.0f)) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean overScrollBy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        h4.R(this.f40957a);
        return super.overScrollBy(i10, i11, i12, i13, i14, i15, i16, i17, z10);
    }
}
