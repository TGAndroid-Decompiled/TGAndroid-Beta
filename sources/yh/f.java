package yh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.mz;
import v4.b0;
import v4.s0;
import zh.l3;
import zh.m3;
import zh.o3;
public final class f extends s0 {
    public final int f59531a;
    public final Object f59532b;

    public f(Object obj, int i7) {
        this.f59531a = i7;
        this.f59532b = obj;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f59531a) {
            case 0:
                b0 b0Var = (b0) recyclerView.getLayoutManager();
                m mVar = (m) this.f59532b;
                e eVar = mVar.C;
                if (mVar.f59572x && !mVar.f59571w && b0Var != null) {
                    if (mVar.f59556f.b() - b0Var.N0() < 10) {
                        g0.r(eVar);
                        g0.h3(eVar);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                m3 m3Var = (m3) this.f59532b;
                for (int i11 = 0; i11 < m3Var.f60473f.getChildCount(); i11++) {
                    if (m3Var.f60473f.getChildAt(i11) instanceof mz) {
                        m3Var.d.g(false);
                        return;
                    }
                }
                return;
            case 2:
                ((l3) this.f59532b).d1();
                return;
            default:
                o3 o3Var = (o3) this.f59532b;
                if (o3Var.e1()) {
                    o3Var.Q1.a();
                    return;
                }
                return;
        }
    }
}
