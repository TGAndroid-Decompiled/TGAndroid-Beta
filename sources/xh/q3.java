package xh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public final class q3 extends org.telegram.ui.ActionBar.e1 {
    public final int L;
    public long M;
    public o3 N;

    public q3(Context context, int i10, d6 d6Var) {
        super(0, context, d6Var, false, false);
        this.L = i10;
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        c(h6.v0(h6.E8, d6Var), h6.v0(h6.F8, d6Var));
        setIconColor(-1);
        this.f18820c.setTranslationX(AndroidUtilities.dp(2.0f));
        this.f18820c.setScaleX(1.2f);
        this.f18820c.setScaleY(1.2f);
        a(2);
        setBackground(null);
        this.f18820c.addOnAttachStateChangeListener(new ai.u2(this, 13));
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
