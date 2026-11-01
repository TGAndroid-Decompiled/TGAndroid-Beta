package ph;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import rh.v5;
public final class c2 extends s4.u {
    public final wq0 d;
    public final f2 e;

    public c2(f2 f2Var, wq0 wq0Var) {
        this.e = f2Var;
        this.d = wq0Var;
    }

    public static TL_stars.SavedStarGift s(s4.c1 c1Var) {
        View view = c1Var.f47909a;
        if (view instanceof c1) {
            return ((c1) view).getSavedGift();
        }
        return null;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f47909a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        if (r(s(c1Var))) {
            return s4.u.l(15, 0);
        }
        return s4.u.l(0, 0);
    }

    @Override
    public final boolean j() {
        return this.e.h;
    }

    @Override
    public final boolean k() {
        return this.e.h;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        rh.g0 g0Var;
        f2 f2Var = this.e;
        ii iiVar = f2Var.f45056f;
        if (f2Var.e != null && f2Var.h && r(s(c1Var)) && r(s(c1Var2))) {
            int b10 = c1Var.b();
            int b11 = c1Var2.b();
            int indexOf = f2Var.e.f47596l.indexOf(s(c1Var));
            int indexOf2 = f2Var.e.f47596l.indexOf(s(c1Var2));
            if (indexOf >= 0 && indexOf2 >= 0) {
                boolean z10 = f2Var.d;
                wq0 wq0Var = this.d;
                if (z10) {
                    f2Var.e.m(indexOf, indexOf2);
                    wq0Var.e.n(f2Var.e.d);
                } else {
                    v5 v5Var = f2Var.e;
                    if (v5Var.f47601q == null) {
                        v5Var.f47601q = v5Var.i();
                    }
                    v5Var.m(indexOf, indexOf2);
                }
                iiVar.f31183f3.j(b10, b11);
                iiVar.f31183f3.T();
                if (f2Var.d) {
                    HashMap hashMap = j2.U;
                    wq0Var.f(true);
                }
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if ((T instanceof ProfileActivity) && (g0Var = ((ProfileActivity) T).f33927v0) != null) {
                    g0Var.a();
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        f2 f2Var = this.e;
        if (i10 == 0) {
            v5 v5Var = f2Var.e;
            if (v5Var != null) {
                ArrayList arrayList = v5Var.f47601q;
                if (arrayList != null) {
                    ArrayList i11 = v5Var.i();
                    if (arrayList.size() == i11.size()) {
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            if (arrayList.get(i12) == i11.get(i12)) {
                            }
                        }
                    }
                    v5Var.n();
                    v5Var.f47601q = null;
                    return;
                }
                v5Var.f47601q = null;
                return;
            }
            return;
        }
        ii iiVar = f2Var.f45056f;
        if (iiVar != null) {
            iiVar.I0(false);
        }
        if (c1Var != null) {
            c1Var.f47909a.setPressed(true);
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        f2 f2Var = this.e;
        if (f2Var.h) {
            if (f2Var.e == this.d.d) {
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
