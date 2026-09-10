package wh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.wr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import xh.n5;
public final class j2 extends s4.v {
    public final wr0 d;
    public final m2 e;

    public j2(m2 m2Var, wr0 wr0Var) {
        this.e = m2Var;
        this.d = wr0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f41610a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        TL_stars.SavedStarGift savedStarGift;
        View view = c1Var.f41610a;
        if (view instanceof h1) {
            savedStarGift = ((h1) view).getSavedGift();
        } else {
            savedStarGift = null;
        }
        if (r(savedStarGift)) {
            return s4.v.l(15, 0);
        }
        return s4.v.l(0, 0);
    }

    @Override
    public final boolean j() {
        return this.e.f44250n;
    }

    @Override
    public final boolean k() {
        return this.e.f44250n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        TL_stars.SavedStarGift savedStarGift;
        xh.g0 g0Var;
        m2 m2Var = this.e;
        h2 h2Var = m2Var.f44249f;
        if (m2Var.e != null && m2Var.f44250n) {
            View view = c1Var.f41610a;
            TL_stars.SavedStarGift savedStarGift2 = null;
            if (view instanceof h1) {
                savedStarGift = ((h1) view).getSavedGift();
            } else {
                savedStarGift = null;
            }
            if (r(savedStarGift)) {
                View view2 = c1Var2.f41610a;
                if (view2 instanceof h1) {
                    savedStarGift2 = ((h1) view2).getSavedGift();
                }
                if (r(savedStarGift2)) {
                    int b10 = c1Var.b();
                    int b11 = c1Var2.b();
                    boolean z10 = m2Var.d;
                    wr0 wr0Var = this.d;
                    if (z10) {
                        m2Var.e.k(b10, b11);
                        wr0Var.e.n(m2Var.e.d);
                    } else {
                        n5 n5Var = m2Var.e;
                        if (n5Var.f45766q == null) {
                            n5Var.f45766q = n5Var.h();
                        }
                        n5Var.k(b10, b11);
                    }
                    h2Var.Y2.p(b10, b11);
                    h2Var.Y2.S();
                    if (m2Var.d) {
                        HashMap hashMap = q2.T;
                        wr0Var.f(true);
                    }
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if ((U instanceof ProfileActivity) && (g0Var = ((ProfileActivity) U).f30497v0) != null) {
                        g0Var.a();
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        m2 m2Var = this.e;
        if (i10 == 0) {
            n5 n5Var = m2Var.e;
            if (n5Var != null) {
                ArrayList arrayList = n5Var.f45766q;
                if (arrayList != null) {
                    ArrayList h = n5Var.h();
                    if (arrayList.size() == h.size()) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            if (arrayList.get(i11) == h.get(i11)) {
                            }
                        }
                    }
                    n5Var.l();
                    n5Var.f45766q = null;
                    return;
                }
                n5Var.f45766q = null;
                return;
            }
            return;
        }
        h2 h2Var = m2Var.f44249f;
        if (h2Var != null) {
            h2Var.I0(false);
        }
        if (c1Var != null) {
            c1Var.f41610a.setPressed(true);
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        m2 m2Var = this.e;
        if (m2Var.f44250n) {
            if (m2Var.e == this.d.d) {
                if (savedStarGift == null || !savedStarGift.pinned_to_top) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }
}
