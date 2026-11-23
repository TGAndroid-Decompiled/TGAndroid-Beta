package wg;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import bi.b9;
import di.i4;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.gc;
import tg.o1;
public final class l extends w2 {
    public static l f59830p1;
    public final j f59831m1;
    public final w0 n1;
    public boolean f59832o1;

    public l(Activity activity, a0 a0Var, w0 w0Var, h6 h6Var, boolean z10) {
        super(1, (Context) activity, h6Var, true);
        boolean z11;
        this.n1 = w0Var;
        this.f30214w0 = false;
        this.f30212v0 = false;
        this.U0 = false;
        v0(0);
        O();
        if (i0.a.h(m6.w0(m6.f29454h5, this.J0)) > 0.699999988079071d) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.messenger.g0.p3(this, z11);
        this.f59832o1 = getContext().getResources().getConfiguration().orientation == 2;
        j jVar = new j(this, getContext(), w0Var, h6Var, a0Var);
        this.f59831m1 = jVar;
        jVar.setOverScrollMode(2);
        jVar.setClipToPadding(false);
        jVar.setAdapter(new i4(a0Var, w0Var));
        jVar.setPosition(0);
        this.O = jVar;
        a0Var.f59752p2 = new i(this, 0);
        a0Var.f59750n2 = new sg.h0(this, w0Var, false, 9);
        w0Var.f59894q2 = new k(this, a0Var, h6Var);
        w0Var.f59892o2 = new i(this, 1);
        if (!z10) {
            np.u1(this.f30173a).R1().U();
        }
        gc.a(this.f30179c, new bi.t(14));
    }

    public static void J0(g2 g2Var, h6 h6Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        g2 g2Var2;
        if (f59830p1 != null) {
            return;
        }
        boolean z10 = h6Var instanceof fi.b;
        if (z10) {
            g2Var2 = new b9(g2Var);
        } else {
            g2Var2 = g2Var;
        }
        l lVar = new l(g2Var.getParentActivity(), new a0(g2Var2, j3, prepaidGiveaway), new w0(g2Var2, j3), g2Var2.getResourceProvider(), z10);
        lVar.show();
        f59830p1 = lVar;
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final void L() {
        super.L();
        f59830p1 = null;
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
        this.f59832o1 = z10;
    }

    @Override
    public final void onBackPressed() {
        String N0;
        j jVar = this.f59831m1;
        if (jVar.getCurrentPosition() > 0) {
            w0 w0Var = this.n1;
            HashSet hashSet = w0Var.f59879a2;
            int size = hashSet.size();
            HashSet hashSet2 = w0Var.f59880b2;
            if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
                if (this.d) {
                    org.telegram.messenger.g0.v1(w0Var.f30176b);
                }
                jVar.A(0);
                return;
            }
            int i7 = w0Var.f59891n2;
            Context context = w0Var.getContext();
            h6 h6Var = w0Var.J0;
            r0 r0Var = new r0(w0Var, 0);
            r0 r0Var2 = new r0(w0Var, 6);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
            String N02 = hd.N0(2131743590, "UnsavedChanges");
            t1 t1Var = alertDialog$Builder.f28777a;
            t1Var.S = N02;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        N0 = "";
                    } else {
                        N0 = hd.N0(2131753593, "BoostingApplyChangesCountries");
                    }
                } else {
                    N0 = hd.N0(2131753594, "BoostingApplyChangesChannels");
                }
            } else {
                N0 = hd.N0(2131753592, "BoostingApplyChangesUsers");
            }
            t1Var.U = N0;
            alertDialog$Builder.k(hd.N0(2131754213, "ApplyTheme"), new o1(r0Var, 13));
            alertDialog$Builder.h(hd.N0(2131751394, "Discard"), new o1(r0Var2, 10));
            alertDialog$Builder.p();
            return;
        }
        super.onBackPressed();
    }
}
