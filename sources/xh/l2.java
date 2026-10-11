package xh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ts0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import yh.f5;
public final class l2 extends s4.w {
    public final ts0 d;
    public final o2 f51430e;

    public l2(o2 o2Var, ts0 ts0Var) {
        this.f51430e = o2Var;
        this.d = ts0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f47748a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        TL_stars.SavedStarGift savedStarGift;
        View view = d1Var.f47748a;
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
        return this.f51430e.f51527n;
    }

    @Override
    public final boolean k() {
        return this.f51430e.f51527n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        TL_stars.SavedStarGift savedStarGift;
        yh.e0 e0Var;
        o2 o2Var = this.f51430e;
        j2 j2Var = o2Var.f51526f;
        if (o2Var.f51525e != null && o2Var.f51527n) {
            View view = d1Var.f47748a;
            TL_stars.SavedStarGift savedStarGift2 = null;
            if (view instanceof j1) {
                savedStarGift = ((j1) view).getSavedGift();
            } else {
                savedStarGift = null;
            }
            if (r(savedStarGift)) {
                View view2 = d1Var2.f47748a;
                if (view2 instanceof j1) {
                    savedStarGift2 = ((j1) view2).getSavedGift();
                }
                if (r(savedStarGift2)) {
                    int b10 = d1Var.b();
                    int b11 = d1Var2.b();
                    boolean z10 = o2Var.d;
                    ts0 ts0Var = this.d;
                    if (z10) {
                        o2Var.f51525e.k(b10, b11);
                        ts0Var.f51601e.n(o2Var.f51525e.d);
                    } else {
                        f5 f5Var = o2Var.f51525e;
                        if (f5Var.f52611q == null) {
                            f5Var.f52611q = f5Var.h();
                        }
                        f5Var.k(b10, b11);
                    }
                    j2Var.W2.p(b10, b11);
                    j2Var.W2.S();
                    if (o2Var.d) {
                        HashMap hashMap = s2.T;
                        ts0Var.f(true);
                    }
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if ((U instanceof ProfileActivity) && (e0Var = ((ProfileActivity) U).f34387v0) != null) {
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
        o2 o2Var = this.f51430e;
        if (i10 == 0) {
            f5 f5Var = o2Var.f51525e;
            if (f5Var != null) {
                ArrayList arrayList = f5Var.f52611q;
                if (arrayList != null) {
                    ArrayList h = f5Var.h();
                    if (arrayList.size() == h.size()) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            if (arrayList.get(i11) == h.get(i11)) {
                            }
                        }
                    }
                    f5Var.l();
                    f5Var.f52611q = null;
                    return;
                }
                f5Var.f52611q = null;
                return;
            }
            return;
        }
        j2 j2Var = o2Var.f51526f;
        if (j2Var != null) {
            j2Var.I0(false);
        }
        if (d1Var != null) {
            d1Var.f47748a.setPressed(true);
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        o2 o2Var = this.f51430e;
        if (o2Var.f51527n) {
            if (o2Var.f51525e == this.d.d) {
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
