package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class tf implements org.telegram.ui.Components.ok0, org.telegram.ui.ActionBar.z1 {
    public final int f42037a;
    public final sn f42038b;
    public final MessageObject f42039c;

    public tf(sn snVar, MessageObject messageObject, int i10) {
        this.f42037a = i10;
        this.f42038b = snVar;
        this.f42039c = messageObject;
    }

    @Override
    public void e(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f42037a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                sn snVar = this.f42038b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.f42039c.getId());
                    bundle.putLong("report_reaction_from_dialog_id", snVar.f41516f6);
                }
                snVar.presentFragment(new ProfileActivity(bundle, null));
                snVar.D7(true);
                return;
            default:
                sn snVar2 = this.f42038b;
                snVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j10 > 0) {
                    bundle2.putLong("user_id", j10);
                } else {
                    bundle2.putLong("chat_id", -j10);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.f42039c.getId());
                    bundle2.putLong("report_reaction_from_dialog_id", snVar2.f41516f6);
                }
                snVar2.presentFragment(new ProfileActivity(bundle2, null));
                snVar2.D7(true);
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        sn snVar = this.f42038b;
        org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(snVar.getParentActivity(), 3, snVar.f41651qa)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        MessageObject messageObject = this.f42039c;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
        tL_poll.f20370id = poll.f20370id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = snVar.getMessagesController().getInputPeer(snVar.f41516f6);
        tL_messages_editMessage.f20427id = messageObject.getId();
        tL_messages_editMessage.flags |= 16384;
        AndroidUtilities.runOnUIThread(new mg(snVar, c2VarArr, snVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new ca(snVar, c2VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
