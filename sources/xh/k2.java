package xh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import yh.f5;
public final class k2 extends s4.w {
    public final xs0 d;
    public final n2 f51551e;

    public k2(n2 n2Var, xs0 xs0Var) {
        this.f51551e = n2Var;
        this.d = xs0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f47897a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        TL_stars.SavedStarGift savedStarGift;
        View view = d1Var.f47897a;
        if (view instanceof i1) {
            savedStarGift = ((i1) view).getSavedGift();
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
        return this.f51551e.f51635n;
    }

    @Override
    public final boolean k() {
        return this.f51551e.f51635n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        TL_stars.SavedStarGift savedStarGift;
        yh.e0 e0Var;
        n2 n2Var = this.f51551e;
        i2 i2Var = n2Var.f51634f;
        if (n2Var.f51633e != null && n2Var.f51635n) {
            View view = d1Var.f47897a;
            TL_stars.SavedStarGift savedStarGift2 = null;
            if (view instanceof i1) {
                savedStarGift = ((i1) view).getSavedGift();
            } else {
                savedStarGift = null;
            }
            if (r(savedStarGift)) {
                View view2 = d1Var2.f47897a;
                if (view2 instanceof i1) {
                    savedStarGift2 = ((i1) view2).getSavedGift();
                }
                if (r(savedStarGift2)) {
                    int b10 = d1Var.b();
                    int b11 = d1Var2.b();
                    boolean z10 = n2Var.d;
                    xs0 xs0Var = this.d;
                    if (z10) {
                        n2Var.f51633e.k(b10, b11);
                        xs0Var.f51732e.n(n2Var.f51633e.d);
                    } else {
                        f5 f5Var = n2Var.f51633e;
                        if (f5Var.f52760q == null) {
                            f5Var.f52760q = f5Var.h();
                        }
                        f5Var.k(b10, b11);
                    }
                    i2Var.W2.p(b10, b11);
                    i2Var.W2.S();
                    if (n2Var.d) {
                        HashMap hashMap = r2.T;
                        xs0Var.f(true);
                    }
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if ((U instanceof ProfileActivity) && (e0Var = ((ProfileActivity) U).f34198v0) != null) {
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
        n2 n2Var = this.f51551e;
        if (i10 == 0) {
            f5 f5Var = n2Var.f51633e;
            if (f5Var != null) {
                ArrayList arrayList = f5Var.f52760q;
                if (arrayList != null) {
                    ArrayList h = f5Var.h();
                    if (arrayList.size() == h.size()) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            if (arrayList.get(i11) == h.get(i11)) {
                            }
                        }
                    }
                    f5Var.l();
                    f5Var.f52760q = null;
                    return;
                }
                f5Var.f52760q = null;
                return;
            }
            return;
        }
        i2 i2Var = n2Var.f51634f;
        if (i2Var != null) {
            i2Var.I0(false);
        }
        if (d1Var != null) {
            d1Var.f47897a.setPressed(true);
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        n2 n2Var = this.f51551e;
        if (n2Var.f51635n) {
            if (n2Var.f51633e == this.d.d) {
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
