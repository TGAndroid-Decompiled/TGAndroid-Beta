package zh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class j3 extends s61 {
    static {
        s61.setup(new s61());
    }

    public static t61 a(String str) {
        t61 K = t61.K(j3.class);
        K.f32875l = str;
        return K;
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        ((k3) view).set(t61Var.f32875l);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        return new k3(context, u6Var);
    }
}
