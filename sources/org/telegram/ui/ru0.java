package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.messenger.voip.VoIPService;
public final class ru0 implements Runnable {
    public final int f51802a;
    public final Object f51803b;

    public ru0(Object obj, int i7) {
        this.f51802a = i7;
        this.f51803b = obj;
    }

    @Override
    public final void run() {
        int i7 = this.f51802a;
        int i10 = 0;
        Object obj = this.f51803b;
        switch (i7) {
            case 0:
                su0 su0Var = (su0) obj;
                su0Var.G.getNotificationCenter().j(su0Var.F);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) ((ai.k0) obj).f1264c;
                if (profileActivity.f43647t5 != 1.0f) {
                    av0 av0Var = profileActivity.f43607o0;
                    while (av0Var.E0.k(i10) != av0Var.getRealCount() - 1) {
                        i10++;
                    }
                    av0Var.x(i10, true);
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = ((rv0) obj).f51808b;
                RectF rectF = ProfileActivity.Z6;
                profileActivity2.getMessagesController().p5(profileActivity2.f43540e1, 0, true, new hi.k9(profileActivity2, true, 2));
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
                ax0Var.f45697f.add(ax0Var.f45695c);
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
                        org.telegram.ui.Components.gc I = lcVar.I(2131624092, org.telegram.messenger.gd.M0(2131746027, null), org.telegram.messenger.gd.M0(2131745990, null));
                        I.f35461j = 5000;
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
                saveToGallerySettingsActivity.f43712w.clear();
                saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.f43704a, saveToGallerySettingsActivity.f43712w);
                saveToGallerySettingsActivity.e0();
                return;
            case 12:
                org.telegram.ui.Components.x20 x20Var = (org.telegram.ui.Components.x20) obj;
                x20Var.dismiss();
                vf.c.t(x20Var.getContext(), org.telegram.messenger.gd.M0(2131746423, null));
                return;
            case 13:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.h60) obj).f35759c;
                Runnable runnable = secretMediaViewer.f43744n0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f43744n0 = null;
                    return;
                }
                return;
            case 14:
                tz0 tz0Var = ((sz0) obj).f52115a;
                tz0Var.R = true;
                tz0Var.O.invalidate();
                return;
            case 15:
                ((org.telegram.messenger.ks) obj).o();
                return;
            case 16:
                org.telegram.messenger.g0.T3(((j01) obj).f48834c, true, true);
                return;
            case 17:
                org.telegram.ui.Components.z41 z41Var = ((b21) obj).f45736e2;
                if (z41Var != null) {
                    z41Var.O(true);
                    return;
                }
                return;
            case 18:
                ((u11) obj).a();
                return;
            case 19:
                kg.f.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 20:
                c51 c51Var = (c51) obj;
                c51Var.f46423n0.a(c51Var.f46420k0.f38906f0, c51Var.f46421l0.isAttachedToWindow());
                return;
            case 21:
                ((b91) obj).J.f54146r.f();
                return;
            case 22:
                ((j91) obj).f48928b.G0();
                return;
            case 23:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 24:
                ((yb1) obj).f54168a.y();
                return;
            case 25:
                ((zb1) obj).f54477a.y();
                return;
            case 26:
                hc1 hc1Var = ((xb1) obj).f53784b;
                hc1Var.L0.e();
                org.telegram.ui.Components.voip.h2.d().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                hc1Var.Z.setCornerRadius(-1.0f);
                hc1Var.f48341d0.d.release();
                hc1Var.f48344e0.d.release();
                hc1Var.f48339c0.release();
                hc1Var.c();
                hc1Var.f48370u0.d();
                org.telegram.ui.Components.voip.h2.T = false;
                hc1Var.E0 = false;
                hc1.f48331m1 = null;
                org.telegram.ui.Components.voip.i2.g();
                return;
            case 27:
                fc1 fc1Var = (fc1) obj;
                fc1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (fc1Var.f47638a.f48361n0 && VoIPService.getSharedInstance() != null) {
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
