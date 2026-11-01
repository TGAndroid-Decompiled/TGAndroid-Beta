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
    public final int f43612a;
    public final int f43613b;
    public final Object f43614c;
    public final Object d;
    public final Object e;

    public ya(KeyEvent.Callback callback, Object obj, int i10, Object obj2, int i11) {
        this.f43612a = i11;
        this.f43614c = callback;
        this.d = obj;
        this.f43613b = i10;
        this.e = obj2;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f43612a;
        int i11 = this.f43613b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f43614c;
        switch (i10) {
            case 0:
                sb.b0((sb) obj3, i11, (ArrayList) obj2, (Integer) obj);
                return;
            case 1:
                int[] iArr = (int[]) obj3;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) obj2;
                ki0 ki0Var = (ki0) obj;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).e7.edit();
                if (i11 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i11 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.f20135a.N0.run();
                ki0Var.run();
                return;
            case 2:
                a50 a50Var = (a50) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) obj;
                if (i11 < arrayList.size()) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) a50Var.R2.d.f(org.telegram.messenger.kj.C1(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    a50Var.z1(groupCallParticipant, org.telegram.messenger.kj.C1(groupCallParticipant.peer), ((Integer) arrayList.get(i11)).intValue());
                    b40 b40Var = a50Var.W4;
                    if (b40Var != null) {
                        b40Var.dismiss();
                        return;
                    } else if (((Integer) arrayList.get(i11)).intValue() != 9 && ((Integer) arrayList.get(i11)).intValue() != 10 && ((Integer) arrayList.get(i11)).intValue() != 11) {
                        a50Var.f1(true);
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
                    int i12 = this.f43613b;
                    org.telegram.messenger.bu.b(i12, context, new f0(dVar, context, z2Var, i12, 4));
                    return;
                }
                return;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                String str = (String) obj;
                RectF rectF = ProfileActivity.S6;
                ((org.telegram.ui.ActionBar.k1) ((AtomicReference) obj2).get()).dismiss();
                try {
                    org.telegram.messenger.i0.g(str);
                    if (i11 == profileActivity.N3) {
                        org.telegram.ui.Components.cc.a0(profileActivity).i(org.telegram.messenger.dd.L0(2131752761, null)).j();
                    } else {
                        org.telegram.ui.Components.cc.a0(profileActivity).i(org.telegram.messenger.dd.L0(2131752693, null)).j();
                    }
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 5:
                nb1 nb1Var = (nb1) obj3;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj;
                org.telegram.messenger.wp messagesController = nb1Var.getMessagesController();
                long j10 = -nb1Var.f39797a;
                if (messagesController.q2(j10, tL_forumTopic.f19846id, null)) {
                    nb1Var.getNotificationsController().G(j10, tL_forumTopic.f19846id, false);
                    nb1Var.finishPreviewFragment();
                    if (org.telegram.ui.Components.cc.a(nb1Var)) {
                        org.telegram.ui.Components.cc.z(nb1Var, 4, 0, nb1Var.getResourceProvider()).j();
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
                } else if (h4Var.f49036j1) {
                    h4Var.dismiss();
                    sw swVar = h4Var.l1;
                    if (swVar != null) {
                        swVar.a(false);
                        return;
                    }
                    return;
                } else {
                    th.e5 O1 = org.telegram.messenger.wp.r1(h4Var.f21584a).O1();
                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = O1.B;
                    if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(h4Var.f21584a).getCurrentTime() <= tL_storiesStealthMode.cooldown_until_date) {
                        if (h4Var.f49036j1) {
                            h4Var.dismiss();
                            sw swVar2 = h4Var.l1;
                            if (swVar2 != null) {
                                swVar2.a(false);
                                return;
                            }
                            return;
                        }
                        new org.telegram.ui.Components.cc(h4Var.f21590c, p6Var2).t(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131744902, null)), null).k(true);
                        return;
                    }
                    TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
                    tL_stories_activateStealthMode.future = true;
                    tL_stories_activateStealthMode.past = true;
                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
                    tL_storiesStealthMode2.flags |= 3;
                    tL_storiesStealthMode2.cooldown_until_date = ConnectionsManager.getInstance(h4Var.f21584a).getCurrentTime() + org.telegram.messenger.wp.r1(h4Var.f21584a).f19131g0;
                    tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(h4Var.f21584a).getCurrentTime() + org.telegram.messenger.wp.r1(h4Var.f21584a).f19123f0;
                    O1.i0(tL_storiesStealthMode2);
                    ConnectionsManager.getInstance(h4Var.f21584a).sendRequest(tL_stories_activateStealthMode, new ag.c3(24));
                    try {
                        h4Var.f21587b.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                    h4Var.dismiss();
                    if (i11 == 0) {
                        th.h4.I0();
                    }
                    sw swVar3 = h4Var.l1;
                    if (swVar3 != null) {
                        swVar3.a(true);
                        return;
                    }
                    return;
                }
        }
    }

    public ya(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f43612a = i11;
        this.f43614c = obj;
        this.f43613b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public ya(org.telegram.ui.ActionBar.k2 k2Var, Object obj, Serializable serializable, int i10, int i11) {
        this.f43612a = i11;
        this.f43614c = k2Var;
        this.d = obj;
        this.e = serializable;
        this.f43613b = i10;
    }
}
