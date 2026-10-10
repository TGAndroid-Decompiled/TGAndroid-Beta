package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ta1 implements kq {
    public final TLRPC.TL_chatChannelParticipant f42010a;
    public final boolean f42011b;
    public final boolean[] f42012c;

    public ta1(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z10, boolean[] zArr) {
        this.f42010a = tL_chatChannelParticipant;
        this.f42011b = z10;
        this.f42012c = zArr;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.f42010a;
        if (i10 == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
            return;
        }
        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
        channelParticipant2.admin_rights = tL_chatAdminRights;
        channelParticipant2.rank = str;
        if (this.f42011b) {
            this.f42012c[0] = true;
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
