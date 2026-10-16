package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.AndroidUtilities;
public final class v2 extends HorizontalScrollView {
    public final z70 f40544a;
    public final w2 f40545b;

    public v2(w2 w2Var, Context context, z70 z70Var) {
        super(context);
        this.f40545b = w2Var;
        this.f40544a = z70Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        this.f40545b.e.getMeasuredWidth();
        getMeasuredWidth();
        AndroidUtilities.dp(36.0f);
        return onInterceptTouchEvent;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        w2 w2Var = this.f40545b;
        w2Var.e.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight(), 0), i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), w2Var.e.getMeasuredHeight());
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        z70 z70Var = this.f40544a;
        if (z70Var.d != null) {
            z70Var.d = null;
            z70Var.f42177f = null;
        }
        this.f40545b.a();
        org.telegram.ui.Cells.o9 o9Var = ((k4) z70Var).O0;
        if (o9Var != null && o9Var.x()) {
            o9Var.w();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f40545b.e.getMeasuredWidth() <= getMeasuredWidth() - AndroidUtilities.dp(36.0f)) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean overScrollBy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        k4.T(this.f40544a);
        return super.overScrollBy(i10, i11, i12, i13, i14, i15, i16, i17, z10);
    }
}
