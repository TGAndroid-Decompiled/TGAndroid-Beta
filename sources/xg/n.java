package xg;

import ai.c7;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import ci.o4;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.Components.ac;
public final class n extends t2 {
    public static n m1;
    public final l f58731j1;
    public final w0 k1;
    public boolean f58732l1;

    public n(Activity activity, a0 a0Var, w0 w0Var, e6 e6Var, boolean z10) {
        super(1, (Context) activity, e6Var, true);
        boolean z11;
        this.k1 = w0Var;
        this.f28621w0 = false;
        this.f28619v0 = false;
        this.U0 = false;
        v0(0);
        N();
        if (i0.a.h(k6.w0(k6.f27954h5, this.J0)) > 0.699999988079071d) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.messenger.g0.q3(this, z11);
        this.f58732l1 = getContext().getResources().getConfiguration().orientation == 2;
        l lVar = new l(this, getContext(), w0Var, e6Var, a0Var);
        this.f58731j1 = lVar;
        lVar.setOverScrollMode(2);
        lVar.setClipToPadding(false);
        lVar.setAdapter(new o4(a0Var, w0Var));
        lVar.setPosition(0);
        this.O = lVar;
        a0Var.f58643m2 = new k(this, 0);
        a0Var.f58641k2 = new ua.b(this, w0Var, false, 4);
        w0Var.f58783n2 = new m(this, a0Var, e6Var);
        w0Var.f58781l2 = new k(this, 1);
        if (!z10) {
            hp.s1(this.f28583a).P1().U();
        }
        ac.a(this.f28589c, new ai.y(14));
    }

    public static void I0(d2 d2Var, e6 e6Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        d2 d2Var2;
        if (m1 != null) {
            return;
        }
        boolean z10 = e6Var instanceof ei.b;
        if (z10) {
            d2Var2 = new c7(d2Var);
        } else {
            d2Var2 = d2Var;
        }
        n nVar = new n(d2Var.getParentActivity(), new a0(d2Var2, j10, prepaidGiveaway), new w0(d2Var2, j10), d2Var2.getResourceProvider(), z10);
        nVar.show();
        m1 = nVar;
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final void K() {
        super.K();
        m1 = null;
    }

    @Override
    public final void c0(Configuration configuration) {
        boolean z10;
        this.k1.c0(configuration);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f58732l1 = z10;
    }

    @Override
    public final void onBackPressed() {
        String M0;
        l lVar = this.f58731j1;
        if (lVar.getCurrentPosition() > 0) {
            w0 w0Var = this.k1;
            HashSet hashSet = w0Var.X1;
            int size = hashSet.size();
            HashSet hashSet2 = w0Var.Y1;
            if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
                if (this.d) {
                    org.telegram.messenger.g0.v1(w0Var.f28586b);
                }
                lVar.D(0);
                return;
            }
            int i3 = w0Var.f58780k2;
            Context context = w0Var.getContext();
            e6 e6Var = w0Var.J0;
            r0 r0Var = new r0(w0Var, 0);
            r0 r0Var2 = new r0(w0Var, 6);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
            String M02 = bd.M0(2131743845, "UnsavedChanges");
            s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M02;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        M0 = "";
                    } else {
                        M0 = bd.M0(2131753596, "BoostingApplyChangesCountries");
                    }
                } else {
                    M0 = bd.M0(2131753597, "BoostingApplyChangesChannels");
                }
            } else {
                M0 = bd.M0(2131753595, "BoostingApplyChangesUsers");
            }
            s1Var.U = M0;
            alertDialog$Builder.k(bd.M0(2131754216, "ApplyTheme"), new c(r0Var, 2));
            alertDialog$Builder.h(bd.M0(2131751407, "Discard"), new e3(r0Var2, 29));
            alertDialog$Builder.p();
            return;
        }
        super.onBackPressed();
    }
}
