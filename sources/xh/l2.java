package xh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import yh.k5;
public final class l2 extends s4.v {
    public final zr0 d;
    public final o2 e;

    public l2(o2 o2Var, zr0 zr0Var) {
        this.e = o2Var;
        this.d = zr0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f42946a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        TL_stars.SavedStarGift savedStarGift;
        View view = c1Var.f42946a;
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
        return this.e.f46317n;
    }

    @Override
    public final boolean k() {
        return this.e.f46317n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        TL_stars.SavedStarGift savedStarGift;
        yh.g0 g0Var;
        o2 o2Var = this.e;
        j2 j2Var = o2Var.f46316f;
        if (o2Var.e != null && o2Var.f46317n) {
            View view = c1Var.f42946a;
            TL_stars.SavedStarGift savedStarGift2 = null;
            if (view instanceof j1) {
                savedStarGift = ((j1) view).getSavedGift();
            } else {
                savedStarGift = null;
            }
            if (r(savedStarGift)) {
                View view2 = c1Var2.f42946a;
                if (view2 instanceof j1) {
                    savedStarGift2 = ((j1) view2).getSavedGift();
                }
                if (r(savedStarGift2)) {
                    int b10 = c1Var.b();
                    int b11 = c1Var2.b();
                    boolean z10 = o2Var.d;
                    zr0 zr0Var = this.d;
                    if (z10) {
                        o2Var.e.k(b10, b11);
                        zr0Var.e.n(o2Var.e.d);
                    } else {
                        k5 k5Var = o2Var.e;
                        if (k5Var.f47606q == null) {
                            k5Var.f47606q = k5Var.h();
                        }
                        k5Var.k(b10, b11);
                    }
                    j2Var.Y2.p(b10, b11);
                    j2Var.Y2.S();
                    if (o2Var.d) {
                        HashMap hashMap = s2.T;
                        zr0Var.f(true);
                    }
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if ((U instanceof ProfileActivity) && (g0Var = ((ProfileActivity) U).f31657v0) != null) {
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
        o2 o2Var = this.e;
        if (i10 == 0) {
            k5 k5Var = o2Var.e;
            if (k5Var != null) {
                ArrayList arrayList = k5Var.f47606q;
                if (arrayList != null) {
                    ArrayList h = k5Var.h();
                    if (arrayList.size() == h.size()) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            if (arrayList.get(i11) == h.get(i11)) {
                            }
                        }
                    }
                    k5Var.l();
                    k5Var.f47606q = null;
                    return;
                }
                k5Var.f47606q = null;
                return;
            }
            return;
        }
        j2 j2Var = o2Var.f46316f;
        if (j2Var != null) {
            j2Var.I0(false);
        }
        if (c1Var != null) {
            c1Var.f42946a.setPressed(true);
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        o2 o2Var = this.e;
        if (o2Var.f46317n) {
            if (o2Var.e == this.d.d) {
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
