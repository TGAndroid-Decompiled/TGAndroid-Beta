package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class vb0 implements Runnable {
    public final int f38541a;
    public final ProfileActivity f38542b;

    public vb0(ProfileActivity profileActivity, int i10) {
        this.f38541a = i10;
        this.f38542b = profileActivity;
    }

    @Override
    public final void run() {
        s01 s01Var;
        switch (this.f38541a) {
            case 0:
                ProfileActivity profileActivity = this.f38542b;
                e01 e01Var = profileActivity.O;
                if (e01Var != null) {
                    e01Var.Y0(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = this.f38542b;
                e01 e01Var2 = profileActivity2.O;
                if (e01Var2 != null) {
                    e01Var2.Y0(14);
                    profileActivity2.G4(false);
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new vb0(this.f38542b, 0), 200L);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new vb0(this.f38542b, 1), 200L);
                return;
            case 4:
                ProfileActivity profileActivity3 = this.f38542b;
                profileActivity3.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", profileActivity3.f31557e1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 5:
                this.f38542b.z4(false);
                return;
            case 6:
                ProfileActivity profileActivity4 = this.f38542b;
                profileActivity4.getClass();
                profileActivity4.presentFragment(new UserInfoActivity());
                return;
            case 7:
                this.f38542b.z4(true);
                return;
            case 8:
                ProfileActivity profileActivity5 = this.f38542b;
                profileActivity5.getClass();
                profileActivity5.presentFragment(new hg.g1());
                return;
            case 9:
                ProfileActivity profileActivity6 = this.f38542b;
                profileActivity6.getClass();
                profileActivity6.presentFragment(new hg.e1());
                return;
            case 10:
                ProfileActivity profileActivity7 = this.f38542b;
                profileActivity7.getClass();
                profileActivity7.presentFragment(new ta(null));
                return;
            case 11:
                ProfileActivity profileActivity8 = this.f38542b;
                profileActivity8.getClass();
                profileActivity8.presentFragment(new UserInfoActivity());
                return;
            case 12:
                ProfileActivity profileActivity9 = this.f38542b;
                profileActivity9.getClass();
                profileActivity9.presentFragment(new h(3));
                return;
            case 13:
                ?? obj = new Object();
                obj.f19631a = true;
                this.f38542b.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 14:
                ProfileActivity profileActivity10 = this.f38542b;
                profileActivity10.k4(true);
                if (profileActivity10.f31594j2.isRunning()) {
                    profileActivity10.f31594j2.cancel();
                }
                profileActivity10.J4(1.0f);
                return;
            case 15:
                this.f38542b.e5(false, false);
                return;
            case 16:
                this.f38542b.F3();
                return;
            case 17:
                ProfileActivity profileActivity11 = this.f38542b;
                e01 e01Var3 = profileActivity11.O;
                if (e01Var3 != null) {
                    e01Var3.v1(true);
                    profileActivity11.O.n1();
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity12 = this.f38542b;
                profileActivity12.getMessagesController().reloadUser(profileActivity12.a());
                return;
            case 19:
                ProfileActivity profileActivity13 = this.f38542b;
                if (!profileActivity13.f31526a.c0() && (s01Var = profileActivity13.d) != null) {
                    s01Var.l();
                    return;
                }
                return;
            case 20:
                this.f38542b.e5(false, false);
                return;
            case 21:
                this.f38542b.f31699y5.setVisibility(8);
                return;
            case 22:
                ProfileActivity profileActivity14 = this.f38542b;
                profileActivity14.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity14.f31565f1);
                bundle.putLong("user_id", profileActivity14.f31557e1);
                profileActivity14.presentFragment(new y21(bundle));
                return;
            case 23:
                ProfileActivity profileActivity15 = this.f38542b;
                profileActivity15.getClass();
                profileActivity15.presentFragment(new ta(null));
                return;
            case 24:
                ProfileActivity.W(this.f38542b);
                return;
            case 25:
                ProfileActivity profileActivity16 = this.f38542b;
                TLRPC.UserFull userFull = profileActivity16.f31675v2;
                if (userFull != null) {
                    AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(userFull.note, false));
                    org.telegram.messenger.qk.o(R.string.TextCopied, org.telegram.ui.Components.xc.a0(profileActivity16));
                    return;
                }
                return;
            case 26:
                ProfileActivity profileActivity17 = this.f38542b;
                profileActivity17.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", profileActivity17.f31557e1);
                bundle2.putBoolean("focus_notes", true);
                profileActivity17.presentFragment(new ps(bundle2, profileActivity17.f31700z0));
                return;
            default:
                this.f38542b.G4(true);
                return;
        }
    }
}
