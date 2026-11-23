package org.telegram.ui;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class t60 implements Runnable {
    public final int f52242a;
    public final LaunchActivity f52243b;

    public t60(LaunchActivity launchActivity, int i7) {
        this.f52242a = i7;
        this.f52243b = launchActivity;
    }

    @Override
    public final void run() {
        WeakReference weakReference;
        int i7 = this.f52242a;
        org.telegram.ui.ActionBar.g2 g2Var = null;
        LaunchActivity launchActivity = this.f52243b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(launchActivity, null);
                obVar.d(2131624009, new String[0]);
                obVar.f38158b.setText(org.telegram.messenger.hd.N0(2131742545, null));
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q != null) {
                    org.telegram.ui.Components.gc.g(Q, obVar, 1500).j();
                    try {
                        Q.fragmentView.performHapticFeedback(3, 2);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                if (launchActivity.W0) {
                    launchActivity.W0 = false;
                    launchActivity.F(false, false, true);
                    return;
                }
                return;
            case 2:
                if (!launchActivity.f43154w1) {
                    try {
                        org.telegram.ui.ActionBar.t1 z10 = org.telegram.ui.Components.c5.z(launchActivity);
                        z10.setOnDismissListener(new l70(launchActivity, 0));
                        launchActivity.f43154w1 = true;
                        z10.show();
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                return;
            case 3:
                String str2 = LaunchActivity.C1;
                launchActivity.F(false, true, false);
                if (LaunchActivity.Q() != null && LaunchActivity.Q().getLastStoryViewer() != null) {
                    LaunchActivity.Q().getLastStoryViewer().V();
                    return;
                }
                return;
            case 4:
                if (!launchActivity.f43139p0.getFragmentStack().isEmpty()) {
                    launchActivity.f43139p0.getFragmentStack().get(0).showDialog(new org.telegram.ui.Components.kw0(launchActivity, launchActivity.f43132k0, launchActivity.f43128i0, launchActivity.f43130j0));
                    return;
                }
                return;
            case 5:
                String str3 = LaunchActivity.C1;
                launchActivity.getClass();
                org.telegram.ui.Components.c20.f33982g0 = false;
                org.telegram.ui.Components.c20.k(launchActivity);
                return;
            case 6:
                String str4 = LaunchActivity.C1;
                if (org.telegram.messenger.g0.f24029g != -10 && org.telegram.messenger.g0.f24027f == -10 && launchActivity.getResources().getConfiguration().smallestScreenWidthDp < 600 && (weakReference = org.telegram.messenger.g0.f24032i) != null && weakReference.get() == launchActivity) {
                    int i10 = org.telegram.messenger.g0.h;
                    int i11 = org.telegram.messenger.g0.f24029g;
                    org.telegram.messenger.g0.f24029g = -10;
                    org.telegram.messenger.g0.h = -10;
                    org.telegram.messenger.g0.f24032i = null;
                    try {
                        launchActivity.setRequestedOrientation(i10);
                        launchActivity.setRequestedOrientation(i11);
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                return;
            case 7:
                launchActivity.f43150u1 = null;
                return;
            case 8:
                if (launchActivity.T0 != null) {
                    File file = new File(org.telegram.messenger.t0.h(), a8.p0.r(new StringBuilder("remote"), launchActivity.T0.f28573id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.T0;
                    org.telegram.ui.ActionBar.l6 v = org.telegram.ui.ActionBar.m6.v(file, tL_theme.title, tL_theme, true);
                    if (v != null) {
                        launchActivity.t0(new x71(v, true, 0, false, false));
                    }
                    launchActivity.i0();
                    return;
                }
                return;
            case 9:
                ArrayList arrayList = launchActivity.f43120e0;
                ArrayList arrayList2 = launchActivity.f43122f0;
                if (org.telegram.messenger.g0.Q1()) {
                    if (!arrayList2.isEmpty()) {
                        g2Var = (org.telegram.ui.ActionBar.g2) i5.c.h(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    g2Var = (org.telegram.ui.ActionBar.g2) i5.c.h(1, arrayList);
                }
                if (!(g2Var instanceof ProxyListActivity) && !(g2Var instanceof yx0)) {
                    launchActivity.t0(new ProxyListActivity());
                    return;
                }
                return;
            case 10:
                launchActivity.f43152v1 = null;
                return;
            default:
                String str5 = LaunchActivity.C1;
                launchActivity.getClass();
                launchActivity.t0(new z90());
                return;
        }
    }
}
