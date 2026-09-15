package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
public final class ve1 extends org.telegram.ui.ActionBar.j {
    public final ze1 f38586a;

    public ve1(ze1 ze1Var) {
        this.f38586a = ze1Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        org.telegram.ui.Cells.v8 v8Var;
        org.telegram.ui.Cells.v8 v8Var2;
        int i12;
        String obj;
        int i13;
        ze1 ze1Var = this.f38586a;
        if (i10 == -1) {
            ze1Var.finishFragment();
            return;
        }
        String str = null;
        if (i10 == 1) {
            if (ze1Var.e.getText() == null) {
                obj = null;
            } else {
                obj = ze1Var.e.getText().toString();
            }
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) ze1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(ze1Var.e);
            } else if (!ze1Var.f40152r) {
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ze1Var.getParentActivity(), 3, null);
                b2Var.q(500L);
                ze1Var.f40152r = true;
                TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                tL_messages_createForumTopic.peer = ze1Var.getMessagesController().getInputPeer(ze1Var.f40147a);
                tL_messages_createForumTopic.title = obj;
                long j3 = ze1Var.f40148b;
                if (j3 != 0) {
                    tL_messages_createForumTopic.icon_emoji_id = j3;
                    tL_messages_createForumTopic.flags |= 8;
                }
                tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
                tL_messages_createForumTopic.icon_color = ze1Var.E;
                tL_messages_createForumTopic.flags |= 1;
                i13 = ((org.telegram.ui.ActionBar.n2) ze1Var).currentAccount;
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_createForumTopic, new ns0(this, obj, b2Var, 11));
            }
        } else if (i10 == 2) {
            if (ze1Var.e.getText() != null) {
                str = ze1Var.e.getText().toString();
            }
            if (TextUtils.isEmpty(str)) {
                Vibrator vibrator2 = (Vibrator) ze1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(ze1Var.e);
                return;
            }
            if (!ze1Var.f40154w.title.equals(str) || ze1Var.f40154w.icon_emoji_id != ze1Var.f40148b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = ze1Var.getMessagesController().getInputPeer(ze1Var.f40147a);
                TLRPC.TL_forumTopic tL_forumTopic = ze1Var.f40154w;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.f18164id;
                if (!tL_forumTopic.title.equals(str)) {
                    tL_messages_editForumTopic.title = str;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j10 = ze1Var.f40154w.icon_emoji_id;
                long j11 = ze1Var.f40148b;
                if (j10 != j11) {
                    tL_messages_editForumTopic.icon_emoji_id = j11;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i11 = ((org.telegram.ui.ActionBar.n2) ze1Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic, new ai.t7(8));
            }
            if (ze1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = ze1Var.f40154w;
                if (tL_forumTopic2.f18164id == 1 && (!v8Var.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = ze1Var.getMessagesController().getInputPeer(ze1Var.f40147a);
                    tL_messages_editForumTopic2.topic_id = ze1Var.f40154w.f18164id;
                    tL_messages_editForumTopic2.hidden = !ze1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i12 = ((org.telegram.ui.ActionBar.n2) ze1Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_editForumTopic2, new ai.t7(8));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = ze1Var.f40154w;
            long j12 = ze1Var.f40148b;
            tL_forumTopic3.icon_emoji_id = j12;
            if (j12 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = str;
            if (ze1Var.d != null) {
                tL_forumTopic3.hidden = !v8Var2.d.h;
            }
            ze1Var.getMessagesController().getTopicsController().onTopicEdited(ze1Var.f40147a, ze1Var.f40154w);
            ze1Var.finishFragment();
        }
    }
}
