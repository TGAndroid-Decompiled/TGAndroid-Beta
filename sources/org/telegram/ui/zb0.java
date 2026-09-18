package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class zb0 implements Runnable {
    public final int f40069a;
    public final ProfileActivity f40070b;

    public zb0(ProfileActivity profileActivity, int i10) {
        this.f40069a = i10;
        this.f40070b = profileActivity;
    }

    @Override
    public final void run() {
        z01 z01Var;
        switch (this.f40069a) {
            case 0:
                ProfileActivity profileActivity = this.f40070b;
                l01 l01Var = profileActivity.O;
                if (l01Var != null) {
                    l01Var.Y0(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = this.f40070b;
                l01 l01Var2 = profileActivity2.O;
                if (l01Var2 != null) {
                    l01Var2.Y0(14);
                    profileActivity2.G4(false);
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new zb0(this.f40070b, 0), 200L);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new zb0(this.f40070b, 1), 200L);
                return;
            case 4:
                ProfileActivity profileActivity3 = this.f40070b;
                profileActivity3.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", profileActivity3.f31513e1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 5:
                this.f40070b.z4(false);
                return;
            case 6:
                ProfileActivity profileActivity4 = this.f40070b;
                profileActivity4.getClass();
                profileActivity4.presentFragment(new UserInfoActivity());
                return;
            case 7:
                this.f40070b.z4(true);
                return;
            case 8:
                ProfileActivity profileActivity5 = this.f40070b;
                profileActivity5.getClass();
                profileActivity5.presentFragment(new hg.g1());
                return;
            case 9:
                ProfileActivity profileActivity6 = this.f40070b;
                profileActivity6.getClass();
                profileActivity6.presentFragment(new hg.e1());
                return;
            case 10:
                ProfileActivity profileActivity7 = this.f40070b;
                profileActivity7.getClass();
                profileActivity7.presentFragment(new ra(null));
                return;
            case 11:
                ProfileActivity profileActivity8 = this.f40070b;
                profileActivity8.getClass();
                profileActivity8.presentFragment(new UserInfoActivity());
                return;
            case 12:
                ProfileActivity profileActivity9 = this.f40070b;
                profileActivity9.getClass();
                profileActivity9.presentFragment(new h(3));
                return;
            case 13:
                ?? obj = new Object();
                obj.f19545a = true;
                this.f40070b.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 14:
                ProfileActivity profileActivity10 = this.f40070b;
                profileActivity10.k4(true);
                if (profileActivity10.f31550j2.isRunning()) {
                    profileActivity10.f31550j2.cancel();
                }
                profileActivity10.J4(1.0f);
                return;
            case 15:
                this.f40070b.e5(false, false);
                return;
            case 16:
                this.f40070b.F3();
                return;
            case 17:
                ProfileActivity profileActivity11 = this.f40070b;
                l01 l01Var3 = profileActivity11.O;
                if (l01Var3 != null) {
                    l01Var3.v1(true);
                    profileActivity11.O.n1();
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity12 = this.f40070b;
                profileActivity12.getMessagesController().reloadUser(profileActivity12.a());
                return;
            case 19:
                ProfileActivity profileActivity13 = this.f40070b;
                if (!profileActivity13.f31482a.c0() && (z01Var = profileActivity13.d) != null) {
                    z01Var.l();
                    return;
                }
                return;
            case 20:
                this.f40070b.e5(false, false);
                return;
            case 21:
                this.f40070b.f31655y5.setVisibility(8);
                return;
            case 22:
                ProfileActivity profileActivity14 = this.f40070b;
                profileActivity14.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity14.f31521f1);
                bundle.putLong("user_id", profileActivity14.f31513e1);
                profileActivity14.presentFragment(new e31(bundle));
                return;
            case 23:
                ProfileActivity profileActivity15 = this.f40070b;
                profileActivity15.getClass();
                profileActivity15.presentFragment(new ra(null));
                return;
            case 24:
                ProfileActivity.W(this.f40070b);
                return;
            case 25:
                ProfileActivity profileActivity16 = this.f40070b;
                TLRPC.UserFull userFull = profileActivity16.f31631v2;
                if (userFull != null) {
                    AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(userFull.note, false));
                    org.telegram.messenger.wh.n(R.string.TextCopied, org.telegram.ui.Components.xc.a0(profileActivity16));
                    return;
                }
                return;
            case 26:
                ProfileActivity profileActivity17 = this.f40070b;
                profileActivity17.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", profileActivity17.f31513e1);
                bundle2.putBoolean("focus_notes", true);
                profileActivity17.presentFragment(new ss(bundle2, profileActivity17.f31656z0));
                return;
            default:
                this.f40070b.G4(true);
                return;
        }
    }
}
