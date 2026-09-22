package xh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;
public final class p2 extends x51 {
    public static final int f46388a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        Typeface typeface;
        n90 n90Var = (n90) view;
        n90Var.setGravity(y51Var.f30531z);
        n90Var.setTextColor((int) y51Var.B);
        n90Var.setTextSize(1, y51Var.A);
        if (y51Var.f30523q) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        n90Var.setTypeface(typeface);
        int i10 = y51Var.f30515i;
        n90Var.setPadding(i10, 0, i10, y51Var.f30517k);
        n90Var.setText(y51Var.f30518l);
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, f6 f6Var) {
        return new wb(context, 5, null);
    }
}
