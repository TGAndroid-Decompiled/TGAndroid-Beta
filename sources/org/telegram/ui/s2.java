package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
public final class s2 extends HorizontalScrollView {
    public final i50 f49334a;
    public final t2 f49335b;

    public s2(t2 t2Var, Context context, i50 i50Var) {
        super(context);
        this.f49335b = t2Var;
        this.f49334a = i50Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        this.f49335b.f49674e.getMeasuredWidth();
        getMeasuredWidth();
        org.telegram.messenger.g0.L(36.0f);
        return onInterceptTouchEvent;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        t2 t2Var = this.f49335b;
        t2Var.f49674e.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i3) - getPaddingLeft()) - getPaddingRight(), 0), i10);
        setMeasuredDimension(View.MeasureSpec.getSize(i3), t2Var.f49674e.getMeasuredHeight());
    }

    @Override
    public final void onScrollChanged(int i3, int i10, int i11, int i12) {
        super.onScrollChanged(i3, i10, i11, i12);
        i50 i50Var = this.f49334a;
        if (i50Var.d != null) {
            i50Var.d = null;
            i50Var.f46114f = null;
        }
        this.f49335b.a();
        org.telegram.ui.Cells.h9 h9Var = ((i4) i50Var).Q0;
        if (h9Var != null && h9Var.x()) {
            h9Var.w();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f49335b.f49674e.getMeasuredWidth() <= getMeasuredWidth() - org.telegram.messenger.g0.L(36.0f)) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean overScrollBy(int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10) {
        i4.R(this.f49334a);
        return super.overScrollBy(i3, i10, i11, i12, i13, i14, i15, i16, z10);
    }
}
