package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ta1 implements nq {
    public final TLRPC.TL_chatChannelParticipant f40728a;
    public final boolean f40729b;
    public final boolean[] f40730c;

    public ta1(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z10, boolean[] zArr) {
        this.f40728a = tL_chatChannelParticipant;
        this.f40729b = z10;
        this.f40730c = zArr;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.f40728a;
        if (i10 == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
            return;
        }
        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
        channelParticipant2.admin_rights = tL_chatAdminRights;
        channelParticipant2.rank = str;
        if (this.f40729b) {
            this.f40730c[0] = true;
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
