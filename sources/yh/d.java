package yh;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.g61;
import org.telegram.ui.bh1;
public final class d implements org.telegram.ui.ActionBar.a2, Utilities.Callback5, Utilities.Callback5Return {
    public final g f51184a;

    public d(g gVar) {
        this.f51184a = gVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        g gVar = this.f51184a;
        gVar.getClass();
        gVar.presentFragment(new bh1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        g61 g61Var = (g61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f51184a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        g.U(this.f51184a, (g61) obj);
    }
}
