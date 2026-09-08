package yh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import zh.j5;
public final class j2 extends s4.v {
    public final nr0 d;
    public final m2 f50377e;

    public j2(m2 m2Var, nr0 nr0Var) {
        this.f50377e = m2Var;
        this.d = nr0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f45766a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        TL_stars.SavedStarGift savedStarGift;
        View view = c1Var.f45766a;
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
        return this.f50377e.f50473n;
    }

    @Override
    public final boolean k() {
        return this.f50377e.f50473n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        TL_stars.SavedStarGift savedStarGift;
        zh.g0 g0Var;
        m2 m2Var = this.f50377e;
        h2 h2Var = m2Var.f50472f;
        if (m2Var.f50471e != null && m2Var.f50473n) {
            View view = c1Var.f45766a;
            TL_stars.SavedStarGift savedStarGift2 = null;
            if (view instanceof h1) {
                savedStarGift = ((h1) view).getSavedGift();
            } else {
                savedStarGift = null;
            }
            if (r(savedStarGift)) {
                View view2 = c1Var2.f45766a;
                if (view2 instanceof h1) {
                    savedStarGift2 = ((h1) view2).getSavedGift();
                }
                if (r(savedStarGift2)) {
                    int b10 = c1Var.b();
                    int b11 = c1Var2.b();
                    boolean z10 = m2Var.d;
                    nr0 nr0Var = this.d;
                    if (z10) {
                        m2Var.f50471e.k(b10, b11);
                        nr0Var.f50547e.n(m2Var.f50471e.d);
                    } else {
                        j5 j5Var = m2Var.f50471e;
                        if (j5Var.f52137q == null) {
                            j5Var.f52137q = j5Var.h();
                        }
                        j5Var.k(b10, b11);
                    }
                    h2Var.Y2.p(b10, b11);
                    h2Var.Y2.S();
                    if (m2Var.d) {
                        HashMap hashMap = q2.T;
                        nr0Var.f(true);
                    }
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if ((U instanceof ProfileActivity) && (g0Var = ((ProfileActivity) U).f34031v0) != null) {
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
        m2 m2Var = this.f50377e;
        if (i10 == 0) {
            j5 j5Var = m2Var.f50471e;
            if (j5Var != null) {
                ArrayList arrayList = j5Var.f52137q;
                if (arrayList != null) {
                    ArrayList h = j5Var.h();
                    if (arrayList.size() == h.size()) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            if (arrayList.get(i11) == h.get(i11)) {
                            }
                        }
                    }
                    j5Var.l();
                    j5Var.f52137q = null;
                    return;
                }
                j5Var.f52137q = null;
                return;
            }
            return;
        }
        h2 h2Var = m2Var.f50472f;
        if (h2Var != null) {
            h2Var.I0(false);
        }
        if (c1Var != null) {
            c1Var.f45766a.setPressed(true);
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        m2 m2Var = this.f50377e;
        if (m2Var.f50473n) {
            if (m2Var.f50471e == this.d.d) {
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
