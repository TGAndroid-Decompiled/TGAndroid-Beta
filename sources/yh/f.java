package yh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.lz;
import v4.b0;
import v4.s0;
import zh.l3;
import zh.m3;
import zh.o3;
public final class f extends s0 {
    public final int f59529a;
    public final Object f59530b;

    public f(Object obj, int i7) {
        this.f59529a = i7;
        this.f59530b = obj;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f59529a) {
            case 0:
                b0 b0Var = (b0) recyclerView.getLayoutManager();
                m mVar = (m) this.f59530b;
                e eVar = mVar.C;
                if (mVar.f59570x && !mVar.f59569w && b0Var != null) {
                    if (mVar.f59554f.b() - b0Var.N0() < 10) {
                        g0.r(eVar);
                        g0.h3(eVar);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                m3 m3Var = (m3) this.f59530b;
                for (int i11 = 0; i11 < m3Var.f60480f.getChildCount(); i11++) {
                    if (m3Var.f60480f.getChildAt(i11) instanceof lz) {
                        m3Var.d.g(false);
                        return;
                    }
                }
                return;
            case 2:
                ((l3) this.f59530b).d1();
                return;
            default:
                o3 o3Var = (o3) this.f59530b;
                if (o3Var.e1()) {
                    o3Var.T1.a();
                    return;
                }
                return;
        }
    }
}
