package yh;

import ai.y9;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ks0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class i2 extends s4.v {
    public final ks0 d;
    public final l2 e;

    public i2(l2 l2Var, ks0 ks0Var) {
        this.e = l2Var;
        this.d = ks0Var;
    }

    public static TL_stars.SavedStarGift s(s4.b1 b1Var) {
        View view = b1Var.f45917a;
        if (view instanceof g1) {
            return ((g1) view).getSavedGift();
        }
        return null;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.f45917a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        if (r(s(b1Var))) {
            return s4.v.l(15, 0);
        }
        return s4.v.l(0, 0);
    }

    @Override
    public final boolean j() {
        return this.e.f50369n;
    }

    @Override
    public final boolean k() {
        return this.e.f50369n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        ai.j1 j1Var;
        l2 l2Var = this.e;
        g2 g2Var = l2Var.f50368f;
        if (l2Var.e != null && l2Var.f50369n && r(s(b1Var)) && r(s(b1Var2))) {
            int b10 = b1Var.b();
            int b11 = b1Var2.b();
            int indexOf = l2Var.e.f2504l.indexOf(s(b1Var));
            int indexOf2 = l2Var.e.f2504l.indexOf(s(b1Var2));
            if (indexOf >= 0 && indexOf2 >= 0) {
                boolean z10 = l2Var.d;
                ks0 ks0Var = this.d;
                if (z10) {
                    l2Var.e.m(indexOf, indexOf2);
                    ks0Var.e.n(l2Var.e.d);
                } else {
                    y9 y9Var = l2Var.e;
                    if (y9Var.f2509q == null) {
                        y9Var.f2509q = y9Var.i();
                    }
                    y9Var.m(indexOf, indexOf2);
                }
                g2Var.W2.p(b10, b11);
                g2Var.W2.S();
                if (l2Var.d) {
                    HashMap hashMap = p2.T;
                    ks0Var.f(true);
                }
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if ((U instanceof ProfileActivity) && (j1Var = ((ProfileActivity) U).f33736w0) != null) {
                    j1Var.a();
                }
                return true;
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
                ArrayList arrayList = y9Var.f2509q;
                if (arrayList != null) {
                    ArrayList i11 = y9Var.i();
                    if (arrayList.size() == i11.size()) {
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            if (arrayList.get(i12) == i11.get(i12)) {
                            }
                        }
                    }
                    y9Var.n();
                    y9Var.f2509q = null;
                    return;
                }
                y9Var.f2509q = null;
                return;
            }
            return;
        }
        g2 g2Var = l2Var.f50368f;
        if (g2Var != null) {
            g2Var.I0(false);
        }
        if (b1Var != null) {
            b1Var.f45917a.setPressed(true);
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        l2 l2Var = this.e;
        if (l2Var.f50369n) {
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
