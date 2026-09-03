package vf;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h51;
public final class d1 implements Utilities.Callback5, Utilities.Callback5Return {
    public final m1 f49057a;

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        m1.W(this.f49057a, (h51) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z4;
        h51 h51Var = (h51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (h51Var.f2505a == 16) {
            Object obj6 = h51Var.G;
            if (!(obj6 instanceof o1) || !((o1) obj6).f49201g) {
                this.f49057a.e0(h51Var, view);
                z4 = true;
                return Boolean.valueOf(z4);
            }
        }
        z4 = false;
        return Boolean.valueOf(z4);
    }
}
