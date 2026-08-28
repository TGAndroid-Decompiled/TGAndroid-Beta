package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.AndroidUtilities;
public final class w2 extends HorizontalScrollView {
    public final a70 f43637a;
    public final x2 f43638b;

    public w2(x2 x2Var, Context context, a70 a70Var) {
        super(context);
        this.f43638b = x2Var;
        this.f43637a = a70Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        this.f43638b.f44328e.getMeasuredWidth();
        getMeasuredWidth();
        AndroidUtilities.dp(36.0f);
        return onInterceptTouchEvent;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        x2 x2Var = this.f43638b;
        x2Var.f44328e.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i9) - getPaddingLeft()) - getPaddingRight(), 0), i10);
        setMeasuredDimension(View.MeasureSpec.getSize(i9), x2Var.f44328e.getMeasuredHeight());
    }

    @Override
    public final void onScrollChanged(int i9, int i10, int i11, int i12) {
        super.onScrollChanged(i9, i10, i11, i12);
        a70 a70Var = this.f43637a;
        if (a70Var.d != null) {
            a70Var.d = null;
            a70Var.f36377f = null;
        }
        this.f43638b.a();
        org.telegram.ui.Cells.n9 n9Var = ((l4) a70Var).K0;
        if (n9Var != null && n9Var.y()) {
            n9Var.x();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f43638b.f44328e.getMeasuredWidth() <= getMeasuredWidth() - AndroidUtilities.dp(36.0f)) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean overScrollBy(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10) {
        l4.T(this.f43637a);
        return super.overScrollBy(i9, i10, i11, i12, i13, i14, i15, i16, z10);
    }
}
