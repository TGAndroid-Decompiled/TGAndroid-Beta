package vf;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.h51;
public final class i0 implements c2, Utilities.Callback5 {
    public final int f49097a;
    public final l0 f49098b;

    public i0(l0 l0Var, int i10) {
        this.f49097a = i10;
        this.f49098b = l0Var;
    }

    @Override
    public void j(d2 d2Var, int i10) {
        switch (this.f49097a) {
            case 0:
                this.f49098b.a0();
                return;
            case 1:
                this.f49098b.finishFragment();
                return;
            default:
                this.f49098b.a0();
                return;
        }
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        l0.W(this.f49098b, (h51) obj, (View) obj2);
    }
}
