package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yu extends org.telegram.ui.Components.n81 {
    public final bv f39114a;

    public yu(bv bvVar) {
        this.f39114a = bvVar;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        boolean z10;
        xu xuVar = (xu) view;
        xuVar.Y2 = i10;
        xuVar.f38821f3.clear();
        if (xuVar.v1(6) + xuVar.x1(6) <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        xuVar.f38827m3 = z10;
        xuVar.y1();
        xuVar.z1(false);
        xuVar.u0(0);
    }

    @Override
    public final View d(int i10) {
        bv bvVar = this.f39114a;
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
