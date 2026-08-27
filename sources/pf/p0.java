package pf;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

public final class p0 implements Runnable {

    public final TLRPC.Chat f45896a;

    public final String f45897b;

    public final long f45898c;
    public final ArrayList d;

    public final a0.h f45899e;

    public final MessagesController f45900f;
    public final u0 h;

    public p0(u0 u0Var, TLRPC.Chat chat, String str, long j10, ArrayList arrayList, a0.h hVar, MessagesController messagesController) {
        this.h = u0Var;
        this.f45896a = chat;
        this.f45897b = str;
        this.f45898c = j10;
        this.d = arrayList;
        this.f45899e = hVar;
        this.f45900f = messagesController;
    }

    @Override
    public final void run() {
        u0 u0Var = this.h;
        if (u0Var.A != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f45896a);
        tL_channels_getParticipants.limit = 20;
        tL_channels_getParticipants.offset = 0;
        TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
        int i10 = tL_channelParticipantsMentions.flags;
        tL_channelParticipantsMentions.flags = i10 | 1;
        tL_channelParticipantsMentions.f22379q = this.f45897b;
        long j10 = this.f45898c;
        if (j10 != 0) {
            tL_channelParticipantsMentions.flags = i10 | 3;
            tL_channelParticipantsMentions.top_msg_id = (int) j10;
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
        int i11 = u0Var.f45927e0 + 1;
        u0Var.f45927e0 = i11;
        u0Var.f45929f0 = ConnectionsManager.getInstance(u0Var.f45928f).sendRequest(tL_channels_getParticipants, new gf.j0(this, i11, this.d, this.f45899e, this.f45900f, 13));
    }
}
