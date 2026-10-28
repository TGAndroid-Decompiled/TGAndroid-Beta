package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class sf implements org.telegram.ui.Components.pk0, org.telegram.ui.ActionBar.b2 {
    public final int f43313a;
    public final wn f43314b;
    public final MessageObject f43315c;

    public sf(wn wnVar, MessageObject messageObject, int i10) {
        this.f43313a = i10;
        this.f43314b = wnVar;
        this.f43315c = messageObject;
    }

    @Override
    public void f(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f43313a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                wn wnVar = this.f43314b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.f43315c.getId());
                    bundle.putLong("report_reaction_from_dialog_id", wnVar.f45168j6);
                }
                wnVar.presentFragment(new ProfileActivity(bundle, null));
                wnVar.J7(true);
                return;
            default:
                wn wnVar2 = this.f43314b;
                wnVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j10 > 0) {
                    bundle2.putLong("user_id", j10);
                } else {
                    bundle2.putLong("chat_id", -j10);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.f43315c.getId());
                    bundle2.putLong("report_reaction_from_dialog_id", wnVar2.f45168j6);
                }
                wnVar2.presentFragment(new ProfileActivity(bundle2, null));
                wnVar2.J7(true);
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        wn wnVar = this.f43314b;
        org.telegram.ui.ActionBar.e2[] e2VarArr = {new org.telegram.ui.ActionBar.e2(wnVar.getParentActivity(), 3, wnVar.f45309ua)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        MessageObject messageObject = this.f43315c;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
        tL_poll.f22054id = poll.f22054id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = wnVar.getMessagesController().getInputPeer(wnVar.f45168j6);
        tL_messages_editMessage.f22112id = messageObject.getId();
        tL_messages_editMessage.flags |= 16384;
        AndroidUtilities.runOnUIThread(new ng(wnVar, e2VarArr, wnVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new ea(wnVar, e2VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
