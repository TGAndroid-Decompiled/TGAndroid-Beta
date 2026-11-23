package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class z11 implements org.telegram.messenger.fs {
    public final int f54481a;
    public final TLRPC.Chat f54482b;
    public TLRPC.ChannelParticipantsFilter f54483c;
    public boolean f54485f;
    public boolean h;
    public boolean f54487r;
    public boolean f54488s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f54484e = new ArrayList();
    public int f54486n = -1;

    public z11(int i7, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f54481a = i7;
        this.f54482b = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(j3));
        TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(i7).P0(j3);
        this.f54483c = channelParticipantsFilter;
        if (P0 == null) {
            if (!this.f54488s) {
                this.f54488s = true;
                org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.T);
            }
            org.telegram.messenger.mp.u1(i7).b3(0, j3, false);
        }
    }

    public final void a() {
        if (!this.f54488s) {
            return;
        }
        this.f54488s = false;
        int i7 = this.f54481a;
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.T);
        if (this.f54486n >= 0) {
            ConnectionsManager.getInstance(i7).cancelRequest(this.f54486n, true);
            this.f54486n = -1;
        }
        this.f54485f = false;
    }

    public final void b() {
        int size;
        if (!this.f54485f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f54483c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f28491q)) {
                this.f54485f = true;
                TLRPC.Chat chat = this.f54482b;
                if (org.telegram.messenger.v3.T(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = org.telegram.messenger.mp.k1(chat);
                    tL_channels_getParticipants.filter = this.f54483c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f54487r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f54481a).sendRequestTyped(tL_channels_getParticipants, new d3.b(1), new a5(this, 25));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.T) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f28493id;
            TLRPC.Chat chat = this.f54482b;
            if (j3 == chat.f28492id && !org.telegram.messenger.v3.T(chat) && this.f54485f) {
                this.f54485f = false;
                b();
            }
        }
    }
}
