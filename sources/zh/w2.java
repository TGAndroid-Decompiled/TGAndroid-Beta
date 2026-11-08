package zh;

import android.content.Context;
import android.view.View;
import bi.m6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
public final class w2 extends org.telegram.ui.ActionBar.z0 {
    public final int V;
    public long W;
    public u2 f60575a0;

    public w2(int i7, Context context, f6 f6Var) {
        super(0, context, f6Var, false, false);
        this.V = i7;
        setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        c(k6.E8, k6.F8);
        setIconColor(-1);
        this.f28816c.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        this.f28816c.setScaleX(1.2f);
        this.f28816c.setScaleY(1.2f);
        a(2);
        setBackground(null);
        this.f28816c.addOnAttachStateChangeListener(new m6(this, 14));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        if (View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE) {
            size = org.telegram.messenger.g0.L(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i10);
    }
}
