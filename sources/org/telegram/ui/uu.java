package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class uu extends org.telegram.ui.Components.h91 {
    public final xu f42768a;

    public uu(xu xuVar) {
        this.f42768a = xuVar;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        boolean z10;
        tu tuVar = (tu) view;
        tuVar.W2 = i10;
        tuVar.f42269d3.clear();
        if (tuVar.x1(6) + tuVar.z1(6) <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        tuVar.f42275k3 = z10;
        tuVar.A1();
        tuVar.B1(false);
        tuVar.u0(0);
    }

    @Override
    public final View d(int i10) {
        xu xuVar = this.f42768a;
        return new tu(xuVar, xuVar.getParentActivity());
    }

    @Override
    public final int e() {
        return 4;
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return "";
                    }
                    return LocaleController.getString(R.string.NetworkUsageRoamingTab);
                }
                return LocaleController.getString(R.string.NetworkUsageWiFiTab);
            }
            return LocaleController.getString(R.string.NetworkUsageMobileTab);
        }
        return LocaleController.getString(R.string.NetworkUsageAllTab);
    }
}
