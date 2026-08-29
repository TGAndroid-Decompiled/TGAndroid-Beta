package sf;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.w41;
public final class d1 implements Utilities.Callback5, Utilities.Callback5Return {
    public final n1 f47780a;

    @Override
    public void mo19run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        n1.W(this.f47780a, (w41) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        w41 w41Var = (w41) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (w41Var.f50845a == 16) {
            Object obj6 = w41Var.G;
            if (!(obj6 instanceof r1) || !((r1) obj6).f47940g) {
                this.f47780a.e0(w41Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
