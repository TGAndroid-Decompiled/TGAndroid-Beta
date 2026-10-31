package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
public final class r2 extends HorizontalScrollView {
    public final m60 f41120a;
    public final s2 f41121b;

    public r2(s2 s2Var, Context context, m60 m60Var) {
        super(context);
        this.f41121b = s2Var;
        this.f41120a = m60Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        this.f41121b.e.getMeasuredWidth();
        getMeasuredWidth();
        org.telegram.messenger.i0.L(36.0f);
        return onInterceptTouchEvent;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        s2 s2Var = this.f41121b;
        s2Var.e.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight(), 0), i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), s2Var.e.getMeasuredHeight());
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        m60 m60Var = this.f41120a;
        if (m60Var.d != null) {
            m60Var.d = null;
            m60Var.f39483f = null;
        }
        this.f41121b.a();
        org.telegram.ui.Cells.k9 k9Var = ((h4) m60Var).P0;
        if (k9Var != null && k9Var.x()) {
            k9Var.w();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f41121b.e.getMeasuredWidth() <= getMeasuredWidth() - org.telegram.messenger.i0.L(36.0f)) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean overScrollBy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        h4.R(this.f41120a);
        return super.overScrollBy(i10, i11, i12, i13, i14, i15, i16, i17, z10);
    }
}
