package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class s71 implements NotificationCenter.NotificationCenterDelegate {
    public final int f40362a;
    public final TLRPC.Chat f40363b;
    public TLRPC.ChannelParticipantsFilter f40364c;
    public boolean f40366f;
    public boolean h;
    public boolean f40368r;
    public boolean f40369s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f40365e = new ArrayList();
    public int f40367n = -1;

    public s71(int i10, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f40362a = i10;
        this.f40363b = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j3);
        this.f40364c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f40369s) {
                this.f40369s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j3, 0, false);
        }
    }

    public final void a() {
        if (this.f40369s) {
            return;
        }
        this.f40369s = false;
        int i10 = this.f40362a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f40367n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f40367n, true);
            this.f40367n = -1;
        }
        this.f40366f = false;
    }

    public final void b() {
        int size;
        if (!this.f40366f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f40364c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f19895q)) {
                this.f40366f = true;
                TLRPC.Chat chat = this.f40363b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f40364c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f40368r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f40362a).sendRequestTyped(tL_channels_getParticipants, new Object(), new b5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f19897id;
            TLRPC.Chat chat = this.f40363b;
            if (j3 == chat.f19896id && !ChatObject.isChannel(chat) && this.f40366f) {
                this.f40366f = false;
                b();
            }
        }
    }
}
