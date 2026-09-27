package xh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import yh.k5;
public final class m2 extends s4.v {
    public final bs0 d;
    public final p2 e;

    public m2(p2 p2Var, bs0 bs0Var) {
        this.e = p2Var;
        this.d = bs0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f43005a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        TL_stars.SavedStarGift savedStarGift;
        View view = c1Var.f43005a;
        if (view instanceof j1) {
            savedStarGift = ((j1) view).getSavedGift();
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
        return this.e.f46409n;
    }

    @Override
    public final boolean k() {
        return this.e.f46409n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        TL_stars.SavedStarGift savedStarGift;
        yh.g0 g0Var;
        p2 p2Var = this.e;
        k2 k2Var = p2Var.f46408f;
        if (p2Var.e != null && p2Var.f46409n) {
            View view = c1Var.f43005a;
            TL_stars.SavedStarGift savedStarGift2 = null;
            if (view instanceof j1) {
                savedStarGift = ((j1) view).getSavedGift();
            } else {
                savedStarGift = null;
            }
            if (r(savedStarGift)) {
                View view2 = c1Var2.f43005a;
                if (view2 instanceof j1) {
                    savedStarGift2 = ((j1) view2).getSavedGift();
                }
                if (r(savedStarGift2)) {
                    int b10 = c1Var.b();
                    int b11 = c1Var2.b();
                    boolean z10 = p2Var.d;
                    bs0 bs0Var = this.d;
                    if (z10) {
                        p2Var.e.k(b10, b11);
                        bs0Var.e.n(p2Var.e.d);
                    } else {
                        k5 k5Var = p2Var.e;
                        if (k5Var.f47671q == null) {
                            k5Var.f47671q = k5Var.h();
                        }
                        k5Var.k(b10, b11);
                    }
                    k2Var.Y2.p(b10, b11);
                    k2Var.Y2.S();
                    if (p2Var.d) {
                        HashMap hashMap = t2.T;
                        bs0Var.f(true);
                    }
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if ((U instanceof ProfileActivity) && (g0Var = ((ProfileActivity) U).f31673v0) != null) {
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
        p2 p2Var = this.e;
        if (i10 == 0) {
            k5 k5Var = p2Var.e;
            if (k5Var != null) {
                ArrayList arrayList = k5Var.f47671q;
                if (arrayList != null) {
                    ArrayList h = k5Var.h();
                    if (arrayList.size() == h.size()) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            if (arrayList.get(i11) == h.get(i11)) {
                            }
                        }
                    }
                    k5Var.l();
                    k5Var.f47671q = null;
                    return;
                }
                k5Var.f47671q = null;
                return;
            }
            return;
        }
        k2 k2Var = p2Var.f46408f;
        if (k2Var != null) {
            k2Var.J0(false);
        }
        if (c1Var != null) {
            c1Var.f43005a.setPressed(true);
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        p2 p2Var = this.e;
        if (p2Var.f46409n) {
            if (p2Var.e == this.d.d) {
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
