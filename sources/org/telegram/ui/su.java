package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class su extends org.telegram.ui.Components.n81 {
    public final vu f37865a;

    public su(vu vuVar) {
        this.f37865a = vuVar;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        boolean z10;
        ru ruVar = (ru) view;
        ruVar.Y2 = i10;
        ruVar.f37470f3.clear();
        if (ruVar.w1(6) + ruVar.y1(6) <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ruVar.f37476m3 = z10;
        ruVar.z1();
        ruVar.A1(false);
        ruVar.u0(0);
    }

    @Override
    public final View d(int i10) {
        vu vuVar = this.f37865a;
        return new ru(vuVar, vuVar.getParentActivity());
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
