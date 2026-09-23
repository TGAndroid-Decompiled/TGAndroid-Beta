package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class xz0 implements Runnable {
    public final int f39681a;
    public final Object f39682b;

    public xz0(Object obj, int i10) {
        this.f39681a = i10;
        this.f39682b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f39681a;
        Object obj = this.f39682b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = ((a01) obj).f31621b;
                profileActivity.getMessagesController().toggleChatNoForwards(profileActivity.f31240e1, 0, true, new ci.za(true, profileActivity, 2));
                return;
            case 1:
                e01 e01Var = (e01) obj;
                e01Var.M0(e01Var.getTabProgress());
                return;
            case 2:
                ((v01) obj).c();
                return;
            case 3:
                ((j11) obj).a();
                return;
            case 4:
                g11 g11Var = (g11) obj;
                g11Var.f33434f.add(g11Var.f33433c);
                g11Var.a();
                return;
            case 5:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                return;
            case 6:
                ((ai.x8) obj).e();
                return;
            case 7:
                org.telegram.ui.Components.xc xcVar = (org.telegram.ui.Components.xc) obj;
                if (LaunchActivity.U() != null) {
                    if (xcVar == null) {
                        xcVar = org.telegram.ui.Components.xc.a0(LaunchActivity.U());
                    }
                    if (xcVar != null) {
                        org.telegram.ui.Components.qc M = xcVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.f27306j = 5000;
                        M.j();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((e41) obj).invalidate();
                return;
            case 9:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f31399a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                return;
            case 10:
                k41 k41Var = (k41) obj;
                k41Var.dismiss();
                nf.f.s(k41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 11:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.qk0) obj).f27380c;
                Runnable runnable = secretMediaViewer.f31438o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f31438o0 = null;
                    return;
                }
                return;
            case 12:
                a51 a51Var = ((z41) obj).f39960a;
                a51Var.Q = true;
                a51Var.N.invalidate();
                return;
            case 13:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 14:
                AndroidUtilities.updateViewShow(((o61) obj).f35691c, true);
                return;
            case 15:
                org.telegram.ui.Components.v51 v51Var = ((j71) obj).f34355i0;
                if (v51Var != null) {
                    v51Var.N(true);
                    return;
                }
                return;
            case 16:
                ((c71) obj).a();
                return;
            case 17:
                hg.g.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 18:
                ((ye1) obj).J.f38969r.l();
                return;
            case 19:
                ((gf1) obj).f33557b.C0();
                return;
            case 20:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 21:
                ((bi1) obj).f32126a.H();
                return;
            case 22:
                ((ci1) obj).f32360a.H();
                return;
            case 23:
                mi1 mi1Var = ((ai1) obj).f31807b;
                mi1Var.L0.unlock();
                org.telegram.ui.Components.voip.m2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                mi1Var.Y.setCornerRadius(-1.0f);
                mi1Var.f35308c0.d.release();
                mi1Var.f35310d0.d.release();
                mi1Var.f35305b0.release();
                mi1Var.l();
                mi1Var.f35339u0.d();
                org.telegram.ui.Components.voip.m2.T = false;
                mi1Var.E0 = false;
                mi1.f35300n1 = null;
                return;
            case 24:
                ki1 ki1Var = (ki1) obj;
                ki1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (ki1Var.f34735a.f35330n0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                ((VoIPPermissionActivity) obj).finish();
                return;
            default:
                int[][] iArr = WallpapersListActivity.f31589k0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
