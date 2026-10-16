package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class tz0 implements Runnable {
    public final int f40232a;
    public final Object f40233b;

    public tz0(Object obj, int i10) {
        this.f40232a = i10;
        this.f40233b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f40232a;
        int i11 = 0;
        Object obj = this.f40233b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) ((ah.v) obj).f895c;
                if (profileActivity.f32327n5 != 1.0f) {
                    vz0 vz0Var = profileActivity.f32322n0;
                    while (vz0Var.D0.k(i11) != vz0Var.getRealCount() - 1) {
                        i11++;
                    }
                    vz0Var.x(i11, true);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = ((m01) obj).f37880b;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.f32261e1, 0, true, new di.ya(2, profileActivity2, true));
                return;
            case 2:
                q01 q01Var = (q01) obj;
                q01Var.N0(q01Var.getTabProgress());
                return;
            case 3:
                ((h11) obj).c();
                return;
            case 4:
                ((w11) obj).a();
                return;
            case 5:
                t11 t11Var = (t11) obj;
                t11Var.f39985f.add(t11Var.f39984c);
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
                        M.f28805j = 5000;
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
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f32421a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                return;
            case 11:
                b51 b51Var = (b51) obj;
                b51Var.dismiss();
                pf.d.r(b51Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                return;
            case 12:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.ql0) obj).f28324c;
                Runnable runnable = secretMediaViewer.f32460o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f32460o0 = null;
                    return;
                }
                return;
            case 13:
                r51 r51Var = ((q51) obj).f39066a;
                r51Var.Q = true;
                r51Var.N.invalidate();
                return;
            case 14:
                ((NotificationCenter) obj).runDelayedNotifications();
                return;
            case 15:
                AndroidUtilities.updateViewShow(((g71) obj).f36086c, true);
                return;
            case 16:
                org.telegram.ui.Components.a71 a71Var = ((b81) obj).f34241i0;
                if (a71Var != null) {
                    a71Var.N(true);
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
                ((mf1) obj).J.f37413r.l();
                return;
            case 20:
                ((uf1) obj).f40392b.C0();
                return;
            case 21:
                ((VoIPFeedbackActivity) obj).finish();
                return;
            case 22:
                ((ri1) obj).f39529a.G();
                return;
            case 23:
                ((si1) obj).f39831a.G();
                return;
            case 24:
                cj1 cj1Var = ((qi1) obj).f39176b;
                cj1Var.L0.unlock();
                org.telegram.ui.Components.voip.k2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                cj1Var.Y.setCornerRadius(-1.0f);
                cj1Var.f34683c0.d.release();
                cj1Var.f34685d0.d.release();
                cj1Var.f34680b0.release();
                cj1Var.k();
                cj1Var.f34714u0.d();
                org.telegram.ui.Components.voip.k2.U = false;
                cj1Var.E0 = false;
                cj1.f34675n1 = null;
                return;
            case 25:
                aj1 aj1Var = (aj1) obj;
                aj1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (aj1Var.f33956a.f34705n0 && VoIPService.getSharedInstance() != null) {
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
                int[][] iArr = WallpapersListActivity.f33674k0;
                ((WallpapersListActivity) obj).B0(false);
                return;
        }
    }
}
