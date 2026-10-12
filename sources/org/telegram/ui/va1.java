package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class va1 implements nq {
    public final TLRPC.TL_chatChannelParticipant f42743a;
    public final boolean f42744b;
    public final boolean[] f42745c;

    public va1(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z10, boolean[] zArr) {
        this.f42743a = tL_chatChannelParticipant;
        this.f42744b = z10;
        this.f42745c = zArr;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.f42743a;
        if (i10 == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
            return;
        }
        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
        channelParticipant2.admin_rights = tL_chatAdminRights;
        channelParticipant2.rank = str;
        if (this.f42744b) {
            this.f42745c[0] = true;
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
