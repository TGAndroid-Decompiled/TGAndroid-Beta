package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class z91 implements hq {
    public final TLRPC.TL_chatChannelParticipant f43872a;
    public final boolean f43873b;
    public final boolean[] f43874c;

    public z91(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z4, boolean[] zArr) {
        this.f43872a = tL_chatChannelParticipant;
        this.f43873b = z4;
        this.f43874c = zArr;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.f43872a;
        if (i10 == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
            return;
        }
        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
        channelParticipant2.admin_rights = tL_chatAdminRights;
        channelParticipant2.rank = str;
        if (this.f43873b) {
            this.f43874c[0] = true;
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
