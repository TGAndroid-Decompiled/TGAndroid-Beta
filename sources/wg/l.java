package wg;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import bi.e9;
import di.i4;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.fc;
public final class l extends w2 {
    public static l f59894p1;
    public final j f59895m1;
    public final v0 n1;
    public boolean f59896o1;

    public l(Activity activity, z zVar, v0 v0Var, i6 i6Var, boolean z10) {
        super(1, (Context) activity, i6Var, true);
        boolean z11;
        this.n1 = v0Var;
        this.f30264w0 = false;
        this.f30262v0 = false;
        this.U0 = false;
        v0(0);
        O();
        if (i0.a.h(n6.w0(n6.f29524h5, this.J0)) > 0.699999988079071d) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.messenger.g0.p3(this, z11);
        this.f59896o1 = getContext().getResources().getConfiguration().orientation == 2;
        j jVar = new j(this, getContext(), v0Var, i6Var, zVar);
        this.f59895m1 = jVar;
        jVar.setOverScrollMode(2);
        jVar.setClipToPadding(false);
        jVar.setAdapter(new i4(zVar, v0Var));
        jVar.setPosition(0);
        this.O = jVar;
        zVar.f59983p2 = new i(this, 0);
        zVar.f59981n2 = new s2.e(this, v0Var, false, 10);
        v0Var.f59954q2 = new k(this, zVar, i6Var);
        v0Var.f59952o2 = new i(this, 1);
        if (!z10) {
            mp.u1(this.f30223a).R1().U();
        }
        fc.a(this.f30229c, new bi.t(14));
    }

    public static void J0(g2 g2Var, i6 i6Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        g2 g2Var2;
        if (f59894p1 != null) {
            return;
        }
        boolean z10 = i6Var instanceof fi.b;
        if (z10) {
            g2Var2 = new e9(g2Var);
        } else {
            g2Var2 = g2Var;
        }
        l lVar = new l(g2Var.getParentActivity(), new z(g2Var2, j3, prepaidGiveaway), new v0(g2Var2, j3), g2Var2.getResourceProvider(), z10);
        lVar.show();
        f59894p1 = lVar;
    }

    @Override
    public final boolean F() {
        return false;
    }

    @Override
    public final void L() {
        super.L();
        f59894p1 = null;
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
        this.f59896o1 = z10;
    }

    @Override
    public final void onBackPressed() {
        String N0;
        j jVar = this.f59895m1;
        if (jVar.getCurrentPosition() > 0) {
            v0 v0Var = this.n1;
            HashSet hashSet = v0Var.f59939a2;
            int size = hashSet.size();
            HashSet hashSet2 = v0Var.f59940b2;
            if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
                if (this.d) {
                    org.telegram.messenger.g0.v1(v0Var.f30226b);
                }
                jVar.C(0);
                return;
            }
            int i7 = v0Var.f59951n2;
            Context context = v0Var.getContext();
            i6 i6Var = v0Var.J0;
            q0 q0Var = new q0(v0Var, 0);
            q0 q0Var2 = new q0(v0Var, 6);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
            String N02 = gd.N0(2131743588, "UnsavedChanges");
            t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N02;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        N0 = "";
                    } else {
                        N0 = gd.N0(2131753593, "BoostingApplyChangesCountries");
                    }
                } else {
                    N0 = gd.N0(2131753594, "BoostingApplyChangesChannels");
                }
            } else {
                N0 = gd.N0(2131753592, "BoostingApplyChangesUsers");
            }
            t1Var.U = N0;
            alertDialog$Builder.k(gd.N0(2131754213, "ApplyTheme"), new tg.s(q0Var, 15));
            alertDialog$Builder.h(gd.N0(2131751394, "Discard"), new tg.s(q0Var2, 12));
            alertDialog$Builder.p();
            return;
        }
        super.onBackPressed();
    }
}
