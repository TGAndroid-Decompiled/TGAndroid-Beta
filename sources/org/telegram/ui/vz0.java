package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class vz0 implements Runnable {
    public final int f38838a;
    public final Object f38839b;

    public vz0(Object obj, int i10) {
        this.f38838a = i10;
        this.f38839b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f38838a;
        Object obj = this.f38839b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = ((yz0) obj).f40279b;
                profileActivity.getMessagesController().toggleChatNoForwards(profileActivity.f31541e1, 0, true, new ci.za(true, profileActivity, 2));
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
                e11Var.f33230f.add(e11Var.f33229c);
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
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) obj;
                if (LaunchActivity.U() != null) {
                    if (ycVar == null) {
                        ycVar = org.telegram.ui.Components.yc.a0(LaunchActivity.U());
                    }
                    if (ycVar != null) {
                        org.telegram.ui.Components.qc M = ycVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.f27571j = 5000;
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
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f31700a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                return;
            case 10:
                l41 l41Var = (l41) obj;
                l41Var.dismiss();
                nf.f.s(l41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 11:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.al0) obj).f22708c;
                Runnable runnable = secretMediaViewer.f31739o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f31739o0 = null;
                    return;
                }
                return;
            case 12:
                b51 b51Var = ((a51) obj).f31975a;
                b51Var.Q = true;
                b51Var.N.invalidate();
                return;
            case 13:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 14:
                AndroidUtilities.updateViewShow(((p61) obj).f36400c, true);
                return;
            case 15:
                org.telegram.ui.Components.j61 j61Var = ((k71) obj).f34955i0;
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
                ((ye1) obj).J.f39326r.l();
                return;
            case 19:
                ((gf1) obj).f33917b.C0();
                return;
            case 20:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 21:
                ((bi1) obj).f32419a.H();
                return;
            case 22:
                ((ci1) obj).f32719a.H();
                return;
            case 23:
                mi1 mi1Var = ((ai1) obj).f32162b;
                mi1Var.L0.unlock();
                org.telegram.ui.Components.voip.n2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                mi1Var.Y.setCornerRadius(-1.0f);
                mi1Var.f35562c0.d.release();
                mi1Var.f35564d0.d.release();
                mi1Var.f35559b0.release();
                mi1Var.l();
                mi1Var.f35593u0.d();
                org.telegram.ui.Components.voip.n2.T = false;
                mi1Var.E0 = false;
                mi1.f35554n1 = null;
                return;
            case 24:
                ki1 ki1Var = (ki1) obj;
                ki1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (ki1Var.f35062a.f35584n0 && VoIPService.getSharedInstance() != null) {
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
                int[][] iArr = WallpapersListActivity.f31890k0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
