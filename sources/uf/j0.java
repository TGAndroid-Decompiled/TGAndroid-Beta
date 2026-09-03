package uf;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.i51;
public final class j0 implements c2, Utilities.Callback5 {
    public final int f45388a;
    public final l0 f45389b;

    public j0(l0 l0Var, int i10) {
        this.f45388a = i10;
        this.f45389b = l0Var;
    }

    @Override
    public void l(d2 d2Var, int i10) {
        switch (this.f45388a) {
            case 0:
                this.f45389b.a0();
                return;
            case 1:
                this.f45389b.finishFragment();
                return;
            default:
                this.f45389b.a0();
                return;
        }
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        l0.W(this.f45389b, (i51) obj, (View) obj2);
    }
}
