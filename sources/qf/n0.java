package qf;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.n41;
import org.telegram.ui.rn;

public final class n0 implements a2, Utilities.Callback5 {

    public final int f46391a;

    public final o0 f46392b;

    public n0(o0 o0Var, int i10) {
        this.f46391a = i10;
        this.f46392b = o0Var;
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f46391a) {
            case 0:
                this.f46392b.X();
                break;
            default:
                this.f46392b.finishFragment();
                break;
        }
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        n41 n41Var = (n41) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        o0 o0Var = this.f46392b;
        if (o0Var.d.h(n41Var)) {
            return;
        }
        int i10 = n41Var.d;
        if (i10 == 2 || n41Var.f49413a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", o0Var.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            o0Var.presentFragment(new rn(bundle));
            return;
        }
        if (i10 == 1) {
            o0Var.f46407s = !o0Var.f46407s;
            o0Var.f46402c.U2.N(true);
            o0Var.V(true);
        } else {
            if (i10 == 3) {
                x xVar = o0Var.d;
                o0Var.v = true;
                xVar.h = true;
                o0Var.f46402c.U2.N(true);
                o0Var.V(true);
                return;
            }
            if (i10 == 4) {
                x xVar2 = o0Var.d;
                o0Var.v = false;
                xVar2.h = false;
                o0Var.f46402c.U2.N(true);
                o0Var.V(true);
            }
        }
    }
}
