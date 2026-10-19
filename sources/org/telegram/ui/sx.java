package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class sx extends org.telegram.ui.ActionBar.g5 {
    public final cy f41543r;

    public sx(cy cyVar) {
        this.f41543r = cyVar;
    }

    @Override
    public final boolean b() {
        cy cyVar = this.f41543r;
        org.telegram.ui.ActionBar.u0 u0Var = cyVar.D1;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        if (cyVar.f36159n2 != null) {
            cyVar.finishFragment();
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        cy cyVar = this.f41543r;
        kVar = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
        if (!kVar.t() && cyVar.R3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void m() {
        org.telegram.ui.Components.b10 b10Var;
        cy cyVar = this.f41543r;
        rx rxVar = cyVar.X;
        if (rxVar != null) {
            ArrayList arrayList = rxVar.F;
            if (!arrayList.isEmpty() && rxVar.H != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((hg.o0) arrayList.get(i10)).h) {
                        ((hx) rxVar.H).g((hg.o0) arrayList.get(i10));
                    }
                }
            }
        }
        cyVar.f36141j2 = false;
        cyVar.f36146k2 = false;
        ay ayVar = cyVar.f36113e0[0];
        if (ayVar != null) {
            xx xxVar = ayVar.f35452a;
            if (cyVar.W2 == 0) {
                b10Var = ayVar.f35459w;
            } else {
                b10Var = null;
            }
            xxVar.setEmptyView(b10Var);
            cyVar.M4(false, false, true, false);
        }
        cyVar.X4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        cyVar.X.setCloseButtonVisible(false);
        cyVar.W4(true);
        cyVar.z3();
        cyVar.j3();
    }

    @Override
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.oo0 oo0Var;
        org.telegram.ui.Components.oo0 oo0Var2;
        cy cyVar = this.f41543r;
        cyVar.f36141j2 = true;
        org.telegram.ui.ActionBar.u0 u0Var = cyVar.D1;
        if (u0Var != null) {
            u0Var.setVisibility(8);
        }
        cyVar.K3();
        ay ayVar = cyVar.f36113e0[0];
        if (ayVar != null) {
            if (cyVar.f36159n2 != null) {
                ayVar.f35452a.c1();
                lx lxVar = cyVar.C0;
                if (lxVar != null) {
                    ai.u1 u1Var = lxVar.V;
                    if (u1Var.f27287g1) {
                        u1Var.f27287g1 = false;
                        u1Var.K0(false);
                    }
                }
            }
            if (!cyVar.f36150l2) {
                ei.x3 x3Var = cyVar.f36167p0;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                ei.x3 x3Var2 = cyVar.f36172q0;
                if (x3Var2 != null) {
                    x3Var2.e(true);
                }
            }
        }
        tw twVar = cyVar.E0;
        if (twVar != null && twVar.getPremiumHint() != null) {
            cyVar.E0.getPremiumHint().e(true);
        }
        if (!cyVar.K) {
            cyVar.A4(0.0f);
        }
        cyVar.X4(false, false);
        kVar = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        cyVar.j3();
        lx lxVar2 = cyVar.C0;
        if (lxVar2 != null && (oo0Var2 = lxVar2.f31351b0) != null) {
            oo0Var2.f11876c = hg.e0.All;
        }
        if ((lxVar2 != null && (oo0Var = lxVar2.f31351b0) != null && oo0Var.N()) || cyVar.getMessagesController().getTotalDialogsCount() > 10 || cyVar.f36192t3 || cyVar.K) {
            cyVar.f36146k2 = true;
            if (!cyVar.f36175q3) {
                cyVar.M4(true, false, true, false);
            }
        }
        cyVar.X.setCloseButtonVisible(true);
        cyVar.W4(true);
        cyVar.z3();
    }

    @Override
    public final void q(EditText editText) {
        lx lxVar;
        org.telegram.ui.Components.oo0 oo0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        boolean z10 = true;
        cy cyVar = this.f41543r;
        if (!isEmpty || (((lxVar = cyVar.C0) != null && (oo0Var = lxVar.f31351b0) != null && oo0Var.N()) || cyVar.f36192t3 || cyVar.K)) {
            cyVar.f36146k2 = true;
            if (!cyVar.f36175q3) {
                cyVar.M4(true, false, true, false);
            }
        }
        lx lxVar2 = cyVar.C0;
        if (lxVar2 != null) {
            View currentView = lxVar2.getCurrentView();
            boolean z11 = !lxVar2.f31354e0;
            if (!TextUtils.isEmpty(lxVar2.K0)) {
                z10 = z11;
            }
            lxVar2.K0 = obj;
            lxVar2.O(currentView, lxVar2.getCurrentPosition(), obj, z10);
        }
    }
}
