package uf;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.i51;
import org.telegram.ui.zn;
public final class m0 implements c2, Utilities.Callback5 {
    public final int f45445a;
    public final n0 f45446b;

    public m0(n0 n0Var, int i10) {
        this.f45445a = i10;
        this.f45446b = n0Var;
    }

    @Override
    public void l(d2 d2Var, int i10) {
        switch (this.f45445a) {
            case 0:
                this.f45446b.X();
                return;
            default:
                this.f45446b.finishFragment();
                return;
        }
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        i51 i51Var = (i51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        n0 n0Var = this.f45446b;
        if (!n0Var.d.h(i51Var)) {
            int i10 = i51Var.d;
            if (i10 != 2 && i51Var.f1830a != 17) {
                if (i10 == 1) {
                    n0Var.f45459s = !n0Var.f45459s;
                    n0Var.f45455c.V2.N(true);
                    n0Var.V(true);
                    return;
                } else if (i10 == 3) {
                    v vVar = n0Var.d;
                    n0Var.v = true;
                    vVar.h = true;
                    n0Var.f45455c.V2.N(true);
                    n0Var.V(true);
                    return;
                } else if (i10 == 4) {
                    v vVar2 = n0Var.d;
                    n0Var.v = false;
                    vVar2.h = false;
                    n0Var.f45455c.V2.N(true);
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
            n0Var.presentFragment(new zn(bundle));
        }
    }
}
