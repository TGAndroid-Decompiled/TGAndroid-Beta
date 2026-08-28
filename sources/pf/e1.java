package pf;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.l41;
public final class e1 implements Utilities.Callback5, Utilities.Callback5Return {
    public final n1 f45613a;

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        n1.V(this.f45613a, (l41) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        l41 l41Var = (l41) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (l41Var.f48814a == 16) {
            Object obj6 = l41Var.G;
            if (!(obj6 instanceof q1) || !((q1) obj6).f45761g) {
                this.f45613a.d0(l41Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
