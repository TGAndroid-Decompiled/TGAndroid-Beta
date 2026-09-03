package uf;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class p0 implements Runnable {
    public final TLRPC.Chat f48704a;
    public final String f48705b;
    public final long f48706c;
    public final ArrayList d;
    public final a0.h f48707e;
    public final MessagesController f48708f;
    public final u0 h;

    public p0(u0 u0Var, TLRPC.Chat chat, String str, long j10, ArrayList arrayList, a0.h hVar, MessagesController messagesController) {
        this.h = u0Var;
        this.f48704a = chat;
        this.f48705b = str;
        this.f48706c = j10;
        this.d = arrayList;
        this.f48707e = hVar;
        this.f48708f = messagesController;
    }

    @Override
    public final void run() {
        u0 u0Var = this.h;
        if (u0Var.B != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.f48704a);
        tL_channels_getParticipants.limit = 20;
        tL_channels_getParticipants.offset = 0;
        TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
        int i10 = tL_channelParticipantsMentions.flags;
        tL_channelParticipantsMentions.flags = i10 | 1;
        tL_channelParticipantsMentions.f20844q = this.f48705b;
        long j10 = this.f48706c;
        if (j10 != 0) {
            tL_channelParticipantsMentions.flags = i10 | 3;
            tL_channelParticipantsMentions.top_msg_id = (int) j10;
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
        int i11 = u0Var.f48737f0 + 1;
        u0Var.f48737f0 = i11;
        u0Var.f48738g0 = ConnectionsManager.getInstance(u0Var.f48736f).sendRequest(tL_channels_getParticipants, new lf.i0(this, i11, this.d, this.f48707e, this.f48708f, 13));
    }
}
