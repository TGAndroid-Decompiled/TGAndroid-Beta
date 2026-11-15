package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class w11 implements org.telegram.messenger.is {
    public final int f52359a;
    public final TLRPC.Chat f52360b;
    public TLRPC.ChannelParticipantsFilter f52361c;
    public boolean f52363f;
    public boolean h;
    public boolean f52365r;
    public boolean f52366s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f52362e = new ArrayList();
    public int f52364n = -1;

    public w11(int i7, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f52359a = i7;
        this.f52360b = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(j3));
        TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(i7).N0(j3);
        this.f52361c = channelParticipantsFilter;
        if (N0 == null) {
            if (!this.f52366s) {
                this.f52366s = true;
                org.telegram.messenger.ns.f(i7).c(this, org.telegram.messenger.ns.T);
            }
            org.telegram.messenger.np.s1(i7).V2(0, j3, false);
        }
    }

    public final void a() {
        if (!this.f52366s) {
            return;
        }
        this.f52366s = false;
        int i7 = this.f52359a;
        org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.T);
        if (this.f52364n >= 0) {
            ConnectionsManager.getInstance(i7).cancelRequest(this.f52364n, true);
            this.f52364n = -1;
        }
        this.f52363f = false;
    }

    public final void b() {
        int size;
        if (!this.f52363f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f52361c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f28050q)) {
                this.f52363f = true;
                TLRPC.Chat chat = this.f52360b;
                if (org.telegram.messenger.t3.T(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = org.telegram.messenger.np.i1(chat);
                    tL_channels_getParticipants.filter = this.f52361c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f52365r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f52359a).sendRequestTyped(tL_channels_getParticipants, new d3.b(1), new a5(this, 25));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.T) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f28052id;
            TLRPC.Chat chat = this.f52360b;
            if (j3 == chat.f28051id && !org.telegram.messenger.t3.T(chat) && this.f52363f) {
                this.f52363f = false;
                b();
            }
        }
    }
}
