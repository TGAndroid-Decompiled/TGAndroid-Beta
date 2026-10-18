package yh;

import ai.y9;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.is0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class i2 extends s4.v {
    public final is0 d;
    public final l2 e;

    public i2(l2 l2Var, is0 is0Var) {
        this.e = l2Var;
        this.d = is0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.f45910a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        TL_stars.SavedStarGift savedStarGift;
        View view = b1Var.f45910a;
        if (view instanceof g1) {
            savedStarGift = ((g1) view).getSavedGift();
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
        return this.e.f50363n;
    }

    @Override
    public final boolean k() {
        return this.e.f50363n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        TL_stars.SavedStarGift savedStarGift;
        ai.j1 j1Var;
        l2 l2Var = this.e;
        g2 g2Var = l2Var.f50362f;
        if (l2Var.e != null && l2Var.f50363n) {
            View view = b1Var.f45910a;
            TL_stars.SavedStarGift savedStarGift2 = null;
            if (view instanceof g1) {
                savedStarGift = ((g1) view).getSavedGift();
            } else {
                savedStarGift = null;
            }
            if (r(savedStarGift)) {
                View view2 = b1Var2.f45910a;
                if (view2 instanceof g1) {
                    savedStarGift2 = ((g1) view2).getSavedGift();
                }
                if (r(savedStarGift2)) {
                    int b10 = b1Var.b();
                    int b11 = b1Var2.b();
                    boolean z10 = l2Var.d;
                    is0 is0Var = this.d;
                    if (z10) {
                        l2Var.e.l(b10, b11);
                        is0Var.e.n(l2Var.e.d);
                    } else {
                        y9 y9Var = l2Var.e;
                        if (y9Var.f2504q == null) {
                            y9Var.f2504q = y9Var.i();
                        }
                        y9Var.l(b10, b11);
                    }
                    g2Var.W2.p(b10, b11);
                    g2Var.W2.S();
                    if (l2Var.d) {
                        HashMap hashMap = p2.T;
                        is0Var.f(true);
                    }
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if ((U instanceof ProfileActivity) && (j1Var = ((ProfileActivity) U).f33724w0) != null) {
                        j1Var.a();
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
        l2 l2Var = this.e;
        if (i10 == 0) {
            y9 y9Var = l2Var.e;
            if (y9Var != null) {
                ArrayList arrayList = y9Var.f2504q;
                if (arrayList != null) {
                    ArrayList i11 = y9Var.i();
                    if (arrayList.size() == i11.size()) {
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            if (arrayList.get(i12) == i11.get(i12)) {
                            }
                        }
                    }
                    y9Var.m();
                    y9Var.f2504q = null;
                    return;
                }
                y9Var.f2504q = null;
                return;
            }
            return;
        }
        g2 g2Var = l2Var.f50362f;
        if (g2Var != null) {
            g2Var.I0(false);
        }
        if (b1Var != null) {
            b1Var.f45910a.setPressed(true);
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        l2 l2Var = this.e;
        if (l2Var.f50363n) {
            if (l2Var.e == this.d.d) {
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
