package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
public final class i3 extends e61 {
    static {
        e61.setup(new e61());
    }

    public static f61 a(String str) {
        f61 J = f61.J(i3.class);
        J.f26147l = str;
        return J;
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        ((j3) view).set(f61Var.f26147l);
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new j3(context, d6Var);
    }
}
