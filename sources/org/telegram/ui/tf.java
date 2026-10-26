package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class tf implements org.telegram.ui.Components.ok0, org.telegram.ui.ActionBar.b2 {
    public final int f43819a;
    public final un f43820b;
    public final MessageObject f43821c;

    public tf(un unVar, MessageObject messageObject, int i10) {
        this.f43819a = i10;
        this.f43820b = unVar;
        this.f43821c = messageObject;
    }

    @Override
    public void f(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f43819a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                un unVar = this.f43820b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.f43821c.getId());
                    bundle.putLong("report_reaction_from_dialog_id", unVar.f44252f6);
                }
                unVar.presentFragment(new ProfileActivity(bundle, null));
                unVar.H7(true);
                return;
            default:
                un unVar2 = this.f43820b;
                unVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j10 > 0) {
                    bundle2.putLong("user_id", j10);
                } else {
                    bundle2.putLong("chat_id", -j10);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.f43821c.getId());
                    bundle2.putLong("report_reaction_from_dialog_id", unVar2.f44252f6);
                }
                unVar2.presentFragment(new ProfileActivity(bundle2, null));
                unVar2.H7(true);
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        un unVar = this.f43820b;
        org.telegram.ui.ActionBar.e2[] e2VarArr = {new org.telegram.ui.ActionBar.e2(unVar.getParentActivity(), 3, unVar.f44388qa)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        MessageObject messageObject = this.f43821c;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
        tL_poll.f22053id = poll.f22053id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = unVar.getMessagesController().getInputPeer(unVar.f44252f6);
        tL_messages_editMessage.f22111id = messageObject.getId();
        tL_messages_editMessage.flags |= 16384;
        AndroidUtilities.runOnUIThread(new og(unVar, e2VarArr, unVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new ea(unVar, e2VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
