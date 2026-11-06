package wg;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import bi.g5;
import bi.w4;
import fi.r7;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Components.cc;
public final class l extends v2 {
    public static l l1;
    public final j f57655i1;
    public final w0 f57656j1;
    public boolean f57657k1;

    public l(Activity activity, a0 a0Var, w0 w0Var, f6 f6Var, boolean z9) {
        super(1, (Context) activity, f6Var, true);
        boolean z10;
        this.f57656j1 = w0Var;
        this.f28647v0 = false;
        this.f28646u0 = false;
        this.T0 = false;
        v0(0);
        N();
        if (i0.a.h(k6.w0(k6.f27921h5, this.I0)) > 0.699999988079071d) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.messenger.g0.q3(this, z10);
        this.f57657k1 = getContext().getResources().getConfiguration().orientation == 2;
        j jVar = new j(this, getContext(), w0Var, f6Var, a0Var);
        this.f57655i1 = jVar;
        jVar.setOverScrollMode(2);
        jVar.setClipToPadding(false);
        jVar.setAdapter(new g5(a0Var, w0Var));
        jVar.setPosition(0);
        this.N = jVar;
        a0Var.f57571l2 = new i(this, 0);
        a0Var.f57569j2 = new sg.i0(this, w0Var, false, 9);
        w0Var.f57715m2 = new k(this, a0Var, f6Var);
        w0Var.f57713k2 = new i(this, 1);
        if (!z9) {
            qp.s1(this.f28612a).P1().U();
        }
        cc.a(this.f28618c, new r7(13));
    }

    public static void I0(f2 f2Var, f6 f6Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        f2 f2Var2;
        if (l1 != null) {
            return;
        }
        boolean z9 = f6Var instanceof di.b;
        if (z9) {
            f2Var2 = new w4(f2Var);
        } else {
            f2Var2 = f2Var;
        }
        l lVar = new l(f2Var.getParentActivity(), new a0(f2Var2, j3, prepaidGiveaway), new w0(f2Var2, j3), f2Var2.getResourceProvider(), z9);
        lVar.show();
        l1 = lVar;
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final void K() {
        super.K();
        l1 = null;
    }

    @Override
    public final void c0(Configuration configuration) {
        boolean z9;
        this.f57656j1.c0(configuration);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f57657k1 = z9;
    }

    @Override
    public final void onBackPressed() {
        String M0;
        j jVar = this.f57655i1;
        if (jVar.getCurrentPosition() > 0) {
            w0 w0Var = this.f57656j1;
            HashSet hashSet = w0Var.W1;
            int size = hashSet.size();
            HashSet hashSet2 = w0Var.X1;
            if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
                if (this.d) {
                    org.telegram.messenger.g0.v1(w0Var.f28615b);
                }
                jVar.E(0);
                return;
            }
            int i7 = w0Var.f57712j2;
            Context context = w0Var.getContext();
            f6 f6Var = w0Var.I0;
            r0 r0Var = new r0(w0Var, 0);
            r0 r0Var2 = new r0(w0Var, 6);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
            String M02 = hd.M0(2131743836, "UnsavedChanges");
            u1 u1Var = alertDialog$Builder.f27292a;
            u1Var.R = M02;
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
            u1Var.T = M0;
            alertDialog$Builder.k(hd.M0(2131754216, "ApplyTheme"), new u5.e(r0Var, 7));
            alertDialog$Builder.h(hd.M0(2131751407, "Discard"), new u5.e(r0Var2, 4));
            alertDialog$Builder.p();
            return;
        }
        super.onBackPressed();
    }
}
