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
public final class tt0 implements u40, org.telegram.ui.Components.tu0, org.telegram.ui.ActionBar.r1, org.telegram.messenger.lr, r0.m, org.telegram.ui.Components.qf0, org.telegram.ui.Components.qj0, te.b, org.telegram.messenger.h9 {
    public final int f52350a;
    public final ProfileActivity f52351b;

    public tt0(ProfileActivity profileActivity, int i7) {
        this.f52350a = i7;
        this.f52351b = profileActivity;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        RectF rectF = ProfileActivity.Z6;
        this.f52351b.s5();
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        RectF rectF = ProfileActivity.Z6;
        int i7 = l1Var.f56258a.f(519).d;
        ProfileActivity profileActivity = this.f52351b;
        profileActivity.P6 = i7;
        FrameLayout frameLayout = profileActivity.f43684y5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i10 = profileActivity.P6 + profileActivity.O6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i10) {
                marginLayoutParams.bottomMargin = i10;
                profileActivity.f43684y5.setLayoutParams(marginLayoutParams);
            }
        }
        if (profileActivity.O != null) {
            profileActivity.H3();
            org.telegram.ui.Components.eq0 eq0Var = profileActivity.O.f35572b0;
            if (eq0Var != null) {
                eq0Var.setButtonOffset(profileActivity.P6 + profileActivity.O6);
            }
        }
        return r0.l1.f56257b;
    }

    @Override
    public boolean c(int i7, View view) {
        ProfileActivity profileActivity = this.f52351b;
        ww0 ww0Var = profileActivity.f43538e;
        if (ww0Var.f53500x || ww0Var.f53499w.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
        String M0 = org.telegram.messenger.gd.M0(2131752045, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.gd.M0(2131752050, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752088, null), new tt0(profileActivity, 10));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        profileActivity.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29635q7, null);
            return true;
        }
        return true;
    }

    @Override
    public void d(boolean z10) {
        ProfileActivity profileActivity = this.f52351b;
        profileActivity.J1 = 0;
        org.telegram.messenger.ks notificationCenter = profileActivity.getNotificationCenter();
        int i7 = org.telegram.messenger.ks.f25190t;
        notificationCenter.n(profileActivity, i7);
        profileActivity.getNotificationCenter().k(i7, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().k(org.telegram.messenger.ks.K2, Long.valueOf(-profileActivity.F2.f28403id), null, profileActivity.F2, Boolean.valueOf(z10));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = this.f52350a;
        ProfileActivity profileActivity = this.f52351b;
        switch (i10) {
            case 2:
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getMessagesController().w(profileActivity.f43540e1);
                if (org.telegram.ui.Components.lc.a(profileActivity)) {
                    org.telegram.ui.Components.lc.d(profileActivity, true).j();
                    return;
                }
                return;
            case 9:
                RectF rectF2 = ProfileActivity.Z6;
                profileActivity.getClass();
                org.telegram.messenger.bz.f23176l = null;
                org.telegram.messenger.bz.f23178m = null;
                org.telegram.messenger.bz.y();
                profileActivity.getConnectionsManager().switchBackend(true);
                return;
            default:
                ww0 ww0Var = profileActivity.f43538e;
                ww0Var.f53499w.clear();
                org.telegram.messenger.mp.g1().edit().remove("settingsSearchRecent2").commit();
                ww0Var.f();
                return;
        }
    }

    @Override
    public void i(int i7, ArrayList arrayList) {
        TLRPC.ChatParticipants chatParticipants;
        RectF rectF = ProfileActivity.Z6;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ProfileActivity profileActivity = this.f52351b;
        TLRPC.ChatFull chatFull = profileActivity.f43657v2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i10 = 0; i10 < profileActivity.f43657v2.participants.participants.size(); i10++) {
                hashSet.add(Long.valueOf(profileActivity.f43657v2.participants.participants.get(i10).user_id));
            }
        }
        profileActivity.getMessagesController().o(profileActivity.F2, profileActivity, arrayList, i7, new f3(arrayList2, 6), new f3(profileActivity, 7), new mc0(profileActivity, arrayList2, hashSet, 26));
    }

    @Override
    public boolean run() {
        ProfileActivity profileActivity = this.f52351b;
        if (profileActivity.E2 == null && !profileActivity.w4()) {
            return false;
        }
        return true;
    }

    @Override
    public void f(TLRPC.User user) {
    }

    @Override
    public void D(float f10, int i7) {
    }
}
