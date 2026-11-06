package yh;

import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.xq;
import v4.b0;
import v4.s0;
import zh.l3;
import zh.m3;
import zh.o3;
public final class f extends s0 {
    public final int f59423a;
    public final Object f59424b;

    public f(Object obj, int i7) {
        this.f59423a = i7;
        this.f59424b = obj;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        float f10;
        switch (this.f59423a) {
            case 0:
                b0 b0Var = (b0) recyclerView.getLayoutManager();
                m mVar = (m) this.f59424b;
                e eVar = mVar.C;
                if (mVar.f59464x && !mVar.f59463w && b0Var != null) {
                    if (mVar.f59448f.b() - b0Var.N0() < 10) {
                        g0.r(eVar);
                        g0.h3(eVar);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                m3 m3Var = (m3) this.f59424b;
                int i11 = 0;
                while (true) {
                    if (i11 < m3Var.f60368n.getChildCount()) {
                        if (m3Var.f60368n.getChildAt(i11) instanceof lz) {
                            m3Var.d.g(false);
                        } else {
                            i11++;
                        }
                    }
                }
                ViewPropertyAnimator animate = m3Var.h.animate();
                if (m3Var.K && m3Var.f60368n.canScrollVertically(-1)) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                q.l(animate.alpha(f10), xq.h, 320L);
                return;
            case 2:
                ((l3) this.f59424b).d1();
                return;
            default:
                o3 o3Var = (o3) this.f59424b;
                if (o3Var.e1()) {
                    o3Var.Q1.a();
                    return;
                }
                return;
        }
    }
}
