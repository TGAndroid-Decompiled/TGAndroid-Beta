package sf;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.w41;
public final class j0 implements b2, Utilities.Callback5 {
    public final int f47826a;
    public final l0 f47827b;

    public j0(l0 l0Var, int i10) {
        this.f47826a = i10;
        this.f47827b = l0Var;
    }

    @Override
    public void g(c2 c2Var, int i10) {
        switch (this.f47826a) {
            case 0:
                this.f47827b.a0();
                return;
            case 1:
                this.f47827b.finishFragment();
                return;
            default:
                this.f47827b.a0();
                return;
        }
    }

    @Override
    public void mo19run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        l0.W(this.f47827b, (w41) obj, (View) obj2);
    }
}
