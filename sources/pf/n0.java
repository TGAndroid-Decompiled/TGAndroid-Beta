package pf;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.l41;
import org.telegram.ui.qn;
public final class n0 implements b2, Utilities.Callback5 {
    public final int f45720a;
    public final o0 f45721b;

    public n0(o0 o0Var, int i9) {
        this.f45720a = i9;
        this.f45721b = o0Var;
    }

    @Override
    public void f(c2 c2Var, int i9) {
        switch (this.f45720a) {
            case 0:
                this.f45721b.W();
                return;
            default:
                this.f45721b.finishFragment();
                return;
        }
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        l41 l41Var = (l41) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        o0 o0Var = this.f45721b;
        if (!o0Var.d.h(l41Var)) {
            int i9 = l41Var.d;
            if (i9 != 2 && l41Var.f48814a != 17) {
                if (i9 == 1) {
                    o0Var.f45737s = !o0Var.f45737s;
                    o0Var.f45732c.U2.N(true);
                    o0Var.U(true);
                    return;
                } else if (i9 == 3) {
                    x xVar = o0Var.d;
                    o0Var.v = true;
                    xVar.h = true;
                    o0Var.f45732c.U2.N(true);
                    o0Var.U(true);
                    return;
                } else if (i9 == 4) {
                    x xVar2 = o0Var.d;
                    o0Var.v = false;
                    xVar2.h = false;
                    o0Var.f45732c.U2.N(true);
                    o0Var.U(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", o0Var.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            o0Var.presentFragment(new qn(bundle));
        }
    }
}
