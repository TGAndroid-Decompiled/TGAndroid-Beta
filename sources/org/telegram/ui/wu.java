package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class wu extends org.telegram.ui.Components.y81 {
    public final zu f42711a;

    public wu(zu zuVar) {
        this.f42711a = zuVar;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        boolean z10;
        vu vuVar = (vu) view;
        vuVar.f41823f3 = i10;
        vuVar.f41829m3.clear();
        if (vuVar.x1(6) + vuVar.z1(6) <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        vuVar.f41836t3 = z10;
        vuVar.A1();
        vuVar.B1(false);
        vuVar.v0(0);
    }

    @Override
    public final View d(int i10) {
        zu zuVar = this.f42711a;
        vu vuVar = new vu(zuVar, zuVar.getParentActivity());
        zuVar.f43914e.add(vuVar);
        return vuVar;
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
