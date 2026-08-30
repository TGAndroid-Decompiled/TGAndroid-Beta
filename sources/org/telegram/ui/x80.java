package org.telegram.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class x80 implements Runnable {
    public final int f39875a;
    public final LaunchActivity f39876b;

    public x80(LaunchActivity launchActivity, int i10) {
        this.f39875a = i10;
        this.f39876b = launchActivity;
    }

    @Override
    public final void run() {
        int i10 = this.f39875a;
        org.telegram.ui.ActionBar.p2 p2Var = null;
        LaunchActivity launchActivity = this.f39876b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f31612y1;
                org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(launchActivity, null);
                qbVar.d(R.raw.email_check_inbox, new String[0]);
                qbVar.f28100b.setText(launchActivity.getString(R.string.YourLoginEmailChangedSuccess));
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
                Pattern pattern2 = LaunchActivity.f31612y1;
                launchActivity.H(false, true, false);
                if (LaunchActivity.R() != null && LaunchActivity.R().getLastStoryViewer() != null) {
                    LaunchActivity.R().getLastStoryViewer().P();
                    return;
                }
                return;
            case 3:
                if (!launchActivity.f31638n0.getFragmentStack().isEmpty()) {
                    launchActivity.f31638n0.getFragmentStack().get(0).showDialog(new org.telegram.ui.Components.xx0(launchActivity, launchActivity.f31626g0, launchActivity.f31622e0, launchActivity.f31624f0));
                    return;
                }
                return;
            case 4:
                Pattern pattern3 = LaunchActivity.f31612y1;
                launchActivity.getClass();
                org.telegram.ui.Components.a30.f23278b0 = false;
                org.telegram.ui.Components.a30.j(launchActivity);
                return;
            case 5:
                ArrayList arrayList = launchActivity.f31614a0;
                ArrayList arrayList2 = launchActivity.f31616b0;
                if (AndroidUtilities.isTablet()) {
                    if (!arrayList2.isEmpty()) {
                        p2Var = (org.telegram.ui.ActionBar.p2) kh.a2.i(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    p2Var = (org.telegram.ui.ActionBar.p2) kh.a2.i(1, arrayList);
                }
                if (!(p2Var instanceof ProxyListActivity) && !(p2Var instanceof w11)) {
                    launchActivity.p0(new ProxyListActivity());
                    return;
                }
                return;
            case 6:
                if (!launchActivity.f31649s1) {
                    try {
                        org.telegram.ui.ActionBar.d2 C = org.telegram.ui.Components.z4.C(launchActivity);
                        C.setOnDismissListener(new y80(launchActivity, 0));
                        launchActivity.f31649s1 = true;
                        C.show();
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                return;
            case 7:
                if (launchActivity.Q0 != null) {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), android.support.v4.media.a.q(new StringBuilder("remote"), launchActivity.Q0.f19321id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.Q0;
                    org.telegram.ui.ActionBar.i6 u10 = org.telegram.ui.ActionBar.j6.u(file, tL_theme.title, tL_theme, true);
                    if (u10 != null) {
                        launchActivity.p0(new cd1(u10, true, 0, false, false));
                    }
                    launchActivity.h0();
                    return;
                }
                return;
            case 8:
                Pattern pattern4 = LaunchActivity.f31612y1;
                launchActivity.getClass();
                launchActivity.p0(new ec0());
                return;
            case 9:
                launchActivity.f31645q1 = null;
                return;
            default:
                launchActivity.f31647r1 = null;
                return;
        }
    }
}
