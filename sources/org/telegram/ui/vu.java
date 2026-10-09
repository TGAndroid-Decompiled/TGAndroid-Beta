package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vu extends org.telegram.ui.Components.f91 {
    public final yu f42980a;

    public vu(yu yuVar) {
        this.f42980a = yuVar;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        boolean z10;
        uu uuVar = (uu) view;
        uuVar.W2 = i10;
        uuVar.f42557d3.clear();
        if (uuVar.x1(6) + uuVar.z1(6) <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        uuVar.f42563k3 = z10;
        uuVar.A1();
        uuVar.B1(false);
        uuVar.u0(0);
    }

    @Override
    public final View d(int i10) {
        yu yuVar = this.f42980a;
        return new uu(yuVar, yuVar.getParentActivity());
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
