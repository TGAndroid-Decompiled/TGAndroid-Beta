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
public final class qx0 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.gx0, MessagesStorage.BooleanCallback, r0.n, org.telegram.ui.Components.bi0, org.telegram.ui.Components.cm0, FlagSecureReason.FlagSecureCondition, ne.d, k60 {
    public final int f40932a;
    public final ProfileActivity f40933b;

    public qx0(ProfileActivity profileActivity, int i10) {
        this.f40932a = i10;
        this.f40933b = profileActivity;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        int i10 = k1Var.f45251a.f(519).d;
        ProfileActivity profileActivity = this.f40933b;
        profileActivity.f34007r6 = i10;
        FrameLayout frameLayout = profileActivity.f34028u5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i11 = profileActivity.f34007r6 + profileActivity.q6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                marginLayoutParams.bottomMargin = i11;
                profileActivity.f34028u5.setLayoutParams(marginLayoutParams);
            }
        }
        rz0 rz0Var = profileActivity.O;
        if (rz0Var != null) {
            rz0Var.setPagesPaddingBottom(profileActivity.f34007r6 + profileActivity.f33993p6);
            org.telegram.ui.Components.ns0 ns0Var = profileActivity.O.V;
            if (ns0Var != null) {
                ns0Var.setButtonOffset(profileActivity.f34007r6 + profileActivity.q6);
            }
        }
        return r0.k1.f45250b;
    }

    @Override
    public boolean d(int i10, View view) {
        ProfileActivity profileActivity = this.f40933b;
        q01 q01Var = profileActivity.e;
        if (q01Var.f40600w || q01Var.v.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.A0);
        alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
        alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.ClearSearchAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new qx0(profileActivity, 9));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
        profileActivity.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, null);
            return true;
        }
        return true;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f40932a) {
            case 0:
                ProfileActivity profileActivity = this.f40933b;
                profileActivity.getMessagesController().blockPeer(profileActivity.f33921f1);
                if (org.telegram.ui.Components.xc.a(profileActivity)) {
                    org.telegram.ui.Components.xc.d(profileActivity, true).j();
                    return;
                }
                return;
            case 6:
                ProfileActivity profileActivity2 = this.f40933b;
                profileActivity2.getClass();
                SharedConfig.pushAuthKey = null;
                SharedConfig.pushAuthKeyId = null;
                SharedConfig.saveConfig();
                profileActivity2.getConnectionsManager().switchBackend(true);
                return;
            default:
                q01 q01Var = this.f40933b.e;
                q01Var.v.clear();
                MessagesController.getGlobalMainSettings().edit().remove("settingsSearchRecent2").commit();
                q01Var.l();
                return;
        }
    }

    @Override
    public void i(int i10, ArrayList arrayList) {
        TLRPC.ChatParticipants chatParticipants;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ProfileActivity profileActivity = this.f40933b;
        TLRPC.ChatFull chatFull = profileActivity.f34032v2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < profileActivity.f34032v2.participants.participants.size(); i11++) {
                hashSet.add(Long.valueOf(profileActivity.f34032v2.participants.participants.get(i11).user_id));
            }
        }
        profileActivity.getMessagesController().addUsersToChat(profileActivity.F2, profileActivity, arrayList, i10, new i3(arrayList2, 5), new i3(profileActivity, 6), new re0(profileActivity, arrayList2, hashSet, 25));
    }

    @Override
    public void o(int i10, float f7, float f10, ne.e eVar) {
        this.f40933b.Y4();
    }

    @Override
    public boolean run() {
        ProfileActivity profileActivity = this.f40933b;
        return profileActivity.E2 != null || profileActivity.i4();
    }

    @Override
    public void run(boolean z10) {
        ProfileActivity profileActivity = this.f40933b;
        profileActivity.K1 = 0;
        NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i10);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-profileActivity.F2.f20343id), null, profileActivity.F2, Boolean.valueOf(z10));
    }

    @Override
    public void h(TLRPC.User user) {
    }

    @Override
    public void H(float f7, int i10) {
    }
}
