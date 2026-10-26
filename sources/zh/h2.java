package zh;

import android.content.Context;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.vs0;
public final class h2 extends r71 {
    public final vs0 f53025n3;

    public h2(Context context, int i10, q0 q0Var, g2 g2Var, g2 g2Var2, u6 u6Var, vs0 vs0Var) {
        super(context, i10, 0, false, q0Var, g2Var, g2Var2, u6Var, 3, 1);
        this.f53025n3 = vs0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f53025n3.p();
    }
}
