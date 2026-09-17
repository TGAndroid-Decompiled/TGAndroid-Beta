package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class s71 implements NotificationCenter.NotificationCenterDelegate {
    public final int f40363a;
    public final TLRPC.Chat f40364b;
    public TLRPC.ChannelParticipantsFilter f40365c;
    public boolean f40367f;
    public boolean h;
    public boolean f40369r;
    public boolean f40370s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f40366e = new ArrayList();
    public int f40368n = -1;

    public s71(int i10, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f40363a = i10;
        this.f40364b = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j3);
        this.f40365c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f40370s) {
                this.f40370s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j3, 0, false);
        }
    }

    public final void a() {
        if (this.f40370s) {
            return;
        }
        this.f40370s = false;
        int i10 = this.f40363a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f40368n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f40368n, true);
            this.f40368n = -1;
        }
        this.f40367f = false;
    }

    public final void b() {
        int size;
        if (!this.f40367f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f40365c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f19895q)) {
                this.f40367f = true;
                TLRPC.Chat chat = this.f40364b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f40365c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f40369r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f40363a).sendRequestTyped(tL_channels_getParticipants, new Object(), new b5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f19897id;
            TLRPC.Chat chat = this.f40364b;
            if (j3 == chat.f19896id && !ChatObject.isChannel(chat) && this.f40367f) {
                this.f40367f = false;
                b();
            }
        }
    }
}
