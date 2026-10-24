package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class ux extends org.telegram.ui.ActionBar.k5 {
    public final ey f42507r;

    public ux(ey eyVar) {
        this.f42507r = eyVar;
    }

    @Override
    public final boolean b() {
        ey eyVar = this.f42507r;
        org.telegram.ui.ActionBar.u0 u0Var = eyVar.D1;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        if (eyVar.f37080n2 != null) {
            eyVar.finishFragment();
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        ey eyVar = this.f42507r;
        kVar = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
        if (!kVar.s() && eyVar.R3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void m() {
        org.telegram.ui.Components.z00 z00Var;
        ey eyVar = this.f42507r;
        tx txVar = eyVar.X;
        if (txVar != null) {
            ArrayList arrayList = txVar.F;
            if (!arrayList.isEmpty() && txVar.H != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((hg.o0) arrayList.get(i10)).h) {
                        ((jx) txVar.H).f((hg.o0) arrayList.get(i10));
                    }
                }
            }
        }
        eyVar.f37062j2 = false;
        eyVar.f37067k2 = false;
        dy dyVar = eyVar.f37034e0[0];
        if (dyVar != null) {
            zx zxVar = dyVar.f36737a;
            if (eyVar.W2 == 0) {
                z00Var = dyVar.f36744w;
            } else {
                z00Var = null;
            }
            zxVar.setEmptyView(z00Var);
            eyVar.M4(false, false, true, false);
        }
        eyVar.Y4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        eyVar.X.setCloseButtonVisible(false);
        eyVar.X4(true);
        eyVar.z3();
        eyVar.i3();
    }

    @Override
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.ro0 ro0Var;
        org.telegram.ui.Components.ro0 ro0Var2;
        ey eyVar = this.f42507r;
        eyVar.f37062j2 = true;
        org.telegram.ui.ActionBar.u0 u0Var = eyVar.D1;
        if (u0Var != null) {
            u0Var.setVisibility(8);
        }
        eyVar.K3();
        dy dyVar = eyVar.f37034e0[0];
        if (dyVar != null) {
            if (eyVar.f37080n2 != null) {
                dyVar.f36737a.d1();
                nx nxVar = eyVar.C0;
                if (nxVar != null) {
                    ai.u1 u1Var = nxVar.V;
                    if (u1Var.f28382g1) {
                        u1Var.f28382g1 = false;
                        u1Var.K0(false);
                    }
                }
            }
            if (!eyVar.f37071l2) {
                ei.x3 x3Var = eyVar.f37088p0;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                ei.x3 x3Var2 = eyVar.f37093q0;
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
        eyVar.Y4(false, false);
        kVar = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        eyVar.i3();
        nx nxVar2 = eyVar.C0;
        if (nxVar2 != null && (ro0Var2 = nxVar2.f33303b0) != null) {
            ro0Var2.f11901c = hg.e0.All;
        }
        if ((nxVar2 != null && (ro0Var = nxVar2.f33303b0) != null && ro0Var.M()) || eyVar.getMessagesController().getTotalDialogsCount() > 10 || eyVar.f37113t3 || eyVar.K) {
            eyVar.f37067k2 = true;
            if (!eyVar.f37096q3) {
                eyVar.M4(true, false, true, false);
            }
        }
        eyVar.X.setCloseButtonVisible(true);
        eyVar.X4(true);
        eyVar.z3();
    }

    @Override
    public final void q(EditText editText) {
        nx nxVar;
        org.telegram.ui.Components.ro0 ro0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        boolean z10 = true;
        ey eyVar = this.f42507r;
        if (!isEmpty || (((nxVar = eyVar.C0) != null && (ro0Var = nxVar.f33303b0) != null && ro0Var.M()) || eyVar.f37113t3 || eyVar.K)) {
            eyVar.f37067k2 = true;
            if (!eyVar.f37096q3) {
                eyVar.M4(true, false, true, false);
            }
        }
        nx nxVar2 = eyVar.C0;
        if (nxVar2 != null) {
            View currentView = nxVar2.getCurrentView();
            boolean z11 = !nxVar2.f33306e0;
            if (!TextUtils.isEmpty(nxVar2.K0)) {
                z10 = z11;
            }
            nxVar2.K0 = obj;
            nxVar2.N(currentView, nxVar2.getCurrentPosition(), obj, z10);
        }
    }
}
