package uf;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.i51;
public final class d1 implements Utilities.Callback5, Utilities.Callback5Return {
    public final m1 f45344a;

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        m1.W(this.f45344a, (i51) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z4;
        i51 i51Var = (i51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (i51Var.f1830a == 16) {
            Object obj6 = i51Var.G;
            if (!(obj6 instanceof o1) || !((o1) obj6).f45475g) {
                this.f45344a.e0(i51Var, view);
                z4 = true;
                return Boolean.valueOf(z4);
            }
        }
        z4 = false;
        return Boolean.valueOf(z4);
    }
}
