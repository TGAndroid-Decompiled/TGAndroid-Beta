package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
public final class sd1 extends org.telegram.ui.ActionBar.j {
    public final wd1 f43474a;

    public sd1(wd1 wd1Var) {
        this.f43474a = wd1Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        org.telegram.ui.Cells.z8 z8Var;
        org.telegram.ui.Cells.z8 z8Var2;
        int i12;
        String obj;
        int i13;
        wd1 wd1Var = this.f43474a;
        if (i10 == -1) {
            wd1Var.finishFragment();
            return;
        }
        String str = null;
        if (i10 == 1) {
            if (wd1Var.e.getText() == null) {
                obj = null;
            } else {
                obj = wd1Var.e.getText().toString();
            }
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) wd1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(wd1Var.e);
            } else if (!wd1Var.f45110r) {
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(wd1Var.getParentActivity(), 3, null);
                e2Var.r(500L);
                wd1Var.f45110r = true;
                TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                tL_messages_createForumTopic.peer = wd1Var.getMessagesController().getInputPeer(wd1Var.f45105a);
                tL_messages_createForumTopic.title = obj;
                long j10 = wd1Var.f45106b;
                if (j10 != 0) {
                    tL_messages_createForumTopic.icon_emoji_id = j10;
                    tL_messages_createForumTopic.flags |= 8;
                }
                tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
                tL_messages_createForumTopic.icon_color = wd1Var.E;
                tL_messages_createForumTopic.flags |= 1;
                i13 = ((org.telegram.ui.ActionBar.r2) wd1Var).currentAccount;
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_createForumTopic, new as0(this, obj, e2Var, 11));
            }
        } else if (i10 == 2) {
            if (wd1Var.e.getText() != null) {
                str = wd1Var.e.getText().toString();
            }
            if (TextUtils.isEmpty(str)) {
                Vibrator vibrator2 = (Vibrator) wd1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(wd1Var.e);
                return;
            }
            if (!wd1Var.f45112w.title.equals(str) || wd1Var.f45112w.icon_emoji_id != wd1Var.f45106b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = wd1Var.getMessagesController().getInputPeer(wd1Var.f45105a);
                TLRPC.TL_forumTopic tL_forumTopic = wd1Var.f45112w;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.f22079id;
                if (!tL_forumTopic.title.equals(str)) {
                    tL_messages_editForumTopic.title = str;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j11 = wd1Var.f45112w.icon_emoji_id;
                long j12 = wd1Var.f45106b;
                if (j11 != j12) {
                    tL_messages_editForumTopic.icon_emoji_id = j12;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i11 = ((org.telegram.ui.ActionBar.r2) wd1Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic, new di.d6(8));
            }
            if (wd1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = wd1Var.f45112w;
                if (tL_forumTopic2.f22079id == 1 && (!z8Var.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = wd1Var.getMessagesController().getInputPeer(wd1Var.f45105a);
                    tL_messages_editForumTopic2.topic_id = wd1Var.f45112w.f22079id;
                    tL_messages_editForumTopic2.hidden = !wd1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i12 = ((org.telegram.ui.ActionBar.r2) wd1Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_editForumTopic2, new di.d6(8));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = wd1Var.f45112w;
            long j13 = wd1Var.f45106b;
            tL_forumTopic3.icon_emoji_id = j13;
            if (j13 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = str;
            if (wd1Var.d != null) {
                tL_forumTopic3.hidden = !z8Var2.d.h;
            }
            wd1Var.getMessagesController().getTopicsController().onTopicEdited(wd1Var.f45105a, wd1Var.f45112w);
            wd1Var.finishFragment();
        }
    }
}
