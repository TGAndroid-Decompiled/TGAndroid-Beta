package org.telegram.ui;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class s60 implements Runnable {
    public final int f49663a;
    public final LaunchActivity f49664b;

    public s60(LaunchActivity launchActivity, int i7) {
        this.f49663a = i7;
        this.f49664b = launchActivity;
    }

    @Override
    public final void run() {
        WeakReference weakReference;
        int i7 = this.f49663a;
        org.telegram.ui.ActionBar.f2 f2Var = null;
        LaunchActivity launchActivity = this.f49664b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.B1;
                org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(launchActivity, null);
                kbVar.d(2131624008, new String[0]);
                kbVar.f35243b.setText(org.telegram.messenger.hd.M0(2131742812, null));
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    org.telegram.ui.Components.cc.g(Q, kbVar, 1500).j();
                    try {
                        Q.fragmentView.performHapticFeedback(3, 2);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                if (launchActivity.V0) {
                    launchActivity.V0 = false;
                    launchActivity.F(false, false, true);
                    return;
                }
                return;
            case 2:
                if (!launchActivity.f41290v1) {
                    try {
                        org.telegram.ui.ActionBar.u1 z9 = org.telegram.ui.Components.v4.z(launchActivity);
                        z9.setOnDismissListener(new k70(launchActivity, 0));
                        launchActivity.f41290v1 = true;
                        z9.show();
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                return;
            case 3:
                String str2 = LaunchActivity.B1;
                launchActivity.F(false, true, false);
                if (LaunchActivity.Q() != null && LaunchActivity.Q().getLastStoryViewer() != null) {
                    LaunchActivity.Q().getLastStoryViewer().V();
                    return;
                }
                return;
            case 4:
                if (!launchActivity.f41275o0.getFragmentStack().isEmpty()) {
                    launchActivity.f41275o0.getFragmentStack().get(0).showDialog(new org.telegram.ui.Components.yv0(launchActivity, launchActivity.f41268j0, launchActivity.f41264h0, launchActivity.f41266i0));
                    return;
                }
                return;
            case 5:
                String str3 = LaunchActivity.B1;
                launchActivity.getClass();
                org.telegram.ui.Components.p10.f36737f0 = false;
                org.telegram.ui.Components.p10.k(launchActivity);
                return;
            case 6:
                String str4 = LaunchActivity.B1;
                if (org.telegram.messenger.g0.f22527g != -10 && org.telegram.messenger.g0.f22525f == -10 && launchActivity.getResources().getConfiguration().smallestScreenWidthDp < 600 && (weakReference = org.telegram.messenger.g0.f22530i) != null && weakReference.get() == launchActivity) {
                    int i10 = org.telegram.messenger.g0.h;
                    int i11 = org.telegram.messenger.g0.f22527g;
                    org.telegram.messenger.g0.f22527g = -10;
                    org.telegram.messenger.g0.h = -10;
                    org.telegram.messenger.g0.f22530i = null;
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
                launchActivity.f41286t1 = null;
                return;
            case 8:
                if (launchActivity.S0 != null) {
                    File file = new File(org.telegram.messenger.t0.h(), a8.p0.r(new StringBuilder("remote"), launchActivity.S0.f27092id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.S0;
                    org.telegram.ui.ActionBar.j6 v = org.telegram.ui.ActionBar.k6.v(file, tL_theme.title, tL_theme, true);
                    if (v != null) {
                        launchActivity.t0(new u71(v, true, 0, false, false));
                    }
                    launchActivity.i0();
                    return;
                }
                return;
            case 9:
                ArrayList arrayList = launchActivity.f41256d0;
                ArrayList arrayList2 = launchActivity.f41258e0;
                if (org.telegram.messenger.g0.Q1()) {
                    if (!arrayList2.isEmpty()) {
                        f2Var = (org.telegram.ui.ActionBar.f2) jg.g.i(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    f2Var = (org.telegram.ui.ActionBar.f2) jg.g.i(1, arrayList);
                }
                if (!(f2Var instanceof ProxyListActivity) && !(f2Var instanceof ux0)) {
                    launchActivity.t0(new ProxyListActivity());
                    return;
                }
                return;
            case 10:
                launchActivity.f41288u1 = null;
                return;
            default:
                String str5 = LaunchActivity.B1;
                launchActivity.getClass();
                launchActivity.t0(new w90());
                return;
        }
    }
}
