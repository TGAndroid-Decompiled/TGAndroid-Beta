package rf;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class q0 implements Runnable {
    public final TLRPC.Chat f47337a;
    public final String f47338b;
    public final long f47339c;
    public final ArrayList d;
    public final a0.h f47340e;
    public final MessagesController f47341f;
    public final v0 h;

    public q0(v0 v0Var, TLRPC.Chat chat, String str, long j10, ArrayList arrayList, a0.h hVar, MessagesController messagesController) {
        this.h = v0Var;
        this.f47337a = chat;
        this.f47338b = str;
        this.f47339c = j10;
        this.d = arrayList;
        this.f47340e = hVar;
        this.f47341f = messagesController;
    }

    @Override
    public final void run() {
        v0 v0Var = this.h;
        if (v0Var.A != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f47337a);
        tL_channels_getParticipants.limit = 20;
        tL_channels_getParticipants.offset = 0;
        TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
        int i10 = tL_channelParticipantsMentions.flags;
        tL_channelParticipantsMentions.flags = i10 | 1;
        tL_channelParticipantsMentions.f22391q = this.f47338b;
        long j10 = this.f47339c;
        if (j10 != 0) {
            tL_channelParticipantsMentions.flags = i10 | 3;
            tL_channelParticipantsMentions.top_msg_id = (int) j10;
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
        int i11 = v0Var.f47368e0 + 1;
        v0Var.f47368e0 = i11;
        v0Var.f47370f0 = ConnectionsManager.getInstance(v0Var.f47369f).sendRequest(tL_channels_getParticipants, new jf.i0(this, i11, this.d, this.f47340e, this.f47341f, 13));
    }
}
