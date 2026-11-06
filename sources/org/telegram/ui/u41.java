package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class u41 implements hp {
    public final TLRPC.TL_chatChannelParticipant f50200a;
    public final boolean f50201b;
    public final boolean[] f50202c;

    public u41(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z9, boolean[] zArr) {
        this.f50200a = tL_chatChannelParticipant;
        this.f50201b = z9;
        this.f50202c = zArr;
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.f50200a;
        if (i7 == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
            return;
        }
        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
        channelParticipant2.admin_rights = tL_chatAdminRights;
        channelParticipant2.rank = str;
        if (this.f50201b) {
            this.f50202c[0] = true;
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
