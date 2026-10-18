package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class sy0 implements Runnable {
    public final int f41559a;
    public final Object f41560b;

    public sy0(Object obj, int i10) {
        this.f41559a = i10;
        this.f41560b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f41559a;
        int i11 = 0;
        Object obj = this.f41560b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) ((ah.v) obj).f897c;
                if (profileActivity.p5 != 1.0f) {
                    uy0 uy0Var = profileActivity.f33674o0;
                    while (uy0Var.D0.k(i11) != uy0Var.getRealCount() - 1) {
                        i11++;
                    }
                    uy0Var.x(i11, true);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = ((lz0) obj).f38990b;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.f33614f1, 0, true, new ei.ka(2, profileActivity2, true));
                return;
            case 2:
                pz0 pz0Var = (pz0) obj;
                pz0Var.O0(pz0Var.getTabProgress());
                return;
            case 3:
                ((g01) obj).c();
                return;
            case 4:
                ((v01) obj).a();
                return;
            case 5:
                s01 s01Var = (s01) obj;
                s01Var.f40875f.add(s01Var.f40874c);
                s01Var.a();
                return;
            case 6:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                return;
            case 7:
                ((ci.w6) obj).e();
                return;
            case 8:
                org.telegram.ui.Components.xc xcVar = (org.telegram.ui.Components.xc) obj;
                if (LaunchActivity.U() != null) {
                    if (xcVar == null) {
                        xcVar = org.telegram.ui.Components.xc.a0(LaunchActivity.U());
                    }
                    if (xcVar != null) {
                        org.telegram.ui.Components.qc M = xcVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.f29645j = 5000;
                        M.j();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((z21) obj).invalidate();
                return;
            case 10:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f33768a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                return;
            case 11:
                j31 j31Var = (j31) obj;
                j31Var.dismiss();
                pf.d.r(j31Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 12:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.ml0) obj).f28556c;
                Runnable runnable = secretMediaViewer.f33807o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f33807o0 = null;
                    return;
                }
                return;
            case 13:
                z31 z31Var = ((y31) obj).f43345a;
                z31Var.Q = true;
                z31Var.N.invalidate();
                return;
            case 14:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 15:
                AndroidUtilities.updateViewShow(((o51) obj).f39681c, true);
                return;
            case 16:
                org.telegram.ui.Components.s61 s61Var = ((j61) obj).f38079i0;
                if (s61Var != null) {
                    s61Var.N(true);
                    return;
                }
                return;
            case 17:
                ((c61) obj).a();
                return;
            case 18:
                ig.f.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 19:
                ((vd1) obj).J.f41738r.l();
                return;
            case 20:
                ((de1) obj).f36203b.C0();
                return;
            case 21:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 22:
                ((yg1) obj).f43431a.G();
                return;
            case 23:
                ((zg1) obj).f43773a.G();
                return;
            case 24:
                jh1 jh1Var = ((xg1) obj).f43158b;
                jh1Var.L0.unlock();
                org.telegram.ui.Components.voip.k2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                jh1Var.Y.setCornerRadius(-1.0f);
                jh1Var.f38195c0.d.release();
                jh1Var.f38197d0.d.release();
                jh1Var.f38192b0.release();
                jh1Var.k();
                jh1Var.f38226u0.d();
                org.telegram.ui.Components.voip.k2.U = false;
                jh1Var.E0 = false;
                jh1.f38187n1 = null;
                return;
            case 25:
                hh1 hh1Var = (hh1) obj;
                hh1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (hh1Var.f37580a.f38217n0 && VoIPService.getSharedInstance() != null) {
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
                int[][] iArr = WallpapersListActivity.f35243k0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
