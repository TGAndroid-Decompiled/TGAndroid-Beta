package org.telegram.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class y80 implements Runnable {
    public final int f43574a;
    public final LaunchActivity f43575b;

    public y80(LaunchActivity launchActivity, int i10) {
        this.f43574a = i10;
        this.f43575b = launchActivity;
    }

    @Override
    public final void run() {
        int i10 = this.f43574a;
        org.telegram.ui.ActionBar.p2 p2Var = null;
        LaunchActivity launchActivity = this.f43575b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f34134y1;
                org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(launchActivity, null);
                qbVar.d(R.raw.email_check_inbox, new String[0]);
                qbVar.f30375b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    org.telegram.ui.Components.ic.g(R, qbVar, 1500).j();
                    try {
                        R.fragmentView.performHapticFeedback(3, 2);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                if (launchActivity.T0) {
                    launchActivity.T0 = false;
                    launchActivity.H(false, false, true);
                    return;
                }
                return;
            case 2:
                Pattern pattern2 = LaunchActivity.f34134y1;
                launchActivity.H(false, true, false);
                if (LaunchActivity.R() != null && LaunchActivity.R().getLastStoryViewer() != null) {
                    LaunchActivity.R().getLastStoryViewer().P();
                    return;
                }
                return;
            case 3:
                if (!launchActivity.f34160n0.getFragmentStack().isEmpty()) {
                    launchActivity.f34160n0.getFragmentStack().get(0).showDialog(new org.telegram.ui.Components.xx0(launchActivity, launchActivity.f34148g0, launchActivity.f34144e0, launchActivity.f34146f0));
                    return;
                }
                return;
            case 4:
                Pattern pattern3 = LaunchActivity.f34134y1;
                launchActivity.getClass();
                org.telegram.ui.Components.c30.f25748b0 = false;
                org.telegram.ui.Components.c30.j(launchActivity);
                return;
            case 5:
                ArrayList arrayList = launchActivity.f34136a0;
                ArrayList arrayList2 = launchActivity.f34138b0;
                if (AndroidUtilities.isTablet()) {
                    if (!arrayList2.isEmpty()) {
                        p2Var = (org.telegram.ui.ActionBar.p2) l.d.i(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    p2Var = (org.telegram.ui.ActionBar.p2) l.d.i(1, arrayList);
                }
                if (!(p2Var instanceof ProxyListActivity) && !(p2Var instanceof d21)) {
                    launchActivity.p0(new ProxyListActivity());
                    return;
                }
                return;
            case 6:
                if (!launchActivity.f34171s1) {
                    try {
                        org.telegram.ui.ActionBar.d2 C = org.telegram.ui.Components.z4.C(launchActivity);
                        C.setOnDismissListener(new z80(launchActivity, 0));
                        launchActivity.f34171s1 = true;
                        C.show();
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                return;
            case 7:
                if (launchActivity.Q0 != null) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), android.support.v4.media.a.q(new StringBuilder("remote"), launchActivity.Q0.f20982id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.Q0;
                    org.telegram.ui.ActionBar.j6 u10 = org.telegram.ui.ActionBar.k6.u(file, tL_theme.title, tL_theme, true);
                    if (u10 != null) {
                        launchActivity.p0(new jd1(u10, true, 0, false, false));
                    }
                    launchActivity.h0();
                    return;
                }
                return;
            case 8:
                Pattern pattern4 = LaunchActivity.f34134y1;
                launchActivity.getClass();
                launchActivity.p0(new fc0());
                return;
            case 9:
                launchActivity.f34167q1 = null;
                return;
            default:
                launchActivity.f34169r1 = null;
                return;
        }
    }
}
