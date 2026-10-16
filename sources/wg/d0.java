package wg;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Components.cr;
public final class d0 extends e9 {
    public final c6 v;

    public d0(Context context, c6 c6Var) {
        super(context, c6Var);
        this.v = c6Var;
    }

    public void setBackground(boolean z10) {
        int i10;
        Context context = getContext();
        if (z10) {
            i10 = R.drawable.greydivider_bottom;
        } else {
            i10 = R.drawable.greydivider;
        }
        int i11 = g6.f19563b7;
        c6 c6Var = this.v;
        cr crVar = new cr(new ColorDrawable(g6.w0(g6.f19543a7, c6Var)), g6.V0(context, i10, g6.w0(i11, c6Var)), 0, 0);
        crVar.f23883w = true;
        setBackground(crVar);
    }
}
