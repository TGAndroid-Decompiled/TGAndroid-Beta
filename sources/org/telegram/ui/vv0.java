package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class vv0 implements Runnable {
    public final int f42614a;
    public final Object f42615b;

    public vv0(Object obj, int i10) {
        this.f42614a = i10;
        this.f42615b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f42614a;
        int i11 = 0;
        Object obj = this.f42615b;
        switch (i10) {
            case 0:
                ((vh.p2) obj).e(true);
                return;
            case 1:
                RectF rectF = ProfileActivity.S6;
                org.telegram.messenger.i0.g("@" + org.telegram.messenger.i20.n((TLRPC.User) obj));
                return;
            case 2:
                bw0 bw0Var = (bw0) obj;
                bw0Var.G.getNotificationCenter().j(bw0Var.F);
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) ((fg.i) obj).f7079c;
                if (profileActivity.f33876n5 != 1.0f) {
                    jw0 jw0Var = profileActivity.f33871n0;
                    while (jw0Var.D0.k(i11) != jw0Var.getRealCount() - 1) {
                        i11++;
                    }
                    jw0Var.x(i11, true);
                    return;
                }
                return;
            case 4:
                ProfileActivity profileActivity2 = ((cx0) obj).f36436b;
                RectF rectF2 = ProfileActivity.S6;
                profileActivity2.getMessagesController().a5(profileActivity2.f33803d1, 0, true, new bv0(0, profileActivity2, true));
                return;
            case 5:
                hx0 hx0Var = (hx0) obj;
                hx0Var.V0(hx0Var.getTabProgress());
                return;
            case 6:
                ((zx0) obj).c();
                return;
            case 7:
                ((ny0) obj).a();
                return;
            case 8:
                ky0 ky0Var = (ky0) obj;
                ky0Var.f39029f.add(ky0Var.f39028c);
                ky0Var.a();
                return;
            case 9:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                return;
            case 10:
                ((th.t4) obj).e();
                return;
            case 11:
                org.telegram.ui.Components.cc ccVar = (org.telegram.ui.Components.cc) obj;
                if (LaunchActivity.T() != null) {
                    if (ccVar == null) {
                        ccVar = org.telegram.ui.Components.cc.a0(LaunchActivity.T());
                    }
                    if (ccVar != null) {
                        org.telegram.ui.Components.wb I = ccVar.I(2131624089, org.telegram.messenger.dd.L0(2131746239, null), org.telegram.messenger.dd.L0(2131746202, null));
                        I.f32201j = 5000;
                        I.j();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((k01) obj).invalidate();
                return;
            case 13:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.f33981w.clear();
                saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.f33974a, saveToGallerySettingsActivity.f33981w);
                saveToGallerySettingsActivity.e0();
                return;
            case 14:
                org.telegram.ui.Components.e30 e30Var = (org.telegram.ui.Components.e30) obj;
                e30Var.dismiss();
                gf.f.r(e30Var.getContext(), org.telegram.messenger.dd.L0(2131746633, null));
                return;
            case 15:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.jw0) obj).f27584c;
                Runnable runnable = secretMediaViewer.m0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.m0 = null;
                    return;
                }
                return;
            case 16:
                h11 h11Var = ((g11) obj).f37272a;
                h11Var.Q = true;
                h11Var.N.invalidate();
                return;
            case 17:
                ((org.telegram.messenger.at) obj).o();
                return;
            case 18:
                org.telegram.messenger.i0.U3(((y11) obj).f43534c, true, true);
                return;
            case 19:
                org.telegram.ui.Components.q51 q51Var = ((q31) obj).a2;
                if (q51Var != null) {
                    q51Var.O(true);
                    return;
                }
                return;
            case 20:
                ((j31) obj).a();
                return;
            case 21:
                ag.k.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 22:
                s61 s61Var = (s61) obj;
                s61Var.m0.a(s61Var.f41249j0.f28276e0, s61Var.f41250k0.isAttachedToWindow());
                return;
            case 23:
                ((qa1) obj).J.f39833r.f();
                return;
            case 24:
                ((za1) obj).f43873b.G0();
                return;
            case 25:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 26:
                ((pd1) obj).f40464a.G();
                return;
            case 27:
                ((qd1) obj).f40757a.G();
                return;
            case 28:
                zd1 zd1Var = ((od1) obj).f40140b;
                zd1Var.L0.e();
                org.telegram.ui.Components.voip.u1.d().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                zd1Var.Y.setCornerRadius(-1.0f);
                zd1Var.f43942c0.d.release();
                zd1Var.f43944d0.d.release();
                zd1Var.f43939b0.release();
                zd1Var.d();
                zd1Var.f43973u0.d();
                org.telegram.ui.Components.voip.u1.U = false;
                zd1Var.E0 = false;
                zd1.f43934n1 = null;
                return;
            default:
                xd1 xd1Var = (xd1) obj;
                xd1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (xd1Var.f43359a.f43964n0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
