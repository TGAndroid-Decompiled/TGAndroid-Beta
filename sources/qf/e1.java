package qf;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.n41;

public final class e1 implements Utilities.Callback5, Utilities.Callback5Return {

    public final n1 f46284a;

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        n1.W(this.f46284a, (n41) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        n41 n41Var = (n41) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (n41Var.f49413a == 16) {
            Object obj6 = n41Var.G;
            if ((obj6 instanceof p1) && ((p1) obj6).f46423g) {
                z10 = false;
            } else {
                this.f46284a.e0(n41Var, view);
                z10 = true;
            }
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
