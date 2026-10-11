package vg;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Components.fr;
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
        int i11 = h6.f20786b7;
        d6 d6Var = this.v;
        fr frVar = new fr(new ColorDrawable(h6.w0(h6.f20766a7, d6Var)), h6.V0(context, i10, h6.w0(i11, d6Var)), 0, 0);
        frVar.f26552w = true;
        setBackground(frVar);
    }
}
