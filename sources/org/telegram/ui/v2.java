package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.AndroidUtilities;
public final class v2 extends HorizontalScrollView {
    public final o70 f41996a;
    public final w2 f41997b;

    public v2(w2 w2Var, Context context, o70 o70Var) {
        super(context);
        this.f41997b = w2Var;
        this.f41996a = o70Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        this.f41997b.f42256e.getMeasuredWidth();
        getMeasuredWidth();
        AndroidUtilities.dp(36.0f);
        return onInterceptTouchEvent;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        w2 w2Var = this.f41997b;
        w2Var.f42256e.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight(), 0), i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), w2Var.f42256e.getMeasuredHeight());
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        o70 o70Var = this.f41996a;
        if (o70Var.d != null) {
            o70Var.d = null;
            o70Var.f39557f = null;
        }
        this.f41997b.a();
        org.telegram.ui.Cells.m9 m9Var = ((l4) o70Var).L0;
        if (m9Var != null && m9Var.y()) {
            m9Var.x();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f41997b.f42256e.getMeasuredWidth() <= getMeasuredWidth() - AndroidUtilities.dp(36.0f)) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean overScrollBy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z4) {
        l4.T(this.f41996a);
        return super.overScrollBy(i10, i11, i12, i13, i14, i15, i16, i17, z4);
    }
}
