package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
public final class we1 extends org.telegram.ui.ActionBar.j {
    public final af1 f38860a;

    public we1(af1 af1Var) {
        this.f38860a = af1Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        org.telegram.ui.Cells.v8 v8Var;
        org.telegram.ui.Cells.v8 v8Var2;
        int i12;
        String obj;
        int i13;
        af1 af1Var = this.f38860a;
        if (i10 == -1) {
            af1Var.finishFragment();
            return;
        }
        String str = null;
        if (i10 == 1) {
            if (af1Var.e.getText() == null) {
                obj = null;
            } else {
                obj = af1Var.e.getText().toString();
            }
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) af1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(af1Var.e);
            } else if (!af1Var.f31794r) {
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(af1Var.getParentActivity(), 3, null);
                b2Var.q(500L);
                af1Var.f31794r = true;
                TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                tL_messages_createForumTopic.peer = af1Var.getMessagesController().getInputPeer(af1Var.f31789a);
                tL_messages_createForumTopic.title = obj;
                long j3 = af1Var.f31790b;
                if (j3 != 0) {
                    tL_messages_createForumTopic.icon_emoji_id = j3;
                    tL_messages_createForumTopic.flags |= 8;
                }
                tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
                tL_messages_createForumTopic.icon_color = af1Var.E;
                tL_messages_createForumTopic.flags |= 1;
                i13 = ((org.telegram.ui.ActionBar.n2) af1Var).currentAccount;
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_createForumTopic, new ns0(this, obj, b2Var, 11));
            }
        } else if (i10 == 2) {
            if (af1Var.e.getText() != null) {
                str = af1Var.e.getText().toString();
            }
            if (TextUtils.isEmpty(str)) {
                Vibrator vibrator2 = (Vibrator) af1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(af1Var.e);
                return;
            }
            if (!af1Var.f31796w.title.equals(str) || af1Var.f31796w.icon_emoji_id != af1Var.f31790b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = af1Var.getMessagesController().getInputPeer(af1Var.f31789a);
                TLRPC.TL_forumTopic tL_forumTopic = af1Var.f31796w;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.f18161id;
                if (!tL_forumTopic.title.equals(str)) {
                    tL_messages_editForumTopic.title = str;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j10 = af1Var.f31796w.icon_emoji_id;
                long j11 = af1Var.f31790b;
                if (j10 != j11) {
                    tL_messages_editForumTopic.icon_emoji_id = j11;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i11 = ((org.telegram.ui.ActionBar.n2) af1Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic, new ai.t7(8));
            }
            if (af1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = af1Var.f31796w;
                if (tL_forumTopic2.f18161id == 1 && (!v8Var.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = af1Var.getMessagesController().getInputPeer(af1Var.f31789a);
                    tL_messages_editForumTopic2.topic_id = af1Var.f31796w.f18161id;
                    tL_messages_editForumTopic2.hidden = !af1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i12 = ((org.telegram.ui.ActionBar.n2) af1Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_editForumTopic2, new ai.t7(8));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = af1Var.f31796w;
            long j12 = af1Var.f31790b;
            tL_forumTopic3.icon_emoji_id = j12;
            if (j12 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = str;
            if (af1Var.d != null) {
                tL_forumTopic3.hidden = !v8Var2.d.h;
            }
            af1Var.getMessagesController().getTopicsController().onTopicEdited(af1Var.f31789a, af1Var.f31796w);
            af1Var.finishFragment();
        }
    }
}
