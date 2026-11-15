package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class r41 implements jp {
    public final TLRPC.TL_chatChannelParticipant f50843a;
    public final boolean f50844b;
    public final boolean[] f50845c;

    public r41(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z10, boolean[] zArr) {
        this.f50843a = tL_chatChannelParticipant;
        this.f50844b = z10;
        this.f50845c = zArr;
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.f50843a;
        if (i7 == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
            return;
        }
        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
        channelParticipant2.admin_rights = tL_chatAdminRights;
        channelParticipant2.rank = str;
        if (this.f50844b) {
            this.f50845c[0] = true;
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
