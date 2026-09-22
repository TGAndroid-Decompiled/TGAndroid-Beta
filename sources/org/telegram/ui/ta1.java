package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ta1 implements kq {
    public final TLRPC.TL_chatChannelParticipant f37741a;
    public final boolean f37742b;
    public final boolean[] f37743c;

    public ta1(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z10, boolean[] zArr) {
        this.f37741a = tL_chatChannelParticipant;
        this.f37742b = z10;
        this.f37743c = zArr;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.f37741a;
        if (i10 == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
            return;
        }
        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
        channelParticipant2.admin_rights = tL_chatAdminRights;
        channelParticipant2.rank = str;
        if (this.f37742b) {
            this.f37743c[0] = true;
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
