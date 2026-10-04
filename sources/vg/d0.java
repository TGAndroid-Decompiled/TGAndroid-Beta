package vg;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
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
        int i11 = i6.f20782b7;
        d6 d6Var = this.v;
        sq sqVar = new sq(new ColorDrawable(i6.v0(i6.f20762a7, d6Var)), i6.U0(context, i10, i6.v0(i11, d6Var)), 0, 0);
        sqVar.f30857w = true;
        setBackground(sqVar);
    }
}
