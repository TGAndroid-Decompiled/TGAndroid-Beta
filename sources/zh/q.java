package zh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
public final class q extends g51 {
    static {
        g51.setup(new g51());
    }

    public static h51 a(String str, CharSequence charSequence, int i10) {
        h51 J = h51.J(q.class);
        J.f44099b = false;
        J.f26634z = i10;
        J.f26621l = str;
        J.f26622m = charSequence;
        return J;
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        ((r) view).a(h51Var.f26621l, h51Var.f26622m, h51Var.f26634z);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new r(context, 0, f6Var);
    }
}
