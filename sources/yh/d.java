package yh;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.p61;
import org.telegram.ui.ih1;
public final class d implements org.telegram.ui.ActionBar.a2, Utilities.Callback5, Utilities.Callback5Return {
    public final g f52364a;

    public d(g gVar) {
        this.f52364a = gVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        g gVar = this.f52364a;
        gVar.getClass();
        gVar.presentFragment(new ih1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        p61 p61Var = (p61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f52364a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        g.W(this.f52364a, (p61) obj);
    }
}
