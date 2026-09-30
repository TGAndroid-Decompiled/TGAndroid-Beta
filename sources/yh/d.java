package yh;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.y51;
import org.telegram.ui.zg1;
public final class d implements org.telegram.ui.ActionBar.z1, Utilities.Callback5, Utilities.Callback5Return {
    public final g f47390a;

    public d(g gVar) {
        this.f47390a = gVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        g gVar = this.f47390a;
        gVar.getClass();
        gVar.presentFragment(new zg1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        y51 y51Var = (y51) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f47390a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        g.W(this.f47390a, (y51) obj);
    }
}
