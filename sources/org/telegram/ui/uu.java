package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class uu extends org.telegram.ui.Components.c81 {
    public final xu f39002a;

    public uu(xu xuVar) {
        this.f39002a = xuVar;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        boolean z4;
        tu tuVar = (tu) view;
        tuVar.V2 = i10;
        tuVar.c3.clear();
        if (tuVar.w1(6) + tuVar.y1(6) <= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        tuVar.f38759j3 = z4;
        tuVar.z1();
        tuVar.A1(false);
        tuVar.u0(0);
    }

    @Override
    public final View d(int i10) {
        xu xuVar = this.f39002a;
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
