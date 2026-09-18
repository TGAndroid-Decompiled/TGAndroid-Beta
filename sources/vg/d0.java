package vg;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Components.pq;
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
        int i11 = j6.f19026b7;
        e6 e6Var = this.v;
        pq pqVar = new pq(new ColorDrawable(j6.v0(j6.f19006a7, e6Var)), j6.U0(context, i10, j6.v0(i11, e6Var)), 0, 0);
        pqVar.f27303w = true;
        setBackground(pqVar);
    }
}
