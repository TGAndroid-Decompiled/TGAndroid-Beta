package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
public final class s81 extends org.telegram.ui.ActionBar.j {
    public final w81 f51972a;

    public s81(w81 w81Var) {
        this.f51972a = w81Var;
    }

    @Override
    public final void b(int i7) {
        int i10;
        org.telegram.ui.Cells.r8 r8Var;
        org.telegram.ui.Cells.r8 r8Var2;
        int i11;
        String obj;
        int i12;
        w81 w81Var = this.f51972a;
        if (i7 == -1) {
            w81Var.finishFragment();
            return;
        }
        String str = null;
        if (i7 == 1) {
            if (w81Var.f53022e.getText() == null) {
                obj = null;
            } else {
                obj = w81Var.f53022e.getText().toString();
            }
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) w81Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                org.telegram.messenger.g0.D3(w81Var.f53022e);
            } else if (!w81Var.f53025r) {
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, w81Var.getParentActivity(), null);
                t1Var.r(500L);
                w81Var.f53025r = true;
                TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                tL_messages_createForumTopic.peer = w81Var.getMessagesController().l1(w81Var.f53019a);
                tL_messages_createForumTopic.title = obj;
                long j3 = w81Var.f53020b;
                if (j3 != 0) {
                    tL_messages_createForumTopic.icon_emoji_id = j3;
                    tL_messages_createForumTopic.flags |= 8;
                }
                tL_messages_createForumTopic.random_id = Utilities.f22805b.nextLong();
                tL_messages_createForumTopic.icon_color = w81Var.F;
                tL_messages_createForumTopic.flags |= 1;
                i12 = ((org.telegram.ui.ActionBar.g2) w81Var).currentAccount;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_createForumTopic, new mo0(this, obj, t1Var, 11));
            }
        } else if (i7 == 2) {
            if (w81Var.f53022e.getText() != null) {
                str = w81Var.f53022e.getText().toString();
            }
            if (TextUtils.isEmpty(str)) {
                Vibrator vibrator2 = (Vibrator) w81Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                org.telegram.messenger.g0.D3(w81Var.f53022e);
                return;
            }
            if (!w81Var.f53028x.title.equals(str) || w81Var.f53028x.icon_emoji_id != w81Var.f53020b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = w81Var.getMessagesController().l1(w81Var.f53019a);
                TLRPC.TL_forumTopic tL_forumTopic = w81Var.f53028x;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.f28483id;
                if (!tL_forumTopic.title.equals(str)) {
                    tL_messages_editForumTopic.title = str;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j10 = w81Var.f53028x.icon_emoji_id;
                long j11 = w81Var.f53020b;
                if (j10 != j11) {
                    tL_messages_editForumTopic.icon_emoji_id = j11;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i10 = ((org.telegram.ui.ActionBar.g2) w81Var).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_editForumTopic, new fi.l5(9));
            }
            if (w81Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = w81Var.f53028x;
                if (tL_forumTopic2.f28483id == 1 && (!r8Var.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = w81Var.getMessagesController().l1(w81Var.f53019a);
                    tL_messages_editForumTopic2.topic_id = w81Var.f53028x.f28483id;
                    tL_messages_editForumTopic2.hidden = !w81Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i11 = ((org.telegram.ui.ActionBar.g2) w81Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic2, new fi.l5(9));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = w81Var.f53028x;
            long j12 = w81Var.f53020b;
            tL_forumTopic3.icon_emoji_id = j12;
            if (j12 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = str;
            if (w81Var.d != null) {
                tL_forumTopic3.hidden = !r8Var2.d.h;
            }
            org.telegram.messenger.e00 e00Var = w81Var.getMessagesController().f25797t7;
            long j13 = w81Var.f53019a;
            e00Var.getMessagesStorage().f2(j13, w81Var.f53028x, 35);
            e00Var.y(-j13, true);
            w81Var.finishFragment();
        }
    }
}
