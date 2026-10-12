package yh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.zb;
public final class n2 extends k61 {
    public static final int f49036a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        Typeface typeface;
        da0 da0Var = (da0) view;
        da0Var.setGravity(l61Var.f26967z);
        da0Var.setTextColor((int) l61Var.B);
        da0Var.setTextSize(1, l61Var.A);
        if (l61Var.f26959q) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        da0Var.setTypeface(typeface);
        int i10 = l61Var.f26951i;
        da0Var.setPadding(i10, 0, i10, l61Var.f26953k);
        da0Var.setText(l61Var.f26954l);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new zb(context, 5, null);
    }
}
