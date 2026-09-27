package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class xz0 implements Runnable {
    public final int f40069a;
    public final Object f40070b;

    public xz0(Object obj, int i10) {
        this.f40069a = i10;
        this.f40070b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f40069a;
        Object obj = this.f40070b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = ((a01) obj).f31935b;
                profileActivity.getMessagesController().toggleChatNoForwards(profileActivity.f31557e1, 0, true, new ci.ya(true, profileActivity, 2));
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
                g11Var.f33702f.add(g11Var.f33701c);
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
                        M.f27691j = 5000;
                        M.j();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((f41) obj).invalidate();
                return;
            case 9:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f31716a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                return;
            case 10:
                o41 o41Var = (o41) obj;
                o41Var.dismiss();
                nf.f.s(o41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 11:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.cl0) obj).f23359c;
                Runnable runnable = secretMediaViewer.f31755o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f31755o0 = null;
                    return;
                }
                return;
            case 12:
                e51 e51Var = ((d51) obj).f32867a;
                e51Var.Q = true;
                e51Var.N.invalidate();
                return;
            case 13:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 14:
                AndroidUtilities.updateViewShow(((r61) obj).f37008c, true);
                return;
            case 15:
                org.telegram.ui.Components.l61 l61Var = ((m71) obj).f35545i0;
                if (l61Var != null) {
                    l61Var.N(true);
                    return;
                }
                return;
            case 16:
                ((f71) obj).a();
                return;
            case 17:
                hg.f.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 18:
                ((ye1) obj).J.f39320r.l();
                return;
            case 19:
                ((gf1) obj).f33921b.C0();
                return;
            case 20:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 21:
                ((zh1) obj).f40530a.H();
                return;
            case 22:
                ((ai1) obj).f32081a.H();
                return;
            case 23:
                ki1 ki1Var = ((yh1) obj).f40218b;
                ki1Var.L0.unlock();
                org.telegram.ui.Components.voip.n2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                ki1Var.Y.setCornerRadius(-1.0f);
                ki1Var.f35051c0.d.release();
                ki1Var.f35053d0.d.release();
                ki1Var.f35048b0.release();
                ki1Var.l();
                ki1Var.f35082u0.d();
                org.telegram.ui.Components.voip.n2.T = false;
                ki1Var.E0 = false;
                ki1.f35043n1 = null;
                return;
            case 24:
                ii1 ii1Var = (ii1) obj;
                ii1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (ii1Var.f34493a.f35073n0 && VoIPService.getSharedInstance() != null) {
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
                int[][] iArr = WallpapersListActivity.f31906i0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
