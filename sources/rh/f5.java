package rh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

public final class f5 extends ViewGroup {

    public final int f47143a;

    public final g5 f47144b;

    public f5(g5 g5Var, Context context) {
        super(context);
        this.f47144b = g5Var;
        this.f47143a = AndroidUtilities.dp(16.0f);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        g5 g5Var = this.f47144b;
        int measuredWidth = g5Var.v.getMeasuredWidth();
        int measuredHeight = g5Var.v.getMeasuredHeight();
        i5 i5Var = g5Var.v;
        int i14 = this.f47143a;
        i5Var.layout(-i14, 0, measuredWidth - i14, measuredHeight);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int i12 = this.f47143a;
        int iMax = Math.max(0, size + i12);
        g5 g5Var = this.f47144b;
        g5Var.v.measure(View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE), i11);
        int measuredWidth = g5Var.v.getMeasuredWidth();
        setMeasuredDimension(Math.max(0, measuredWidth - i12), g5Var.v.getMeasuredHeight());
    }
}
