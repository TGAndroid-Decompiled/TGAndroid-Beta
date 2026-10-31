package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ya implements View.OnClickListener {
    public final int f43766a;
    public final int f43767b;
    public final Object f43768c;
    public final Object d;
    public final Object e;

    public ya(KeyEvent.Callback callback, Object obj, int i10, Object obj2, int i11) {
        this.f43766a = i11;
        this.f43768c = callback;
        this.d = obj;
        this.f43767b = i10;
        this.e = obj2;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f43766a;
        int i11 = this.f43767b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f43768c;
        switch (i10) {
            case 0:
                sb.a0((sb) obj3, i11, (ArrayList) obj2, (Integer) obj);
                return;
            case 1:
                int[] iArr = (int[]) obj3;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) obj2;
                mi0 mi0Var = (mi0) obj;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).e7.edit();
                if (i11 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i11 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.f20134a.N0.run();
                mi0Var.run();
                return;
            case 2:
                b50 b50Var = (b50) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) obj;
                if (i11 < arrayList.size()) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) b50Var.R2.d.f(org.telegram.messenger.jj.C1(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    b50Var.z1(groupCallParticipant, org.telegram.messenger.jj.C1(groupCallParticipant.peer), ((Integer) arrayList.get(i11)).intValue());
                    c40 c40Var = b50Var.W4;
                    if (c40Var != null) {
                        c40Var.dismiss();
                        return;
                    } else if (((Integer) arrayList.get(i11)).intValue() != 9 && ((Integer) arrayList.get(i11)).intValue() != 10 && ((Integer) arrayList.get(i11)).intValue() != 11) {
                        b50Var.f1(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 3:
                vh.d dVar = (vh.d) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    int i12 = this.f43767b;
                    org.telegram.messenger.au.b(i12, context, new f0(dVar, context, z2Var, i12, 4));
                    return;
                }
                return;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                String str = (String) obj;
                RectF rectF = ProfileActivity.R6;
                ((org.telegram.ui.ActionBar.k1) ((AtomicReference) obj2).get()).dismiss();
                try {
                    org.telegram.messenger.i0.g(str);
                    if (i11 == profileActivity.N3) {
                        org.telegram.ui.Components.cc.a0(profileActivity).i(org.telegram.messenger.cd.L0(2131752761, null)).j();
                    } else {
                        org.telegram.ui.Components.cc.a0(profileActivity).i(org.telegram.messenger.cd.L0(2131752693, null)).j();
                    }
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 5:
                pb1 pb1Var = (pb1) obj3;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj;
                org.telegram.messenger.vp messagesController = pb1Var.getMessagesController();
                long j10 = -pb1Var.f40566a;
                if (messagesController.q2(j10, tL_forumTopic.f19845id, null)) {
                    pb1Var.getNotificationsController().G(j10, tL_forumTopic.f19845id, false);
                    pb1Var.finishPreviewFragment();
                    if (org.telegram.ui.Components.cc.a(pb1Var)) {
                        org.telegram.ui.Components.cc.z(pb1Var, 4, 0, pb1Var.getResourceProvider()).j();
                        return;
                    }
                    return;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(i11);
                return;
            case 6:
                vh.d dVar2 = (vh.d) obj3;
                org.telegram.ui.ActionBar.z2 z2Var2 = (org.telegram.ui.ActionBar.z2) obj2;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj;
                if (!dVar2.Q) {
                    dVar2.setLoading(true);
                    org.telegram.ui.Wallet.k4 k4Var = new org.telegram.ui.Wallet.k4(dVar2, z2Var2, p6Var, 0);
                    org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i11);
                    x10.m0(new org.telegram.ui.Wallet.x0(i11, k4Var, x10));
                    return;
                }
                return;
            default:
                th.h4 h4Var = (th.h4) obj3;
                org.telegram.ui.ActionBar.p6 p6Var2 = (org.telegram.ui.ActionBar.p6) obj;
                if (!((TLRPC.User) obj2).premium) {
                    h4Var.dismiss();
                    org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new kg.i1(Q, 14, false));
                        return;
                    }
                    return;
                } else if (h4Var.f49022j1) {
                    h4Var.dismiss();
                    tw twVar = h4Var.l1;
                    if (twVar != null) {
                        twVar.a(false);
                        return;
                    }
                    return;
                } else {
                    th.e5 O1 = org.telegram.messenger.vp.r1(h4Var.f21583a).O1();
                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = O1.B;
                    if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(h4Var.f21583a).getCurrentTime() <= tL_storiesStealthMode.cooldown_until_date) {
                        if (h4Var.f49022j1) {
                            h4Var.dismiss();
                            tw twVar2 = h4Var.l1;
                            if (twVar2 != null) {
                                twVar2.a(false);
                                return;
                            }
                            return;
                        }
                        new org.telegram.ui.Components.cc(h4Var.f21589c, p6Var2).t(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131744902, null)), null).k(true);
                        return;
                    }
                    TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
                    tL_stories_activateStealthMode.future = true;
                    tL_stories_activateStealthMode.past = true;
                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
                    tL_storiesStealthMode2.flags |= 3;
                    tL_storiesStealthMode2.cooldown_until_date = ConnectionsManager.getInstance(h4Var.f21583a).getCurrentTime() + org.telegram.messenger.vp.r1(h4Var.f21583a).f18788g0;
                    tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(h4Var.f21583a).getCurrentTime() + org.telegram.messenger.vp.r1(h4Var.f21583a).f18780f0;
                    O1.i0(tL_storiesStealthMode2);
                    ConnectionsManager.getInstance(h4Var.f21583a).sendRequest(tL_stories_activateStealthMode, new ag.c3(24));
                    try {
                        h4Var.f21586b.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                    h4Var.dismiss();
                    if (i11 == 0) {
                        th.h4.I0();
                    }
                    tw twVar3 = h4Var.l1;
                    if (twVar3 != null) {
                        twVar3.a(true);
                        return;
                    }
                    return;
                }
        }
    }

    public ya(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f43766a = i11;
        this.f43768c = obj;
        this.f43767b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public ya(org.telegram.ui.ActionBar.k2 k2Var, Object obj, Serializable serializable, int i10, int i11) {
        this.f43766a = i11;
        this.f43768c = k2Var;
        this.d = obj;
        this.e = serializable;
        this.f43767b = i10;
    }
}
