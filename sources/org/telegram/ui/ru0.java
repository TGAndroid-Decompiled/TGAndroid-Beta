package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.messenger.voip.VoIPService;
public final class ru0 implements Runnable {
    public final int f49553a;
    public final Object f49554b;

    public ru0(Object obj, int i7) {
        this.f49553a = i7;
        this.f49554b = obj;
    }

    @Override
    public final void run() {
        int i7 = this.f49553a;
        int i10 = 0;
        Object obj = this.f49554b;
        switch (i7) {
            case 0:
                su0 su0Var = (su0) obj;
                su0Var.G.getNotificationCenter().j(su0Var.F);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) ((bi.x5) obj).f5027c;
                if (profileActivity.f41788n5 != 1.0f) {
                    av0 av0Var = profileActivity.f41784n0;
                    while (av0Var.D0.k(i10) != av0Var.getRealCount() - 1) {
                        i10++;
                    }
                    av0Var.x(i10, true);
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = ((rv0) obj).f49556b;
                RectF rectF = ProfileActivity.S6;
                profileActivity2.getMessagesController().d5(profileActivity2.f41716d1, 0, true, new fi.m9(2, profileActivity2, true));
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
                xw0Var.f51997f.add(xw0Var.f51995c);
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
                        org.telegram.ui.Components.cc I = hcVar.I(2131624091, org.telegram.messenger.id.M0(2131746225, null), org.telegram.messenger.id.M0(2131746188, null));
                        I.f32545j = 5000;
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
                saveToGallerySettingsActivity.f41895w.clear();
                saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.f41887a, saveToGallerySettingsActivity.f41895w);
                saveToGallerySettingsActivity.e0();
                return;
            case 12:
                org.telegram.ui.Components.m20 m20Var = (org.telegram.ui.Components.m20) obj;
                m20Var.dismiss();
                vf.c.t(m20Var.getContext(), org.telegram.messenger.id.M0(2131746619, null));
                return;
            case 13:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.v50) obj).f38895c;
                Runnable runnable = secretMediaViewer.m0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.m0 = null;
                    return;
                }
                return;
            case 14:
                rz0 rz0Var = ((qz0) obj).f49339a;
                rz0Var.Q = true;
                rz0Var.N.invalidate();
                return;
            case 15:
                ((org.telegram.messenger.qs) obj).o();
                return;
            case 16:
                org.telegram.messenger.g0.V3(((i01) obj).f46537c, true, true);
                return;
            case 17:
                org.telegram.ui.Components.l41 l41Var = ((a21) obj).f43554a2;
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
                c51Var.m0.a(c51Var.f44680j0.f34347e0, c51Var.f44681k0.isAttachedToWindow());
                return;
            case 21:
                ((a91) obj).J.f51028r.f();
                return;
            case 22:
                ((i91) obj).f46613b.G0();
                return;
            case 23:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 24:
                ((wb1) obj).f51054a.y();
                return;
            case 25:
                ((xb1) obj).f51823a.y();
                return;
            case 26:
                fc1 fc1Var = ((vb1) obj).f50634b;
                fc1Var.K0.e();
                org.telegram.ui.Components.voip.e2.d().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                fc1Var.Y.setCornerRadius(-1.0f);
                fc1Var.f45546c0.d.release();
                fc1Var.f45548d0.d.release();
                fc1Var.f45543b0.release();
                fc1Var.c();
                fc1Var.f45576t0.d();
                org.telegram.ui.Components.voip.e2.S = false;
                fc1Var.D0 = false;
                fc1.l1 = null;
                org.telegram.ui.Components.voip.f2.d();
                return;
            case 27:
                dc1 dc1Var = (dc1) obj;
                dc1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (dc1Var.f45045a.m0 && VoIPService.getSharedInstance() != null) {
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
