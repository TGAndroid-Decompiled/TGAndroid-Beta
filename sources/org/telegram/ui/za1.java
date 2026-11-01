package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class za1 extends org.telegram.ui.ActionBar.k {
    public final Context f43872a;
    public final nb1 f43873b;

    public za1(nb1 nb1Var, Context context) {
        this.f43873b = nb1Var;
        this.f43872a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        boolean z10;
        int i12;
        boolean z11;
        kb1 kb1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        nb1 nb1Var = this.f43873b;
        org.telegram.messenger.y00 y00Var = nb1Var.f39835s;
        ArrayList arrayList = nb1Var.f39800b;
        HashSet hashSet = nb1Var.f39798a0;
        long j10 = nb1Var.f39797a;
        if (i10 == -1) {
            if (hashSet.size() > 0) {
                nb1Var.G0();
                return;
            } else {
                nb1Var.finishFragment();
                return;
            }
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i13 = 0;
        switch (i10) {
            case 1:
                org.telegram.messenger.y00 y00Var2 = nb1Var.getMessagesController().f19234r7;
                y00Var2.getClass();
                TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
                tL_channels_toggleViewForumAsMessages.channel_id = y00Var2.getMessagesController().g1(j10);
                tL_channels_toggleViewForumAsMessages.enabled = true;
                y00Var2.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new org.telegram.messenger.v1(y00Var2, 7));
                nb1Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                un unVar = new un(bundle);
                unVar.Ca = true;
                nb1Var.presentFragment(unVar);
                return;
            case 2:
                TLRPC.ChatFull M0 = nb1Var.getMessagesController().M0(j10);
                TLRPC.ChatFull chatFull = nb1Var.J;
                if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                    M0.participants = chatParticipants;
                }
                if (M0 != null) {
                    a0.h hVar = new a0.h();
                    if (M0.participants != null) {
                        while (i13 < M0.participants.participants.size()) {
                            hVar.k(null, M0.participants.participants.get(i13).user_id);
                            i13++;
                        }
                    }
                    long j11 = M0.f19795id;
                    i11 = ((org.telegram.ui.ActionBar.k2) nb1Var).currentAccount;
                    xa1 xa1Var = new xa1(this, this.f43872a, i11, hVar, M0.f19795id, nb1Var, j11);
                    xa1Var.f28381c2 = new m4.x0(this, j11, 9);
                    xa1Var.show();
                    return;
                }
                return;
            case 3:
                ja1 f02 = ja1.f0(j10, 0L);
                nb1Var.presentFragment(f02);
                org.telegram.messenger.i0.h3(new ea1(f02, 1), 200L);
                return;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    nb1Var.C0 = true;
                    nb1Var.N0 = true;
                    org.telegram.messenger.y00 y00Var3 = nb1Var.f39835s;
                    long j12 = nb1Var.f39797a;
                    int intValue = ((Integer) hashSet.iterator().next()).intValue();
                    if (i10 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    y00Var3.t(j12, intValue, z10, nb1Var);
                }
                nb1Var.G0();
                return;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    nb1Var.getNotificationsController().G(-j10, ((Integer) it.next()).intValue(), nb1Var.B0);
                }
                nb1Var.G0();
                return;
            case 7:
                nb1Var.H0(hashSet, new vv0(this, 24));
                return;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TLRPC.TL_forumTopic f7 = y00Var.f(j10, ((Integer) arrayList2.get(i14)).intValue());
                    if (f7 != null) {
                        nb1Var.getMessagesController().l3(-j10, f7.f19846id);
                        org.telegram.messenger.wp messagesController = nb1Var.getMessagesController();
                        long j13 = -j10;
                        int i15 = f7.top_message;
                        TLRPC.Message message = f7.topMessage;
                        if (message != null) {
                            i12 = message.date;
                        } else {
                            i12 = 0;
                        }
                        messagesController.h3(j13, i15, 0, i12, false, f7.f19846id, 0, true, 0);
                        nb1Var.getMessagesStorage().d2(nb1Var.f39797a, f7.f19846id, f7.top_message, 0);
                    }
                }
                nb1Var.G0();
                return;
            case 9:
            case 10:
                nb1Var.N0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                    int intValue2 = ((Integer) arrayList3.get(i16)).intValue();
                    if (i10 == 9) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    y00Var.z(intValue2, j10, z11);
                }
                nb1Var.G0();
                return;
            case 11:
                TLRPC.Chat L0 = nb1Var.getMessagesController().L0(Long.valueOf(j10));
                org.telegram.ui.Components.s4.r(nb1Var, false, L0, null, false, true, false, false, new cp0(19, this, L0));
                return;
            case 12:
            case 13:
                int i17 = 0;
                while (true) {
                    if (i17 < nb1Var.N.getChildCount()) {
                        View childAt = nb1Var.N.getChildAt(i17);
                        if ((childAt instanceof kb1) && (tL_forumTopic = (kb1Var = (kb1) childAt).N) != null && tL_forumTopic.f19846id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i17++;
                        }
                    } else {
                        kb1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i13 < arrayList.size()) {
                            if (arrayList.get(i13) != null && ((fb1) arrayList.get(i13)).f37097c != null && ((fb1) arrayList.get(i13)).f37097c.f19846id == 1) {
                                tL_forumTopic2 = ((fb1) arrayList.get(i13)).f37097c;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (nb1Var.f39844y <= 0) {
                        nb1Var.E = true;
                        nb1Var.D = 2;
                    }
                    nb1Var.getMessagesController().f19234r7.A(1, j10, tL_forumTopic2.hidden);
                    if (kb1Var != null) {
                        nb1Var.f39805c1 = kb1Var;
                    }
                    nb1Var.N.B1(!tL_forumTopic2.hidden, kb1Var);
                    nb1Var.Z0(true, true);
                    if (kb1Var != null) {
                        kb1Var.setTopicIcon(kb1Var.f38790c5);
                    }
                }
                nb1Var.G0();
                return;
            case 14:
                if (org.telegram.messenger.w3.N(nb1Var.getMessagesController().L0(Long.valueOf(j10)))) {
                    t5 t5Var = new t5(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = nb1Var.X;
                    t5Var.T = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        t5Var.getMessagesController().G0().b(t5Var.R, t5Var.T, new k5(t5Var, 0));
                    }
                    nb1Var.presentFragment(t5Var);
                    return;
                }
                nb1Var.getNotificationCenter().k(org.telegram.messenger.at.f14752n3, Long.valueOf(-j10));
                return;
            case 15:
                b01.K0(-j10, nb1Var);
                return;
            default:
                return;
        }
    }
}
