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
public final class ue1 extends org.telegram.ui.ActionBar.j {
    public final Context f38923a;
    public final kf1 f38924b;

    public ue1(kf1 kf1Var, Context context) {
        this.f38924b = kf1Var;
        this.f38923a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        boolean z4;
        int i12;
        boolean z10;
        hf1 hf1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        kf1 kf1Var = this.f38924b;
        TopicsController topicsController = kf1Var.f35701s;
        ArrayList arrayList = kf1Var.f35671b;
        HashSet hashSet = kf1Var.X;
        long j10 = kf1Var.f35668a;
        if (i10 == -1) {
            if (hashSet.size() > 0) {
                kf1Var.C0();
                return;
            } else {
                kf1Var.finishFragment();
                return;
            }
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i13 = 0;
        switch (i10) {
            case 1:
                kf1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j10, true);
                kf1Var.F = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                xn xnVar = new xn(bundle);
                xnVar.f40032ga = true;
                kf1Var.presentFragment(xnVar);
                return;
            case 2:
                TLRPC.ChatFull chatFull = kf1Var.getMessagesController().getChatFull(j10);
                TLRPC.ChatFull chatFull2 = kf1Var.G;
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
                    long j11 = chatFull.f19185id;
                    i11 = ((org.telegram.ui.ActionBar.p2) kf1Var).currentAccount;
                    se1 se1Var = new se1(this, this.f38923a, i11, hVar, chatFull.f19185id, kf1Var, j11);
                    se1Var.f23871i0 = new f3.e(this, j11, 10);
                    se1Var.show();
                    return;
                }
                return;
            case 3:
                fe1 a02 = fe1.a0(j10, 0L);
                kf1Var.presentFragment(a02);
                AndroidUtilities.runOnUIThread(new ae1(a02, 1), 200L);
                return;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    kf1Var.f35712z0 = true;
                    kf1Var.K0 = true;
                    TopicsController topicsController2 = kf1Var.f35701s;
                    long j12 = kf1Var.f35668a;
                    int intValue = ((Integer) hashSet.iterator().next()).intValue();
                    if (i10 == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    topicsController2.pinTopic(j12, intValue, z4, kf1Var);
                }
                kf1Var.C0();
                return;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    kf1Var.getNotificationsController().muteDialog(-j10, ((Integer) it.next()).intValue(), kf1Var.f35711y0);
                }
                kf1Var.C0();
                return;
            case 7:
                kf1Var.D0(hashSet, new vy0(this, 21));
                return;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, ((Integer) arrayList2.get(i14)).intValue());
                    if (findTopic != null) {
                        kf1Var.getMessagesController().markMentionsAsRead(-j10, findTopic.f19236id);
                        MessagesController messagesController = kf1Var.getMessagesController();
                        long j13 = -j10;
                        int i15 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        if (message != null) {
                            i12 = message.date;
                        } else {
                            i12 = 0;
                        }
                        messagesController.markDialogAsRead(j13, i15, 0, i12, false, findTopic.f19236id, 0, true, 0);
                        kf1Var.getMessagesStorage().updateRepliesMaxReadId(kf1Var.f35668a, findTopic.f19236id, findTopic.top_message, 0, true);
                    }
                }
                kf1Var.C0();
                return;
            case 9:
            case 10:
                kf1Var.K0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                    int intValue2 = ((Integer) arrayList3.get(i16)).intValue();
                    if (i10 == 9) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    topicsController.toggleCloseTopic(j10, intValue2, z10);
                }
                kf1Var.C0();
                return;
            case 11:
                TLRPC.Chat chat = kf1Var.getMessagesController().getChat(Long.valueOf(j10));
                org.telegram.ui.Components.z4.s(kf1Var, false, chat, null, false, true, false, false, new tl0(24, this, chat));
                return;
            case 12:
            case 13:
                int i17 = 0;
                while (true) {
                    if (i17 < kf1Var.K.getChildCount()) {
                        View childAt = kf1Var.K.getChildAt(i17);
                        if ((childAt instanceof hf1) && (tL_forumTopic = (hf1Var = (hf1) childAt).K) != null && tL_forumTopic.f19236id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i17++;
                        }
                    } else {
                        hf1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i13 < arrayList.size()) {
                            if (arrayList.get(i13) != null && ((bf1) arrayList.get(i13)).f32951c != null && ((bf1) arrayList.get(i13)).f32951c.f19236id == 1) {
                                tL_forumTopic2 = ((bf1) arrayList.get(i13)).f32951c;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (kf1Var.f35708x <= 0) {
                        kf1Var.B = true;
                        kf1Var.f35710y = 2;
                    }
                    kf1Var.getMessagesController().getTopicsController().toggleShowTopic(j10, 1, tL_forumTopic2.hidden);
                    if (hf1Var != null) {
                        kf1Var.Y0 = hf1Var;
                    }
                    kf1Var.K.z1(!tL_forumTopic2.hidden, hf1Var);
                    kf1Var.U0(true, true);
                    if (hf1Var != null) {
                        hf1Var.setTopicIcon(hf1Var.V4);
                    }
                }
                kf1Var.C0();
                return;
            case 14:
                if (ChatObject.hasAdminRights(kf1Var.getMessagesController().getChat(Long.valueOf(j10)))) {
                    y5 y5Var = new y5(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = kf1Var.U;
                    y5Var.O = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        y5Var.getMessagesController().getBoostsController().userCanBoostChannel(y5Var.M, y5Var.O, new p5(y5Var, 0));
                    }
                    kf1Var.presentFragment(y5Var);
                    return;
                }
                kf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j10));
                return;
            case 15:
                k31.K(-j10, kf1Var);
                return;
            default:
                return;
        }
    }
}
