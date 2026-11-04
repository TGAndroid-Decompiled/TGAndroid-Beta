package wh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.g0;
import u4.b0;
import u4.t0;
import xg.e1;
import xg.w0;
import zh.k;
public final class d extends t0 {
    public final int f57760a;
    public final Object f57761b;

    public d(Object obj, int i3) {
        this.f57760a = i3;
        this.f57761b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i3) {
        switch (this.f57760a) {
            case 1:
                if (i3 == 1) {
                    g0.v1(((w0) this.f57761b).R1.getEditText());
                    return;
                }
                return;
            case 2:
                if (i3 == 1) {
                    g0.v1(((e1) this.f57761b).S1.getEditText());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i3, int i10) {
        switch (this.f57760a) {
            case 0:
                ((h) this.f57761b).f1();
                return;
            case 3:
                b0 b0Var = (b0) recyclerView.getLayoutManager();
                k kVar = (k) this.f57761b;
                zh.e eVar = kVar.C;
                if (kVar.f60600x && !kVar.f60599w && b0Var != null) {
                    if (kVar.f60584f.b() - b0Var.N0() < 10) {
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
