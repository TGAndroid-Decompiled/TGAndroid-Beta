package yh;

import ai.n6;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public final class n3 extends org.telegram.ui.ActionBar.e1 {
    public final int V;
    public long W;
    public l3 f50880a0;

    public n3(Context context, int i10, g6 g6Var) {
        super(0, context, g6Var, false, false);
        this.V = i10;
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        c(k6.E8, k6.F8);
        setIconColor(-1);
        this.f20837c.setTranslationX(AndroidUtilities.dp(2.0f));
        this.f20837c.setScaleX(1.2f);
        this.f20837c.setScaleY(1.2f);
        a(2);
        setBackground(null);
        this.f20837c.addOnAttachStateChangeListener(new n6(this, 14));
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
