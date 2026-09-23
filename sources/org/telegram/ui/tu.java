package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tu extends org.telegram.ui.Components.z71 {
    public final wu f37757a;

    public tu(wu wuVar) {
        this.f37757a = wuVar;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        boolean z10;
        su suVar = (su) view;
        suVar.Y2 = i10;
        suVar.f37424f3.clear();
        if (suVar.w1(6) + suVar.y1(6) <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        suVar.f37430m3 = z10;
        suVar.z1();
        suVar.A1(false);
        suVar.u0(0);
    }

    @Override
    public final View d(int i10) {
        wu wuVar = this.f37757a;
        return new su(wuVar, wuVar.getParentActivity());
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
