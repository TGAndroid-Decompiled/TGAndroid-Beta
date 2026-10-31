package th;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
public final class g5 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final TextView f49000a;
    public final View f49001b;
    public final TextView f49002c;
    public final i5 d;

    public g5(i5 i5Var, TextView textView, View view, TextView textView2) {
        this.d = i5Var;
        this.f49000a = textView;
        this.f49001b = view;
        this.f49002c = textView2;
    }

    @Override
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.f49000a;
        textView.getLocationOnScreen(iArr);
        int L = org.telegram.messenger.i0.L(24.0f) + iArr[1];
        int measuredHeight = this.f49001b.getMeasuredHeight();
        i5 i5Var = this.d;
        if (L > measuredHeight) {
            textView.setLayoutParams(w7.b6.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.f49002c.setLayoutParams(w7.b6.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            i5Var.requestLayout();
        }
        i5Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
