package xh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import yh.f5;
public final class l2 extends s4.w {
    public final ss0 d;
    public final o2 f51464e;

    public l2(o2 o2Var, ss0 ss0Var) {
        this.f51464e = o2Var;
        this.d = ss0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f47782a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        TL_stars.SavedStarGift savedStarGift;
        View view = d1Var.f47782a;
        if (view instanceof j1) {
            savedStarGift = ((j1) view).getSavedGift();
        } else {
            savedStarGift = null;
        }
        if (r(savedStarGift)) {
            return s4.w.l(15, 0);
        }
        return s4.w.l(0, 0);
    }

    @Override
    public final boolean j() {
        return this.f51464e.f51561n;
    }

    @Override
    public final boolean k() {
        return this.f51464e.f51561n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        TL_stars.SavedStarGift savedStarGift;
        yh.e0 e0Var;
        o2 o2Var = this.f51464e;
        j2 j2Var = o2Var.f51560f;
        if (o2Var.f51559e != null && o2Var.f51561n) {
            View view = d1Var.f47782a;
            TL_stars.SavedStarGift savedStarGift2 = null;
            if (view instanceof j1) {
                savedStarGift = ((j1) view).getSavedGift();
            } else {
                savedStarGift = null;
            }
            if (r(savedStarGift)) {
                View view2 = d1Var2.f47782a;
                if (view2 instanceof j1) {
                    savedStarGift2 = ((j1) view2).getSavedGift();
                }
                if (r(savedStarGift2)) {
                    int b10 = d1Var.b();
                    int b11 = d1Var2.b();
                    boolean z10 = o2Var.d;
                    ss0 ss0Var = this.d;
                    if (z10) {
                        o2Var.f51559e.k(b10, b11);
                        ss0Var.f51635e.n(o2Var.f51559e.d);
                    } else {
                        f5 f5Var = o2Var.f51559e;
                        if (f5Var.f52645q == null) {
                            f5Var.f52645q = f5Var.h();
                        }
                        f5Var.k(b10, b11);
                    }
                    j2Var.W2.p(b10, b11);
                    j2Var.W2.S();
                    if (o2Var.d) {
                        HashMap hashMap = s2.T;
                        ss0Var.f(true);
                    }
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if ((U instanceof ProfileActivity) && (e0Var = ((ProfileActivity) U).f34421v0) != null) {
                        e0Var.a();
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
    public final void p(s4.d1 d1Var, int i10) {
        o2 o2Var = this.f51464e;
        if (i10 == 0) {
            f5 f5Var = o2Var.f51559e;
            if (f5Var != null) {
                ArrayList arrayList = f5Var.f52645q;
                if (arrayList != null) {
                    ArrayList h = f5Var.h();
                    if (arrayList.size() == h.size()) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            if (arrayList.get(i11) == h.get(i11)) {
                            }
                        }
                    }
                    f5Var.l();
                    f5Var.f52645q = null;
                    return;
                }
                f5Var.f52645q = null;
                return;
            }
            return;
        }
        j2 j2Var = o2Var.f51560f;
        if (j2Var != null) {
            j2Var.I0(false);
        }
        if (d1Var != null) {
            d1Var.f47782a.setPressed(true);
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        o2 o2Var = this.f51464e;
        if (o2Var.f51561n) {
            if (o2Var.f51559e == this.d.d) {
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
    public final void q(s4.d1 d1Var) {
    }
}
