package yh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.y90;
public final class m2 extends l61 {
    public static final int f50863a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        g6 g6Var;
        y90 y90Var = (y90) view;
        y90Var.setGravity(m61Var.f28572z);
        Object obj = m61Var.H;
        Typeface typeface = null;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = m61Var.G;
            if (obj2 instanceof g6) {
                g6Var = (g6) obj2;
            } else {
                g6Var = null;
            }
            r6.W(y90Var, intValue, g6Var);
        } else {
            r6.r(y90Var);
            y90Var.setTextColor((int) m61Var.B);
        }
        y90Var.setTextSize(1, m61Var.A);
        if (m61Var.f28564q) {
            typeface = AndroidUtilities.bold();
        }
        y90Var.setTypeface(typeface);
        int i10 = m61Var.f28556i;
        y90Var.setPadding(i10, 0, i10, m61Var.f28558k);
        y90Var.setText(m61Var.f28559l);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, g6 g6Var) {
        return new xb(context, 5, null);
    }
}
