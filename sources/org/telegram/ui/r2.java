package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
public final class r2 extends HorizontalScrollView {
    public final p50 f51461a;
    public final s2 f51462b;

    public r2(s2 s2Var, Context context, p50 p50Var) {
        super(context);
        this.f51462b = s2Var;
        this.f51461a = p50Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        this.f51462b.f51856e.getMeasuredWidth();
        getMeasuredWidth();
        org.telegram.messenger.g0.L(36.0f);
        return onInterceptTouchEvent;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        s2 s2Var = this.f51462b;
        s2Var.f51856e.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight(), 0), i10);
        setMeasuredDimension(View.MeasureSpec.getSize(i7), s2Var.f51856e.getMeasuredHeight());
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        p50 p50Var = this.f51461a;
        if (p50Var.d != null) {
            p50Var.d = null;
            p50Var.f50728f = null;
        }
        this.f51462b.a();
        org.telegram.ui.Cells.j9 j9Var = ((g4) p50Var).Q0;
        if (j9Var != null && j9Var.x()) {
            j9Var.w();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f51462b.f51856e.getMeasuredWidth() <= getMeasuredWidth() - org.telegram.messenger.g0.L(36.0f)) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean overScrollBy(int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10) {
        g4.R(this.f51461a);
        return super.overScrollBy(i7, i10, i11, i12, i13, i14, i15, i16, z10);
    }
}
