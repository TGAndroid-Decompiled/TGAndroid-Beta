package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class sz0 implements Runnable {
    public final int f41343a;
    public final Object f41344b;

    public sz0(Object obj, int i10) {
        this.f41343a = i10;
        this.f41344b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f41343a;
        Object obj = this.f41344b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = ((vz0) obj).f42235b;
                profileActivity.getMessagesController().toggleChatNoForwards(profileActivity.f34569b1, 0, true, new ry0(true, profileActivity, 0));
                return;
            case 1:
                zz0 zz0Var = (zz0) obj;
                zz0Var.M0(zz0Var.getTabProgress());
                return;
            case 2:
                ((q01) obj).c();
                return;
            case 3:
                ((e11) obj).a();
                return;
            case 4:
                b11 b11Var = (b11) obj;
                b11Var.f35319f.add(b11Var.f35317c);
                b11Var.a();
                return;
            case 5:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                return;
            case 6:
                ((oh.h6) obj).e();
                return;
            case 7:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) obj;
                if (LaunchActivity.U() != null) {
                    if (qcVar == null) {
                        qcVar = org.telegram.ui.Components.qc.a0(LaunchActivity.U());
                    }
                    if (qcVar != null) {
                        org.telegram.ui.Components.ic M = qcVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.f27778j = 5000;
                        M.j();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((a41) obj).invalidate();
                return;
            case 9:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34750a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                return;
            case 10:
                g41 g41Var = (g41) obj;
                g41Var.dismiss();
                af.g.s(g41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 11:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.ex0) obj).f26692c;
                Runnable runnable = secretMediaViewer.f34786l0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f34786l0 = null;
                    return;
                }
                return;
            case 12:
                w41 w41Var = ((v41) obj).f42010a;
                w41Var.N = true;
                w41Var.K.invalidate();
                return;
            case 13:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 14:
                AndroidUtilities.updateViewShow(((l61) obj).f38553c, true);
                return;
            case 15:
                org.telegram.ui.Components.w51 w51Var = ((h71) obj).f37247f0;
                if (w51Var != null) {
                    w51Var.N(true);
                    return;
                }
                return;
            case 16:
                ((a71) obj).a();
                return;
            case 17:
                vf.f.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 18:
                ((te1) obj).J.f41220r.l();
                return;
            case 19:
                ((cf1) obj).f35788b.C0();
                return;
            case 20:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 21:
                ((xh1) obj).f43056a.H();
                return;
            case 22:
                ((yh1) obj).f43630a.H();
                return;
            case 23:
                ii1 ii1Var = ((wh1) obj).f42780b;
                ii1Var.I0.unlock();
                org.telegram.ui.Components.voip.n2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                ii1Var.V.setCornerRadius(-1.0f);
                ii1Var.Z.d.release();
                ii1Var.f37671a0.d.release();
                ii1Var.Y.release();
                ii1Var.l();
                ii1Var.f37703r0.d();
                org.telegram.ui.Components.voip.n2.Q = false;
                ii1Var.B0 = false;
                ii1.f37669k1 = null;
                return;
            case 24:
                gi1 gi1Var = (gi1) obj;
                gi1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (gi1Var.f37116a.f37695k0 && VoIPService.getSharedInstance() != null) {
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
                int[][] iArr = WallpapersListActivity.f34941h0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
