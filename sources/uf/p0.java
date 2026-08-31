package uf;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class p0 implements Runnable {
    public final TLRPC.Chat f48668a;
    public final String f48669b;
    public final long f48670c;
    public final ArrayList d;
    public final a0.h f48671e;
    public final MessagesController f48672f;
    public final u0 h;

    public p0(u0 u0Var, TLRPC.Chat chat, String str, long j10, ArrayList arrayList, a0.h hVar, MessagesController messagesController) {
        this.h = u0Var;
        this.f48668a = chat;
        this.f48669b = str;
        this.f48670c = j10;
        this.d = arrayList;
        this.f48671e = hVar;
        this.f48672f = messagesController;
    }

    @Override
    public final void run() {
        u0 u0Var = this.h;
        if (u0Var.B != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f48668a);
        tL_channels_getParticipants.limit = 20;
        tL_channels_getParticipants.offset = 0;
        TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
        int i10 = tL_channelParticipantsMentions.flags;
        tL_channelParticipantsMentions.flags = i10 | 1;
        tL_channelParticipantsMentions.f20842q = this.f48669b;
        long j10 = this.f48670c;
        if (j10 != 0) {
            tL_channelParticipantsMentions.flags = i10 | 3;
            tL_channelParticipantsMentions.top_msg_id = (int) j10;
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
        int i11 = u0Var.f48701f0 + 1;
        u0Var.f48701f0 = i11;
        u0Var.f48702g0 = ConnectionsManager.getInstance(u0Var.f48700f).sendRequest(tL_channels_getParticipants, new lf.i0(this, i11, this.d, this.f48671e, this.f48672f, 13));
    }
}
