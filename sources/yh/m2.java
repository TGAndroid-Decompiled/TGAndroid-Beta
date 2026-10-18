package yh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xb;
public final class m2 extends e61 {
    public static final int f50397a = 0;

    static {
        e61.setup(new e61());
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        Typeface typeface;
        x90 x90Var = (x90) view;
        x90Var.setGravity(f61Var.f26153z);
        x90Var.setTextColor((int) f61Var.B);
        x90Var.setTextSize(1, f61Var.A);
        if (f61Var.f26145q) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        x90Var.setTypeface(typeface);
        int i10 = f61Var.f26137i;
        x90Var.setPadding(i10, 0, i10, f61Var.f26139k);
        x90Var.setText(f61Var.f26140l);
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new xb(context, 5, null);
    }
}
