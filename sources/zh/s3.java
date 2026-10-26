package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import bi.i6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
public final class s3 extends org.telegram.ui.ActionBar.g1 {
    public final int V;
    public long W;
    public q3 f53248a0;

    public s3(Context context, int i10, u6 u6Var) {
        super(0, context, u6Var, false, false);
        this.V = i10;
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        int i11 = y6.E8;
        int i12 = y6.F8;
        c(i11, i12);
        g(y6.w0(i12, u6Var), PorterDuff.Mode.SRC_IN);
        this.f22638c.setTranslationX(AndroidUtilities.dp(2.0f));
        a(2);
        setBackground(null);
        this.f22638c.addOnAttachStateChangeListener(new i6(this, 16));
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
