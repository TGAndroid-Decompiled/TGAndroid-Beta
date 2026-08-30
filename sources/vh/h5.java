package vh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class h5 extends ViewGroup {
    public final int f45921a;
    public final i5 f45922b;

    public h5(i5 i5Var, Context context) {
        super(context);
        this.f45922b = i5Var;
        this.f45921a = AndroidUtilities.dp(16.0f);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        i5 i5Var = this.f45922b;
        int measuredWidth = i5Var.v.getMeasuredWidth();
        int measuredHeight = i5Var.v.getMeasuredHeight();
        k5 k5Var = i5Var.v;
        int i14 = this.f45921a;
        k5Var.layout(-i14, 0, measuredWidth - i14, measuredHeight);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int i12 = this.f45921a;
        int max = Math.max(0, size + i12);
        i5 i5Var = this.f45922b;
        i5Var.v.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), i11);
        int measuredWidth = i5Var.v.getMeasuredWidth();
        setMeasuredDimension(Math.max(0, measuredWidth - i12), i5Var.v.getMeasuredHeight());
    }
}
