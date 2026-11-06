package zh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.v9;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.up0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class x1 extends v4.v {
    public final up0 d;
    public final a2 f60493e;

    public x1(a2 a2Var, up0 up0Var) {
        this.f60493e = a2Var;
        this.d = up0Var;
    }

    public static TL_stars.SavedStarGift s(v4.d1 d1Var) {
        View view = d1Var.f56952a;
        if (view instanceof z0) {
            return ((z0) view).getSavedGift();
        }
        return null;
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f56952a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, v4.d1 d1Var) {
        if (r(s(d1Var))) {
            return v4.v.l(15, 0);
        }
        return v4.v.l(0, 0);
    }

    @Override
    public final boolean j() {
        return this.f60493e.h;
    }

    @Override
    public final boolean k() {
        return this.f60493e.h;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2) {
        bi.g1 g1Var;
        a2 a2Var = this.f60493e;
        fi.w3 w3Var = a2Var.f60110f;
        if (a2Var.f60109e != null && a2Var.h && r(s(d1Var)) && r(s(d1Var2))) {
            int b10 = d1Var.b();
            int b11 = d1Var2.b();
            int indexOf = a2Var.f60109e.f4915l.indexOf(s(d1Var));
            int indexOf2 = a2Var.f60109e.f4915l.indexOf(s(d1Var2));
            if (indexOf >= 0 && indexOf2 >= 0) {
                boolean z9 = a2Var.d;
                up0 up0Var = this.d;
                if (z9) {
                    a2Var.f60109e.m(indexOf, indexOf2);
                    up0Var.f60215e.n(a2Var.f60109e.d);
                } else {
                    v9 v9Var = a2Var.f60109e;
                    if (v9Var.f4920q == null) {
                        v9Var.f4920q = v9Var.i();
                    }
                    v9Var.m(indexOf, indexOf2);
                }
                w3Var.f36781f3.j(b10, b11);
                w3Var.f36781f3.T();
                if (a2Var.d) {
                    HashMap hashMap = f2.U;
                    up0Var.f(true);
                }
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if ((T instanceof ProfileActivity) && (g1Var = ((ProfileActivity) T).f41835v0) != null) {
                    g1Var.a();
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(v4.d1 d1Var, int i7) {
        a2 a2Var = this.f60493e;
        if (i7 == 0) {
            v9 v9Var = a2Var.f60109e;
            if (v9Var != null) {
                ArrayList arrayList = v9Var.f4920q;
                if (arrayList != null) {
                    ArrayList i10 = v9Var.i();
                    if (arrayList.size() == i10.size()) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            if (arrayList.get(i11) == i10.get(i11)) {
                            }
                        }
                    }
                    v9Var.n();
                    v9Var.f4920q = null;
                    return;
                }
                v9Var.f4920q = null;
                return;
            }
            return;
        }
        fi.w3 w3Var = a2Var.f60110f;
        if (w3Var != null) {
            w3Var.I0(false);
        }
        if (d1Var != null) {
            d1Var.f56952a.setPressed(true);
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        a2 a2Var = this.f60493e;
        if (a2Var.h) {
            if (a2Var.f60109e == this.d.d) {
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
    public final void q(v4.d1 d1Var) {
    }
}
