package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
public final class t3 extends org.telegram.ui.ActionBar.f1 {
    public final int L;
    public long M;
    public r3 N;

    public t3(Context context, int i10, e6 e6Var) {
        super(0, context, e6Var, false, false);
        this.L = i10;
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        int w02 = i6.w0(i6.E8, e6Var);
        int i11 = i6.F8;
        c(w02, i6.w0(i11, e6Var));
        e(i6.w0(i11, e6Var), PorterDuff.Mode.SRC_IN);
        this.f20581c.setTranslationX(AndroidUtilities.dp(2.0f));
        a(2);
        setBackground(null);
        this.f20581c.addOnAttachStateChangeListener(new ai.v2(this, 14));
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
