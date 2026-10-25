package zh;

import android.content.Context;
import android.view.View;
import bi.i6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
public final class p3 extends org.telegram.ui.ActionBar.g1 {
    public final int V;
    public long W;
    public n3 f53210a0;

    public p3(Context context, int i10, u6 u6Var) {
        super(0, context, u6Var, false, false);
        this.V = i10;
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        c(y6.E8, y6.F8);
        setIconColor(-1);
        this.f22636c.setTranslationX(AndroidUtilities.dp(2.0f));
        this.f22636c.setScaleX(1.2f);
        this.f22636c.setScaleY(1.2f);
        a(2);
        setBackground(null);
        this.f22636c.addOnAttachStateChangeListener(new i6(this, 15));
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
