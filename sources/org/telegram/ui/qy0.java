package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class qy0 implements Runnable {
    public final int f41000a;
    public final Object f41001b;

    public qy0(Object obj, int i10) {
        this.f41000a = i10;
        this.f41001b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f41000a;
        int i11 = 0;
        Object obj = this.f41001b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) ((ah.v) obj).f895c;
                if (profileActivity.p5 != 1.0f) {
                    sy0 sy0Var = profileActivity.f33673o0;
                    while (sy0Var.D0.k(i11) != sy0Var.getRealCount() - 1) {
                        i11++;
                    }
                    sy0Var.x(i11, true);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = ((jz0) obj).f38373b;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.f33613f1, 0, true, new ei.ka(2, profileActivity2, true));
                return;
            case 2:
                nz0 nz0Var = (nz0) obj;
                nz0Var.O0(nz0Var.getTabProgress());
                return;
            case 3:
                ((e01) obj).c();
                return;
            case 4:
                ((t01) obj).a();
                return;
            case 5:
                q01 q01Var = (q01) obj;
                q01Var.f40337f.add(q01Var.f40336c);
                q01Var.a();
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
                        M.f29594j = 5000;
                        M.j();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((x21) obj).invalidate();
                return;
            case 10:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f33769a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                return;
            case 11:
                h31 h31Var = (h31) obj;
                h31Var.dismiss();
                pf.d.r(h31Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 12:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.ml0) obj).f28562c;
                Runnable runnable = secretMediaViewer.f33808o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f33808o0 = null;
                    return;
                }
                return;
            case 13:
                x31 x31Var = ((w31) obj).f42453a;
                x31Var.Q = true;
                x31Var.N.invalidate();
                return;
            case 14:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 15:
                AndroidUtilities.updateViewShow(((m51) obj).f39109c, true);
                return;
            case 16:
                org.telegram.ui.Components.t61 t61Var = ((h61) obj).f37507i0;
                if (t61Var != null) {
                    t61Var.N(true);
                    return;
                }
                return;
            case 17:
                ((a61) obj).a();
                return;
            case 18:
                ig.f.a(((SessionsActivity) obj).currentAccount).b();
                return;
            case 19:
                ((td1) obj).J.f41175r.l();
                return;
            case 20:
                ((be1) obj).f35612b.C0();
                return;
            case 21:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 22:
                ((wg1) obj).f42873a.G();
                return;
            case 23:
                ((xg1) obj).f43212a.G();
                return;
            case 24:
                hh1 hh1Var = ((vg1) obj).f42250b;
                hh1Var.L0.unlock();
                org.telegram.ui.Components.voip.k2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                hh1Var.Y.setCornerRadius(-1.0f);
                hh1Var.f37631c0.d.release();
                hh1Var.f37633d0.d.release();
                hh1Var.f37628b0.release();
                hh1Var.k();
                hh1Var.f37662u0.d();
                org.telegram.ui.Components.voip.k2.U = false;
                hh1Var.E0 = false;
                hh1.f37623n1 = null;
                return;
            case 25:
                fh1 fh1Var = (fh1) obj;
                fh1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (fh1Var.f37009a.f37653n0 && VoIPService.getSharedInstance() != null) {
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
                int[][] iArr = WallpapersListActivity.f35200k0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
