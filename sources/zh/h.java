package zh;

import android.view.View;
import org.telegram.messenger.b20;
import org.telegram.messenger.k9;
import org.telegram.ui.Components.r31;
public final class h implements org.telegram.ui.ActionBar.r1, b20, k9 {
    public final int f60216a;

    public h(int i7) {
        this.f60216a = i7;
    }

    @Override
    public Boolean a(r31 r31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.FALSE;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f60216a) {
            case 0:
                u1Var.dismiss();
                return;
            default:
                u1Var.dismiss();
                return;
        }
    }

    @Override
    public Object j(Object obj) {
        Integer num = (Integer) obj;
        int i7 = l3.f60314c2;
        return 0;
    }
}
