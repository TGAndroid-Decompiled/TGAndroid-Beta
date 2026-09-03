package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class wf implements org.telegram.ui.Components.xj0, org.telegram.ui.ActionBar.c2 {
    public final int f39673a;
    public final zn f39674b;
    public final MessageObject f39675c;

    public wf(zn znVar, MessageObject messageObject, int i10) {
        this.f39673a = i10;
        this.f39674b = znVar;
        this.f39675c = messageObject;
    }

    @Override
    public void a(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f39673a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                zn znVar = this.f39674b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.f39675c.getId());
                    bundle.putLong("report_reaction_from_dialog_id", znVar.Q5);
                }
                znVar.presentFragment(new ProfileActivity(bundle, null));
                znVar.A7(true);
                return;
            default:
                zn znVar2 = this.f39674b;
                znVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j10 > 0) {
                    bundle2.putLong("user_id", j10);
                } else {
                    bundle2.putLong("chat_id", -j10);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.f39675c.getId());
                    bundle2.putLong("report_reaction_from_dialog_id", znVar2.Q5);
                }
                znVar2.presentFragment(new ProfileActivity(bundle2, null));
                znVar2.A7(true);
                return;
        }
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        zn znVar = this.f39674b;
        org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(znVar.getParentActivity(), 3, znVar.f40534ba)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        MessageObject messageObject = this.f39675c;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
        tL_poll.f19185id = poll.f19185id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = znVar.getMessagesController().getInputPeer(znVar.Q5);
        tL_messages_editMessage.f19242id = messageObject.getId();
        tL_messages_editMessage.flags |= 16384;
        AndroidUtilities.runOnUIThread(new rg(znVar, d2VarArr, znVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new da(znVar, d2VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
