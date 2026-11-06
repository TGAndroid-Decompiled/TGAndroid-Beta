package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class z11 implements org.telegram.messenger.ls {
    public final int f52421a;
    public final TLRPC.Chat f52422b;
    public TLRPC.ChannelParticipantsFilter f52423c;
    public boolean f52425f;
    public boolean h;
    public boolean f52427r;
    public boolean f52428s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f52424e = new ArrayList();
    public int f52426n = -1;

    public z11(int i7, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f52421a = i7;
        this.f52422b = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(j3));
        TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(i7).N0(j3);
        this.f52423c = channelParticipantsFilter;
        if (N0 == null) {
            if (!this.f52428s) {
                this.f52428s = true;
                org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.T);
            }
            org.telegram.messenger.qp.s1(i7).V2(0, j3, false);
        }
    }

    public final void a() {
        if (!this.f52428s) {
            return;
        }
        this.f52428s = false;
        int i7 = this.f52421a;
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.T);
        if (this.f52426n >= 0) {
            ConnectionsManager.getInstance(i7).cancelRequest(this.f52426n, true);
            this.f52426n = -1;
        }
        this.f52425f = false;
    }

    public final void b() {
        int size;
        if (!this.f52425f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f52423c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f26951q)) {
                this.f52425f = true;
                TLRPC.Chat chat = this.f52422b;
                if (org.telegram.messenger.t3.T(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = org.telegram.messenger.qp.i1(chat);
                    tL_channels_getParticipants.filter = this.f52423c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f52427r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f52421a).sendRequestTyped(tL_channels_getParticipants, new d3.b(1), new a5(this, 25));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.T) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f26953id;
            TLRPC.Chat chat = this.f52422b;
            if (j3 == chat.f26952id && !org.telegram.messenger.t3.T(chat) && this.f52425f) {
                this.f52425f = false;
                b();
            }
        }
    }
}
