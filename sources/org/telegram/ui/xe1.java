package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
public final class xe1 extends org.telegram.ui.ActionBar.j {
    public final bf1 f39569a;

    public xe1(bf1 bf1Var) {
        this.f39569a = bf1Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        org.telegram.ui.Cells.w8 w8Var;
        org.telegram.ui.Cells.w8 w8Var2;
        int i12;
        String obj;
        int i13;
        bf1 bf1Var = this.f39569a;
        if (i10 == -1) {
            bf1Var.finishFragment();
            return;
        }
        String str = null;
        if (i10 == 1) {
            if (bf1Var.e.getText() == null) {
                obj = null;
            } else {
                obj = bf1Var.e.getText().toString();
            }
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) bf1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(bf1Var.e);
            } else if (!bf1Var.f32421r) {
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(bf1Var.getParentActivity(), 3, null);
                b2Var.q(500L);
                bf1Var.f32421r = true;
                TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                tL_messages_createForumTopic.peer = bf1Var.getMessagesController().getInputPeer(bf1Var.f32416a);
                tL_messages_createForumTopic.title = obj;
                long j3 = bf1Var.f32417b;
                if (j3 != 0) {
                    tL_messages_createForumTopic.icon_emoji_id = j3;
                    tL_messages_createForumTopic.flags |= 8;
                }
                tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
                tL_messages_createForumTopic.icon_color = bf1Var.E;
                tL_messages_createForumTopic.flags |= 1;
                i13 = ((org.telegram.ui.ActionBar.n2) bf1Var).currentAccount;
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_createForumTopic, new ns0(this, obj, b2Var, 11));
            }
        } else if (i10 == 2) {
            if (bf1Var.e.getText() != null) {
                str = bf1Var.e.getText().toString();
            }
            if (TextUtils.isEmpty(str)) {
                Vibrator vibrator2 = (Vibrator) bf1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(bf1Var.e);
                return;
            }
            if (!bf1Var.f32423w.title.equals(str) || bf1Var.f32423w.icon_emoji_id != bf1Var.f32417b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = bf1Var.getMessagesController().getInputPeer(bf1Var.f32416a);
                TLRPC.TL_forumTopic tL_forumTopic = bf1Var.f32423w;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.f18395id;
                if (!tL_forumTopic.title.equals(str)) {
                    tL_messages_editForumTopic.title = str;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j10 = bf1Var.f32423w.icon_emoji_id;
                long j11 = bf1Var.f32417b;
                if (j10 != j11) {
                    tL_messages_editForumTopic.icon_emoji_id = j11;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i11 = ((org.telegram.ui.ActionBar.n2) bf1Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic, new ai.t7(8));
            }
            if (bf1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = bf1Var.f32423w;
                if (tL_forumTopic2.f18395id == 1 && (!w8Var.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = bf1Var.getMessagesController().getInputPeer(bf1Var.f32416a);
                    tL_messages_editForumTopic2.topic_id = bf1Var.f32423w.f18395id;
                    tL_messages_editForumTopic2.hidden = !bf1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i12 = ((org.telegram.ui.ActionBar.n2) bf1Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_editForumTopic2, new ai.t7(8));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = bf1Var.f32423w;
            long j12 = bf1Var.f32417b;
            tL_forumTopic3.icon_emoji_id = j12;
            if (j12 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = str;
            if (bf1Var.d != null) {
                tL_forumTopic3.hidden = !w8Var2.d.h;
            }
            bf1Var.getMessagesController().getTopicsController().onTopicEdited(bf1Var.f32416a, bf1Var.f32423w);
            bf1Var.finishFragment();
        }
    }
}
