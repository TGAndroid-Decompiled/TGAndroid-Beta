package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
public final class q extends o61 {
    static {
        o61.setup(new o61());
    }

    public static p61 a(String str, CharSequence charSequence, int i10) {
        p61 J = p61.J(q.class);
        J.f17126b = false;
        J.f29747z = i10;
        J.f29734l = str;
        J.f29735m = charSequence;
        return J;
    }

    @Override
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        ((r) view).a(p61Var.f29734l, p61Var.f29735m, p61Var.f29747z);
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new r(context, 0, e6Var);
    }
}
