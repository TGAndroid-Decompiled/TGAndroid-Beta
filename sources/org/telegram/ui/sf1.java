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
public final class sf1 extends org.telegram.ui.ActionBar.k {
    public final Context f36672a;
    public final ig1 f36673b;

    public sf1(ig1 ig1Var, Context context) {
        this.f36673b = ig1Var;
        this.f36672a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        boolean z10;
        int i12;
        boolean z11;
        fg1 fg1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        ig1 ig1Var = this.f36673b;
        TopicsController topicsController = ig1Var.f33716s;
        ArrayList arrayList = ig1Var.f33684b;
        HashSet hashSet = ig1Var.f33682a0;
        long j3 = ig1Var.f33681a;
        if (i10 == -1) {
            if (hashSet.size() > 0) {
                ig1Var.C0();
                return;
            } else {
                ig1Var.finishFragment();
                return;
            }
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i13 = 0;
        switch (i10) {
            case 1:
                ig1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j3, true);
                ig1Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j3);
                eo eoVar = new eo(bundle);
                eoVar.f32376ja = true;
                ig1Var.presentFragment(eoVar);
                return;
            case 2:
                TLRPC.ChatFull chatFull = ig1Var.getMessagesController().getChatFull(j3);
                TLRPC.ChatFull chatFull2 = ig1Var.J;
                if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                    chatFull.participants = chatParticipants;
                }
                if (chatFull != null) {
                    a0.i iVar = new a0.i();
                    if (chatFull.participants != null) {
                        while (i13 < chatFull.participants.participants.size()) {
                            iVar.k(null, chatFull.participants.participants.get(i13).user_id);
                            i13++;
                        }
                    }
                    long j10 = chatFull.f17196id;
                    i11 = ((org.telegram.ui.ActionBar.p2) ig1Var).currentAccount;
                    qf1 qf1Var = new qf1(this, this.f36672a, i11, iVar, chatFull.f17196id, ig1Var, j10);
                    qf1Var.f24637l0 = new bi.za(this, j10, 10);
                    qf1Var.show();
                    return;
                }
                return;
            case 3:
                ef1 a02 = ef1.a0(j3, 0L);
                ig1Var.presentFragment(a02);
                AndroidUtilities.runOnUIThread(new ze1(a02, 1), 200L);
                return;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    ig1Var.C0 = true;
                    ig1Var.N0 = true;
                    TopicsController topicsController2 = ig1Var.f33716s;
                    long j11 = ig1Var.f33681a;
                    int intValue = ((Integer) hashSet.iterator().next()).intValue();
                    if (i10 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    topicsController2.pinTopic(j11, intValue, z10, ig1Var);
                }
                ig1Var.C0();
                return;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ig1Var.getNotificationsController().muteDialog(-j3, ((Integer) it.next()).intValue(), ig1Var.B0);
                }
                ig1Var.C0();
                return;
            case 7:
                ig1Var.D0(hashSet, new k01(this, 19));
                return;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j3, ((Integer) arrayList2.get(i14)).intValue());
                    if (findTopic != null) {
                        ig1Var.getMessagesController().markMentionsAsRead(-j3, findTopic.f17247id);
                        MessagesController messagesController = ig1Var.getMessagesController();
                        long j12 = -j3;
                        int i15 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        if (message != null) {
                            i12 = message.date;
                        } else {
                            i12 = 0;
                        }
                        messagesController.markDialogAsRead(j12, i15, 0, i12, false, findTopic.f17247id, 0, true, 0);
                        ig1Var.getMessagesStorage().updateRepliesMaxReadId(ig1Var.f33681a, findTopic.f17247id, findTopic.top_message, 0, true);
                    }
                }
                ig1Var.C0();
                return;
            case 9:
            case 10:
                ig1Var.N0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                    int intValue2 = ((Integer) arrayList3.get(i16)).intValue();
                    if (i10 == 9) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    topicsController.toggleCloseTopic(j3, intValue2, z11);
                }
                ig1Var.C0();
                return;
            case 11:
                TLRPC.Chat chat = ig1Var.getMessagesController().getChat(Long.valueOf(j3));
                org.telegram.ui.Components.d5.s(ig1Var, false, chat, null, false, true, false, false, new fz0(11, this, chat));
                return;
            case 12:
            case 13:
                int i17 = 0;
                while (true) {
                    if (i17 < ig1Var.N.getChildCount()) {
                        View childAt = ig1Var.N.getChildAt(i17);
                        if ((childAt instanceof fg1) && (tL_forumTopic = (fg1Var = (fg1) childAt).N) != null && tL_forumTopic.f17247id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i17++;
                        }
                    } else {
                        fg1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i13 < arrayList.size()) {
                            if (arrayList.get(i13) != null && ((zf1) arrayList.get(i13)).f39309c != null && ((zf1) arrayList.get(i13)).f39309c.f17247id == 1) {
                                tL_forumTopic2 = ((zf1) arrayList.get(i13)).f39309c;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (ig1Var.f33723x <= 0) {
                        ig1Var.E = true;
                        ig1Var.f33725y = 2;
                    }
                    ig1Var.getMessagesController().getTopicsController().toggleShowTopic(j3, 1, tL_forumTopic2.hidden);
                    if (fg1Var != null) {
                        ig1Var.f33686b1 = fg1Var;
                    }
                    ig1Var.N.y1(!tL_forumTopic2.hidden, fg1Var);
                    ig1Var.U0(true, true);
                    if (fg1Var != null) {
                        fg1Var.setTopicIcon(fg1Var.Y4);
                    }
                }
                ig1Var.C0();
                return;
            case 14:
                if (ChatObject.hasAdminRights(ig1Var.getMessagesController().getChat(Long.valueOf(j3)))) {
                    w5 w5Var = new w5(-j3);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = ig1Var.X;
                    w5Var.R = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        w5Var.getMessagesController().getBoostsController().userCanBoostChannel(w5Var.P, w5Var.R, new m5(w5Var, 0));
                    }
                    ig1Var.presentFragment(w5Var);
                    return;
                }
                ig1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j3));
                return;
            case 15:
                h41.L(-j3, ig1Var);
                return;
            default:
                return;
        }
    }
}
