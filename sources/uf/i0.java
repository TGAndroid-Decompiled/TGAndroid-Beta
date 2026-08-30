package uf;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.i51;
public final class i0 implements c2, Utilities.Callback5 {
    public final int f45317a;
    public final k0 f45318b;

    public i0(k0 k0Var, int i10) {
        this.f45317a = i10;
        this.f45318b = k0Var;
    }

    @Override
    public void i(d2 d2Var, int i10) {
        switch (this.f45317a) {
            case 0:
                this.f45318b.a0();
                return;
            case 1:
                this.f45318b.finishFragment();
                return;
            default:
                this.f45318b.a0();
                return;
        }
    }

    @Override
    public void mo28run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        k0.W(this.f45318b, (i51) obj, (View) obj2);
    }
}
