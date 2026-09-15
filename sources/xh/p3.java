package xh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
public final class p3 extends org.telegram.ui.ActionBar.f1 {
    public final int L;
    public long M;
    public n3 N;

    public p3(Context context, int i10, e6 e6Var) {
        super(0, context, e6Var, false, false);
        this.L = i10;
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        c(i6.v0(i6.E8, e6Var), i6.v0(i6.F8, e6Var));
        setIconColor(-1);
        this.f18625c.setTranslationX(AndroidUtilities.dp(2.0f));
        this.f18625c.setScaleX(1.2f);
        this.f18625c.setScaleY(1.2f);
        a(2);
        setBackground(null);
        this.f18625c.addOnAttachStateChangeListener(new ai.u2(this, 12));
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
