package rh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import org.telegram.messenger.p20;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.rc1;
public final class c implements fe.e, hu0, ju0, org.telegram.ui.ActionBar.u1, p20 {
    public final i f46706a;

    public c(i iVar) {
        this.f46706a = iVar;
    }

    @Override
    public int c() {
        return this.f46706a.f47063n;
    }

    @Override
    public float f(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.f1.c(recyclerView);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        i iVar = this.f46706a;
        iVar.getClass();
        iVar.presentFragment(new rc1(6, null));
    }

    @Override
    public RecyclerView j(View view) {
        i iVar = this.f46706a;
        if (iVar.f47047a == 1) {
            return ((h) view).f47002c;
        }
        iVar.K.getClass();
        return ((e8) view).f46888a;
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        i.a0(this.f46706a, (b51) obj);
    }

    @Override
    public void q(RecyclerView recyclerView) {
        org.telegram.ui.Cells.f1.b(recyclerView);
    }

    @Override
    public void v(int i10, float f7, float f10, fe.f fVar) {
        this.f46706a.x0();
    }

    @Override
    public void E(float f7, int i10) {
    }
}
