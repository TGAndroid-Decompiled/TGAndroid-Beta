package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class xb0 implements Runnable {
    public final int f43958a;
    public final ProfileActivity f43959b;

    public xb0(ProfileActivity profileActivity, int i10) {
        this.f43958a = i10;
        this.f43959b = profileActivity;
    }

    @Override
    public final void run() {
        y01 y01Var;
        switch (this.f43958a) {
            case 0:
                ProfileActivity profileActivity = this.f43959b;
                k01 k01Var = profileActivity.O;
                if (k01Var != null) {
                    k01Var.Y0(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = this.f43959b;
                k01 k01Var2 = profileActivity2.O;
                if (k01Var2 != null) {
                    k01Var2.Y0(14);
                    profileActivity2.G4(false);
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new xb0(this.f43959b, 0), 200L);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new xb0(this.f43959b, 1), 200L);
                return;
            case 4:
                ProfileActivity profileActivity3 = this.f43959b;
                profileActivity3.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", profileActivity3.f34281e1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 5:
                this.f43959b.z4(false);
                return;
            case 6:
                ProfileActivity profileActivity4 = this.f43959b;
                profileActivity4.getClass();
                profileActivity4.presentFragment(new UserInfoActivity());
                return;
            case 7:
                this.f43959b.z4(true);
                return;
            case 8:
                ProfileActivity profileActivity5 = this.f43959b;
                profileActivity5.getClass();
                profileActivity5.presentFragment(new hg.g1());
                return;
            case 9:
                ProfileActivity profileActivity6 = this.f43959b;
                profileActivity6.getClass();
                profileActivity6.presentFragment(new hg.e1());
                return;
            case 10:
                ProfileActivity profileActivity7 = this.f43959b;
                profileActivity7.getClass();
                profileActivity7.presentFragment(new ra(null));
                return;
            case 11:
                ProfileActivity profileActivity8 = this.f43959b;
                profileActivity8.getClass();
                profileActivity8.presentFragment(new UserInfoActivity());
                return;
            case 12:
                ProfileActivity profileActivity9 = this.f43959b;
                profileActivity9.getClass();
                profileActivity9.presentFragment(new h(3));
                return;
            case 13:
                ?? obj = new Object();
                obj.f21361a = true;
                this.f43959b.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 14:
                ProfileActivity profileActivity10 = this.f43959b;
                profileActivity10.k4(true);
                if (profileActivity10.f34318j2.isRunning()) {
                    profileActivity10.f34318j2.cancel();
                }
                profileActivity10.J4(1.0f);
                return;
            case 15:
                this.f43959b.e5(false, false);
                return;
            case 16:
                this.f43959b.F3();
                return;
            case 17:
                ProfileActivity profileActivity11 = this.f43959b;
                k01 k01Var3 = profileActivity11.O;
                if (k01Var3 != null) {
                    k01Var3.v1(true);
                    profileActivity11.O.n1();
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity12 = this.f43959b;
                profileActivity12.getMessagesController().reloadUser(profileActivity12.a());
                return;
            case 19:
                ProfileActivity profileActivity13 = this.f43959b;
                if (!profileActivity13.f34249a.b0() && (y01Var = profileActivity13.d) != null) {
                    y01Var.l();
                    return;
                }
                return;
            case 20:
                this.f43959b.e5(false, false);
                return;
            case 21:
                this.f43959b.f34423y5.setVisibility(8);
                return;
            case 22:
                ProfileActivity profileActivity14 = this.f43959b;
                profileActivity14.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity14.f34289f1);
                bundle.putLong("user_id", profileActivity14.f34281e1);
                profileActivity14.presentFragment(new e31(bundle));
                return;
            case 23:
                ProfileActivity profileActivity15 = this.f43959b;
                profileActivity15.getClass();
                profileActivity15.presentFragment(new ra(null));
                return;
            case 24:
                ProfileActivity.W(this.f43959b);
                return;
            case 25:
                ProfileActivity profileActivity16 = this.f43959b;
                TLRPC.UserFull userFull = profileActivity16.f34399v2;
                if (userFull != null) {
                    AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(userFull.note, false));
                    org.telegram.messenger.bi.p(R.string.TextCopied, org.telegram.ui.Components.ad.a0(profileActivity16));
                    return;
                }
                return;
            case 26:
                ProfileActivity profileActivity17 = this.f43959b;
                profileActivity17.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", profileActivity17.f34281e1);
                bundle2.putBoolean("focus_notes", true);
                profileActivity17.presentFragment(new qs(bundle2, profileActivity17.f34424z0));
                return;
            default:
                this.f43959b.G4(true);
                return;
        }
    }
}
