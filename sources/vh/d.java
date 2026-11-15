package vh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.g0;
import v4.b0;
import v4.t0;
import wg.c1;
import wg.u0;
import zh.l;
public final class d extends t0 {
    public final int f58989a;
    public final Object f58990b;

    public d(Object obj, int i7) {
        this.f58989a = i7;
        this.f58990b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.f58989a) {
            case 1:
                if (i7 == 1) {
                    g0.v1(((u0) this.f58990b).U1.getEditText());
                    return;
                }
                return;
            case 2:
                if (i7 == 1) {
                    g0.v1(((c1) this.f58990b).V1.getEditText());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f58989a) {
            case 0:
                ((h) this.f58990b).f1();
                return;
            case 3:
                b0 b0Var = (b0) recyclerView.getLayoutManager();
                l lVar = (l) this.f58990b;
                zh.e eVar = lVar.C;
                if (lVar.f61462x && !lVar.f61461w && b0Var != null) {
                    if (lVar.f61446f.b() - b0Var.N0() < 10) {
                        g0.r(eVar);
                        g0.h3(eVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
