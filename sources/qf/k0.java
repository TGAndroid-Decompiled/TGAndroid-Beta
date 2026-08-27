package qf;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.n41;

public final class k0 implements a2, Utilities.Callback5 {

    public final int f46330a;

    public final m0 f46331b;

    public k0(m0 m0Var, int i10) {
        this.f46330a = i10;
        this.f46331b = m0Var;
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f46330a) {
            case 0:
                this.f46331b.a0();
                break;
            case 1:
                this.f46331b.finishFragment();
                break;
            default:
                this.f46331b.a0();
                break;
        }
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        m0.W(this.f46331b, (n41) obj, (View) obj2);
    }
}
