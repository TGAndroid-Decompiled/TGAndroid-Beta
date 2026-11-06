package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
public final class r2 extends HorizontalScrollView {
    public final o50 f49357a;
    public final s2 f49358b;

    public r2(s2 s2Var, Context context, o50 o50Var) {
        super(context);
        this.f49358b = s2Var;
        this.f49357a = o50Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        this.f49358b.f49619e.getMeasuredWidth();
        getMeasuredWidth();
        org.telegram.messenger.g0.L(36.0f);
        return onInterceptTouchEvent;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        s2 s2Var = this.f49358b;
        s2Var.f49619e.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight(), 0), i10);
        setMeasuredDimension(View.MeasureSpec.getSize(i7), s2Var.f49619e.getMeasuredHeight());
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        o50 o50Var = this.f49357a;
        if (o50Var.d != null) {
            o50Var.d = null;
            o50Var.f48270f = null;
        }
        this.f49358b.a();
        org.telegram.ui.Cells.i9 i9Var = ((g4) o50Var).P0;
        if (i9Var != null && i9Var.x()) {
            i9Var.w();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f49358b.f49619e.getMeasuredWidth() <= getMeasuredWidth() - org.telegram.messenger.g0.L(36.0f)) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean overScrollBy(int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z9) {
        g4.R(this.f49357a);
        return super.overScrollBy(i7, i10, i11, i12, i13, i14, i15, i16, z9);
    }
}
