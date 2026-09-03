package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class uf implements org.telegram.ui.Components.yj0, org.telegram.ui.ActionBar.c2 {
    public final int f41814a;
    public final xn f41815b;
    public final MessageObject f41816c;

    public uf(xn xnVar, MessageObject messageObject, int i10) {
        this.f41814a = i10;
        this.f41815b = xnVar;
        this.f41816c = messageObject;
    }

    @Override
    public void a(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f41814a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                xn xnVar = this.f41815b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.f41816c.getId());
                    bundle.putLong("report_reaction_from_dialog_id", xnVar.Q5);
                }
                xnVar.presentFragment(new ProfileActivity(bundle, null));
                xnVar.A7(true);
                return;
            default:
                xn xnVar2 = this.f41815b;
                xnVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j10 > 0) {
                    bundle2.putLong("user_id", j10);
                } else {
                    bundle2.putLong("chat_id", -j10);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.f41816c.getId());
                    bundle2.putLong("report_reaction_from_dialog_id", xnVar2.Q5);
                }
                xnVar2.presentFragment(new ProfileActivity(bundle2, null));
                xnVar2.A7(true);
                return;
        }
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        xn xnVar = this.f41815b;
        org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(xnVar.getParentActivity(), 3, xnVar.f43114ba)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        MessageObject messageObject = this.f41816c;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
        tL_poll.f20871id = poll.f20871id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = xnVar.getMessagesController().getInputPeer(xnVar.Q5);
        tL_messages_editMessage.f20928id = messageObject.getId();
        tL_messages_editMessage.flags |= 16384;
        AndroidUtilities.runOnUIThread(new pg(xnVar, d2VarArr, xnVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new ba(xnVar, d2VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
