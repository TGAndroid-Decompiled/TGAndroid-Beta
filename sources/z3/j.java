package z3;

import android.view.View;
import org.telegram.messenger.b20;
import org.telegram.messenger.k9;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.x31;
import zh.k3;
public final class j implements g9.k, r1, b20, k9 {
    public final int f59629a;

    public j(int i7) {
        this.f59629a = i7;
    }

    @Override
    public Boolean a(x31 x31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.FALSE;
    }

    @Override
    public Object apply(Object obj) {
        return (r) obj;
    }

    @Override
    public void g(u1 u1Var, int i7) {
        switch (this.f59629a) {
            case 1:
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
        int i7 = k3.f60416c2;
        return 0;
    }
}
