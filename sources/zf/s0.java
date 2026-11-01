package zf;

import java.util.ArrayList;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.q8;
public final class s0 implements Runnable {
    public final TLRPC.Chat f55641a;
    public final String f55642b;
    public final long f55643c;
    public final ArrayList d;
    public final a0.h e;
    public final wp f55644f;
    public final x0 h;

    public s0(x0 x0Var, TLRPC.Chat chat, String str, long j10, ArrayList arrayList, a0.h hVar, wp wpVar) {
        this.h = x0Var;
        this.f55641a = chat;
        this.f55642b = str;
        this.f55643c = j10;
        this.d = arrayList;
        this.e = hVar;
        this.f55644f = wpVar;
    }

    @Override
    public final void run() {
        x0 x0Var = this.h;
        if (x0Var.E != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = wp.h1(this.f55641a);
        tL_channels_getParticipants.limit = 20;
        tL_channels_getParticipants.offset = 0;
        TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
        int i10 = tL_channelParticipantsMentions.flags;
        tL_channelParticipantsMentions.flags = i10 | 1;
        tL_channelParticipantsMentions.f19793q = this.f55642b;
        long j10 = this.f55643c;
        if (j10 != 0) {
            tL_channelParticipantsMentions.flags = i10 | 3;
            tL_channelParticipantsMentions.top_msg_id = (int) j10;
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
        int i11 = x0Var.f55673i0 + 1;
        x0Var.f55673i0 = i11;
        x0Var.f55674j0 = ConnectionsManager.getInstance(x0Var.f55669f).sendRequest(tL_channels_getParticipants, new q8(this, i11, this.d, this.e, this.f55644f, 14));
    }
}
