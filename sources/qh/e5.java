package qh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class e5 extends ViewGroup {
    public final int f46368a;
    public final f5 f46369b;

    public e5(f5 f5Var, Context context) {
        super(context);
        this.f46369b = f5Var;
        this.f46368a = AndroidUtilities.dp(16.0f);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        f5 f5Var = this.f46369b;
        int measuredWidth = f5Var.v.getMeasuredWidth();
        int measuredHeight = f5Var.v.getMeasuredHeight();
        h5 h5Var = f5Var.v;
        int i13 = this.f46368a;
        h5Var.layout(-i13, 0, measuredWidth - i13, measuredHeight);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int i11 = this.f46368a;
        int max = Math.max(0, size + i11);
        f5 f5Var = this.f46369b;
        f5Var.v.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), i10);
        int measuredWidth = f5Var.v.getMeasuredWidth();
        setMeasuredDimension(Math.max(0, measuredWidth - i11), f5Var.v.getMeasuredHeight());
    }
}
