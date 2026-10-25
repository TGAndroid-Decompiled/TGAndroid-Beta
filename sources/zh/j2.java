package zh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.t9;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class j2 extends s4.w {
    public final vs0 d;
    public final m2 e;

    public j2(m2 m2Var, vs0 vs0Var) {
        this.e = m2Var;
        this.d = vs0Var;
    }

    public static TL_stars.SavedStarGift s(s4.e1 e1Var) {
        View view = e1Var.f47735a;
        if (view instanceof g1) {
            return ((g1) view).getSavedGift();
        }
        return null;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        e1Var.f47735a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.e1 e1Var) {
        if (r(s(e1Var))) {
            return s4.w.l(15, 0);
        }
        return s4.w.l(0, 0);
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
    public final boolean n(RecyclerView recyclerView, s4.e1 e1Var, s4.e1 e1Var2) {
        bi.i1 i1Var;
        m2 m2Var = this.e;
        h2 h2Var = m2Var.f53143f;
        if (m2Var.e != null && m2Var.h && r(s(e1Var)) && r(s(e1Var2))) {
            int b10 = e1Var.b();
            int b11 = e1Var2.b();
            int indexOf = m2Var.e.f5471l.indexOf(s(e1Var));
            int indexOf2 = m2Var.e.f5471l.indexOf(s(e1Var2));
            if (indexOf >= 0 && indexOf2 >= 0) {
                boolean z10 = m2Var.d;
                vs0 vs0Var = this.d;
                if (z10) {
                    m2Var.e.m(indexOf, indexOf2);
                    vs0Var.e.n(m2Var.e.d);
                } else {
                    t9 t9Var = m2Var.e;
                    if (t9Var.f5476q == null) {
                        t9Var.f5476q = t9Var.i();
                    }
                    t9Var.m(indexOf, indexOf2);
                }
                h2Var.f32150g3.p(b10, b11);
                h2Var.f32150g3.T();
                if (m2Var.d) {
                    HashMap hashMap = r2.V;
                    vs0Var.f(true);
                }
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if ((U instanceof ProfileActivity) && (i1Var = ((ProfileActivity) U).f36093v0) != null) {
                    i1Var.a();
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(s4.e1 e1Var, int i10) {
        m2 m2Var = this.e;
        if (i10 == 0) {
            t9 t9Var = m2Var.e;
            if (t9Var != null) {
                ArrayList arrayList = t9Var.f5476q;
                if (arrayList != null) {
                    ArrayList i11 = t9Var.i();
                    if (arrayList.size() == i11.size()) {
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            if (arrayList.get(i12) == i11.get(i12)) {
                            }
                        }
                    }
                    t9Var.n();
                    t9Var.f5476q = null;
                    return;
                }
                t9Var.f5476q = null;
                return;
            }
            return;
        }
        h2 h2Var = m2Var.f53143f;
        if (h2Var != null) {
            h2Var.I0(false);
        }
        if (e1Var != null) {
            e1Var.f47735a.setPressed(true);
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        m2 m2Var = this.e;
        if (m2Var.h) {
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
    public final void q(s4.e1 e1Var) {
    }
}
