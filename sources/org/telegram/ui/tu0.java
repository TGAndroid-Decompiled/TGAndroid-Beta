package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.messenger.voip.VoIPService;
public final class tu0 implements Runnable {
    public final int f50243a;
    public final Object f50244b;

    public tu0(Object obj, int i7) {
        this.f50243a = i7;
        this.f50244b = obj;
    }

    @Override
    public final void run() {
        int i7 = this.f50243a;
        int i10 = 0;
        Object obj = this.f50244b;
        switch (i7) {
            case 0:
                uu0 uu0Var = (uu0) obj;
                uu0Var.G.getNotificationCenter().j(uu0Var.F);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) ((bi.x5) obj).f5025c;
                if (profileActivity.f41808p5 != 1.0f) {
                    cv0 cv0Var = profileActivity.f41791n0;
                    while (cv0Var.D0.k(i10) != cv0Var.getRealCount() - 1) {
                        i10++;
                    }
                    cv0Var.x(i10, true);
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = ((tv0) obj).f50246b;
                RectF rectF = ProfileActivity.V6;
                profileActivity2.getMessagesController().d5(profileActivity2.f41723d1, 0, true, new fi.l9(2, profileActivity2, true));
                return;
            case 3:
                xv0 xv0Var = (xv0) obj;
                xv0Var.Z0(xv0Var.getTabProgress());
                return;
            case 4:
                ((ow0) obj).c();
                return;
            case 5:
                ((ex0) obj).a();
                return;
            case 6:
                bx0 bx0Var = (bx0) obj;
                bx0Var.f44156f.add(bx0Var.f44154c);
                bx0Var.a();
                return;
            case 7:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                return;
            case 8:
                ((di.n6) obj).e();
                return;
            case 9:
                org.telegram.ui.Components.hc hcVar = (org.telegram.ui.Components.hc) obj;
                if (LaunchActivity.T() != null) {
                    if (hcVar == null) {
                        hcVar = org.telegram.ui.Components.hc.a0(LaunchActivity.T());
                    }
                    if (hcVar != null) {
                        org.telegram.ui.Components.cc I = hcVar.I(2131624091, org.telegram.messenger.id.M0(2131746222, null), org.telegram.messenger.id.M0(2131746185, null));
                        I.f32627j = 5000;
                        I.j();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((zy0) obj).invalidate();
                return;
            case 11:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.f41902w.clear();
                saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.f41894a, saveToGallerySettingsActivity.f41902w);
                saveToGallerySettingsActivity.e0();
                return;
            case 12:
                org.telegram.ui.Components.n20 n20Var = (org.telegram.ui.Components.n20) obj;
                n20Var.dismiss();
                vf.c.t(n20Var.getContext(), org.telegram.messenger.id.M0(2131746618, null));
                return;
            case 13:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.w50) obj).f39919c;
                Runnable runnable = secretMediaViewer.m0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.m0 = null;
                    return;
                }
                return;
            case 14:
                uz0 uz0Var = ((tz0) obj).f50269a;
                uz0Var.Q = true;
                uz0Var.N.invalidate();
                return;
            case 15:
                ((org.telegram.messenger.qs) obj).o();
                return;
            case 16:
                org.telegram.messenger.g0.V3(((k01) obj).f47146c, true, true);
                return;
            case 17:
                org.telegram.ui.Components.m41 m41Var = ((c21) obj).f44201a2;
                if (m41Var != null) {
                    m41Var.O(true);
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
                d51 d51Var = (d51) obj;
                d51Var.m0.a(d51Var.f44839j0.f35139e0, d51Var.f44840k0.isAttachedToWindow());
                return;
            case 21:
                ((b91) obj).J.f52049r.f();
                return;
            case 22:
                ((j91) obj).f46898b.G0();
                return;
            case 23:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 24:
                ((zb1) obj).f52495a.y();
                return;
            case 25:
                ((ac1) obj).f43670a.y();
                return;
            case 26:
                ic1 ic1Var = ((yb1) obj).f52076b;
                ic1Var.K0.e();
                org.telegram.ui.Components.voip.e2.d().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                ic1Var.Y.setCornerRadius(-1.0f);
                ic1Var.f46578c0.d.release();
                ic1Var.f46580d0.d.release();
                ic1Var.f46575b0.release();
                ic1Var.c();
                ic1Var.f46608t0.d();
                org.telegram.ui.Components.voip.e2.S = false;
                ic1Var.D0 = false;
                ic1.l1 = null;
                org.telegram.ui.Components.voip.f2.d();
                return;
            case 27:
                gc1 gc1Var = (gc1) obj;
                gc1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (gc1Var.f45974a.m0 && VoIPService.getSharedInstance() != null) {
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
