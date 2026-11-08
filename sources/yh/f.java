package yh;

import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.xq;
import v4.b0;
import v4.s0;
import zh.k3;
import zh.l3;
import zh.n3;
public final class f extends s0 {
    public final int f59522a;
    public final Object f59523b;

    public f(Object obj, int i7) {
        this.f59522a = i7;
        this.f59523b = obj;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        float f10;
        switch (this.f59522a) {
            case 0:
                b0 b0Var = (b0) recyclerView.getLayoutManager();
                m mVar = (m) this.f59523b;
                e eVar = mVar.C;
                if (mVar.f59563x && !mVar.f59562w && b0Var != null) {
                    if (mVar.f59547f.b() - b0Var.N0() < 10) {
                        g0.r(eVar);
                        g0.h3(eVar);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                l3 l3Var = (l3) this.f59523b;
                int i11 = 0;
                while (true) {
                    if (i11 < l3Var.f60451n.getChildCount()) {
                        if (l3Var.f60451n.getChildAt(i11) instanceof mz) {
                            l3Var.d.g(false);
                        } else {
                            i11++;
                        }
                    }
                }
                ViewPropertyAnimator animate = l3Var.h.animate();
                if (l3Var.K && l3Var.f60451n.canScrollVertically(-1)) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                q.l(animate.alpha(f10), xq.h, 320L);
                return;
            case 2:
                ((k3) this.f59523b).d1();
                return;
            default:
                n3 n3Var = (n3) this.f59523b;
                if (n3Var.e1()) {
                    n3Var.Q1.a();
                    return;
                }
                return;
        }
    }
}
