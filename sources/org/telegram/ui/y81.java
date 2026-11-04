package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class y81 extends org.telegram.ui.ActionBar.j {
    public final Context f52226a;
    public final m91 f52227b;

    public y81(m91 m91Var, Context context) {
        this.f52227b = m91Var;
        this.f52226a = context;
    }

    @Override
    public final void b(int i3) {
        int i10;
        TLRPC.ChatParticipants chatParticipants;
        boolean z10;
        int i11;
        boolean z11;
        j91 j91Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        m91 m91Var = this.f52227b;
        org.telegram.messenger.c00 c00Var = m91Var.f47614s;
        ArrayList arrayList = m91Var.f47578b;
        HashSet hashSet = m91Var.f47579b0;
        long j10 = m91Var.f47575a;
        if (i3 == -1) {
            if (hashSet.size() > 0) {
                m91Var.G0();
                return;
            } else {
                m91Var.finishFragment();
                return;
            }
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i12 = 0;
        switch (i3) {
            case 1:
                org.telegram.messenger.c00 c00Var2 = m91Var.getMessagesController().f23102q7;
                c00Var2.getClass();
                TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
                tL_channels_toggleViewForumAsMessages.channel_id = c00Var2.getMessagesController().h1(j10);
                tL_channels_toggleViewForumAsMessages.enabled = true;
                c00Var2.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new org.telegram.messenger.s1(c00Var2, 7));
                m91Var.J = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                wm wmVar = new wm(bundle);
                wmVar.Da = true;
                m91Var.presentFragment(wmVar);
                return;
            case 2:
                TLRPC.ChatFull N0 = m91Var.getMessagesController().N0(j10);
                TLRPC.ChatFull chatFull = m91Var.K;
                if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                    N0.participants = chatParticipants;
                }
                if (N0 != null) {
                    a0.h hVar = new a0.h();
                    if (N0.participants != null) {
                        while (i12 < N0.participants.participants.size()) {
                            hVar.k(null, N0.participants.participants.get(i12).user_id);
                            i12++;
                        }
                    }
                    long j11 = N0.f27002id;
                    i10 = ((org.telegram.ui.ActionBar.d2) m91Var).currentAccount;
                    w81 w81Var = new w81(this, this.f52226a, i10, hVar, N0.f27002id, m91Var, j11);
                    w81Var.f38290d2 = new ei.c1(this, j11, 11);
                    w81Var.show();
                    return;
                }
                return;
            case 3:
                l81 f02 = l81.f0(j10, 0L);
                m91Var.presentFragment(f02);
                org.telegram.messenger.g0.i3(new f81(f02, 1), 200L);
                return;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    m91Var.D0 = true;
                    m91Var.O0 = true;
                    org.telegram.messenger.c00 c00Var3 = m91Var.f47614s;
                    long j12 = m91Var.f47575a;
                    int intValue = ((Integer) hashSet.iterator().next()).intValue();
                    if (i3 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    c00Var3.t(j12, intValue, z10, m91Var);
                }
                m91Var.G0();
                return;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    m91Var.getNotificationsController().G(-j10, ((Integer) it.next()).intValue(), m91Var.C0);
                }
                m91Var.G0();
                return;
            case 7:
                m91Var.H0(hashSet, new pu0(this, 21));
                return;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TLRPC.TL_forumTopic f10 = c00Var.f(j10, ((Integer) arrayList2.get(i13)).intValue());
                    if (f10 != null) {
                        m91Var.getMessagesController().o3(-j10, f10.f27053id);
                        org.telegram.messenger.hp messagesController = m91Var.getMessagesController();
                        long j13 = -j10;
                        int i14 = f10.top_message;
                        TLRPC.Message message = f10.topMessage;
                        if (message != null) {
                            i11 = message.date;
                        } else {
                            i11 = 0;
                        }
                        messagesController.j3(j13, i14, 0, i11, false, f10.f27053id, 0, true, 0);
                        m91Var.getMessagesStorage().d2(m91Var.f47575a, f10.f27053id, f10.top_message, 0);
                    }
                }
                m91Var.G0();
                return;
            case 9:
            case 10:
                m91Var.O0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    int intValue2 = ((Integer) arrayList3.get(i15)).intValue();
                    if (i3 == 9) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c00Var.z(intValue2, j10, z11);
                }
                m91Var.G0();
                return;
            case 11:
                TLRPC.Chat M0 = m91Var.getMessagesController().M0(Long.valueOf(j10));
                org.telegram.ui.Components.t4.r(m91Var, false, M0, null, false, true, false, false, new rb0(28, this, M0));
                return;
            case 12:
            case 13:
                int i16 = 0;
                while (true) {
                    if (i16 < m91Var.O.getChildCount()) {
                        View childAt = m91Var.O.getChildAt(i16);
                        if ((childAt instanceof j91) && (tL_forumTopic = (j91Var = (j91) childAt).O) != null && tL_forumTopic.f27053id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i16++;
                        }
                    } else {
                        j91Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i12 < arrayList.size()) {
                            if (arrayList.get(i12) != null && ((e91) arrayList.get(i12)).f44941c != null && ((e91) arrayList.get(i12)).f44941c.f27053id == 1) {
                                tL_forumTopic2 = ((e91) arrayList.get(i12)).f44941c;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (m91Var.f47623y <= 0) {
                        m91Var.F = true;
                        m91Var.E = 2;
                    }
                    m91Var.getMessagesController().f23102q7.A(1, j10, tL_forumTopic2.hidden);
                    if (j91Var != null) {
                        m91Var.f47585d1 = j91Var;
                    }
                    m91Var.O.B1(!tL_forumTopic2.hidden, j91Var);
                    m91Var.Z0(true, true);
                    if (j91Var != null) {
                        j91Var.setTopicIcon(j91Var.f46567d5);
                    }
                }
                m91Var.G0();
                return;
            case 14:
                if (org.telegram.messenger.t3.N(m91Var.getMessagesController().M0(Long.valueOf(j10)))) {
                    v5 v5Var = new v5(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = m91Var.Y;
                    v5Var.U = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        v5Var.getMessagesController().G0().b(v5Var.S, v5Var.U, new n5(v5Var, 0));
                    }
                    m91Var.presentFragment(v5Var);
                    return;
                }
                m91Var.getNotificationCenter().k(org.telegram.messenger.hs.f23272n3, Long.valueOf(-j10));
                return;
            case 15:
                ey0.K0(-j10, m91Var);
                return;
            default:
                return;
        }
    }
}
