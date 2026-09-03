package tf;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class p0 implements Runnable {
    public final TLRPC.Chat f44877a;
    public final String f44878b;
    public final long f44879c;
    public final ArrayList d;
    public final a0.h e;
    public final MessagesController f44880f;
    public final u0 h;

    public p0(u0 u0Var, TLRPC.Chat chat, String str, long j10, ArrayList arrayList, a0.h hVar, MessagesController messagesController) {
        this.h = u0Var;
        this.f44877a = chat;
        this.f44878b = str;
        this.f44879c = j10;
        this.d = arrayList;
        this.e = hVar;
        this.f44880f = messagesController;
    }

    @Override
    public final void run() {
        u0 u0Var = this.h;
        if (u0Var.B != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f44877a);
        tL_channels_getParticipants.limit = 20;
        tL_channels_getParticipants.offset = 0;
        TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
        int i10 = tL_channelParticipantsMentions.flags;
        tL_channelParticipantsMentions.flags = i10 | 1;
        tL_channelParticipantsMentions.f19158q = this.f44878b;
        long j10 = this.f44879c;
        if (j10 != 0) {
            tL_channelParticipantsMentions.flags = i10 | 3;
            tL_channelParticipantsMentions.top_msg_id = (int) j10;
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
        int i11 = u0Var.f44906f0 + 1;
        u0Var.f44906f0 = i11;
        u0Var.f44907g0 = ConnectionsManager.getInstance(u0Var.f44905f).sendRequest(tL_channels_getParticipants, new kf.i0(this, i11, this.d, this.e, this.f44880f, 14));
    }
}
