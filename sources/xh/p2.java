package xh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
public final class p2 extends o61 {
    public static final int f51453a = 0;

    static {
        o61.setup(new o61());
    }

    @Override
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        Typeface typeface;
        ea0 ea0Var = (ea0) view;
        ea0Var.setGravity(p61Var.f29747z);
        ea0Var.setTextColor((int) p61Var.B);
        ea0Var.setTextSize(1, p61Var.A);
        if (p61Var.f29739q) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        ea0Var.setTypeface(typeface);
        int i10 = p61Var.f29731i;
        ea0Var.setPadding(i10, 0, i10, p61Var.f29733k);
        ea0Var.setText(p61Var.f29734l);
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, e6 e6Var) {
        return new ac(context, 5, null);
    }
}
