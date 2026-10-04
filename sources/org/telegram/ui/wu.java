package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class wu extends org.telegram.ui.Components.x81 {
    public final zu f42644a;

    public wu(zu zuVar) {
        this.f42644a = zuVar;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        boolean z10;
        vu vuVar = (vu) view;
        vuVar.f41825f3 = i10;
        vuVar.f41831m3.clear();
        if (vuVar.y1(6) + vuVar.A1(6) <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        vuVar.f41838t3 = z10;
        vuVar.B1();
        vuVar.C1(false);
        vuVar.v0(0);
    }

    @Override
    public final View d(int i10) {
        zu zuVar = this.f42644a;
        vu vuVar = new vu(zuVar, zuVar.getParentActivity());
        zuVar.f43907e.add(vuVar);
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
