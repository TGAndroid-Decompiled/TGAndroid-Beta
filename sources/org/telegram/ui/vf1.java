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
public final class vf1 extends org.telegram.ui.ActionBar.j {
    public final Context f40984a;
    public final lg1 f40985b;

    public vf1(lg1 lg1Var, Context context) {
        this.f40985b = lg1Var;
        this.f40984a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        boolean z10;
        int i12;
        boolean z11;
        ig1 ig1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        lg1 lg1Var = this.f40985b;
        TopicsController topicsController = lg1Var.f37992s;
        ArrayList arrayList = lg1Var.f37960b;
        HashSet hashSet = lg1Var.f37958a0;
        long j10 = lg1Var.f37957a;
        if (i10 == -1) {
            if (hashSet.size() > 0) {
                lg1Var.C0();
                return;
            } else {
                lg1Var.finishFragment();
                return;
            }
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i13 = 0;
        switch (i10) {
            case 1:
                lg1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j10, true);
                lg1Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                fo foVar = new fo(bundle);
                foVar.f35993ja = true;
                lg1Var.presentFragment(foVar);
                return;
            case 2:
                TLRPC.ChatFull chatFull = lg1Var.getMessagesController().getChatFull(j10);
                TLRPC.ChatFull chatFull2 = lg1Var.J;
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
                    long j11 = chatFull.f19217id;
                    i11 = ((org.telegram.ui.ActionBar.m2) lg1Var).currentAccount;
                    tf1 tf1Var = new tf1(this, this.f40984a, i11, hVar, chatFull.f19217id, lg1Var, j11);
                    tf1Var.f23477l0 = new bi.p1(this, j11, 11);
                    tf1Var.show();
                    return;
                }
                return;
            case 3:
                hf1 a02 = hf1.a0(j10, 0L);
                lg1Var.presentFragment(a02);
                AndroidUtilities.runOnUIThread(new cf1(a02, 1), 200L);
                return;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    lg1Var.C0 = true;
                    lg1Var.N0 = true;
                    TopicsController topicsController2 = lg1Var.f37992s;
                    long j12 = lg1Var.f37957a;
                    int intValue = ((Integer) hashSet.iterator().next()).intValue();
                    if (i10 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    topicsController2.pinTopic(j12, intValue, z10, lg1Var);
                }
                lg1Var.C0();
                return;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    lg1Var.getNotificationsController().muteDialog(-j10, ((Integer) it.next()).intValue(), lg1Var.B0);
                }
                lg1Var.C0();
                return;
            case 7:
                lg1Var.D0(hashSet, new uz0(this, 20));
                return;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, ((Integer) arrayList2.get(i14)).intValue());
                    if (findTopic != null) {
                        lg1Var.getMessagesController().markMentionsAsRead(-j10, findTopic.f19268id);
                        MessagesController messagesController = lg1Var.getMessagesController();
                        long j13 = -j10;
                        int i15 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        if (message != null) {
                            i12 = message.date;
                        } else {
                            i12 = 0;
                        }
                        messagesController.markDialogAsRead(j13, i15, 0, i12, false, findTopic.f19268id, 0, true, 0);
                        lg1Var.getMessagesStorage().updateRepliesMaxReadId(lg1Var.f37957a, findTopic.f19268id, findTopic.top_message, 0, true);
                    }
                }
                lg1Var.C0();
                return;
            case 9:
            case 10:
                lg1Var.N0 = true;
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
                lg1Var.C0();
                return;
            case 11:
                TLRPC.Chat chat = lg1Var.getMessagesController().getChat(Long.valueOf(j10));
                org.telegram.ui.Components.g5.r(lg1Var, false, chat, null, false, true, false, false, new cs0(20, this, chat));
                return;
            case 12:
            case 13:
                int i17 = 0;
                while (true) {
                    if (i17 < lg1Var.N.getChildCount()) {
                        View childAt = lg1Var.N.getChildAt(i17);
                        if ((childAt instanceof ig1) && (tL_forumTopic = (ig1Var = (ig1) childAt).N) != null && tL_forumTopic.f19268id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i17++;
                        }
                    } else {
                        ig1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i13 < arrayList.size()) {
                            if (arrayList.get(i13) != null && ((cg1) arrayList.get(i13)).f34947c != null && ((cg1) arrayList.get(i13)).f34947c.f19268id == 1) {
                                tL_forumTopic2 = ((cg1) arrayList.get(i13)).f34947c;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (lg1Var.f37999x <= 0) {
                        lg1Var.E = true;
                        lg1Var.f38001y = 2;
                    }
                    lg1Var.getMessagesController().getTopicsController().toggleShowTopic(j10, 1, tL_forumTopic2.hidden);
                    if (ig1Var != null) {
                        lg1Var.f37962b1 = ig1Var;
                    }
                    lg1Var.N.A1(!tL_forumTopic2.hidden, ig1Var);
                    lg1Var.U0(true, true);
                    if (ig1Var != null) {
                        ig1Var.setTopicIcon(ig1Var.f37119c5);
                    }
                }
                lg1Var.C0();
                return;
            case 14:
                if (ChatObject.hasAdminRights(lg1Var.getMessagesController().getChat(Long.valueOf(j10)))) {
                    z5 z5Var = new z5(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = lg1Var.X;
                    z5Var.R = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        z5Var.getMessagesController().getBoostsController().userCanBoostChannel(z5Var.P, z5Var.R, new q5(z5Var, 0));
                    }
                    lg1Var.presentFragment(z5Var);
                    return;
                }
                lg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j10));
                return;
            case 15:
                i41.M(-j10, lg1Var);
                return;
            default:
                return;
        }
    }
}
