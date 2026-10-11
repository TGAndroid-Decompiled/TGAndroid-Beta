package xh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.zb;
public final class p2 extends p61 {
    public static final int f51576a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        Typeface typeface;
        ea0 ea0Var = (ea0) view;
        ea0Var.setGravity(q61Var.f30180z);
        ea0Var.setTextColor((int) q61Var.B);
        ea0Var.setTextSize(1, q61Var.A);
        if (q61Var.f30172q) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        ea0Var.setTypeface(typeface);
        int i10 = q61Var.f30164i;
        ea0Var.setPadding(i10, 0, i10, q61Var.f30166k);
        ea0Var.setText(q61Var.f30167l);
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, d6 d6Var) {
        return new zb(context, 5, null);
    }
}
