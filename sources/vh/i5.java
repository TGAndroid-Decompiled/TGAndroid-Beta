package vh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class i5 extends ViewGroup {
    public final int f46018a;
    public final j5 f46019b;

    public i5(j5 j5Var, Context context) {
        super(context);
        this.f46019b = j5Var;
        this.f46018a = AndroidUtilities.dp(16.0f);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        j5 j5Var = this.f46019b;
        int measuredWidth = j5Var.v.getMeasuredWidth();
        int measuredHeight = j5Var.v.getMeasuredHeight();
        l5 l5Var = j5Var.v;
        int i14 = this.f46018a;
        l5Var.layout(-i14, 0, measuredWidth - i14, measuredHeight);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int i12 = this.f46018a;
        int max = Math.max(0, size + i12);
        j5 j5Var = this.f46019b;
        j5Var.v.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), i11);
        int measuredWidth = j5Var.v.getMeasuredWidth();
        setMeasuredDimension(Math.max(0, measuredWidth - i12), j5Var.v.getMeasuredHeight());
    }
}
