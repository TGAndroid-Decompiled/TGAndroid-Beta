package xh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import yh.m5;
public final class k2 extends s4.v {
    public final nr0 d;
    public final n2 e;

    public k2(n2 n2Var, nr0 nr0Var) {
        this.e = n2Var;
        this.d = nr0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f42671a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        TL_stars.SavedStarGift savedStarGift;
        View view = c1Var.f42671a;
        if (view instanceof i1) {
            savedStarGift = ((i1) view).getSavedGift();
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
        return this.e.f46034n;
    }

    @Override
    public final boolean k() {
        return this.e.f46034n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        TL_stars.SavedStarGift savedStarGift;
        yh.g0 g0Var;
        n2 n2Var = this.e;
        i2 i2Var = n2Var.f46033f;
        if (n2Var.e != null && n2Var.f46034n) {
            View view = c1Var.f42671a;
            TL_stars.SavedStarGift savedStarGift2 = null;
            if (view instanceof i1) {
                savedStarGift = ((i1) view).getSavedGift();
            } else {
                savedStarGift = null;
            }
            if (r(savedStarGift)) {
                View view2 = c1Var2.f42671a;
                if (view2 instanceof i1) {
                    savedStarGift2 = ((i1) view2).getSavedGift();
                }
                if (r(savedStarGift2)) {
                    int b10 = c1Var.b();
                    int b11 = c1Var2.b();
                    boolean z10 = n2Var.d;
                    nr0 nr0Var = this.d;
                    if (z10) {
                        n2Var.e.k(b10, b11);
                        nr0Var.e.n(n2Var.e.d);
                    } else {
                        m5 m5Var = n2Var.e;
                        if (m5Var.f47411q == null) {
                            m5Var.f47411q = m5Var.h();
                        }
                        m5Var.k(b10, b11);
                    }
                    i2Var.Y2.p(b10, b11);
                    i2Var.Y2.S();
                    if (n2Var.d) {
                        HashMap hashMap = r2.T;
                        nr0Var.f(true);
                    }
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if ((U instanceof ProfileActivity) && (g0Var = ((ProfileActivity) U).f31382v0) != null) {
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
        n2 n2Var = this.e;
        if (i10 == 0) {
            m5 m5Var = n2Var.e;
            if (m5Var != null) {
                ArrayList arrayList = m5Var.f47411q;
                if (arrayList != null) {
                    ArrayList h = m5Var.h();
                    if (arrayList.size() == h.size()) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            if (arrayList.get(i11) == h.get(i11)) {
                            }
                        }
                    }
                    m5Var.l();
                    m5Var.f47411q = null;
                    return;
                }
                m5Var.f47411q = null;
                return;
            }
            return;
        }
        i2 i2Var = n2Var.f46033f;
        if (i2Var != null) {
            i2Var.I0(false);
        }
        if (c1Var != null) {
            c1Var.f42671a.setPressed(true);
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        n2 n2Var = this.e;
        if (n2Var.f46034n) {
            if (n2Var.e == this.d.d) {
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
