package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public final class r3 extends org.telegram.ui.ActionBar.e1 {
    public final int L;
    public long M;
    public p3 N;

    public r3(Context context, int i10, c6 c6Var) {
        super(0, context, c6Var, false, false);
        this.L = i10;
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        int w02 = g6.w0(g6.E8, c6Var);
        int i11 = g6.F8;
        c(w02, g6.w0(i11, c6Var));
        e(g6.w0(i11, c6Var), PorterDuff.Mode.SRC_IN);
        this.f19721c.setTranslationX(AndroidUtilities.dp(2.0f));
        a(2);
        setBackground(null);
        this.f19721c.addOnAttachStateChangeListener(new bi.j2(this, 14));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = AndroidUtilities.dp(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i11);
    }
}
