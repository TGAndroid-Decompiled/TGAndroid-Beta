package vf;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.h51;
import org.telegram.ui.xn;
public final class m0 implements c2, Utilities.Callback5 {
    public final int f49166a;
    public final n0 f49167b;

    public m0(n0 n0Var, int i10) {
        this.f49166a = i10;
        this.f49167b = n0Var;
    }

    @Override
    public void j(d2 d2Var, int i10) {
        switch (this.f49166a) {
            case 0:
                this.f49167b.X();
                return;
            default:
                this.f49167b.finishFragment();
                return;
        }
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        h51 h51Var = (h51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        n0 n0Var = this.f49167b;
        if (!n0Var.d.h(h51Var)) {
            int i10 = h51Var.d;
            if (i10 != 2 && h51Var.f2505a != 17) {
                if (i10 == 1) {
                    n0Var.f49183s = !n0Var.f49183s;
                    n0Var.f49178c.V2.N(true);
                    n0Var.V(true);
                    return;
                } else if (i10 == 3) {
                    v vVar = n0Var.d;
                    n0Var.v = true;
                    vVar.h = true;
                    n0Var.f49178c.V2.N(true);
                    n0Var.V(true);
                    return;
                } else if (i10 == 4) {
                    v vVar2 = n0Var.d;
                    n0Var.v = false;
                    vVar2.h = false;
                    n0Var.f49178c.V2.N(true);
                    n0Var.V(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", n0Var.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            n0Var.presentFragment(new xn(bundle));
        }
    }
}
