package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class tf implements org.telegram.ui.Components.mk0, org.telegram.ui.ActionBar.a2 {
    public final int f41664a;
    public final qn f41665b;
    public final MessageObject f41666c;

    public tf(qn qnVar, MessageObject messageObject, int i10) {
        this.f41664a = i10;
        this.f41665b = qnVar;
        this.f41666c = messageObject;
    }

    @Override
    public void c(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f41664a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                qn qnVar = this.f41665b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.f41666c.getId());
                    bundle.putLong("report_reaction_from_dialog_id", qnVar.T5);
                }
                qnVar.presentFragment(new ProfileActivity(bundle, null));
                qnVar.D7(true);
                return;
            default:
                qn qnVar2 = this.f41665b;
                qnVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j10 > 0) {
                    bundle2.putLong("user_id", j10);
                } else {
                    bundle2.putLong("chat_id", -j10);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.f41666c.getId());
                    bundle2.putLong("report_reaction_from_dialog_id", qnVar2.T5);
                }
                qnVar2.presentFragment(new ProfileActivity(bundle2, null));
                qnVar2.D7(true);
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        qn qnVar = this.f41665b;
        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(qnVar.getParentActivity(), 3, qnVar.f40677ea)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        MessageObject messageObject = this.f41666c;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
        tL_poll.f20306id = poll.f20306id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = qnVar.getMessagesController().getInputPeer(qnVar.T5);
        tL_messages_editMessage.f20363id = messageObject.getId();
        tL_messages_editMessage.flags |= 16384;
        AndroidUtilities.runOnUIThread(new mg(qnVar, b2VarArr, qnVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new ca(qnVar, b2VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
