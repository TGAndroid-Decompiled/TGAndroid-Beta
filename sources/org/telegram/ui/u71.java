package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class u71 implements NotificationCenter.NotificationCenterDelegate {
    public final int f37142a;
    public final TLRPC.Chat f37143b;
    public TLRPC.ChannelParticipantsFilter f37144c;
    public boolean f37145f;
    public boolean h;
    public boolean f37147r;
    public boolean f37148s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f37146n = -1;

    public u71(int i10, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f37142a = i10;
        this.f37143b = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j3);
        this.f37144c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f37148s) {
                this.f37148s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j3, 0, false);
        }
    }

    public final void a() {
        if (this.f37148s) {
            return;
        }
        this.f37148s = false;
        int i10 = this.f37142a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f37146n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f37146n, true);
            this.f37146n = -1;
        }
        this.f37145f = false;
    }

    public final void b() {
        int size;
        if (!this.f37145f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f37144c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f17194q)) {
                this.f37145f = true;
                TLRPC.Chat chat = this.f37143b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f37144c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f37147r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f37142a).sendRequestTyped(tL_channels_getParticipants, new Object(), new b5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f17196id;
            TLRPC.Chat chat = this.f37143b;
            if (j3 == chat.f17195id && !ChatObject.isChannel(chat) && this.f37145f) {
                this.f37145f = false;
                b();
            }
        }
    }
}
