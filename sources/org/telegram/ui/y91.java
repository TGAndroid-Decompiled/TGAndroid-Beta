package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class y91 implements gq {
    public final TLRPC.TL_chatChannelParticipant f40454a;
    public final boolean f40455b;
    public final boolean[] f40456c;

    public y91(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z4, boolean[] zArr) {
        this.f40454a = tL_chatChannelParticipant;
        this.f40455b = z4;
        this.f40456c = zArr;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.f40454a;
        if (i10 == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
            return;
        }
        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
        channelParticipant2.admin_rights = tL_chatAdminRights;
        channelParticipant2.rank = str;
        if (this.f40455b) {
            this.f40456c[0] = true;
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
