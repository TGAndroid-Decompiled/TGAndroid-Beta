package qh;

import android.os.Bundle;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import sf.u1;
import sf.v0;
import sf.x0;
import sf.z0;
public final class e extends org.telegram.ui.ActionBar.k {
    public final int f46690a;
    public final Object f46691b;

    public e(Object obj, int i10) {
        this.f46690a = i10;
        this.f46691b = obj;
    }

    @Override
    public final void b(int i10) {
        switch (this.f46690a) {
            case 0:
                if (i10 == -1) {
                    ((g) this.f46691b).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((n) this.f46691b).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((q) this.f46691b).finishFragment();
                    return;
                }
                return;
            case 3:
                i0 i0Var = ((c0) this.f46691b).h;
                if (i10 == -1) {
                    if (i0Var.J) {
                        i0Var.dismiss();
                        return;
                    }
                    i0Var.v.d.U2.N(false);
                    i0Var.d.D(0);
                    return;
                } else if (i10 == 3) {
                    i0Var.f46714c.a(true, true);
                    i0Var.setAllowNestedScroll(false);
                    i0Var.O = null;
                    i0Var.C.U2.N(true);
                    i0Var.A.f34546r.getText().clear();
                    i0Var.A.f34546r.requestFocus();
                    AndroidUtilities.showKeyboard(i0Var.A.f34546r);
                    return;
                } else {
                    return;
                }
            case 4:
                i0 i0Var2 = ((d0) this.f46691b).f46689r;
                if (i10 == 2) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", i0Var2.f46715e);
                    i0Var2.f46719s.presentFragment(new n(bundle));
                    i0Var2.dismiss();
                    return;
                } else if (i10 == 3) {
                    i0Var2.f46713b.a(true, true);
                    i0Var2.setAllowNestedScroll(false);
                    TextUtils.isEmpty(i0Var2.N);
                    i0Var2.N = null;
                    i0Var2.B.h(0L, i0Var2.f46715e, 0L, 0L, null, false, null, true);
                    i0Var2.f46722y.f34546r.getText().clear();
                    i0Var2.f46722y.f34546r.requestFocus();
                    AndroidUtilities.showKeyboard(i0Var2.f46722y.f34546r);
                    return;
                } else {
                    return;
                }
            case 5:
                i0 i0Var3 = ((h0) this.f46691b).h;
                if (i10 == -1) {
                    i0Var3.v.d.U2.N(false);
                    i0Var3.d.D(0);
                    return;
                }
                return;
            case 6:
                sf.d dVar = (sf.d) this.f46691b;
                if (i10 == -1) {
                    if (dVar.onBackPressed(true)) {
                        dVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    dVar.X();
                    return;
                } else {
                    return;
                }
            case 7:
                sf.l lVar = (sf.l) this.f46691b;
                if (i10 == -1) {
                    if (lVar.onBackPressed(true)) {
                        lVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    lVar.h0();
                    return;
                } else {
                    return;
                }
            case 8:
                sf.l0 l0Var = (sf.l0) this.f46691b;
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
                sf.n0 n0Var = (sf.n0) this.f46691b;
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
                v0 v0Var = (v0) this.f46691b;
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
                x0 x0Var = (x0) this.f46691b;
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
                    ((z0) this.f46691b).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((u1) this.f46691b).finishFragment();
                    return;
                }
                return;
        }
    }
}
