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
public final class we1 extends org.telegram.ui.ActionBar.j {
    public final Context f42453a;
    public final mf1 f42454b;

    public we1(mf1 mf1Var, Context context) {
        this.f42454b = mf1Var;
        this.f42453a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        boolean z4;
        int i12;
        boolean z10;
        jf1 jf1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        mf1 mf1Var = this.f42454b;
        TopicsController topicsController = mf1Var.f39136s;
        ArrayList arrayList = mf1Var.f39105b;
        HashSet hashSet = mf1Var.X;
        long j10 = mf1Var.f39102a;
        if (i10 == -1) {
            if (hashSet.size() > 0) {
                mf1Var.C0();
                return;
            } else {
                mf1Var.finishFragment();
                return;
            }
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i13 = 0;
        switch (i10) {
            case 1:
                mf1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j10, true);
                mf1Var.F = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                xn xnVar = new xn(bundle);
                xnVar.f43201ga = true;
                mf1Var.presentFragment(xnVar);
                return;
            case 2:
                TLRPC.ChatFull chatFull = mf1Var.getMessagesController().getChatFull(j10);
                TLRPC.ChatFull chatFull2 = mf1Var.G;
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
                    long j11 = chatFull.f20844id;
                    i11 = ((org.telegram.ui.ActionBar.p2) mf1Var).currentAccount;
                    ue1 ue1Var = new ue1(this, this.f42453a, i11, hVar, chatFull.f20844id, mf1Var, j11);
                    ue1Var.f26464i0 = new f3.e(this, j11, 10);
                    ue1Var.show();
                    return;
                }
                return;
            case 3:
                ie1 a02 = ie1.a0(j10, 0L);
                mf1Var.presentFragment(a02);
                AndroidUtilities.runOnUIThread(new de1(a02, 1), 200L);
                return;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    mf1Var.f39147z0 = true;
                    mf1Var.K0 = true;
                    TopicsController topicsController2 = mf1Var.f39136s;
                    long j12 = mf1Var.f39102a;
                    int intValue = ((Integer) hashSet.iterator().next()).intValue();
                    if (i10 == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    topicsController2.pinTopic(j12, intValue, z4, mf1Var);
                }
                mf1Var.C0();
                return;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    mf1Var.getNotificationsController().muteDialog(-j10, ((Integer) it.next()).intValue(), mf1Var.f39146y0);
                }
                mf1Var.C0();
                return;
            case 7:
                mf1Var.D0(hashSet, new xy0(this, 20));
                return;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, ((Integer) arrayList2.get(i14)).intValue());
                    if (findTopic != null) {
                        mf1Var.getMessagesController().markMentionsAsRead(-j10, findTopic.f20895id);
                        MessagesController messagesController = mf1Var.getMessagesController();
                        long j13 = -j10;
                        int i15 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        if (message != null) {
                            i12 = message.date;
                        } else {
                            i12 = 0;
                        }
                        messagesController.markDialogAsRead(j13, i15, 0, i12, false, findTopic.f20895id, 0, true, 0);
                        mf1Var.getMessagesStorage().updateRepliesMaxReadId(mf1Var.f39102a, findTopic.f20895id, findTopic.top_message, 0, true);
                    }
                }
                mf1Var.C0();
                return;
            case 9:
            case 10:
                mf1Var.K0 = true;
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
                mf1Var.C0();
                return;
            case 11:
                TLRPC.Chat chat = mf1Var.getMessagesController().getChat(Long.valueOf(j10));
                org.telegram.ui.Components.z4.s(mf1Var, false, chat, null, false, true, false, false, new vl0(24, this, chat));
                return;
            case 12:
            case 13:
                int i17 = 0;
                while (true) {
                    if (i17 < mf1Var.K.getChildCount()) {
                        View childAt = mf1Var.K.getChildAt(i17);
                        if ((childAt instanceof jf1) && (tL_forumTopic = (jf1Var = (jf1) childAt).K) != null && tL_forumTopic.f20895id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i17++;
                        }
                    } else {
                        jf1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i13 < arrayList.size()) {
                            if (arrayList.get(i13) != null && ((df1) arrayList.get(i13)).f36216c != null && ((df1) arrayList.get(i13)).f36216c.f20895id == 1) {
                                tL_forumTopic2 = ((df1) arrayList.get(i13)).f36216c;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (mf1Var.f39143x <= 0) {
                        mf1Var.B = true;
                        mf1Var.f39145y = 2;
                    }
                    mf1Var.getMessagesController().getTopicsController().toggleShowTopic(j10, 1, tL_forumTopic2.hidden);
                    if (jf1Var != null) {
                        mf1Var.Y0 = jf1Var;
                    }
                    mf1Var.K.z1(!tL_forumTopic2.hidden, jf1Var);
                    mf1Var.U0(true, true);
                    if (jf1Var != null) {
                        jf1Var.setTopicIcon(jf1Var.V4);
                    }
                }
                mf1Var.C0();
                return;
            case 14:
                if (ChatObject.hasAdminRights(mf1Var.getMessagesController().getChat(Long.valueOf(j10)))) {
                    y5 y5Var = new y5(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = mf1Var.U;
                    y5Var.O = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        y5Var.getMessagesController().getBoostsController().userCanBoostChannel(y5Var.M, y5Var.O, new p5(y5Var, 0));
                    }
                    mf1Var.presentFragment(y5Var);
                    return;
                }
                mf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j10));
                return;
            case 15:
                m31.K(-j10, mf1Var);
                return;
            default:
                return;
        }
    }
}
