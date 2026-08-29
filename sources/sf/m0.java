package sf;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.w41;
import org.telegram.ui.tn;
public final class m0 implements b2, Utilities.Callback5 {
    public final int f47882a;
    public final n0 f47883b;

    public m0(n0 n0Var, int i10) {
        this.f47882a = i10;
        this.f47883b = n0Var;
    }

    @Override
    public void g(c2 c2Var, int i10) {
        switch (this.f47882a) {
            case 0:
                this.f47883b.X();
                return;
            default:
                this.f47883b.finishFragment();
                return;
        }
    }

    @Override
    public void mo19run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        w41 w41Var = (w41) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        n0 n0Var = this.f47883b;
        if (!n0Var.d.h(w41Var)) {
            int i10 = w41Var.d;
            if (i10 != 2 && w41Var.f50845a != 17) {
                if (i10 == 1) {
                    n0Var.f47900s = !n0Var.f47900s;
                    n0Var.f47895c.U2.N(true);
                    n0Var.V(true);
                    return;
                } else if (i10 == 3) {
                    w wVar = n0Var.d;
                    n0Var.v = true;
                    wVar.h = true;
                    n0Var.f47895c.U2.N(true);
                    n0Var.V(true);
                    return;
                } else if (i10 == 4) {
                    w wVar2 = n0Var.d;
                    n0Var.v = false;
                    wVar2.h = false;
                    n0Var.f47895c.U2.N(true);
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
            n0Var.presentFragment(new tn(bundle));
        }
    }
}
