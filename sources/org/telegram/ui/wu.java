package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class wu extends org.telegram.ui.Components.a81 {
    public final zu f39388a;

    public wu(zu zuVar) {
        this.f39388a = zuVar;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        boolean z10;
        vu vuVar = (vu) view;
        vuVar.Y2 = i10;
        vuVar.f38627f3.clear();
        if (vuVar.w1(6) + vuVar.y1(6) <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        vuVar.f38633m3 = z10;
        vuVar.z1();
        vuVar.A1(false);
        vuVar.u0(0);
    }

    @Override
    public final View d(int i10) {
        zu zuVar = this.f39388a;
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
