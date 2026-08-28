package pf;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.l41;
public final class k0 implements b2, Utilities.Callback5 {
    public final int f45659a;
    public final m0 f45660b;

    public k0(m0 m0Var, int i9) {
        this.f45659a = i9;
        this.f45660b = m0Var;
    }

    @Override
    public void f(c2 c2Var, int i9) {
        switch (this.f45659a) {
            case 0:
                this.f45660b.Z();
                return;
            case 1:
                this.f45660b.finishFragment();
                return;
            default:
                this.f45660b.Z();
                return;
        }
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        m0.V(this.f45660b, (l41) obj, (View) obj2);
    }
}
