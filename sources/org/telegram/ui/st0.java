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
public final class st0 implements t40, org.telegram.ui.Components.vu0, org.telegram.ui.ActionBar.q1, org.telegram.messenger.lr, r0.m, org.telegram.ui.Components.rf0, org.telegram.ui.Components.sj0, te.b, org.telegram.messenger.h9 {
    public final int f52151a;
    public final ProfileActivity f52152b;

    public st0(ProfileActivity profileActivity, int i7) {
        this.f52151a = i7;
        this.f52152b = profileActivity;
    }

    @Override
    public void K(int i7, float f10, float f11, te.c cVar) {
        RectF rectF = ProfileActivity.Z6;
        this.f52152b.s5();
    }

    @Override
    public boolean b(int i7, View view) {
        ProfileActivity profileActivity = this.f52152b;
        uw0 uw0Var = profileActivity.f43664e;
        if (uw0Var.f52749x || uw0Var.f52748w.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
        String N0 = org.telegram.messenger.gd.N0(2131752044, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.gd.N0(2131752049, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752087, null), new st0(profileActivity, 10));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        profileActivity.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
            return true;
        }
        return true;
    }

    @Override
    public void g(int i7, ArrayList arrayList) {
        TLRPC.ChatParticipants chatParticipants;
        RectF rectF = ProfileActivity.Z6;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ProfileActivity profileActivity = this.f52152b;
        TLRPC.ChatFull chatFull = profileActivity.f43783v2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i10 = 0; i10 < profileActivity.f43783v2.participants.participants.size(); i10++) {
                hashSet.add(Long.valueOf(profileActivity.f43783v2.participants.participants.get(i10).user_id));
            }
        }
        profileActivity.getMessagesController().o(profileActivity.F2, profileActivity, arrayList, i7, new f3(arrayList2, 6), new f3(profileActivity, 7), new lc0(profileActivity, arrayList2, hashSet, 26));
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = this.f52151a;
        ProfileActivity profileActivity = this.f52152b;
        switch (i10) {
            case 2:
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getMessagesController().w(profileActivity.f43666e1);
                if (org.telegram.ui.Components.kc.a(profileActivity)) {
                    org.telegram.ui.Components.kc.d(profileActivity, true).j();
                    return;
                }
                return;
            case 9:
                RectF rectF2 = ProfileActivity.Z6;
                profileActivity.getClass();
                org.telegram.messenger.bz.f23301l = null;
                org.telegram.messenger.bz.f23303m = null;
                org.telegram.messenger.bz.y();
                profileActivity.getConnectionsManager().switchBackend(true);
                return;
            default:
                uw0 uw0Var = profileActivity.f43664e;
                uw0Var.f52748w.clear();
                org.telegram.messenger.mp.g1().edit().remove("settingsSearchRecent2").commit();
                uw0Var.f();
                return;
        }
    }

    @Override
    public r0.l1 l1(View view, r0.l1 l1Var) {
        RectF rectF = ProfileActivity.Z6;
        int i7 = l1Var.f56381a.f(519).d;
        ProfileActivity profileActivity = this.f52152b;
        profileActivity.P6 = i7;
        FrameLayout frameLayout = profileActivity.f43810y5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i10 = profileActivity.P6 + profileActivity.O6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i10) {
                marginLayoutParams.bottomMargin = i10;
                profileActivity.f43810y5.setLayoutParams(marginLayoutParams);
            }
        }
        if (profileActivity.O != null) {
            profileActivity.H3();
            org.telegram.ui.Components.fq0 fq0Var = profileActivity.O.f36096b0;
            if (fq0Var != null) {
                fq0Var.setButtonOffset(profileActivity.P6 + profileActivity.O6);
            }
        }
        return r0.l1.f56380b;
    }

    @Override
    public void q(boolean z10) {
        ProfileActivity profileActivity = this.f52152b;
        profileActivity.J1 = 0;
        org.telegram.messenger.ks notificationCenter = profileActivity.getNotificationCenter();
        int i7 = org.telegram.messenger.ks.f25289t;
        notificationCenter.n(profileActivity, i7);
        profileActivity.getNotificationCenter().k(i7, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().k(org.telegram.messenger.ks.K2, Long.valueOf(-profileActivity.F2.f28492id), null, profileActivity.F2, Boolean.valueOf(z10));
    }

    @Override
    public boolean run() {
        ProfileActivity profileActivity = this.f52152b;
        if (profileActivity.E2 == null && !profileActivity.w4()) {
            return false;
        }
        return true;
    }

    @Override
    public void f(TLRPC.User user) {
    }

    @Override
    public void G(float f10, int i7) {
    }
}
