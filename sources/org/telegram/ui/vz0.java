package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class vz0 implements Runnable {
    public final int f38941a;
    public final Object f38942b;

    public vz0(Object obj, int i10) {
        this.f38941a = i10;
        this.f38942b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f38941a;
        Object obj = this.f38942b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = ((yz0) obj).f40405b;
                profileActivity.getMessagesController().toggleChatNoForwards(profileActivity.f31629e1, 0, true, new ci.za(true, profileActivity, 2));
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
                e11Var.f33340f.add(e11Var.f33339c);
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
                        org.telegram.ui.Components.rc M = ycVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.f27946j = 5000;
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
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f31788a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                return;
            case 10:
                l41 l41Var = (l41) obj;
                l41Var.dismiss();
                nf.f.s(l41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 11:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.dl0) obj).f23677c;
                Runnable runnable = secretMediaViewer.f31827o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f31827o0 = null;
                    return;
                }
                return;
            case 12:
                b51 b51Var = ((a51) obj).f32063a;
                b51Var.Q = true;
                b51Var.N.invalidate();
                return;
            case 13:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 14:
                AndroidUtilities.updateViewShow(((p61) obj).f36515c, true);
                return;
            case 15:
                org.telegram.ui.Components.m61 m61Var = ((k71) obj).f35058i0;
                if (m61Var != null) {
                    m61Var.N(true);
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
                ((ye1) obj).J.f39430r.l();
                return;
            case 19:
                ((gf1) obj).f34073b.C0();
                return;
            case 20:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 21:
                ((bi1) obj).f32507a.H();
                return;
            case 22:
                ((ci1) obj).f32821a.H();
                return;
            case 23:
                mi1 mi1Var = ((ai1) obj).f32250b;
                mi1Var.L0.unlock();
                org.telegram.ui.Components.voip.n2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                mi1Var.Y.setCornerRadius(-1.0f);
                mi1Var.f35664c0.d.release();
                mi1Var.f35666d0.d.release();
                mi1Var.f35661b0.release();
                mi1Var.l();
                mi1Var.f35695u0.d();
                org.telegram.ui.Components.voip.n2.T = false;
                mi1Var.E0 = false;
                mi1.f35656n1 = null;
                return;
            case 24:
                ki1 ki1Var = (ki1) obj;
                ki1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (ki1Var.f35165a.f35686n0 && VoIPService.getSharedInstance() != null) {
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
                int[][] iArr = WallpapersListActivity.f31978k0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
