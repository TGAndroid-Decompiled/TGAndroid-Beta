package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class u41 implements kp {
    public final TLRPC.TL_chatChannelParticipant f52439a;
    public final boolean f52440b;
    public final boolean[] f52441c;

    public u41(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z10, boolean[] zArr) {
        this.f52439a = tL_chatChannelParticipant;
        this.f52440b = z10;
        this.f52441c = zArr;
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.f52439a;
        if (i7 == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
            return;
        }
        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
        channelParticipant2.admin_rights = tL_chatAdminRights;
        channelParticipant2.rank = str;
        if (this.f52440b) {
            this.f52441c[0] = true;
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
