package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class xa1 implements oq {
    public final TLRPC.TL_chatChannelParticipant f38654a;
    public final boolean f38655b;
    public final boolean[] f38656c;

    public xa1(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z10, boolean[] zArr) {
        this.f38654a = tL_chatChannelParticipant;
        this.f38655b = z10;
        this.f38656c = zArr;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.f38654a;
        if (i10 == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
            return;
        }
        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
        channelParticipant2.admin_rights = tL_chatAdminRights;
        channelParticipant2.rank = str;
        if (this.f38655b) {
            this.f38656c[0] = true;
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
