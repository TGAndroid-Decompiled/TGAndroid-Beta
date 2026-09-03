package sh;

import android.os.Bundle;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import uf.r1;
import uf.v0;
import uf.x0;
import uf.z0;
public final class e extends org.telegram.ui.ActionBar.j {
    public final int f44395a;
    public final Object f44396b;

    public e(Object obj, int i10) {
        this.f44395a = i10;
        this.f44396b = obj;
    }

    @Override
    public final void b(int i10) {
        switch (this.f44395a) {
            case 0:
                if (i10 == -1) {
                    ((g) this.f44396b).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((n) this.f44396b).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((q) this.f44396b).finishFragment();
                    return;
                }
                return;
            case 3:
                i0 i0Var = ((c0) this.f44396b).h;
                if (i10 == -1) {
                    if (i0Var.K) {
                        i0Var.dismiss();
                        return;
                    }
                    i0Var.v.d.V2.N(false);
                    i0Var.d.D(0);
                    return;
                } else if (i10 == 3) {
                    i0Var.f44417c.a(true, true);
                    i0Var.setAllowNestedScroll(false);
                    i0Var.P = null;
                    i0Var.D.V2.N(true);
                    i0Var.B.f24117r.getText().clear();
                    i0Var.B.f24117r.requestFocus();
                    AndroidUtilities.showKeyboard(i0Var.B.f24117r);
                    return;
                } else {
                    return;
                }
            case 4:
                i0 i0Var2 = ((d0) this.f44396b).f44394r;
                if (i10 == 2) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", i0Var2.e);
                    i0Var2.f44421s.presentFragment(new n(bundle));
                    i0Var2.dismiss();
                    return;
                } else if (i10 == 3) {
                    i0Var2.f44416b.a(true, true);
                    i0Var2.setAllowNestedScroll(false);
                    TextUtils.isEmpty(i0Var2.O);
                    i0Var2.O = null;
                    i0Var2.C.h(0L, i0Var2.e, 0L, 0L, null, false, null, true);
                    i0Var2.f44424y.f24117r.getText().clear();
                    i0Var2.f44424y.f24117r.requestFocus();
                    AndroidUtilities.showKeyboard(i0Var2.f44424y.f24117r);
                    return;
                } else {
                    return;
                }
            case 5:
                i0 i0Var3 = ((h0) this.f44396b).h;
                if (i10 == -1) {
                    i0Var3.v.d.V2.N(false);
                    i0Var3.d.D(0);
                    return;
                }
                return;
            case 6:
                uf.c cVar = (uf.c) this.f44396b;
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
                uf.k kVar = (uf.k) this.f44396b;
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
                uf.l0 l0Var = (uf.l0) this.f44396b;
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
                uf.n0 n0Var = (uf.n0) this.f44396b;
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
                v0 v0Var = (v0) this.f44396b;
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
                x0 x0Var = (x0) this.f44396b;
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
                    ((z0) this.f44396b).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((r1) this.f44396b).finishFragment();
                    return;
                }
                return;
        }
    }
}
