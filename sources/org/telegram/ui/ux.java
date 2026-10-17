package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class ux extends org.telegram.ui.ActionBar.g5 {
    public final ey f42066r;

    public ux(ey eyVar) {
        this.f42066r = eyVar;
    }

    @Override
    public final boolean b() {
        ey eyVar = this.f42066r;
        org.telegram.ui.ActionBar.u0 u0Var = eyVar.D1;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        if (eyVar.f36676n2 != null) {
            eyVar.finishFragment();
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        ey eyVar = this.f42066r;
        kVar = ((org.telegram.ui.ActionBar.n2) eyVar).actionBar;
        if (!kVar.s() && eyVar.R3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void m() {
        org.telegram.ui.Components.b10 b10Var;
        ey eyVar = this.f42066r;
        tx txVar = eyVar.X;
        if (txVar != null) {
            ArrayList arrayList = txVar.F;
            if (!arrayList.isEmpty() && txVar.H != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((hg.o0) arrayList.get(i10)).h) {
                        ((jx) txVar.H).c((hg.o0) arrayList.get(i10));
                    }
                }
            }
        }
        eyVar.f36658j2 = false;
        eyVar.f36663k2 = false;
        dy dyVar = eyVar.f36630e0[0];
        if (dyVar != null) {
            zx zxVar = dyVar.f36333a;
            if (eyVar.W2 == 0) {
                b10Var = dyVar.f36340w;
            } else {
                b10Var = null;
            }
            zxVar.setEmptyView(b10Var);
            eyVar.M4(false, false, true, false);
        }
        eyVar.X4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        eyVar.X.setCloseButtonVisible(false);
        eyVar.W4(true);
        eyVar.z3();
        eyVar.j3();
    }

    @Override
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.oo0 oo0Var;
        org.telegram.ui.Components.oo0 oo0Var2;
        ey eyVar = this.f42066r;
        eyVar.f36658j2 = true;
        org.telegram.ui.ActionBar.u0 u0Var = eyVar.D1;
        if (u0Var != null) {
            u0Var.setVisibility(8);
        }
        eyVar.K3();
        dy dyVar = eyVar.f36630e0[0];
        if (dyVar != null) {
            if (eyVar.f36676n2 != null) {
                dyVar.f36333a.c1();
                nx nxVar = eyVar.C0;
                if (nxVar != null) {
                    ai.u1 u1Var = nxVar.V;
                    if (u1Var.f27270g1) {
                        u1Var.f27270g1 = false;
                        u1Var.K0(false);
                    }
                }
            }
            if (!eyVar.f36667l2) {
                ei.x3 x3Var = eyVar.f36684p0;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                ei.x3 x3Var2 = eyVar.f36689q0;
                if (x3Var2 != null) {
                    x3Var2.e(true);
                }
            }
        }
        vw vwVar = eyVar.E0;
        if (vwVar != null && vwVar.getPremiumHint() != null) {
            eyVar.E0.getPremiumHint().e(true);
        }
        if (!eyVar.K) {
            eyVar.A4(0.0f);
        }
        eyVar.X4(false, false);
        kVar = ((org.telegram.ui.ActionBar.n2) eyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        eyVar.j3();
        nx nxVar2 = eyVar.C0;
        if (nxVar2 != null && (oo0Var2 = nxVar2.f31340b0) != null) {
            oo0Var2.f11875c = hg.e0.All;
        }
        if ((nxVar2 != null && (oo0Var = nxVar2.f31340b0) != null && oo0Var.N()) || eyVar.getMessagesController().getTotalDialogsCount() > 10 || eyVar.f36709t3 || eyVar.K) {
            eyVar.f36663k2 = true;
            if (!eyVar.f36692q3) {
                eyVar.M4(true, false, true, false);
            }
        }
        eyVar.X.setCloseButtonVisible(true);
        eyVar.W4(true);
        eyVar.z3();
    }

    @Override
    public final void q(EditText editText) {
        nx nxVar;
        org.telegram.ui.Components.oo0 oo0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        boolean z10 = true;
        ey eyVar = this.f42066r;
        if (!isEmpty || (((nxVar = eyVar.C0) != null && (oo0Var = nxVar.f31340b0) != null && oo0Var.N()) || eyVar.f36709t3 || eyVar.K)) {
            eyVar.f36663k2 = true;
            if (!eyVar.f36692q3) {
                eyVar.M4(true, false, true, false);
            }
        }
        nx nxVar2 = eyVar.C0;
        if (nxVar2 != null) {
            View currentView = nxVar2.getCurrentView();
            boolean z11 = !nxVar2.f31343e0;
            if (!TextUtils.isEmpty(nxVar2.K0)) {
                z10 = z11;
            }
            nxVar2.K0 = obj;
            nxVar2.O(currentView, nxVar2.getCurrentPosition(), obj, z10);
        }
    }
}
