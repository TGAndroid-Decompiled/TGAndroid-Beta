package wg;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.d9;
import org.telegram.ui.Components.zq;
public final class d0 extends d9 {
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
        int i11 = h6.f20952b7;
        d6 d6Var = this.v;
        zq zqVar = new zq(new ColorDrawable(h6.w0(h6.f20932a7, d6Var)), h6.V0(context, i10, h6.w0(i11, d6Var)), 0, 0);
        zqVar.f33024w = true;
        setBackground(zqVar);
    }
}
