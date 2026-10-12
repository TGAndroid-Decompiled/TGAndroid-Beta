package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class uz0 implements Runnable {
    public final int f40838a;
    public final Object f40839b;

    public uz0(Object obj, int i10) {
        this.f40838a = i10;
        this.f40839b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f40838a;
        int i11 = 0;
        Object obj = this.f40839b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) ((ah.v) obj).f891c;
                if (profileActivity.f32625n5 != 1.0f) {
                    wz0 wz0Var = profileActivity.f32620n0;
                    while (wz0Var.D0.k(i11) != wz0Var.getRealCount() - 1) {
                        i11++;
                    }
                    wz0Var.x(i11, true);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = ((n01) obj).f38393b;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.f32559e1, 0, true, new di.ya(2, profileActivity2, true));
                return;
            case 2:
                r01 r01Var = (r01) obj;
                r01Var.M0(r01Var.getTabProgress());
                return;
            case 3:
                ((i11) obj).c();
                return;
            case 4:
                ((w11) obj).a();
                return;
            case 5:
                t11 t11Var = (t11) obj;
                t11Var.f40270f.add(t11Var.f40269c);
                t11Var.a();
                return;
            case 6:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                return;
            case 7:
                ((bi.i8) obj).e();
                return;
            case 8:
                org.telegram.ui.Components.zc zcVar = (org.telegram.ui.Components.zc) obj;
                if (LaunchActivity.U() != null) {
                    if (zcVar == null) {
                        zcVar = org.telegram.ui.Components.zc.a0(LaunchActivity.U());
                    }
                    if (zcVar != null) {
                        org.telegram.ui.Components.sc M = zcVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.f29102j = 5000;
                        M.j();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((r41) obj).invalidate();
                return;
            case 10:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f32719a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                return;
            case 11:
                b51 b51Var = (b51) obj;
                b51Var.dismiss();
                pf.d.s(b51Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 12:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.ql0) obj).f28643c;
                Runnable runnable = secretMediaViewer.f32758o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f32758o0 = null;
                    return;
                }
                return;
            case 13:
                r51 r51Var = ((q51) obj).f39345a;
                r51Var.Q = true;
                r51Var.N.invalidate();
                return;
            case 14:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 15:
                AndroidUtilities.updateViewShow(((g71) obj).f36329c, true);
                return;
            case 16:
                org.telegram.ui.Components.z61 z61Var = ((b81) obj).f34457i0;
                if (z61Var != null) {
                    z61Var.N(true);
                    return;
                }
                return;
            case 17:
                ((u71) obj).a();
                return;
            case 18:
                ig.f.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 19:
                ((nf1) obj).J.f37990r.l();
                return;
            case 20:
                ((vf1) obj).f40985b.C0();
                return;
            case 21:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 22:
                ((si1) obj).f40155a.G();
                return;
            case 23:
                ((ti1) obj).f40393a.G();
                return;
            case 24:
                dj1 dj1Var = ((ri1) obj).f39811b;
                dj1Var.L0.unlock();
                org.telegram.ui.Components.voip.k2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                dj1Var.Y.setCornerRadius(-1.0f);
                dj1Var.f35281c0.d.release();
                dj1Var.f35283d0.d.release();
                dj1Var.f35278b0.release();
                dj1Var.k();
                dj1Var.f35312u0.d();
                org.telegram.ui.Components.voip.k2.U = false;
                dj1Var.E0 = false;
                dj1.f35273n1 = null;
                return;
            case 25:
                bj1 bj1Var = (bj1) obj;
                bj1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (bj1Var.f34589a.f35303n0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ((VoIPPermissionActivity) obj).finish();
                return;
            default:
                int[][] iArr = WallpapersListActivity.f33971k0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
