package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class yf implements org.telegram.ui.Components.ck0, org.telegram.ui.ActionBar.z1 {
    public final int f40244a;
    public final wn f40245b;
    public final MessageObject f40246c;

    public yf(wn wnVar, MessageObject messageObject, int i10) {
        this.f40244a = i10;
        this.f40245b = wnVar;
        this.f40246c = messageObject;
    }

    @Override
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f40244a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                wn wnVar = this.f40245b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.f40246c.getId());
                    bundle.putLong("report_reaction_from_dialog_id", wnVar.T5);
                }
                wnVar.presentFragment(new ProfileActivity(bundle, null));
                wnVar.A7(true);
                return;
            default:
                wn wnVar2 = this.f40245b;
                wnVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j3 > 0) {
                    bundle2.putLong("user_id", j3);
                } else {
                    bundle2.putLong("chat_id", -j3);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.f40246c.getId());
                    bundle2.putLong("report_reaction_from_dialog_id", wnVar2.T5);
                }
                wnVar2.presentFragment(new ProfileActivity(bundle2, null));
                wnVar2.A7(true);
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        wn wnVar = this.f40245b;
        org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(wnVar.getParentActivity(), 3, wnVar.f39562ea)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        MessageObject messageObject = this.f40246c;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
        tL_poll.f18378id = poll.f18378id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = wnVar.getMessagesController().getInputPeer(wnVar.T5);
        tL_messages_editMessage.f18435id = messageObject.getId();
        tL_messages_editMessage.flags |= 16384;
        AndroidUtilities.runOnUIThread(new tg(wnVar, a2VarArr, wnVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new aa(wnVar, a2VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
