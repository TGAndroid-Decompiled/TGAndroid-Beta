package ph;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
public final class c3 extends org.telegram.ui.ActionBar.b1 {
    public final int V;
    public long W;
    public a3 f45025a0;

    public c3(int i10, Context context, p6 p6Var) {
        super(0, context, p6Var, false, false);
        this.V = i10;
        setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        c(t6.E8, t6.F8);
        setIconColor(-1);
        this.f20167c.setTranslationX(org.telegram.messenger.i0.L(2.0f));
        this.f20167c.setScaleX(1.2f);
        this.f20167c.setScaleY(1.2f);
        a(2);
        setBackground(null);
        this.f20167c.addOnAttachStateChangeListener(new l.d(this, 12));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = org.telegram.messenger.i0.L(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i11);
    }
}
