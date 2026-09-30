package vg;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Components.sq;
public final class d0 extends e9 {
    public final d6 v;

    public d0(Context context, d6 d6Var) {
        super(context, d6Var);
        this.v = d6Var;
    }

    public void setBackground(boolean z10) {
        int i10;
        Context context = getContext();
        if (z10) {
            i10 = R.drawable.greydivider_bottom;
        } else {
            i10 = R.drawable.greydivider;
        }
        int i11 = h6.f19040b7;
        d6 d6Var = this.v;
        sq sqVar = new sq(new ColorDrawable(h6.v0(h6.f19020a7, d6Var)), h6.U0(context, i10, h6.v0(i11, d6Var)), 0, 0);
        sqVar.f28328w = true;
        setBackground(sqVar);
    }
}
