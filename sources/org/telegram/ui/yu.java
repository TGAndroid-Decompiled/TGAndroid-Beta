package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yu extends org.telegram.ui.Components.b81 {
    public final bv f40027a;

    public yu(bv bvVar) {
        this.f40027a = bvVar;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        boolean z10;
        xu xuVar = (xu) view;
        xuVar.Y2 = i10;
        xuVar.f39711f3.clear();
        if (xuVar.x1(6) + xuVar.z1(6) <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        xuVar.f39717m3 = z10;
        xuVar.A1();
        xuVar.B1(false);
        xuVar.v0(0);
    }

    @Override
    public final View d(int i10) {
        bv bvVar = this.f40027a;
        xu xuVar = new xu(bvVar, bvVar.getParentActivity());
        bvVar.e.add(xuVar);
        return xuVar;
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
