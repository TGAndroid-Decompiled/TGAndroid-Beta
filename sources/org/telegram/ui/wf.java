package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class wf implements org.telegram.ui.Components.vi0, org.telegram.ui.ActionBar.u1 {
    public final int f43096a;
    public final un f43097b;
    public final org.telegram.messenger.kj f43098c;

    public wf(un unVar, org.telegram.messenger.kj kjVar, int i10) {
        this.f43096a = i10;
        this.f43097b = unVar;
        this.f43098c = kjVar;
    }

    @Override
    public void c(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f43096a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                un unVar = this.f43097b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.f43098c.f1());
                    bundle.putLong("report_reaction_from_dialog_id", unVar.f42108j6);
                }
                unVar.presentFragment(new ProfileActivity(bundle, null));
                unVar.M7(true);
                return;
            default:
                un unVar2 = this.f43097b;
                unVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j10 > 0) {
                    bundle2.putLong("user_id", j10);
                } else {
                    bundle2.putLong("chat_id", -j10);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.f43098c.f1());
                    bundle2.putLong("report_reaction_from_dialog_id", unVar2.f42108j6);
                }
                unVar2.presentFragment(new ProfileActivity(bundle2, null));
                unVar2.M7(true);
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        un unVar = this.f43097b;
        org.telegram.ui.ActionBar.x1[] x1VarArr = {new org.telegram.ui.ActionBar.x1(3, unVar.getParentActivity(), unVar.f42288xa)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        org.telegram.messenger.kj kjVar = this.f43098c;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) kjVar.f16690k.media).poll;
        tL_poll.f19820id = poll.f19820id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = unVar.getMessagesController().i1(unVar.f42108j6);
        tL_messages_editMessage.f19878id = kjVar.f1();
        tL_messages_editMessage.flags |= 16384;
        org.telegram.messenger.i0.h3(new pg(unVar, x1VarArr, unVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new aa(unVar, x1VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
