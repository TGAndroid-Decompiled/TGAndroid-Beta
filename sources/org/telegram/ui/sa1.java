package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sa1 implements kq {
    public final TLRPC.TL_chatChannelParticipant f41696a;
    public final boolean f41697b;
    public final boolean[] f41698c;

    public sa1(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z10, boolean[] zArr) {
        this.f41696a = tL_chatChannelParticipant;
        this.f41697b = z10;
        this.f41698c = zArr;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.f41696a;
        if (i10 == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
            return;
        }
        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
        channelParticipant2.admin_rights = tL_chatAdminRights;
        channelParticipant2.rank = str;
        if (this.f41697b) {
            this.f41698c[0] = true;
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
