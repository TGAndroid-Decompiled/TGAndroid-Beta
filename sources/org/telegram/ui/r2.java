package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
public final class r2 extends HorizontalScrollView {
    public final n50 f50833a;
    public final s2 f50834b;

    public r2(s2 s2Var, Context context, n50 n50Var) {
        super(context);
        this.f50834b = s2Var;
        this.f50833a = n50Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        this.f50834b.f51071e.getMeasuredWidth();
        getMeasuredWidth();
        org.telegram.messenger.g0.L(36.0f);
        return onInterceptTouchEvent;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        s2 s2Var = this.f50834b;
        s2Var.f51071e.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight(), 0), i10);
        setMeasuredDimension(View.MeasureSpec.getSize(i7), s2Var.f51071e.getMeasuredHeight());
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        n50 n50Var = this.f50833a;
        if (n50Var.d != null) {
            n50Var.d = null;
            n50Var.f49451f = null;
        }
        this.f50834b.a();
        org.telegram.ui.Cells.h9 h9Var = ((g4) n50Var).Q0;
        if (h9Var != null && h9Var.x()) {
            h9Var.w();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f50834b.f51071e.getMeasuredWidth() <= getMeasuredWidth() - org.telegram.messenger.g0.L(36.0f)) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean overScrollBy(int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10) {
        g4.R(this.f50833a);
        return super.overScrollBy(i7, i10, i11, i12, i13, i14, i15, i16, z10);
    }
}
