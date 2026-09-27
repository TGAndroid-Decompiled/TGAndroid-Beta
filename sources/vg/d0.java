package vg;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Components.rq;
public final class d0 extends e9 {
    public final e6 v;

    public d0(Context context, e6 e6Var) {
        super(context, e6Var);
        this.v = e6Var;
    }

    public void setBackground(boolean z10) {
        int i10;
        Context context = getContext();
        if (z10) {
            i10 = R.drawable.greydivider_bottom;
        } else {
            i10 = R.drawable.greydivider;
        }
        int i11 = i6.f19021b7;
        e6 e6Var = this.v;
        rq rqVar = new rq(new ColorDrawable(i6.v0(i6.f19001a7, e6Var)), i6.U0(context, i10, i6.v0(i11, e6Var)), 0, 0);
        rqVar.f28069w = true;
        setBackground(rqVar);
    }
}
