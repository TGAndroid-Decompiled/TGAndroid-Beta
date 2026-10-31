package rh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import org.telegram.messenger.o20;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.gu0;
import org.telegram.ui.Components.iu0;
import org.telegram.ui.tc1;
public final class c implements fe.e, gu0, iu0, org.telegram.ui.ActionBar.u1, o20 {
    public final i f46692a;

    public c(i iVar) {
        this.f46692a = iVar;
    }

    @Override
    public int c() {
        return this.f46692a.f47049n;
    }

    @Override
    public float f(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.f1.c(recyclerView);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        i iVar = this.f46692a;
        iVar.getClass();
        iVar.presentFragment(new tc1(6, null));
    }

    @Override
    public RecyclerView j(View view) {
        i iVar = this.f46692a;
        if (iVar.f47033a == 1) {
            return ((h) view).f46988c;
        }
        iVar.K.getClass();
        return ((e8) view).f46874a;
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        i.Z(this.f46692a, (a51) obj);
    }

    @Override
    public void p(RecyclerView recyclerView) {
        org.telegram.ui.Cells.f1.b(recyclerView);
    }

    @Override
    public void v(int i10, float f7, float f10, fe.f fVar) {
        this.f46692a.w0();
    }

    @Override
    public void E(float f7, int i10) {
    }
}
