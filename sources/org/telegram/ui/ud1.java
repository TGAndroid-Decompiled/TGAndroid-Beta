package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
public final class ud1 extends org.telegram.ui.ActionBar.j {
    public final yd1 f43994a;

    public ud1(yd1 yd1Var) {
        this.f43994a = yd1Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        org.telegram.ui.Cells.z8 z8Var;
        org.telegram.ui.Cells.z8 z8Var2;
        int i12;
        String obj;
        int i13;
        yd1 yd1Var = this.f43994a;
        if (i10 == -1) {
            yd1Var.finishFragment();
            return;
        }
        String str = null;
        if (i10 == 1) {
            if (yd1Var.e.getText() == null) {
                obj = null;
            } else {
                obj = yd1Var.e.getText().toString();
            }
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) yd1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(yd1Var.e);
            } else if (!yd1Var.f45974r) {
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(yd1Var.getParentActivity(), 3, null);
                e2Var.r(500L);
                yd1Var.f45974r = true;
                TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                tL_messages_createForumTopic.peer = yd1Var.getMessagesController().getInputPeer(yd1Var.f45969a);
                tL_messages_createForumTopic.title = obj;
                long j10 = yd1Var.f45970b;
                if (j10 != 0) {
                    tL_messages_createForumTopic.icon_emoji_id = j10;
                    tL_messages_createForumTopic.flags |= 8;
                }
                tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
                tL_messages_createForumTopic.icon_color = yd1Var.E;
                tL_messages_createForumTopic.flags |= 1;
                i13 = ((org.telegram.ui.ActionBar.r2) yd1Var).currentAccount;
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_createForumTopic, new cs0(this, obj, e2Var, 11));
            }
        } else if (i10 == 2) {
            if (yd1Var.e.getText() != null) {
                str = yd1Var.e.getText().toString();
            }
            if (TextUtils.isEmpty(str)) {
                Vibrator vibrator2 = (Vibrator) yd1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(yd1Var.e);
                return;
            }
            if (!yd1Var.f45976w.title.equals(str) || yd1Var.f45976w.icon_emoji_id != yd1Var.f45970b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = yd1Var.getMessagesController().getInputPeer(yd1Var.f45969a);
                TLRPC.TL_forumTopic tL_forumTopic = yd1Var.f45976w;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.f22080id;
                if (!tL_forumTopic.title.equals(str)) {
                    tL_messages_editForumTopic.title = str;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j11 = yd1Var.f45976w.icon_emoji_id;
                long j12 = yd1Var.f45970b;
                if (j11 != j12) {
                    tL_messages_editForumTopic.icon_emoji_id = j12;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i11 = ((org.telegram.ui.ActionBar.r2) yd1Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic, new di.d6(8));
            }
            if (yd1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = yd1Var.f45976w;
                if (tL_forumTopic2.f22080id == 1 && (!z8Var.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = yd1Var.getMessagesController().getInputPeer(yd1Var.f45969a);
                    tL_messages_editForumTopic2.topic_id = yd1Var.f45976w.f22080id;
                    tL_messages_editForumTopic2.hidden = !yd1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i12 = ((org.telegram.ui.ActionBar.r2) yd1Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_editForumTopic2, new di.d6(8));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = yd1Var.f45976w;
            long j13 = yd1Var.f45970b;
            tL_forumTopic3.icon_emoji_id = j13;
            if (j13 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = str;
            if (yd1Var.d != null) {
                tL_forumTopic3.hidden = !z8Var2.d.h;
            }
            yd1Var.getMessagesController().getTopicsController().onTopicEdited(yd1Var.f45969a, yd1Var.f45976w);
            yd1Var.finishFragment();
        }
    }
}
