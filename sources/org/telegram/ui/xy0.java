package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class xy0 implements Runnable {
    public final int f43503a;
    public final Object f43504b;

    public xy0(Object obj, int i10) {
        this.f43503a = i10;
        this.f43504b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f43503a;
        int i11 = 0;
        Object obj = this.f43504b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) ((ag.l) obj).f213c;
                if (profileActivity.f34637k5 != 1.0f) {
                    zy0 zy0Var = profileActivity.f34632k0;
                    while (zy0Var.A0.k(i11) != zy0Var.getRealCount() - 1) {
                        i11++;
                    }
                    zy0Var.x(i11, true);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = ((qz0) obj).f40724b;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.f34569b1, 0, true, new my0(true, profileActivity2, 0));
                return;
            case 2:
                uz0 uz0Var = (uz0) obj;
                uz0Var.M0(uz0Var.getTabProgress());
                return;
            case 3:
                ((l01) obj).c();
                return;
            case 4:
                ((a11) obj).a();
                return;
            case 5:
                x01 x01Var = (x01) obj;
                x01Var.f42925f.add(x01Var.f42923c);
                x01Var.a();
                return;
            case 6:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                return;
            case 7:
                ((oh.h6) obj).e();
                return;
            case 8:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) obj;
                if (LaunchActivity.U() != null) {
                    if (qcVar == null) {
                        qcVar = org.telegram.ui.Components.qc.a0(LaunchActivity.U());
                    }
                    if (qcVar != null) {
                        org.telegram.ui.Components.ic M = qcVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.f27745j = 5000;
                        M.j();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((v31) obj).invalidate();
                return;
            case 10:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34750a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                return;
            case 11:
                b41 b41Var = (b41) obj;
                b41Var.dismiss();
                af.g.s(b41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 12:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.fx0) obj).f27035c;
                Runnable runnable = secretMediaViewer.f34786l0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f34786l0 = null;
                    return;
                }
                return;
            case 13:
                r41 r41Var = ((q41) obj).f40338a;
                r41Var.N = true;
                r41Var.K.invalidate();
                return;
            case 14:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 15:
                AndroidUtilities.updateViewShow(((g61) obj).f37096c, true);
                return;
            case 16:
                org.telegram.ui.Components.x51 x51Var = ((c71) obj).f35701f0;
                if (x51Var != null) {
                    x51Var.N(true);
                    return;
                }
                return;
            case 17:
                ((v61) obj).a();
                return;
            case 18:
                vf.f.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 19:
                ((ne1) obj).J.f39134r.l();
                return;
            case 20:
                ((we1) obj).f42454b.C0();
                return;
            case 21:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 22:
                ((rh1) obj).f40966a.H();
                return;
            case 23:
                ((sh1) obj).f41292a.H();
                return;
            case 24:
                ci1 ci1Var = ((qh1) obj).f40528b;
                ci1Var.I0.unlock();
                org.telegram.ui.Components.voip.n2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                ci1Var.V.setCornerRadius(-1.0f);
                ci1Var.Z.d.release();
                ci1Var.f35819a0.d.release();
                ci1Var.Y.release();
                ci1Var.l();
                ci1Var.f35851r0.d();
                org.telegram.ui.Components.voip.n2.Q = false;
                ci1Var.B0 = false;
                ci1.f35817k1 = null;
                return;
            case 25:
                ai1 ai1Var = (ai1) obj;
                ai1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (ai1Var.f35191a.f35843k0 && VoIPService.getSharedInstance() != null) {
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
                int[][] iArr = WallpapersListActivity.f34941h0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
