package yh;

import ai.x9;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.is0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class j2 extends s4.v {
    public final is0 d;
    public final m2 e;

    public j2(m2 m2Var, is0 is0Var) {
        this.e = m2Var;
        this.d = is0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.f45938a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        TL_stars.SavedStarGift savedStarGift;
        View view = b1Var.f45938a;
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
        return this.e.f50398n;
    }

    @Override
    public final boolean k() {
        return this.e.f50398n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        TL_stars.SavedStarGift savedStarGift;
        ai.j1 j1Var;
        m2 m2Var = this.e;
        h2 h2Var = m2Var.f50397f;
        if (m2Var.e != null && m2Var.f50398n) {
            View view = b1Var.f45938a;
            TL_stars.SavedStarGift savedStarGift2 = null;
            if (view instanceof h1) {
                savedStarGift = ((h1) view).getSavedGift();
            } else {
                savedStarGift = null;
            }
            if (r(savedStarGift)) {
                View view2 = b1Var2.f45938a;
                if (view2 instanceof h1) {
                    savedStarGift2 = ((h1) view2).getSavedGift();
                }
                if (r(savedStarGift2)) {
                    int b10 = b1Var.b();
                    int b11 = b1Var2.b();
                    boolean z10 = m2Var.d;
                    is0 is0Var = this.d;
                    if (z10) {
                        m2Var.e.l(b10, b11);
                        is0Var.e.n(m2Var.e.d);
                    } else {
                        x9 x9Var = m2Var.e;
                        if (x9Var.f2453q == null) {
                            x9Var.f2453q = x9Var.i();
                        }
                        x9Var.l(b10, b11);
                    }
                    h2Var.W2.p(b10, b11);
                    h2Var.W2.S();
                    if (m2Var.d) {
                        HashMap hashMap = q2.T;
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
        m2 m2Var = this.e;
        if (i10 == 0) {
            x9 x9Var = m2Var.e;
            if (x9Var != null) {
                ArrayList arrayList = x9Var.f2453q;
                if (arrayList != null) {
                    ArrayList i11 = x9Var.i();
                    if (arrayList.size() == i11.size()) {
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            if (arrayList.get(i12) == i11.get(i12)) {
                            }
                        }
                    }
                    x9Var.m();
                    x9Var.f2453q = null;
                    return;
                }
                x9Var.f2453q = null;
                return;
            }
            return;
        }
        h2 h2Var = m2Var.f50397f;
        if (h2Var != null) {
            h2Var.I0(false);
        }
        if (b1Var != null) {
            b1Var.f45938a.setPressed(true);
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        m2 m2Var = this.e;
        if (m2Var.f50398n) {
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
