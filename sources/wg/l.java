package wg;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import bi.t6;
import di.f4;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.u2;
import org.telegram.ui.Components.xb;
import tg.a2;
public final class l extends u2 {
    public static l f59202p1;
    public final j f59203m1;
    public final u0 n1;
    public boolean f59204o1;

    public l(Activity activity, y yVar, u0 u0Var, e6 e6Var, boolean z10) {
        super(1, (Context) activity, e6Var, true);
        boolean z11;
        this.n1 = u0Var;
        this.f29720w0 = false;
        this.f29718v0 = false;
        this.U0 = false;
        v0(0);
        O();
        if (i0.a.h(j6.w0(j6.f28922h5, this.J0)) > 0.699999988079071d) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.messenger.g0.q3(this, z11);
        this.f59204o1 = getContext().getResources().getConfiguration().orientation == 2;
        j jVar = new j(this, getContext(), u0Var, e6Var, yVar);
        this.f59203m1 = jVar;
        jVar.setOverScrollMode(2);
        jVar.setClipToPadding(false);
        jVar.setAdapter(new f4(yVar, u0Var));
        jVar.setPosition(0);
        this.O = jVar;
        yVar.f59287p2 = new i(this, 0);
        yVar.f59285n2 = new sg.h0(this, u0Var, false, 9);
        u0Var.f59258q2 = new k(this, yVar, e6Var);
        u0Var.f59256o2 = new i(this, 1);
        if (!z10) {
            np.s1(this.f29679a).P1().U();
        }
        xb.a(this.f29685c, new bi.t(14));
    }

    public static void I0(e2 e2Var, e6 e6Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        e2 e2Var2;
        if (f59202p1 != null) {
            return;
        }
        boolean z10 = e6Var instanceof fi.b;
        if (z10) {
            e2Var2 = new t6(e2Var);
        } else {
            e2Var2 = e2Var;
        }
        l lVar = new l(e2Var.getParentActivity(), new y(e2Var2, j3, prepaidGiveaway), new u0(e2Var2, j3), e2Var2.getResourceProvider(), z10);
        lVar.show();
        f59202p1 = lVar;
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final void L() {
        super.L();
        f59202p1 = null;
    }

    @Override
    public final void c0(Configuration configuration) {
        boolean z10;
        this.n1.c0(configuration);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f59204o1 = z10;
    }

    @Override
    public final void onBackPressed() {
        String M0;
        j jVar = this.f59203m1;
        if (jVar.getCurrentPosition() > 0) {
            u0 u0Var = this.n1;
            HashSet hashSet = u0Var.f59243a2;
            int size = hashSet.size();
            HashSet hashSet2 = u0Var.f59244b2;
            if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
                if (this.d) {
                    org.telegram.messenger.g0.v1(u0Var.f29682b);
                }
                jVar.C(0);
                return;
            }
            int i7 = u0Var.f59255n2;
            Context context = u0Var.getContext();
            e6 e6Var = u0Var.J0;
            p0 p0Var = new p0(u0Var, 0);
            p0 p0Var2 = new p0(u0Var, 6);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
            String M02 = hd.M0(2131743835, "UnsavedChanges");
            t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M02;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        M0 = "";
                    } else {
                        M0 = hd.M0(2131753596, "BoostingApplyChangesCountries");
                    }
                } else {
                    M0 = hd.M0(2131753597, "BoostingApplyChangesChannels");
                }
            } else {
                M0 = hd.M0(2131753595, "BoostingApplyChangesUsers");
            }
            t1Var.U = M0;
            alertDialog$Builder.k(hd.M0(2131754216, "ApplyTheme"), new a2(p0Var, 11));
            alertDialog$Builder.h(hd.M0(2131751406, "Discard"), new a2(p0Var2, 8));
            alertDialog$Builder.p();
            return;
        }
        super.onBackPressed();
    }
}
