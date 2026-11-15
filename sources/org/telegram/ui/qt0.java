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
public final class qt0 implements r40, org.telegram.ui.Components.lu0, org.telegram.ui.ActionBar.q1, org.telegram.messenger.nr, r0.m, org.telegram.ui.Components.gf0, org.telegram.ui.Components.ij0, te.b, org.telegram.messenger.i9 {
    public final int f50791a;
    public final ProfileActivity f50792b;

    public qt0(ProfileActivity profileActivity, int i7) {
        this.f50791a = i7;
        this.f50792b = profileActivity;
    }

    @Override
    public void G(int i7, float f10, float f11, te.c cVar) {
        RectF rectF = ProfileActivity.X6;
        this.f50792b.r5();
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        RectF rectF = ProfileActivity.X6;
        int i7 = k1Var.f55682a.f(519).d;
        ProfileActivity profileActivity = this.f50792b;
        profileActivity.N6 = i7;
        FrameLayout frameLayout = profileActivity.f43222w5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i10 = profileActivity.N6 + profileActivity.M6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i10) {
                marginLayoutParams.bottomMargin = i10;
                profileActivity.f43222w5.setLayoutParams(marginLayoutParams);
            }
        }
        if (profileActivity.O != null) {
            profileActivity.G3();
            org.telegram.ui.Components.wp0 wp0Var = profileActivity.O.f42080b0;
            if (wp0Var != null) {
                wp0Var.setButtonOffset(profileActivity.N6 + profileActivity.M6);
            }
        }
        return r0.k1.f55681b;
    }

    @Override
    public boolean b(int i7, View view) {
        ProfileActivity profileActivity = this.f50792b;
        sw0 sw0Var = profileActivity.f43092e;
        if (sw0Var.f51293x || sw0Var.f51292w.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
        String M0 = org.telegram.messenger.hd.M0(2131752056, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.M0(2131752061, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752099, null), new qt0(profileActivity, 10));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        profileActivity.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
            return true;
        }
        return true;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = this.f50791a;
        ProfileActivity profileActivity = this.f50792b;
        switch (i10) {
            case 2:
                RectF rectF = ProfileActivity.X6;
                profileActivity.getMessagesController().w(profileActivity.f43094e1);
                if (org.telegram.ui.Components.cc.a(profileActivity)) {
                    org.telegram.ui.Components.cc.d(profileActivity, true).j();
                    return;
                }
                return;
            case 9:
                RectF rectF2 = ProfileActivity.X6;
                profileActivity.getClass();
                org.telegram.messenger.gz.f23960l = null;
                org.telegram.messenger.gz.f23962m = null;
                org.telegram.messenger.gz.y();
                profileActivity.getConnectionsManager().switchBackend(true);
                return;
            default:
                sw0 sw0Var = profileActivity.f43092e;
                sw0Var.f51292w.clear();
                org.telegram.messenger.np.e1().edit().remove("settingsSearchRecent2").commit();
                sw0Var.f();
                return;
        }
    }

    @Override
    public void i(int i7, ArrayList arrayList) {
        TLRPC.ChatParticipants chatParticipants;
        RectF rectF = ProfileActivity.X6;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ProfileActivity profileActivity = this.f50792b;
        TLRPC.ChatFull chatFull = profileActivity.f43211v2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i10 = 0; i10 < profileActivity.f43211v2.participants.participants.size(); i10++) {
                hashSet.add(Long.valueOf(profileActivity.f43211v2.participants.participants.get(i10).user_id));
            }
        }
        profileActivity.getMessagesController().o(profileActivity.F2, profileActivity, arrayList, i7, new f3(arrayList2, 5), new f3(profileActivity, 6), new lc0(profileActivity, arrayList2, hashSet, 26));
    }

    @Override
    public void j(boolean z10) {
        ProfileActivity profileActivity = this.f50792b;
        profileActivity.J1 = 0;
        org.telegram.messenger.ns notificationCenter = profileActivity.getNotificationCenter();
        int i7 = org.telegram.messenger.ns.f25572t;
        notificationCenter.n(profileActivity, i7);
        profileActivity.getNotificationCenter().k(i7, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().k(org.telegram.messenger.ns.K2, Long.valueOf(-profileActivity.F2.f28051id), null, profileActivity.F2, Boolean.valueOf(z10));
    }

    @Override
    public boolean run() {
        ProfileActivity profileActivity = this.f50792b;
        if (profileActivity.E2 == null && !profileActivity.v4()) {
            return false;
        }
        return true;
    }

    @Override
    public void f(TLRPC.User user) {
    }

    @Override
    public void E(float f10, int i7) {
    }
}
