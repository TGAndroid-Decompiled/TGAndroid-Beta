package yh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public final class o3 extends org.telegram.ui.ActionBar.e1 {
    public final int L;
    public long M;
    public m3 N;

    public o3(Context context, int i10, c6 c6Var) {
        super(0, context, c6Var, false, false);
        this.L = i10;
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        c(g6.w0(g6.E8, c6Var), g6.w0(g6.F8, c6Var));
        setIconColor(-1);
        this.f19721c.setTranslationX(AndroidUtilities.dp(2.0f));
        this.f19721c.setScaleX(1.2f);
        this.f19721c.setScaleY(1.2f);
        a(2);
        setBackground(null);
        this.f19721c.addOnAttachStateChangeListener(new bi.j2(this, 13));
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
