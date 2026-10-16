package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class uf1 extends org.telegram.ui.ActionBar.j {
    public final Context f40391a;
    public final kg1 f40392b;

    public uf1(kg1 kg1Var, Context context) {
        this.f40392b = kg1Var;
        this.f40391a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        boolean z10;
        int i12;
        boolean z11;
        hg1 hg1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        kg1 kg1Var = this.f40392b;
        TopicsController topicsController = kg1Var.f37415s;
        ArrayList arrayList = kg1Var.f37383b;
        HashSet hashSet = kg1Var.f37381a0;
        long j10 = kg1Var.f37380a;
        if (i10 == -1) {
            if (hashSet.size() > 0) {
                kg1Var.C0();
                return;
            } else {
                kg1Var.finishFragment();
                return;
            }
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i13 = 0;
        switch (i10) {
            case 1:
                kg1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j10, true);
                kg1Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                fo foVar = new fo(bundle);
                foVar.f35694ja = true;
                kg1Var.presentFragment(foVar);
                return;
            case 2:
                TLRPC.ChatFull chatFull = kg1Var.getMessagesController().getChatFull(j10);
                TLRPC.ChatFull chatFull2 = kg1Var.J;
                if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                    chatFull.participants = chatParticipants;
                }
                if (chatFull != null) {
                    a0.h hVar = new a0.h();
                    if (chatFull.participants != null) {
                        while (i13 < chatFull.participants.participants.size()) {
                            hVar.k(null, chatFull.participants.participants.get(i13).user_id);
                            i13++;
                        }
                    }
                    long j11 = chatFull.f18917id;
                    i11 = ((org.telegram.ui.ActionBar.m2) kg1Var).currentAccount;
                    sf1 sf1Var = new sf1(this, this.f40391a, i11, hVar, chatFull.f18917id, kg1Var, j11);
                    sf1Var.f31484l0 = new bi.p1(this, j11, 11);
                    sf1Var.show();
                    return;
                }
                return;
            case 3:
                gf1 a02 = gf1.a0(j10, 0L);
                kg1Var.presentFragment(a02);
                AndroidUtilities.runOnUIThread(new bf1(a02, 1), 200L);
                return;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    kg1Var.C0 = true;
                    kg1Var.N0 = true;
                    TopicsController topicsController2 = kg1Var.f37415s;
                    long j12 = kg1Var.f37380a;
                    int intValue = ((Integer) hashSet.iterator().next()).intValue();
                    if (i10 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    topicsController2.pinTopic(j12, intValue, z10, kg1Var);
                }
                kg1Var.C0();
                return;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    kg1Var.getNotificationsController().muteDialog(-j10, ((Integer) it.next()).intValue(), kg1Var.B0);
                }
                kg1Var.C0();
                return;
            case 7:
                kg1Var.D0(hashSet, new tz0(this, 20));
                return;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, ((Integer) arrayList2.get(i14)).intValue());
                    if (findTopic != null) {
                        kg1Var.getMessagesController().markMentionsAsRead(-j10, findTopic.f18968id);
                        MessagesController messagesController = kg1Var.getMessagesController();
                        long j13 = -j10;
                        int i15 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        if (message != null) {
                            i12 = message.date;
                        } else {
                            i12 = 0;
                        }
                        messagesController.markDialogAsRead(j13, i15, 0, i12, false, findTopic.f18968id, 0, true, 0);
                        kg1Var.getMessagesStorage().updateRepliesMaxReadId(kg1Var.f37380a, findTopic.f18968id, findTopic.top_message, 0, true);
                    }
                }
                kg1Var.C0();
                return;
            case 9:
            case 10:
                kg1Var.N0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                    int intValue2 = ((Integer) arrayList3.get(i16)).intValue();
                    if (i10 == 9) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    topicsController.toggleCloseTopic(j10, intValue2, z11);
                }
                kg1Var.C0();
                return;
            case 11:
                TLRPC.Chat chat = kg1Var.getMessagesController().getChat(Long.valueOf(j10));
                org.telegram.ui.Components.g5.r(kg1Var, false, chat, null, false, true, false, false, new bs0(19, this, chat));
                return;
            case 12:
            case 13:
                int i17 = 0;
                while (true) {
                    if (i17 < kg1Var.N.getChildCount()) {
                        View childAt = kg1Var.N.getChildAt(i17);
                        if ((childAt instanceof hg1) && (tL_forumTopic = (hg1Var = (hg1) childAt).N) != null && tL_forumTopic.f18968id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i17++;
                        }
                    } else {
                        hg1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i13 < arrayList.size()) {
                            if (arrayList.get(i13) != null && ((bg1) arrayList.get(i13)).f34328c != null && ((bg1) arrayList.get(i13)).f34328c.f18968id == 1) {
                                tL_forumTopic2 = ((bg1) arrayList.get(i13)).f34328c;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (kg1Var.f37422x <= 0) {
                        kg1Var.E = true;
                        kg1Var.f37424y = 2;
                    }
                    kg1Var.getMessagesController().getTopicsController().toggleShowTopic(j10, 1, tL_forumTopic2.hidden);
                    if (hg1Var != null) {
                        kg1Var.f37385b1 = hg1Var;
                    }
                    kg1Var.N.A1(!tL_forumTopic2.hidden, hg1Var);
                    kg1Var.U0(true, true);
                    if (hg1Var != null) {
                        hg1Var.setTopicIcon(hg1Var.f36550c5);
                    }
                }
                kg1Var.C0();
                return;
            case 14:
                if (ChatObject.hasAdminRights(kg1Var.getMessagesController().getChat(Long.valueOf(j10)))) {
                    z5 z5Var = new z5(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = kg1Var.X;
                    z5Var.R = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        z5Var.getMessagesController().getBoostsController().userCanBoostChannel(z5Var.P, z5Var.R, new q5(z5Var, 0));
                    }
                    kg1Var.presentFragment(z5Var);
                    return;
                }
                kg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j10));
                return;
            case 15:
                i41.M(-j10, kg1Var);
                return;
            default:
                return;
        }
    }
}
