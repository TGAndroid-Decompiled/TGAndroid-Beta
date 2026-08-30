package uf;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.i51;
import org.telegram.ui.xn;
public final class l0 implements c2, Utilities.Callback5 {
    public final int f45370a;
    public final m0 f45371b;

    public l0(m0 m0Var, int i10) {
        this.f45370a = i10;
        this.f45371b = m0Var;
    }

    @Override
    public void i(d2 d2Var, int i10) {
        switch (this.f45370a) {
            case 0:
                this.f45371b.X();
                return;
            default:
                this.f45371b.finishFragment();
                return;
        }
    }

    @Override
    public void mo28run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        i51 i51Var = (i51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        m0 m0Var = this.f45371b;
        if (!m0Var.d.h(i51Var)) {
            int i10 = i51Var.d;
            if (i10 != 2 && i51Var.f1808a != 17) {
                if (i10 == 1) {
                    m0Var.f45386s = !m0Var.f45386s;
                    m0Var.f45382c.V2.N(true);
                    m0Var.V(true);
                    return;
                } else if (i10 == 3) {
                    v vVar = m0Var.d;
                    m0Var.v = true;
                    vVar.h = true;
                    m0Var.f45382c.V2.N(true);
                    m0Var.V(true);
                    return;
                } else if (i10 == 4) {
                    v vVar2 = m0Var.d;
                    m0Var.v = false;
                    vVar2.h = false;
                    m0Var.f45382c.V2.N(true);
                    m0Var.V(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", m0Var.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            m0Var.presentFragment(new xn(bundle));
        }
    }
}
