package yh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xb;
public final class m2 extends f61 {
    public static final int f50396a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        Typeface typeface;
        x90 x90Var = (x90) view;
        x90Var.setGravity(g61Var.f26512z);
        x90Var.setTextColor((int) g61Var.B);
        x90Var.setTextSize(1, g61Var.A);
        if (g61Var.f26504q) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        x90Var.setTypeface(typeface);
        int i10 = g61Var.f26496i;
        x90Var.setPadding(i10, 0, i10, g61Var.f26498k);
        x90Var.setText(g61Var.f26499l);
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new xb(context, 5, null);
    }
}
