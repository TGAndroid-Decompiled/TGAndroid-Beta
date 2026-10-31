package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class wv0 implements Runnable {
    public final int f43376a;
    public final Object f43377b;

    public wv0(Object obj, int i10) {
        this.f43376a = i10;
        this.f43377b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f43376a;
        int i11 = 0;
        Object obj = this.f43377b;
        switch (i10) {
            case 0:
                ((vh.p2) obj).e(true);
                return;
            case 1:
                RectF rectF = ProfileActivity.R6;
                org.telegram.messenger.i0.g("@" + org.telegram.messenger.h20.n((TLRPC.User) obj));
                return;
            case 2:
                cw0 cw0Var = (cw0) obj;
                cw0Var.G.getNotificationCenter().j(cw0Var.F);
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) ((fg.i) obj).f7078c;
                if (profileActivity.f33869n5 != 1.0f) {
                    kw0 kw0Var = profileActivity.f33864n0;
                    while (kw0Var.D0.k(i11) != kw0Var.getRealCount() - 1) {
                        i11++;
                    }
                    kw0Var.x(i11, true);
                    return;
                }
                return;
            case 4:
                ProfileActivity profileActivity2 = ((dx0) obj).f36859b;
                RectF rectF2 = ProfileActivity.R6;
                profileActivity2.getMessagesController().a5(profileActivity2.f33796d1, 0, true, new cv0(0, profileActivity2, true));
                return;
            case 5:
                ix0 ix0Var = (ix0) obj;
                ix0Var.U0(ix0Var.getTabProgress());
                return;
            case 6:
                ((ay0) obj).c();
                return;
            case 7:
                ((oy0) obj).a();
                return;
            case 8:
                ly0 ly0Var = (ly0) obj;
                ly0Var.f39439f.add(ly0Var.f39438c);
                ly0Var.a();
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
                        org.telegram.ui.Components.wb I = ccVar.I(2131624089, org.telegram.messenger.cd.L0(2131746239, null), org.telegram.messenger.cd.L0(2131746202, null));
                        I.f32135j = 5000;
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
                saveToGallerySettingsActivity.f33974w.clear();
                saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.f33967a, saveToGallerySettingsActivity.f33974w);
                saveToGallerySettingsActivity.d0();
                return;
            case 14:
                org.telegram.ui.Components.e30 e30Var = (org.telegram.ui.Components.e30) obj;
                e30Var.dismiss();
                gf.f.r(e30Var.getContext(), org.telegram.messenger.cd.L0(2131746633, null));
                return;
            case 15:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.iw0) obj).f27111c;
                Runnable runnable = secretMediaViewer.m0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.m0 = null;
                    return;
                }
                return;
            case 16:
                i11 i11Var = ((h11) obj).f37688a;
                i11Var.Q = true;
                i11Var.N.invalidate();
                return;
            case 17:
                ((org.telegram.messenger.zs) obj).o();
                return;
            case 18:
                org.telegram.messenger.i0.U3(((a21) obj).f35529c, true, true);
                return;
            case 19:
                org.telegram.ui.Components.p51 p51Var = ((s31) obj).a2;
                if (p51Var != null) {
                    p51Var.O(true);
                    return;
                }
                return;
            case 20:
                ((l31) obj).a();
                return;
            case 21:
                ag.k.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 22:
                u61 u61Var = (u61) obj;
                u61Var.m0.a(u61Var.f42036j0.f27914e0, u61Var.f42037k0.isAttachedToWindow());
                return;
            case 23:
                ((sa1) obj).J.f40602r.f();
                return;
            case 24:
                ((bb1) obj).f36164b.F0();
                return;
            case 25:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 26:
                ((rd1) obj).f41206a.G();
                return;
            case 27:
                ((sd1) obj).f41481a.G();
                return;
            case 28:
                be1 be1Var = ((qd1) obj).f40964b;
                be1Var.L0.e();
                org.telegram.ui.Components.voip.t1.d().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                be1Var.Y.setCornerRadius(-1.0f);
                be1Var.f36203c0.d.release();
                be1Var.f36205d0.d.release();
                be1Var.f36200b0.release();
                be1Var.d();
                be1Var.f36234u0.d();
                org.telegram.ui.Components.voip.t1.U = false;
                be1Var.E0 = false;
                be1.f36195n1 = null;
                return;
            default:
                zd1 zd1Var = (zd1) obj;
                zd1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (zd1Var.f44136a.f36225n0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
