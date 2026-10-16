package yh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.zb;
public final class n2 extends l61 {
    public static final int f49035a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        Typeface typeface;
        da0 da0Var = (da0) view;
        da0Var.setGravity(m61Var.f26959z);
        da0Var.setTextColor((int) m61Var.B);
        da0Var.setTextSize(1, m61Var.A);
        if (m61Var.f26951q) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        da0Var.setTypeface(typeface);
        int i10 = m61Var.f26943i;
        da0Var.setPadding(i10, 0, i10, m61Var.f26945k);
        da0Var.setText(m61Var.f26946l);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new zb(context, 5, null);
    }
}
