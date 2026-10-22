package yh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xb;
public final class m2 extends g61 {
    public static final int f50406a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        Typeface typeface;
        x90 x90Var = (x90) view;
        x90Var.setGravity(h61Var.f26798z);
        x90Var.setTextColor((int) h61Var.B);
        x90Var.setTextSize(1, h61Var.A);
        if (h61Var.f26790q) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        x90Var.setTypeface(typeface);
        int i10 = h61Var.f26782i;
        x90Var.setPadding(i10, 0, i10, h61Var.f26784k);
        x90Var.setText(h61Var.f26785l);
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, d6 d6Var) {
        return new xb(context, 5, null);
    }
}
