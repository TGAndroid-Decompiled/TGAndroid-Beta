package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wx0 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.nx0, MessagesStorage.BooleanCallback, r0.n, org.telegram.ui.Components.ai0, org.telegram.ui.Components.bm0, FlagSecureReason.FlagSecureCondition, oe.d, m60 {
    public final int f45581a;
    public final ProfileActivity f45582b;

    public wx0(ProfileActivity profileActivity, int i10) {
        this.f45581a = i10;
        this.f45582b = profileActivity;
    }

    @Override
    public void E(int i10, float f7, float f10, oe.e eVar) {
        int i11 = ProfileActivity.R6;
        this.f45582b.g5();
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        int i10 = ProfileActivity.R6;
        int i11 = k1Var.f47115a.f(519).d;
        ProfileActivity profileActivity = this.f45582b;
        profileActivity.f36129z6 = i11;
        FrameLayout frameLayout = profileActivity.f36121y5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i12 = profileActivity.f36129z6 + profileActivity.f36122y6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i12) {
                marginLayoutParams.bottomMargin = i12;
                profileActivity.f36121y5.setLayoutParams(marginLayoutParams);
            }
        }
        if (profileActivity.N != null) {
            profileActivity.C3();
            org.telegram.ui.Components.vs0 vs0Var = profileActivity.N.f26635a0;
            if (vs0Var != null) {
                vs0Var.setButtonOffset(profileActivity.f36129z6 + profileActivity.f36122y6);
            }
        }
        return r0.k1.f47114b;
    }

    @Override
    public boolean c(int i10, View view) {
        ProfileActivity profileActivity = this.f45582b;
        u01 u01Var = profileActivity.e;
        if (u01Var.f43965w || u01Var.v.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f36123z0);
        alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
        alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.ClearSearchAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new wx0(profileActivity, 9));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
        profileActivity.showDialog(e2Var);
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23596q7, null);
            return true;
        }
        return true;
    }

    @Override
    public void f(int i10, ArrayList arrayList) {
        TLRPC.ChatParticipants chatParticipants;
        int i11 = ProfileActivity.R6;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ProfileActivity profileActivity = this.f45582b;
        TLRPC.ChatFull chatFull = profileActivity.f36088u2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i12 = 0; i12 < profileActivity.f36088u2.participants.participants.size(); i12++) {
                hashSet.add(Long.valueOf(profileActivity.f36088u2.participants.participants.get(i12).user_id));
            }
        }
        profileActivity.getMessagesController().addUsersToChat(profileActivity.E2, profileActivity, arrayList, i10, new h3(arrayList2, 5), new h3(profileActivity, 6), new oe0(profileActivity, arrayList2, hashSet, 26));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        int i11 = this.f45581a;
        ProfileActivity profileActivity = this.f45582b;
        switch (i11) {
            case 0:
                int i12 = ProfileActivity.R6;
                profileActivity.getMessagesController().blockPeer(profileActivity.f35976e1);
                if (org.telegram.ui.Components.wc.a(profileActivity)) {
                    org.telegram.ui.Components.wc.d(profileActivity, true).j();
                    return;
                }
                return;
            case 6:
                int i13 = ProfileActivity.R6;
                profileActivity.getClass();
                SharedConfig.pushAuthKey = null;
                SharedConfig.pushAuthKeyId = null;
                SharedConfig.saveConfig();
                profileActivity.getConnectionsManager().switchBackend(true);
                return;
            default:
                u01 u01Var = profileActivity.e;
                u01Var.v.clear();
                MessagesController.getGlobalMainSettings().edit().remove("settingsSearchRecent2").commit();
                u01Var.l();
                return;
        }
    }

    @Override
    public boolean run() {
        ProfileActivity profileActivity = this.f45582b;
        return profileActivity.D2 != null || profileActivity.n4();
    }

    @Override
    public void run(boolean z10) {
        ProfileActivity profileActivity = this.f45582b;
        profileActivity.J1 = 0;
        NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i10);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-profileActivity.E2.f22027id), null, profileActivity.E2, Boolean.valueOf(z10));
    }

    @Override
    public void e(TLRPC.User user) {
    }

    @Override
    public void z(float f7, int i10) {
    }
}
