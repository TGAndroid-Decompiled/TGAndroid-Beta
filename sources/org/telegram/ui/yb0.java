package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class yb0 implements Runnable {
    public final int f43097a;
    public final ProfileActivity f43098b;

    public yb0(ProfileActivity profileActivity, int i10) {
        this.f43097a = i10;
        this.f43098b = profileActivity;
    }

    @Override
    public final void run() {
        a11 a11Var;
        switch (this.f43097a) {
            case 0:
                ProfileActivity profileActivity = this.f43098b;
                m01 m01Var = profileActivity.O;
                if (m01Var != null) {
                    m01Var.Y0(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = this.f43098b;
                m01 m01Var2 = profileActivity2.O;
                if (m01Var2 != null) {
                    m01Var2.Y0(14);
                    profileActivity2.G4(false);
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new yb0(this.f43098b, 0), 200L);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new yb0(this.f43098b, 1), 200L);
                return;
            case 4:
                ProfileActivity profileActivity3 = this.f43098b;
                profileActivity3.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", profileActivity3.f33915e1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 5:
                this.f43098b.z4(false);
                return;
            case 6:
                ProfileActivity profileActivity4 = this.f43098b;
                profileActivity4.getClass();
                profileActivity4.presentFragment(new UserInfoActivity());
                return;
            case 7:
                this.f43098b.z4(true);
                return;
            case 8:
                ProfileActivity profileActivity5 = this.f43098b;
                profileActivity5.getClass();
                profileActivity5.presentFragment(new ig.g1());
                return;
            case 9:
                ProfileActivity profileActivity6 = this.f43098b;
                profileActivity6.getClass();
                profileActivity6.presentFragment(new ig.e1());
                return;
            case 10:
                ProfileActivity profileActivity7 = this.f43098b;
                profileActivity7.getClass();
                profileActivity7.presentFragment(new qa(null));
                return;
            case 11:
                ProfileActivity profileActivity8 = this.f43098b;
                profileActivity8.getClass();
                profileActivity8.presentFragment(new UserInfoActivity());
                return;
            case 12:
                ProfileActivity profileActivity9 = this.f43098b;
                profileActivity9.getClass();
                profileActivity9.presentFragment(new h(3));
                return;
            case 13:
                ?? obj = new Object();
                obj.f21169a = true;
                this.f43098b.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 14:
                ProfileActivity profileActivity10 = this.f43098b;
                profileActivity10.k4(true);
                if (profileActivity10.f33952j2.isRunning()) {
                    profileActivity10.f33952j2.cancel();
                }
                profileActivity10.J4(1.0f);
                return;
            case 15:
                this.f43098b.e5(false, false);
                return;
            case 16:
                this.f43098b.F3();
                return;
            case 17:
                ProfileActivity profileActivity11 = this.f43098b;
                m01 m01Var3 = profileActivity11.O;
                if (m01Var3 != null) {
                    m01Var3.v1(true);
                    profileActivity11.O.n1();
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity12 = this.f43098b;
                profileActivity12.getMessagesController().reloadUser(profileActivity12.a());
                return;
            case 19:
                ProfileActivity profileActivity13 = this.f43098b;
                if (!profileActivity13.f33883a.b0() && (a11Var = profileActivity13.d) != null) {
                    a11Var.l();
                    return;
                }
                return;
            case 20:
                this.f43098b.e5(false, false);
                return;
            case 21:
                this.f43098b.f34057y5.setVisibility(8);
                return;
            case 22:
                ProfileActivity profileActivity14 = this.f43098b;
                profileActivity14.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity14.f33923f1);
                bundle.putLong("user_id", profileActivity14.f33915e1);
                profileActivity14.presentFragment(new g31(bundle));
                return;
            case 23:
                ProfileActivity profileActivity15 = this.f43098b;
                profileActivity15.getClass();
                profileActivity15.presentFragment(new qa(null));
                return;
            case 24:
                ProfileActivity.W(this.f43098b);
                return;
            case 25:
                ProfileActivity profileActivity16 = this.f43098b;
                TLRPC.UserFull userFull = profileActivity16.f34033v2;
                if (userFull != null) {
                    AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(userFull.note, false));
                    org.telegram.messenger.wl.o(R.string.TextCopied, org.telegram.ui.Components.yc.a0(profileActivity16));
                    return;
                }
                return;
            case 26:
                ProfileActivity profileActivity17 = this.f43098b;
                profileActivity17.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", profileActivity17.f33915e1);
                bundle2.putBoolean("focus_notes", true);
                profileActivity17.presentFragment(new ss(bundle2, profileActivity17.f34058z0));
                return;
            default:
                this.f43098b.G4(true);
                return;
        }
    }
}
