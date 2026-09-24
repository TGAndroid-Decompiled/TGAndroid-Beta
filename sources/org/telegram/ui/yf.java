package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class yf implements org.telegram.ui.Components.zj0, org.telegram.ui.ActionBar.z1 {
    public final int f40123a;
    public final wn f40124b;
    public final MessageObject f40125c;

    public yf(wn wnVar, MessageObject messageObject, int i10) {
        this.f40123a = i10;
        this.f40124b = wnVar;
        this.f40125c = messageObject;
    }

    @Override
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f40123a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                wn wnVar = this.f40124b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.f40125c.getId());
                    bundle.putLong("report_reaction_from_dialog_id", wnVar.T5);
                }
                wnVar.presentFragment(new ProfileActivity(bundle, null));
                wnVar.A7(true);
                return;
            default:
                wn wnVar2 = this.f40124b;
                wnVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j3 > 0) {
                    bundle2.putLong("user_id", j3);
                } else {
                    bundle2.putLong("chat_id", -j3);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.f40125c.getId());
                    bundle2.putLong("report_reaction_from_dialog_id", wnVar2.T5);
                }
                wnVar2.presentFragment(new ProfileActivity(bundle2, null));
                wnVar2.A7(true);
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        wn wnVar = this.f40124b;
        org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(wnVar.getParentActivity(), 3, wnVar.f39454ea)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        MessageObject messageObject = this.f40125c;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
        tL_poll.f18347id = poll.f18347id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = wnVar.getMessagesController().getInputPeer(wnVar.T5);
        tL_messages_editMessage.f18404id = messageObject.getId();
        tL_messages_editMessage.flags |= 16384;
        AndroidUtilities.runOnUIThread(new tg(wnVar, a2VarArr, wnVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new aa(wnVar, a2VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
