package th;

import android.os.Bundle;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import vf.r1;
import vf.v0;
import vf.x0;
import vf.z0;
public final class e extends org.telegram.ui.ActionBar.j {
    public final int f48145a;
    public final Object f48146b;

    public e(Object obj, int i10) {
        this.f48145a = i10;
        this.f48146b = obj;
    }

    @Override
    public final void b(int i10) {
        switch (this.f48145a) {
            case 0:
                if (i10 == -1) {
                    ((g) this.f48146b).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((n) this.f48146b).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((q) this.f48146b).finishFragment();
                    return;
                }
                return;
            case 3:
                i0 i0Var = ((c0) this.f48146b).h;
                if (i10 == -1) {
                    if (i0Var.K) {
                        i0Var.dismiss();
                        return;
                    }
                    i0Var.v.d.V2.N(false);
                    i0Var.d.D(0);
                    return;
                } else if (i10 == 3) {
                    i0Var.f48169c.a(true, true);
                    i0Var.setAllowNestedScroll(false);
                    i0Var.P = null;
                    i0Var.D.V2.N(true);
                    i0Var.B.f26132r.getText().clear();
                    i0Var.B.f26132r.requestFocus();
                    AndroidUtilities.showKeyboard(i0Var.B.f26132r);
                    return;
                } else {
                    return;
                }
            case 4:
                i0 i0Var2 = ((d0) this.f48146b).f48144r;
                if (i10 == 2) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", i0Var2.f48170e);
                    i0Var2.f48174s.presentFragment(new n(bundle));
                    i0Var2.dismiss();
                    return;
                } else if (i10 == 3) {
                    i0Var2.f48168b.a(true, true);
                    i0Var2.setAllowNestedScroll(false);
                    TextUtils.isEmpty(i0Var2.O);
                    i0Var2.O = null;
                    i0Var2.C.h(0L, i0Var2.f48170e, 0L, 0L, null, false, null, true);
                    i0Var2.f48177y.f26132r.getText().clear();
                    i0Var2.f48177y.f26132r.requestFocus();
                    AndroidUtilities.showKeyboard(i0Var2.f48177y.f26132r);
                    return;
                } else {
                    return;
                }
            case 5:
                i0 i0Var3 = ((h0) this.f48146b).h;
                if (i10 == -1) {
                    i0Var3.v.d.V2.N(false);
                    i0Var3.d.D(0);
                    return;
                }
                return;
            case 6:
                vf.c cVar = (vf.c) this.f48146b;
                if (i10 == -1) {
                    if (cVar.onBackPressed(true)) {
                        cVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    cVar.X();
                    return;
                } else {
                    return;
                }
            case 7:
                vf.k kVar = (vf.k) this.f48146b;
                if (i10 == -1) {
                    if (kVar.onBackPressed(true)) {
                        kVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    kVar.h0();
                    return;
                } else {
                    return;
                }
            case 8:
                vf.l0 l0Var = (vf.l0) this.f48146b;
                if (i10 == -1) {
                    if (l0Var.onBackPressed(true)) {
                        l0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    l0Var.a0();
                    return;
                } else {
                    return;
                }
            case 9:
                vf.n0 n0Var = (vf.n0) this.f48146b;
                if (i10 == -1) {
                    if (n0Var.onBackPressed(true)) {
                        n0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    n0Var.X();
                    return;
                } else {
                    return;
                }
            case 10:
                v0 v0Var = (v0) this.f48146b;
                if (i10 == -1) {
                    if (v0Var.onBackPressed(true)) {
                        v0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    v0Var.W();
                    return;
                } else {
                    return;
                }
            case 11:
                x0 x0Var = (x0) this.f48146b;
                if (i10 == -1) {
                    if (x0Var.onBackPressed(true)) {
                        x0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    x0Var.d0();
                    return;
                } else {
                    return;
                }
            case 12:
                if (i10 == -1) {
                    ((z0) this.f48146b).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((r1) this.f48146b).finishFragment();
                    return;
                }
                return;
        }
    }
}
