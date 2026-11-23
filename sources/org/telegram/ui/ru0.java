package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.messenger.voip.VoIPService;
public final class ru0 implements Runnable {
    public final int f51770a;
    public final Object f51771b;

    public ru0(Object obj, int i7) {
        this.f51770a = i7;
        this.f51771b = obj;
    }

    @Override
    public final void run() {
        int i7 = this.f51770a;
        int i10 = 0;
        Object obj = this.f51771b;
        switch (i7) {
            case 0:
                su0 su0Var = (su0) obj;
                su0Var.G.getNotificationCenter().j(su0Var.F);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) ((ai.l0) obj).f1282c;
                if (profileActivity.f43692t5 != 1.0f) {
                    av0 av0Var = profileActivity.f43652o0;
                    while (av0Var.E0.k(i10) != av0Var.getRealCount() - 1) {
                        i10++;
                    }
                    av0Var.x(i10, true);
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = ((rv0) obj).f51776b;
                RectF rectF = ProfileActivity.Z6;
                profileActivity2.getMessagesController().p5(profileActivity2.f43585e1, 0, true, new hi.j9(profileActivity2, true, 2));
                return;
            case 3:
                vv0 vv0Var = (vv0) obj;
                vv0Var.Z0(vv0Var.getTabProgress());
                return;
            case 4:
                ((ow0) obj).c();
                return;
            case 5:
                ((dx0) obj).a();
                return;
            case 6:
                ax0 ax0Var = (ax0) obj;
                ax0Var.f45727f.add(ax0Var.f45725c);
                ax0Var.a();
                return;
            case 7:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                return;
            case 8:
                ((fi.d6) obj).e();
                return;
            case 9:
                org.telegram.ui.Components.lc lcVar = (org.telegram.ui.Components.lc) obj;
                if (LaunchActivity.T() != null) {
                    if (lcVar == null) {
                        lcVar = org.telegram.ui.Components.lc.b0(LaunchActivity.T());
                    }
                    if (lcVar != null) {
                        org.telegram.ui.Components.gc I = lcVar.I(2131624092, org.telegram.messenger.hd.N0(2131746026, null), org.telegram.messenger.hd.N0(2131745989, null));
                        I.f35527j = 5000;
                        I.j();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((yy0) obj).invalidate();
                return;
            case 11:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.f43757w.clear();
                saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.f43749a, saveToGallerySettingsActivity.f43757w);
                saveToGallerySettingsActivity.e0();
                return;
            case 12:
                org.telegram.ui.Components.a30 a30Var = (org.telegram.ui.Components.a30) obj;
                a30Var.dismiss();
                vf.c.t(a30Var.getContext(), org.telegram.messenger.hd.N0(2131746422, null));
                return;
            case 13:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.h10) obj).f35743c;
                Runnable runnable = secretMediaViewer.f43789n0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f43789n0 = null;
                    return;
                }
                return;
            case 14:
                uz0 uz0Var = ((tz0) obj).f52419a;
                uz0Var.R = true;
                uz0Var.O.invalidate();
                return;
            case 15:
                ((org.telegram.messenger.ls) obj).o();
                return;
            case 16:
                org.telegram.messenger.g0.T3(((k01) obj).f49162c, true, true);
                return;
            case 17:
                org.telegram.ui.Components.c51 c51Var = ((c21) obj).f46397e2;
                if (c51Var != null) {
                    c51Var.O(true);
                    return;
                }
                return;
            case 18:
                ((v11) obj).a();
                return;
            case 19:
                kg.f.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 20:
                c51 c51Var2 = (c51) obj;
                c51Var2.f46449n0.a(c51Var2.f46446k0.f40047f0, c51Var2.f46447l0.isAttachedToWindow());
                return;
            case 21:
                ((b91) obj).J.f54136r.f();
                return;
            case 22:
                ((j91) obj).f48945b.G0();
                return;
            case 23:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 24:
                ((yb1) obj).f54160a.y();
                return;
            case 25:
                ((zb1) obj).f54522a.y();
                return;
            case 26:
                hc1 hc1Var = ((xb1) obj).f53825b;
                hc1Var.L0.e();
                org.telegram.ui.Components.voip.h2.d().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                hc1Var.Z.setCornerRadius(-1.0f);
                hc1Var.f48339d0.d.release();
                hc1Var.f48342e0.d.release();
                hc1Var.f48337c0.release();
                hc1Var.c();
                hc1Var.f48368u0.d();
                org.telegram.ui.Components.voip.h2.T = false;
                hc1Var.E0 = false;
                hc1.f48329m1 = null;
                org.telegram.ui.Components.voip.i2.g();
                return;
            case 27:
                fc1 fc1Var = (fc1) obj;
                fc1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (fc1Var.f47669a.f48359n0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                ((VoIPPermissionActivity) obj).finish();
                return;
            default:
                ((WallpapersListActivity) obj).G0(false);
                return;
        }
    }
}
