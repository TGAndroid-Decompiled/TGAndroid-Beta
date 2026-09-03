package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class wu extends org.telegram.ui.Components.c81 {
    public final zu f39773a;

    public wu(zu zuVar) {
        this.f39773a = zuVar;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        boolean z4;
        vu vuVar = (vu) view;
        vuVar.V2 = i10;
        vuVar.c3.clear();
        if (vuVar.v1(6) + vuVar.x1(6) <= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        vuVar.f39201j3 = z4;
        vuVar.y1();
        vuVar.z1(false);
        vuVar.u0(0);
    }

    @Override
    public final View d(int i10) {
        zu zuVar = this.f39773a;
        return new vu(zuVar, zuVar.getParentActivity());
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
