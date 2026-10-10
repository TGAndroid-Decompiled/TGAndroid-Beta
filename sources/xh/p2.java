package xh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
public final class p2 extends p61 {
    public static final int f51499a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        Typeface typeface;
        fa0 fa0Var = (fa0) view;
        fa0Var.setGravity(q61Var.f30076z);
        fa0Var.setTextColor((int) q61Var.B);
        fa0Var.setTextSize(1, q61Var.A);
        if (q61Var.f30068q) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        fa0Var.setTypeface(typeface);
        int i10 = q61Var.f30060i;
        fa0Var.setPadding(i10, 0, i10, q61Var.f30062k);
        fa0Var.setText(q61Var.f30063l);
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, e6 e6Var) {
        return new ac(context, 5, null);
    }
}
