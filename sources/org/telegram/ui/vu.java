package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vu extends org.telegram.ui.Components.e81 {
    public final yu f42301a;

    public vu(yu yuVar) {
        this.f42301a = yuVar;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        boolean z4;
        uu uuVar = (uu) view;
        uuVar.V2 = i10;
        uuVar.c3.clear();
        if (uuVar.w1(6) + uuVar.y1(6) <= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        uuVar.f42046j3 = z4;
        uuVar.z1();
        uuVar.A1(false);
        uuVar.u0(0);
    }

    @Override
    public final View d(int i10) {
        yu yuVar = this.f42301a;
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
