package wg;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import bi.z8;
import di.i4;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x2;
import org.telegram.ui.Components.gc;
import tg.z1;
public final class l extends x2 {
    public static l f59784p1;
    public final j f59785m1;
    public final w0 n1;
    public boolean f59786o1;

    public l(Activity activity, a0 a0Var, w0 w0Var, i6 i6Var, boolean z10) {
        super(1, (Context) activity, i6Var, true);
        boolean z11;
        this.n1 = w0Var;
        this.f30230w0 = false;
        this.f30228v0 = false;
        this.U0 = false;
        v0(0);
        O();
        if (i0.a.h(n6.w0(n6.f29469h5, this.J0)) > 0.699999988079071d) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.messenger.g0.p3(this, z11);
        this.f59786o1 = getContext().getResources().getConfiguration().orientation == 2;
        j jVar = new j(this, getContext(), w0Var, i6Var, a0Var);
        this.f59785m1 = jVar;
        jVar.setOverScrollMode(2);
        jVar.setClipToPadding(false);
        jVar.setAdapter(new i4(a0Var, w0Var));
        jVar.setPosition(0);
        this.O = jVar;
        a0Var.f59709p2 = new i(this, 0);
        a0Var.f59707n2 = new sg.h0(this, w0Var, false, 9);
        w0Var.f59848q2 = new k(this, a0Var, i6Var);
        w0Var.f59846o2 = new i(this, 1);
        if (!z10) {
            mp.u1(this.f30189a).R1().U();
        }
        gc.a(this.f30195c, new bi.t(14));
    }

    public static void J0(h2 h2Var, i6 i6Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        h2 h2Var2;
        if (f59784p1 != null) {
            return;
        }
        boolean z10 = i6Var instanceof fi.b;
        if (z10) {
            h2Var2 = new z8(h2Var);
        } else {
            h2Var2 = h2Var;
        }
        l lVar = new l(h2Var.getParentActivity(), new a0(h2Var2, j3, prepaidGiveaway), new w0(h2Var2, j3), h2Var2.getResourceProvider(), z10);
        lVar.show();
        f59784p1 = lVar;
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final void L() {
        super.L();
        f59784p1 = null;
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
        this.f59786o1 = z10;
    }

    @Override
    public final void onBackPressed() {
        String M0;
        j jVar = this.f59785m1;
        if (jVar.getCurrentPosition() > 0) {
            w0 w0Var = this.n1;
            HashSet hashSet = w0Var.f59833a2;
            int size = hashSet.size();
            HashSet hashSet2 = w0Var.f59834b2;
            if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
                if (this.d) {
                    org.telegram.messenger.g0.v1(w0Var.f30192b);
                }
                jVar.A(0);
                return;
            }
            int i7 = w0Var.f59845n2;
            Context context = w0Var.getContext();
            i6 i6Var = w0Var.J0;
            r0 r0Var = new r0(w0Var, 0);
            r0 r0Var2 = new r0(w0Var, 6);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
            String M02 = gd.M0(2131743598, "UnsavedChanges");
            u1 u1Var = alertDialog$Builder.f28746a;
            u1Var.S = M02;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        M0 = "";
                    } else {
                        M0 = gd.M0(2131753594, "BoostingApplyChangesCountries");
                    }
                } else {
                    M0 = gd.M0(2131753595, "BoostingApplyChangesChannels");
                }
            } else {
                M0 = gd.M0(2131753593, "BoostingApplyChangesUsers");
            }
            u1Var.U = M0;
            alertDialog$Builder.k(gd.M0(2131754214, "ApplyTheme"), new z1(r0Var, 12));
            alertDialog$Builder.h(gd.M0(2131751395, "Discard"), new z1(r0Var2, 9));
            alertDialog$Builder.p();
            return;
        }
        super.onBackPressed();
    }
}
