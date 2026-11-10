package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
public final class s81 extends org.telegram.ui.ActionBar.k {
    public final x81 f49737a;

    public s81(x81 x81Var) {
        this.f49737a = x81Var;
    }

    @Override
    public final void b(int i7) {
        int i10;
        org.telegram.ui.Cells.q8 q8Var;
        org.telegram.ui.Cells.q8 q8Var2;
        int i11;
        String obj;
        int i12;
        x81 x81Var = this.f49737a;
        if (i7 == -1) {
            x81Var.finishFragment();
            return;
        }
        String str = null;
        if (i7 == 1) {
            if (x81Var.f51635e.getText() == null) {
                obj = null;
            } else {
                obj = x81Var.f51635e.getText().toString();
            }
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) x81Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                org.telegram.messenger.g0.F3(x81Var.f51635e);
            } else if (!x81Var.f51638r) {
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, x81Var.getParentActivity(), null);
                u1Var.r(500L);
                x81Var.f51638r = true;
                TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                tL_messages_createForumTopic.peer = x81Var.getMessagesController().j1(x81Var.f51632a);
                tL_messages_createForumTopic.title = obj;
                long j3 = x81Var.f51633b;
                if (j3 != 0) {
                    tL_messages_createForumTopic.icon_emoji_id = j3;
                    tL_messages_createForumTopic.flags |= 8;
                }
                tL_messages_createForumTopic.random_id = Utilities.f21339b.nextLong();
                tL_messages_createForumTopic.icon_color = x81Var.E;
                tL_messages_createForumTopic.flags |= 1;
                i12 = ((org.telegram.ui.ActionBar.f2) x81Var).currentAccount;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_createForumTopic, new oo0(this, obj, u1Var, 11));
            }
        } else if (i7 == 2) {
            if (x81Var.f51635e.getText() != null) {
                str = x81Var.f51635e.getText().toString();
            }
            if (TextUtils.isEmpty(str)) {
                Vibrator vibrator2 = (Vibrator) x81Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                org.telegram.messenger.g0.F3(x81Var.f51635e);
                return;
            }
            if (!x81Var.f51641x.title.equals(str) || x81Var.f51641x.icon_emoji_id != x81Var.f51633b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = x81Var.getMessagesController().j1(x81Var.f51632a);
                TLRPC.TL_forumTopic tL_forumTopic = x81Var.f51641x;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.f27012id;
                if (!tL_forumTopic.title.equals(str)) {
                    tL_messages_editForumTopic.title = str;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j10 = x81Var.f51641x.icon_emoji_id;
                long j11 = x81Var.f51633b;
                if (j10 != j11) {
                    tL_messages_editForumTopic.icon_emoji_id = j11;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i10 = ((org.telegram.ui.ActionBar.f2) x81Var).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_editForumTopic, new di.v5(9));
            }
            if (x81Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = x81Var.f51641x;
                if (tL_forumTopic2.f27012id == 1 && (!q8Var.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = x81Var.getMessagesController().j1(x81Var.f51632a);
                    tL_messages_editForumTopic2.topic_id = x81Var.f51641x.f27012id;
                    tL_messages_editForumTopic2.hidden = !x81Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i11 = ((org.telegram.ui.ActionBar.f2) x81Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic2, new di.v5(9));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = x81Var.f51641x;
            long j12 = x81Var.f51633b;
            tL_forumTopic3.icon_emoji_id = j12;
            if (j12 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = str;
            if (x81Var.d != null) {
                tL_forumTopic3.hidden = !q8Var2.d.h;
            }
            org.telegram.messenger.k00 k00Var = x81Var.getMessagesController().f24881q7;
            long j13 = x81Var.f51632a;
            k00Var.getMessagesStorage().f2(j13, x81Var.f51641x, 35);
            k00Var.y(-j13, true);
            x81Var.finishFragment();
        }
    }
}
