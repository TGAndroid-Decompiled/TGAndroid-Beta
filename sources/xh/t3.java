package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public final class t3 extends org.telegram.ui.ActionBar.e1 {
    public final int L;
    public long M;
    public r3 N;

    public t3(Context context, int i10, d6 d6Var) {
        super(0, context, d6Var, false, false);
        this.L = i10;
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        int v02 = h6.v0(h6.E8, d6Var);
        int i11 = h6.F8;
        c(v02, h6.v0(i11, d6Var));
        e(h6.v0(i11, d6Var), PorterDuff.Mode.SRC_IN);
        this.f18835c.setTranslationX(AndroidUtilities.dp(2.0f));
        a(2);
        setBackground(null);
        this.f18835c.addOnAttachStateChangeListener(new ai.u2(this, 14));
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
