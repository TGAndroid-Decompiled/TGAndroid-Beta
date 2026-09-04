package wg;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Components.oq;
public final class d0 extends e9 {
    public final f6 v;

    public d0(Context context, f6 f6Var) {
        super(context, f6Var);
        this.v = f6Var;
    }

    public void setBackground(boolean z10) {
        int i10;
        Context context = getContext();
        if (z10) {
            i10 = R.drawable.greydivider_bottom;
        } else {
            i10 = R.drawable.greydivider;
        }
        int i11 = j6.f20627b7;
        f6 f6Var = this.v;
        oq oqVar = new oq(new ColorDrawable(j6.v0(j6.f20607a7, f6Var)), j6.U0(context, i10, j6.v0(i11, f6Var)), 0, 0);
        oqVar.f29167w = true;
        setBackground(oqVar);
    }
}
