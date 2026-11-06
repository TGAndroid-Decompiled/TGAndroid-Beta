package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.messenger.voip.VoIPService;
public final class ru0 implements Runnable {
    public final int f49574a;
    public final Object f49575b;

    public ru0(Object obj, int i7) {
        this.f49574a = i7;
        this.f49575b = obj;
    }

    @Override
    public final void run() {
        int i7 = this.f49574a;
        int i10 = 0;
        Object obj = this.f49575b;
        switch (i7) {
            case 0:
                su0 su0Var = (su0) obj;
                su0Var.G.getNotificationCenter().j(su0Var.F);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) ((bi.x5) obj).f5027c;
                if (profileActivity.f41784n5 != 1.0f) {
                    av0 av0Var = profileActivity.f41780n0;
                    while (av0Var.D0.k(i10) != av0Var.getRealCount() - 1) {
                        i10++;
                    }
                    av0Var.x(i10, true);
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = ((rv0) obj).f49577b;
                RectF rectF = ProfileActivity.S6;
                profileActivity2.getMessagesController().d5(profileActivity2.f41712d1, 0, true, new fi.m9(2, profileActivity2, true));
                return;
            case 3:
                vv0 vv0Var = (vv0) obj;
                vv0Var.X0(vv0Var.getTabProgress());
                return;
            case 4:
                ((mw0) obj).c();
                return;
            case 5:
                ((ax0) obj).a();
                return;
            case 6:
                xw0 xw0Var = (xw0) obj;
                xw0Var.f52004f.add(xw0Var.f52002c);
                xw0Var.a();
                return;
            case 7:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                return;
            case 8:
                ((di.m6) obj).e();
                return;
            case 9:
                org.telegram.ui.Components.hc hcVar = (org.telegram.ui.Components.hc) obj;
                if (LaunchActivity.T() != null) {
                    if (hcVar == null) {
                        hcVar = org.telegram.ui.Components.hc.a0(LaunchActivity.T());
                    }
                    if (hcVar != null) {
                        org.telegram.ui.Components.cc I = hcVar.I(2131624091, org.telegram.messenger.hd.M0(2131746223, null), org.telegram.messenger.hd.M0(2131746186, null));
                        I.f32514j = 5000;
                        I.j();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((wy0) obj).invalidate();
                return;
            case 11:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.f41891w.clear();
                saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.f41883a, saveToGallerySettingsActivity.f41891w);
                saveToGallerySettingsActivity.e0();
                return;
            case 12:
                org.telegram.ui.Components.m20 m20Var = (org.telegram.ui.Components.m20) obj;
                m20Var.dismiss();
                vf.c.t(m20Var.getContext(), org.telegram.messenger.hd.M0(2131746617, null));
                return;
            case 13:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.v50) obj).f38860c;
                Runnable runnable = secretMediaViewer.m0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.m0 = null;
                    return;
                }
                return;
            case 14:
                rz0 rz0Var = ((qz0) obj).f49336a;
                rz0Var.Q = true;
                rz0Var.N.invalidate();
                return;
            case 15:
                ((org.telegram.messenger.qs) obj).o();
                return;
            case 16:
                org.telegram.messenger.g0.V3(((i01) obj).f46538c, true, true);
                return;
            case 17:
                org.telegram.ui.Components.l41 l41Var = ((a21) obj).f43551a2;
                if (l41Var != null) {
                    l41Var.O(true);
                    return;
                }
                return;
            case 18:
                ((t11) obj).a();
                return;
            case 19:
                kg.f.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 20:
                c51 c51Var = (c51) obj;
                c51Var.m0.a(c51Var.f44677j0.f34410e0, c51Var.f44678k0.isAttachedToWindow());
                return;
            case 21:
                ((z81) obj).J.f50664r.f();
                return;
            case 22:
                ((h91) obj).f46307b.G0();
                return;
            case 23:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 24:
                ((vb1) obj).f50690a.y();
                return;
            case 25:
                ((wb1) obj).f51049a.y();
                return;
            case 26:
                ec1 ec1Var = ((ub1) obj).f50388b;
                ec1Var.K0.e();
                org.telegram.ui.Components.voip.e2.d().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                ec1Var.Y.setCornerRadius(-1.0f);
                ec1Var.f45278c0.d.release();
                ec1Var.f45280d0.d.release();
                ec1Var.f45275b0.release();
                ec1Var.c();
                ec1Var.f45308t0.d();
                org.telegram.ui.Components.voip.e2.S = false;
                ec1Var.D0 = false;
                ec1.l1 = null;
                org.telegram.ui.Components.voip.f2.d();
                return;
            case 27:
                cc1 cc1Var = (cc1) obj;
                cc1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (cc1Var.f44749a.m0 && VoIPService.getSharedInstance() != null) {
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
