package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class tt0 implements r40, org.telegram.ui.Components.ku0, org.telegram.ui.ActionBar.r1, org.telegram.messenger.qr, r0.m, org.telegram.ui.Components.df0, org.telegram.ui.Components.dj0, te.b, org.telegram.messenger.j9 {
    public final int f50149a;
    public final ProfileActivity f50150b;

    public tt0(ProfileActivity profileActivity, int i7) {
        this.f50149a = i7;
        this.f50150b = profileActivity;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        RectF rectF = ProfileActivity.S6;
        int i7 = k1Var.f54109a.f(519).d;
        ProfileActivity profileActivity = this.f50150b;
        profileActivity.I6 = i7;
        FrameLayout frameLayout = profileActivity.s5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i10 = profileActivity.I6 + profileActivity.H6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i10) {
                marginLayoutParams.bottomMargin = i10;
                profileActivity.s5.setLayoutParams(marginLayoutParams);
            }
        }
        if (profileActivity.N != null) {
            profileActivity.H3();
            org.telegram.ui.Components.up0 up0Var = profileActivity.N.f40354a0;
            if (up0Var != null) {
                up0Var.setButtonOffset(profileActivity.I6 + profileActivity.H6);
            }
        }
        return r0.k1.f54108b;
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        RectF rectF = ProfileActivity.S6;
        this.f50150b.p5();
    }

    @Override
    public boolean c(int i7, View view) {
        ProfileActivity profileActivity = this.f50150b;
        tw0 tw0Var = profileActivity.f41718e;
        if (tw0Var.f50174x || tw0Var.f50173w.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.f41866z0);
        String M0 = org.telegram.messenger.hd.M0(2131752056, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.hd.M0(2131752061, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752099, null), new tt0(profileActivity, 10));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        profileActivity.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28089q7, null);
            return true;
        }
        return true;
    }

    @Override
    public void f(int i7, ArrayList arrayList) {
        TLRPC.ChatParticipants chatParticipants;
        RectF rectF = ProfileActivity.S6;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ProfileActivity profileActivity = this.f50150b;
        TLRPC.ChatFull chatFull = profileActivity.f41824t2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i10 = 0; i10 < profileActivity.f41824t2.participants.participants.size(); i10++) {
                hashSet.add(Long.valueOf(profileActivity.f41824t2.participants.participants.get(i10).user_id));
            }
        }
        profileActivity.getMessagesController().o(profileActivity.D2, profileActivity, arrayList, i7, new f3(arrayList2, 5), new f3(profileActivity, 6), new mc0(profileActivity, arrayList2, hashSet, 26));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = this.f50149a;
        ProfileActivity profileActivity = this.f50150b;
        switch (i10) {
            case 2:
                RectF rectF = ProfileActivity.S6;
                profileActivity.getMessagesController().w(profileActivity.f41713d1);
                if (org.telegram.ui.Components.hc.a(profileActivity)) {
                    org.telegram.ui.Components.hc.d(profileActivity, true).j();
                    return;
                }
                return;
            case 9:
                RectF rectF2 = ProfileActivity.S6;
                profileActivity.getClass();
                org.telegram.messenger.iz.f23388l = null;
                org.telegram.messenger.iz.f23390m = null;
                org.telegram.messenger.iz.y();
                profileActivity.getConnectionsManager().switchBackend(true);
                return;
            default:
                tw0 tw0Var = profileActivity.f41718e;
                tw0Var.f50173w.clear();
                org.telegram.messenger.qp.e1().edit().remove("settingsSearchRecent2").commit();
                tw0Var.f();
                return;
        }
    }

    @Override
    public void k(boolean z9) {
        ProfileActivity profileActivity = this.f50150b;
        profileActivity.I1 = 0;
        org.telegram.messenger.qs notificationCenter = profileActivity.getNotificationCenter();
        int i7 = org.telegram.messenger.qs.f25059t;
        notificationCenter.n(profileActivity, i7);
        profileActivity.getNotificationCenter().k(i7, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().k(org.telegram.messenger.qs.K2, Long.valueOf(-profileActivity.D2.f26952id), null, profileActivity.D2, Boolean.valueOf(z9));
    }

    @Override
    public boolean run() {
        ProfileActivity profileActivity = this.f50150b;
        if (profileActivity.C2 == null && !profileActivity.u4()) {
            return false;
        }
        return true;
    }

    @Override
    public void e(TLRPC.User user) {
    }

    @Override
    public void F(float f10, int i7) {
    }
}
