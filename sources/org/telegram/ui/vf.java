package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class vf implements org.telegram.ui.Components.lk0, org.telegram.ui.ActionBar.a2 {
    public final int f42210a;
    public final sn f42211b;
    public final MessageObject f42212c;

    public vf(sn snVar, MessageObject messageObject, int i10) {
        this.f42210a = i10;
        this.f42211b = snVar;
        this.f42212c = messageObject;
    }

    @Override
    public void c(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f42210a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                sn snVar = this.f42211b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.f42212c.getId());
                    bundle.putLong("report_reaction_from_dialog_id", snVar.T5);
                }
                snVar.presentFragment(new ProfileActivity(bundle, null));
                snVar.D7(true);
                return;
            default:
                sn snVar2 = this.f42211b;
                snVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j10 > 0) {
                    bundle2.putLong("user_id", j10);
                } else {
                    bundle2.putLong("chat_id", -j10);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.f42212c.getId());
                    bundle2.putLong("report_reaction_from_dialog_id", snVar2.T5);
                }
                snVar2.presentFragment(new ProfileActivity(bundle2, null));
                snVar2.D7(true);
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        sn snVar = this.f42211b;
        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(snVar.getParentActivity(), 3, snVar.f41226ea)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        MessageObject messageObject = this.f42212c;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
        tL_poll.f20305id = poll.f20305id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = snVar.getMessagesController().getInputPeer(snVar.T5);
        tL_messages_editMessage.f20362id = messageObject.getId();
        tL_messages_editMessage.flags |= 16384;
        AndroidUtilities.runOnUIThread(new og(snVar, b2VarArr, snVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new ea(snVar, b2VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
