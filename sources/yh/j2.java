package yh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import zh.f5;
public final class j2 extends s4.v {
    public final ns0 d;
    public final m2 e;

    public j2(m2 m2Var, ns0 ns0Var) {
        this.e = m2Var;
        this.d = ns0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.f44838a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        TL_stars.SavedStarGift savedStarGift;
        View view = b1Var.f44838a;
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
        return this.e.f48997n;
    }

    @Override
    public final boolean k() {
        return this.e.f48997n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        TL_stars.SavedStarGift savedStarGift;
        zh.f0 f0Var;
        m2 m2Var = this.e;
        h2 h2Var = m2Var.f48996f;
        if (m2Var.e != null && m2Var.f48997n) {
            View view = b1Var.f44838a;
            TL_stars.SavedStarGift savedStarGift2 = null;
            if (view instanceof h1) {
                savedStarGift = ((h1) view).getSavedGift();
            } else {
                savedStarGift = null;
            }
            if (r(savedStarGift)) {
                View view2 = b1Var2.f44838a;
                if (view2 instanceof h1) {
                    savedStarGift2 = ((h1) view2).getSavedGift();
                }
                if (r(savedStarGift2)) {
                    int b10 = b1Var.b();
                    int b11 = b1Var2.b();
                    boolean z10 = m2Var.d;
                    ns0 ns0Var = this.d;
                    if (z10) {
                        m2Var.e.k(b10, b11);
                        ns0Var.e.n(m2Var.e.d);
                    } else {
                        f5 f5Var = m2Var.e;
                        if (f5Var.f50515q == null) {
                            f5Var.f50515q = f5Var.h();
                        }
                        f5Var.k(b10, b11);
                    }
                    h2Var.W2.p(b10, b11);
                    h2Var.W2.S();
                    if (m2Var.d) {
                        HashMap hashMap = q2.T;
                        ns0Var.f(true);
                    }
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if ((U instanceof ProfileActivity) && (f0Var = ((ProfileActivity) U).f32378v0) != null) {
                        f0Var.a();
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
    public final void p(s4.b1 b1Var, int i10) {
        m2 m2Var = this.e;
        if (i10 == 0) {
            f5 f5Var = m2Var.e;
            if (f5Var != null) {
                ArrayList arrayList = f5Var.f50515q;
                if (arrayList != null) {
                    ArrayList h = f5Var.h();
                    if (arrayList.size() == h.size()) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            if (arrayList.get(i11) == h.get(i11)) {
                            }
                        }
                    }
                    f5Var.l();
                    f5Var.f50515q = null;
                    return;
                }
                f5Var.f50515q = null;
                return;
            }
            return;
        }
        h2 h2Var = m2Var.f48996f;
        if (h2Var != null) {
            h2Var.I0(false);
        }
        if (b1Var != null) {
            b1Var.f44838a.setPressed(true);
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        m2 m2Var = this.e;
        if (m2Var.f48997n) {
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
    public final void q(s4.b1 b1Var) {
    }
}
