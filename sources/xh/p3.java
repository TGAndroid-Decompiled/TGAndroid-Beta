package xh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
public final class p3 extends org.telegram.ui.ActionBar.e1 {
    public final int L;
    public long M;
    public n3 N;

    public p3(Context context, int i10, c6 c6Var) {
        super(0, context, c6Var, false, false);
        this.L = i10;
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        c(h6.w0(h6.E8, c6Var), h6.w0(h6.F8, c6Var));
        setIconColor(-1);
        this.f20324c.setTranslationX(AndroidUtilities.dp(2.0f));
        this.f20324c.setScaleX(1.2f);
        this.f20324c.setScaleY(1.2f);
        a(2);
        setBackground(null);
        this.f20324c.addOnAttachStateChangeListener(new ai.v2(this, 13));
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
