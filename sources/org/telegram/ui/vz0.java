package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class vz0 implements Runnable {
    public final int f38853a;
    public final Object f38854b;

    public vz0(Object obj, int i10) {
        this.f38853a = i10;
        this.f38854b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f38853a;
        Object obj = this.f38854b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = ((yz0) obj).f40295b;
                profileActivity.getMessagesController().toggleChatNoForwards(profileActivity.f31555e1, 0, true, new ci.za(true, profileActivity, 2));
                return;
            case 1:
                c01 c01Var = (c01) obj;
                c01Var.M0(c01Var.getTabProgress());
                return;
            case 2:
                ((t01) obj).c();
                return;
            case 3:
                ((h11) obj).a();
                return;
            case 4:
                e11 e11Var = (e11) obj;
                e11Var.f33257f.add(e11Var.f33256c);
                e11Var.a();
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
                        M.f27577j = 5000;
                        M.j();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((d41) obj).invalidate();
                return;
            case 9:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f31714a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                return;
            case 10:
                l41 l41Var = (l41) obj;
                l41Var.dismiss();
                nf.f.s(l41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 11:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.al0) obj).f22726c;
                Runnable runnable = secretMediaViewer.f31753o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f31753o0 = null;
                    return;
                }
                return;
            case 12:
                b51 b51Var = ((a51) obj).f31989a;
                b51Var.Q = true;
                b51Var.N.invalidate();
                return;
            case 13:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 14:
                AndroidUtilities.updateViewShow(((p61) obj).f36410c, true);
                return;
            case 15:
                org.telegram.ui.Components.j61 j61Var = ((k71) obj).f34968i0;
                if (j61Var != null) {
                    j61Var.N(true);
                    return;
                }
                return;
            case 16:
                ((d71) obj).a();
                return;
            case 17:
                hg.g.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 18:
                ((ye1) obj).J.f39341r.l();
                return;
            case 19:
                ((gf1) obj).f33932b.C0();
                return;
            case 20:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 21:
                ((bi1) obj).f32432a.H();
                return;
            case 22:
                ((ci1) obj).f32733a.H();
                return;
            case 23:
                mi1 mi1Var = ((ai1) obj).f32176b;
                mi1Var.L0.unlock();
                org.telegram.ui.Components.voip.n2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                mi1Var.Y.setCornerRadius(-1.0f);
                mi1Var.f35574c0.d.release();
                mi1Var.f35576d0.d.release();
                mi1Var.f35571b0.release();
                mi1Var.l();
                mi1Var.f35605u0.d();
                org.telegram.ui.Components.voip.n2.T = false;
                mi1Var.E0 = false;
                mi1.f35566n1 = null;
                return;
            case 24:
                ki1 ki1Var = (ki1) obj;
                ki1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (ki1Var.f35075a.f35596n0 && VoIPService.getSharedInstance() != null) {
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
                int[][] iArr = WallpapersListActivity.f31904k0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
