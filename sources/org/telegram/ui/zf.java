package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class zf implements org.telegram.ui.Components.pj0, org.telegram.ui.ActionBar.a2 {
    public final int f40117a;
    public final xn f40118b;
    public final MessageObject f40119c;

    public zf(xn xnVar, MessageObject messageObject, int i10) {
        this.f40117a = i10;
        this.f40118b = xnVar;
        this.f40119c = messageObject;
    }

    @Override
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f40117a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                xn xnVar = this.f40118b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.f40119c.getId());
                    bundle.putLong("report_reaction_from_dialog_id", xnVar.T5);
                }
                xnVar.presentFragment(new ProfileActivity(bundle, null));
                xnVar.A7(true);
                return;
            default:
                xn xnVar2 = this.f40118b;
                xnVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j3 > 0) {
                    bundle2.putLong("user_id", j3);
                } else {
                    bundle2.putLong("chat_id", -j3);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.f40119c.getId());
                    bundle2.putLong("report_reaction_from_dialog_id", xnVar2.T5);
                }
                xnVar2.presentFragment(new ProfileActivity(bundle2, null));
                xnVar2.A7(true);
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        xn xnVar = this.f40118b;
        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(xnVar.getParentActivity(), 3, xnVar.f39370ea)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        MessageObject messageObject = this.f40119c;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
        tL_poll.f18109id = poll.f18109id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = xnVar.getMessagesController().getInputPeer(xnVar.T5);
        tL_messages_editMessage.f18166id = messageObject.getId();
        tL_messages_editMessage.flags |= 16384;
        AndroidUtilities.runOnUIThread(new ug(xnVar, b2VarArr, xnVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new aa(xnVar, b2VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
