package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class v41 implements jp {
    public final TLRPC.TL_chatChannelParticipant f50566a;
    public final boolean f50567b;
    public final boolean[] f50568c;

    public v41(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z9, boolean[] zArr) {
        this.f50566a = tL_chatChannelParticipant;
        this.f50567b = z9;
        this.f50568c = zArr;
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.f50566a;
        if (i7 == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
            return;
        }
        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
        channelParticipant2.admin_rights = tL_chatAdminRights;
        channelParticipant2.rank = str;
        if (this.f50567b) {
            this.f50568c[0] = true;
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
