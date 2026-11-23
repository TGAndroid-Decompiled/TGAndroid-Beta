package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class t41 implements kp {
    public final TLRPC.TL_chatChannelParticipant f52240a;
    public final boolean f52241b;
    public final boolean[] f52242c;

    public t41(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z10, boolean[] zArr) {
        this.f52240a = tL_chatChannelParticipant;
        this.f52241b = z10;
        this.f52242c = zArr;
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.f52240a;
        if (i7 == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
            return;
        }
        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
        channelParticipant2.admin_rights = tL_chatAdminRights;
        channelParticipant2.rank = str;
        if (this.f52241b) {
            this.f52242c[0] = true;
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
