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
public final class wx0 implements org.telegram.ui.ActionBar.c2, MessagesStorage.BooleanCallback, r0.o, org.telegram.ui.Components.jh0, org.telegram.ui.Components.jl0, FlagSecureReason.FlagSecureCondition, xd.b, v60, org.telegram.ui.Components.iw0 {
    public final int f39784a;
    public final ProfileActivity f39785b;

    public wx0(ProfileActivity profileActivity, int i10) {
        this.f39784a = i10;
        this.f39785b = profileActivity;
    }

    @Override
    public void L(int i10, float f10, float f11, xd.c cVar) {
        this.f39785b.U4();
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        int i10 = m1Var.f43154a.f(519).d;
        ProfileActivity profileActivity = this.f39785b;
        profileActivity.f32065i6 = i10;
        FrameLayout frameLayout = profileActivity.f32112p5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i11 = profileActivity.f32065i6 + profileActivity.f32058h6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                marginLayoutParams.bottomMargin = i11;
                profileActivity.f32112p5.setLayoutParams(marginLayoutParams);
            }
        }
        zz0 zz0Var = profileActivity.L;
        if (zz0Var != null) {
            zz0Var.setPagesPaddingBottom(profileActivity.f32065i6 + profileActivity.f32051g6);
            org.telegram.ui.Components.or0 or0Var = profileActivity.L.S;
            if (or0Var != null) {
                or0Var.setButtonOffset(profileActivity.f32065i6 + profileActivity.f32058h6);
            }
        }
        return r0.m1.f43153b;
    }

    @Override
    public boolean d(int i10, View view) {
        ProfileActivity profileActivity = this.f39785b;
        x01 x01Var = profileActivity.e;
        if (x01Var.f39804w || x01Var.v.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f32155w0);
        alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.ClearSearchAlertTitle);
        alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.ClearSearchAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new wx0(profileActivity, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
        profileActivity.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
            return true;
        }
        return true;
    }

    @Override
    public void i(int i10, ArrayList arrayList) {
        TLRPC.ChatParticipants chatParticipants;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ProfileActivity profileActivity = this.f39785b;
        TLRPC.ChatFull chatFull = profileActivity.f32124r2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < profileActivity.f32124r2.participants.participants.size(); i11++) {
                hashSet.add(Long.valueOf(profileActivity.f32124r2.participants.participants.get(i11).user_id));
            }
        }
        profileActivity.getMessagesController().addUsersToChat(profileActivity.B2, profileActivity, arrayList, i10, new l3(arrayList2, 5), new l3(profileActivity, 6), new jf0(profileActivity, arrayList2, hashSet, 23));
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f39784a) {
            case 0:
                ProfileActivity profileActivity = this.f39785b;
                profileActivity.getMessagesController().blockPeer(profileActivity.f32011b1);
                if (org.telegram.ui.Components.qc.a(profileActivity)) {
                    org.telegram.ui.Components.qc.d(profileActivity, true).j();
                    return;
                }
                return;
            case 5:
                x01 x01Var = this.f39785b.e;
                x01Var.v.clear();
                MessagesController.getGlobalMainSettings().edit().remove("settingsSearchRecent2").commit();
                x01Var.l();
                return;
            default:
                ProfileActivity profileActivity2 = this.f39785b;
                profileActivity2.getClass();
                SharedConfig.pushAuthKey = null;
                SharedConfig.pushAuthKeyId = null;
                SharedConfig.saveConfig();
                profileActivity2.getConnectionsManager().switchBackend(true);
                return;
        }
    }

    @Override
    public boolean run() {
        ProfileActivity profileActivity = this.f39785b;
        return profileActivity.A2 != null || profileActivity.g4();
    }

    @Override
    public void run(boolean z4) {
        ProfileActivity profileActivity = this.f39785b;
        profileActivity.G1 = 0;
        NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i10);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-profileActivity.B2.f19159id), null, profileActivity.B2, Boolean.valueOf(z4));
    }

    @Override
    public void h(TLRPC.User user) {
    }

    @Override
    public void z(float f10, int i10) {
    }
}
