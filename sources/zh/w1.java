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
public final class w1 extends v4.v {
    public final up0 d;
    public final z1 f60604e;

    public w1(z1 z1Var, up0 up0Var) {
        this.f60604e = z1Var;
        this.d = up0Var;
    }

    public static TL_stars.SavedStarGift s(v4.d1 d1Var) {
        View view = d1Var.f57052a;
        if (view instanceof y0) {
            return ((y0) view).getSavedGift();
        }
        return null;
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f57052a.setPressed(false);
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
        return this.f60604e.h;
    }

    @Override
    public final boolean k() {
        return this.f60604e.h;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2) {
        bi.g1 g1Var;
        z1 z1Var = this.f60604e;
        fi.w3 w3Var = z1Var.f60655f;
        if (z1Var.f60654e != null && z1Var.h && r(s(d1Var)) && r(s(d1Var2))) {
            int b10 = d1Var.b();
            int b11 = d1Var2.b();
            int indexOf = z1Var.f60654e.f4914l.indexOf(s(d1Var));
            int indexOf2 = z1Var.f60654e.f4914l.indexOf(s(d1Var2));
            if (indexOf >= 0 && indexOf2 >= 0) {
                boolean z9 = z1Var.d;
                up0 up0Var = this.d;
                if (z9) {
                    z1Var.f60654e.m(indexOf, indexOf2);
                    up0Var.f60297e.n(z1Var.f60654e.d);
                } else {
                    v9 v9Var = z1Var.f60654e;
                    if (v9Var.f4919q == null) {
                        v9Var.f4919q = v9Var.i();
                    }
                    v9Var.m(indexOf, indexOf2);
                }
                w3Var.f37496f3.j(b10, b11);
                w3Var.f37496f3.T();
                if (z1Var.d) {
                    HashMap hashMap = d2.U;
                    up0Var.f(true);
                }
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if ((T instanceof ProfileActivity) && (g1Var = ((ProfileActivity) T).f41836v0) != null) {
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
        z1 z1Var = this.f60604e;
        if (i7 == 0) {
            v9 v9Var = z1Var.f60654e;
            if (v9Var != null) {
                ArrayList arrayList = v9Var.f4919q;
                if (arrayList != null) {
                    ArrayList i10 = v9Var.i();
                    if (arrayList.size() == i10.size()) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            if (arrayList.get(i11) == i10.get(i11)) {
                            }
                        }
                    }
                    v9Var.n();
                    v9Var.f4919q = null;
                    return;
                }
                v9Var.f4919q = null;
                return;
            }
            return;
        }
        fi.w3 w3Var = z1Var.f60655f;
        if (w3Var != null) {
            w3Var.I0(false);
        }
        if (d1Var != null) {
            d1Var.f57052a.setPressed(true);
        }
    }

    public final boolean r(TL_stars.SavedStarGift savedStarGift) {
        z1 z1Var = this.f60604e;
        if (z1Var.h) {
            if (z1Var.f60654e == this.d.d) {
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
