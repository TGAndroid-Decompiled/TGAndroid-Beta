package vf;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.j51;
public final class j0 implements c2, Utilities.Callback5 {
    public final int f49067a;
    public final l0 f49068b;

    public j0(l0 l0Var, int i10) {
        this.f49067a = i10;
        this.f49068b = l0Var;
    }

    @Override
    public void j(d2 d2Var, int i10) {
        switch (this.f49067a) {
            case 0:
                this.f49068b.a0();
                return;
            case 1:
                this.f49068b.finishFragment();
                return;
            default:
                this.f49068b.a0();
                return;
        }
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        l0.W(this.f49068b, (j51) obj, (View) obj2);
    }
}
