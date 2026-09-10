package xh;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.v51;
import org.telegram.ui.mh1;
public final class e implements org.telegram.ui.ActionBar.c2, Utilities.Callback5, Utilities.Callback5Return {
    public final h f45353a;

    public e(h hVar) {
        this.f45353a = hVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        h hVar = this.f45353a;
        hVar.getClass();
        hVar.presentFragment(new mh1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        v51 v51Var = (v51) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f45353a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        h.W(this.f45353a, (v51) obj);
    }
}
