package zh;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class l5 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final TextView f48644a;
    public final View f48645b;
    public final TextView f48646c;
    public final n5 d;

    public l5(n5 n5Var, TextView textView, View view, TextView textView2) {
        this.d = n5Var;
        this.f48644a = textView;
        this.f48645b = view;
        this.f48646c = textView2;
    }

    @Override
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        TextView textView = this.f48644a;
        textView.getLocationOnScreen(iArr);
        int dp = AndroidUtilities.dp(24.0f) + iArr[1];
        int measuredHeight = this.f48645b.getMeasuredHeight();
        n5 n5Var = this.d;
        if (dp > measuredHeight) {
            textView.setLayoutParams(w7.a6.k(0.0f, 13.0f, 0.0f, 0.0f, -2, -2));
            this.f48646c.setLayoutParams(w7.a6.k(68.0f, 8.0f, 68.0f, 13.0f, -2, -2));
            n5Var.requestLayout();
        }
        n5Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
