package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xu extends org.telegram.ui.Components.a81 {
    public final av f42920a;

    public xu(av avVar) {
        this.f42920a = avVar;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        boolean z10;
        wu wuVar = (wu) view;
        wuVar.Y2 = i10;
        wuVar.f42512f3.clear();
        if (wuVar.v1(6) + wuVar.x1(6) <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        wuVar.f42518m3 = z10;
        wuVar.y1();
        wuVar.z1(false);
        wuVar.u0(0);
    }

    @Override
    public final View d(int i10) {
        av avVar = this.f42920a;
        return new wu(avVar, avVar.getParentActivity());
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
