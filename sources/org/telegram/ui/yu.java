package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yu extends org.telegram.ui.Components.l91 {
    public final bv f44564a;

    public yu(bv bvVar) {
        this.f44564a = bvVar;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        boolean z10;
        xu xuVar = (xu) view;
        xuVar.W2 = i10;
        xuVar.f44170d3.clear();
        if (xuVar.x1(6) + xuVar.z1(6) <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        xuVar.f44176k3 = z10;
        xuVar.A1();
        xuVar.B1(false);
        xuVar.u0(0);
    }

    @Override
    public final View d(int i10) {
        bv bvVar = this.f44564a;
        return new xu(bvVar, bvVar.getParentActivity());
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
