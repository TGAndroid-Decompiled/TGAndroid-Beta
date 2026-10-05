package yh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.zv0;
import org.telegram.ui.zg1;
public final class c implements le.d, xv0, zv0, org.telegram.ui.ActionBar.a2, Utilities.Callback5, Utilities.Callback5Return {
    public final h f51169a;

    public c(h hVar) {
        this.f51169a = hVar;
    }

    @Override
    public void a0(int i10, float f7, float f10, le.e eVar) {
        this.f51169a.s0();
    }

    @Override
    public int b() {
        return this.f51169a.f51383n;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        h hVar = this.f51169a;
        hVar.getClass();
        hVar.presentFragment(new zg1(6, null));
    }

    @Override
    public float h(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.c1.c(recyclerView);
    }

    @Override
    public RecyclerView i(View view) {
        h hVar = this.f51169a;
        if (hVar.f51366a == 1) {
            return ((g) view).f51312c;
        }
        hVar.K.getClass();
        return ((w7) view).f52203a;
    }

    @Override
    public void n(RecyclerView recyclerView) {
        org.telegram.ui.Cells.c1.b(recyclerView);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        h61 h61Var = (h61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f51169a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        h.T(this.f51169a, (h61) obj);
    }

    @Override
    public void V(float f7, int i10) {
    }
}
