package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
public final class r2 extends HorizontalScrollView {
    public final q50 f49248a;
    public final s2 f49249b;

    public r2(s2 s2Var, Context context, q50 q50Var) {
        super(context);
        this.f49249b = s2Var;
        this.f49248a = q50Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        this.f49249b.f49724e.getMeasuredWidth();
        getMeasuredWidth();
        org.telegram.messenger.g0.L(36.0f);
        return onInterceptTouchEvent;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        s2 s2Var = this.f49249b;
        s2Var.f49724e.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight(), 0), i10);
        setMeasuredDimension(View.MeasureSpec.getSize(i7), s2Var.f49724e.getMeasuredHeight());
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        q50 q50Var = this.f49248a;
        if (q50Var.d != null) {
            q50Var.d = null;
            q50Var.f48921f = null;
        }
        this.f49249b.a();
        org.telegram.ui.Cells.i9 i9Var = ((g4) q50Var).P0;
        if (i9Var != null && i9Var.x()) {
            i9Var.w();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f49249b.f49724e.getMeasuredWidth() <= getMeasuredWidth() - org.telegram.messenger.g0.L(36.0f)) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean overScrollBy(int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z9) {
        g4.R(this.f49248a);
        return super.overScrollBy(i7, i10, i11, i12, i13, i14, i15, i16, z9);
    }
}
