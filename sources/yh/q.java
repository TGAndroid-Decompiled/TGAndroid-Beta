package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
public final class q extends v51 {
    static {
        v51.setup(new v51());
    }

    public static w51 a(String str, CharSequence charSequence, int i10) {
        w51 J = w51.J(q.class);
        J.f15705b = false;
        J.f29961z = i10;
        J.f29948l = str;
        J.f29949m = charSequence;
        return J;
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        ((r) view).a(w51Var.f29948l, w51Var.f29949m, w51Var.f29961z);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new r(context, 0, f6Var);
    }
}
