package yh;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.u61;
import org.telegram.ui.kh1;
public final class d implements org.telegram.ui.ActionBar.z1, Utilities.Callback5, Utilities.Callback5Return {
    public final g f52602a;

    public d(g gVar) {
        this.f52602a = gVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        g gVar = this.f52602a;
        gVar.getClass();
        gVar.presentFragment(new kh1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        u61 u61Var = (u61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f52602a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        g.W(this.f52602a, (u61) obj);
    }
}
