package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class r31 implements org.telegram.messenger.us {
    public final int f41125a;
    public final TLRPC.Chat f41126b;
    public TLRPC.ChannelParticipantsFilter f41127c;
    public boolean f41128f;
    public boolean h;
    public boolean f41130r;
    public boolean f41131s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f41129n = -1;

    public r31(int i10, long j10, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f41125a = i10;
        this.f41126b = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(j10));
        TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(i10).M0(j10);
        this.f41127c = channelParticipantsFilter;
        if (M0 == null) {
            if (!this.f41131s) {
                this.f41131s = true;
                org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.T);
            }
            org.telegram.messenger.vp.r1(i10).T2(0, j10, false);
        }
    }

    public final void a() {
        if (!this.f41131s) {
            return;
        }
        this.f41131s = false;
        int i10 = this.f41125a;
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.T);
        if (this.f41129n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f41129n, true);
            this.f41129n = -1;
        }
        this.f41128f = false;
    }

    public final void b() {
        int size;
        if (!this.f41128f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f41127c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f19792q)) {
                this.f41128f = true;
                TLRPC.Chat chat = this.f41126b;
                if (org.telegram.messenger.w3.T(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = org.telegram.messenger.vp.h1(chat);
                    tL_channels_getParticipants.filter = this.f41127c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f41130r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f41125a).sendRequestTyped(tL_channels_getParticipants, new a3.b(1), new z4(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.T) {
            long j10 = ((TLRPC.ChatFull) objArr[0]).f19794id;
            TLRPC.Chat chat = this.f41126b;
            if (j10 == chat.f19793id && !org.telegram.messenger.w3.T(chat) && this.f41128f) {
                this.f41128f = false;
                b();
            }
        }
    }
}
