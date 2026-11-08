package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class z11 implements org.telegram.messenger.ls {
    public final int f52406a;
    public final TLRPC.Chat f52407b;
    public TLRPC.ChannelParticipantsFilter f52408c;
    public boolean f52410f;
    public boolean h;
    public boolean f52412r;
    public boolean f52413s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f52409e = new ArrayList();
    public int f52411n = -1;

    public z11(int i7, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f52406a = i7;
        this.f52407b = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(j3));
        TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(i7).N0(j3);
        this.f52408c = channelParticipantsFilter;
        if (N0 == null) {
            if (!this.f52413s) {
                this.f52413s = true;
                org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.T);
            }
            org.telegram.messenger.qp.s1(i7).V2(0, j3, false);
        }
    }

    public final void a() {
        if (!this.f52413s) {
            return;
        }
        this.f52413s = false;
        int i7 = this.f52406a;
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.T);
        if (this.f52411n >= 0) {
            ConnectionsManager.getInstance(i7).cancelRequest(this.f52411n, true);
            this.f52411n = -1;
        }
        this.f52410f = false;
    }

    public final void b() {
        int size;
        if (!this.f52410f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f52408c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f26955q)) {
                this.f52410f = true;
                TLRPC.Chat chat = this.f52407b;
                if (org.telegram.messenger.t3.T(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = org.telegram.messenger.qp.i1(chat);
                    tL_channels_getParticipants.filter = this.f52408c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f52412r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f52406a).sendRequestTyped(tL_channels_getParticipants, new d3.b(1), new a5(this, 25));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.T) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f26957id;
            TLRPC.Chat chat = this.f52407b;
            if (j3 == chat.f26956id && !org.telegram.messenger.t3.T(chat) && this.f52410f) {
                this.f52410f = false;
                b();
            }
        }
    }
}
