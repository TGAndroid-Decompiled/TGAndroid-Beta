package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class za1 implements qq {
    public final TLRPC.TL_chatChannelParticipant f42582a;
    public final boolean f42583b;
    public final boolean[] f42584c;

    public za1(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z10, boolean[] zArr) {
        this.f42582a = tL_chatChannelParticipant;
        this.f42583b = z10;
        this.f42584c = zArr;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.f42582a;
        if (i10 == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
            return;
        }
        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
        channelParticipant2.admin_rights = tL_chatAdminRights;
        channelParticipant2.rank = str;
        if (this.f42583b) {
            this.f42584c[0] = true;
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
