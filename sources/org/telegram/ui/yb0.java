package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class yb0 implements Runnable {
    public final int f39799a;
    public final ProfileActivity f39800b;

    public yb0(ProfileActivity profileActivity, int i10) {
        this.f39799a = i10;
        this.f39800b = profileActivity;
    }

    @Override
    public final void run() {
        a11 a11Var;
        switch (this.f39799a) {
            case 0:
                ProfileActivity profileActivity = this.f39800b;
                m01 m01Var = profileActivity.O;
                if (m01Var != null) {
                    m01Var.Y0(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = this.f39800b;
                m01 m01Var2 = profileActivity2.O;
                if (m01Var2 != null) {
                    m01Var2.Y0(14);
                    profileActivity2.G4(false);
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new yb0(this.f39800b, 0), 200L);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new yb0(this.f39800b, 1), 200L);
                return;
            case 4:
                ProfileActivity profileActivity3 = this.f39800b;
                profileActivity3.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", profileActivity3.f31266e1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 5:
                this.f39800b.z4(false);
                return;
            case 6:
                ProfileActivity profileActivity4 = this.f39800b;
                profileActivity4.getClass();
                profileActivity4.presentFragment(new UserInfoActivity());
                return;
            case 7:
                this.f39800b.z4(true);
                return;
            case 8:
                ProfileActivity profileActivity5 = this.f39800b;
                profileActivity5.getClass();
                profileActivity5.presentFragment(new hg.h1());
                return;
            case 9:
                ProfileActivity profileActivity6 = this.f39800b;
                profileActivity6.getClass();
                profileActivity6.presentFragment(new hg.f1());
                return;
            case 10:
                ProfileActivity profileActivity7 = this.f39800b;
                profileActivity7.getClass();
                profileActivity7.presentFragment(new qa(null));
                return;
            case 11:
                ProfileActivity profileActivity8 = this.f39800b;
                profileActivity8.getClass();
                profileActivity8.presentFragment(new UserInfoActivity());
                return;
            case 12:
                ProfileActivity profileActivity9 = this.f39800b;
                profileActivity9.getClass();
                profileActivity9.presentFragment(new h(3));
                return;
            case 13:
                ?? obj = new Object();
                obj.f19364a = true;
                this.f39800b.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 14:
                ProfileActivity profileActivity10 = this.f39800b;
                profileActivity10.k4(true);
                if (profileActivity10.f31303j2.isRunning()) {
                    profileActivity10.f31303j2.cancel();
                }
                profileActivity10.J4(1.0f);
                return;
            case 15:
                this.f39800b.e5(false, false);
                return;
            case 16:
                this.f39800b.F3();
                return;
            case 17:
                ProfileActivity profileActivity11 = this.f39800b;
                m01 m01Var3 = profileActivity11.O;
                if (m01Var3 != null) {
                    m01Var3.v1(true);
                    profileActivity11.O.n1();
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity12 = this.f39800b;
                profileActivity12.getMessagesController().reloadUser(profileActivity12.a());
                return;
            case 19:
                ProfileActivity profileActivity13 = this.f39800b;
                if (!profileActivity13.f31235a.b0() && (a11Var = profileActivity13.d) != null) {
                    a11Var.l();
                    return;
                }
                return;
            case 20:
                this.f39800b.e5(false, false);
                return;
            case 21:
                this.f39800b.f31408y5.setVisibility(8);
                return;
            case 22:
                ProfileActivity profileActivity14 = this.f39800b;
                profileActivity14.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity14.f31274f1);
                bundle.putLong("user_id", profileActivity14.f31266e1);
                profileActivity14.presentFragment(new f31(bundle));
                return;
            case 23:
                ProfileActivity profileActivity15 = this.f39800b;
                profileActivity15.getClass();
                profileActivity15.presentFragment(new qa(null));
                return;
            case 24:
                ProfileActivity.W(this.f39800b);
                return;
            case 25:
                ProfileActivity profileActivity16 = this.f39800b;
                TLRPC.UserFull userFull = profileActivity16.f31384v2;
                if (userFull != null) {
                    AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(userFull.note, false));
                    org.telegram.messenger.vl.p(R.string.TextCopied, org.telegram.ui.Components.vc.a0(profileActivity16));
                    return;
                }
                return;
            case 26:
                ProfileActivity profileActivity17 = this.f39800b;
                profileActivity17.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", profileActivity17.f31266e1);
                bundle2.putBoolean("focus_notes", true);
                profileActivity17.presentFragment(new ss(bundle2, profileActivity17.f31409z0));
                return;
            default:
                this.f39800b.G4(true);
                return;
        }
    }
}
